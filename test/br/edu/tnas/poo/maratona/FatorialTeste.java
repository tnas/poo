package br.edu.tnas.poo.maratona;

import br.edu.tnas.poo.util.FileHelper;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class FatorialTeste {
    
    public static final String INTPUT_DIR = "./maratona-input/Fatorial/";
    public static final String OUTPUT_DIR = "./maratona-output/Fatorial/";
    
    public static void main(String[] args) {
        
        Fatorial fatorial = new Fatorial();
        FileHelper inputFileHelper = new FileHelper(INTPUT_DIR);
        
        inputFileHelper.getFiles().forEach(f -> {
            File inputFile = new File(f.getAbsolutePath());
            int qtdNumeros = fatorial.calcular(inputFile);
            File outputFile = new File(OUTPUT_DIR.concat(inputFile.getName()));
            try {
                try (Scanner scan = new Scanner(outputFile)) {
                    int gabarito = scan.nextInt();
                    if (qtdNumeros == gabarito) {
                        System.out.println(inputFile.getName() + " --- OK");
                    }
                    else {
                        System.out.println(inputFile.getName() + " --- Falha");
                        System.out.printf("Esperado: %d, Encontrado: %d\n", gabarito, qtdNumeros);
                    }
                    scan.close();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
    }    
}

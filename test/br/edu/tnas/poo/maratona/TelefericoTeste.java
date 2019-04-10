package br.edu.tnas.poo.maratona;

import static br.edu.tnas.poo.maratona.JogoEstrategiaTeste.INTPUT_DIR;
import static br.edu.tnas.poo.maratona.JogoEstrategiaTeste.OUTPUT_DIR;
import br.edu.tnas.poo.util.FileHelper;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class TelefericoTeste {
    
    public static final String INTPUT_DIR = "./maratona-input/Teleferico/";
    public static final String OUTPUT_DIR = "./maratona-output/Teleferico/";
    
    public static void main(String[] args) {
        
        Teleferico teleferico = new Teleferico();
        FileHelper inputFileHelper = new FileHelper(INTPUT_DIR);
        
        inputFileHelper.getFiles().forEach(f -> {
            File inputFile = new File(f.getAbsolutePath());
            int numViagens = teleferico.calcularViagens(inputFile);
            File outputFile = new File(OUTPUT_DIR.concat(inputFile.getName()));
            try {
                try (Scanner scan = new Scanner(outputFile)) {
                    int gabarito = scan.nextInt();
                    if (numViagens == gabarito) {
                        System.out.println(inputFile.getName() + " --- OK");
                    }
                    else {
                        System.out.println(inputFile.getName() + " --- Falha");
                        System.out.printf("Esperado: %d, Encontrado: %d\n", gabarito, numViagens);
                    }
                    scan.close();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
    }
}

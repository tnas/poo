package br.edu.tnas.poo.maratona;

import br.edu.tnas.poo.util.FileHelper;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class ReturnKingTeste {
    
    public static final String INTPUT_OUTPUT_DIR = "./maratona-input/ReturnKing/";
    private static int SUCCESS = 0;
    private static int FAIL = 0;
    
    public static void main(String[] args) {
        
        ReturnKing returnKing = new ReturnKing();
        FileHelper inputFileHelper = new FileHelper(INTPUT_OUTPUT_DIR);
        
        inputFileHelper.getFiles().stream()
                .filter(f -> f.getName().endsWith(".in"))
                .forEach(f -> {
            File inputFile = new File(f.getAbsolutePath());
            double average = returnKing.run(inputFile);
            File outputFile = new File(INTPUT_OUTPUT_DIR.concat(inputFile.getName()
                    .replaceFirst("\\.in", "\\.sol")));
            try {
                try (Scanner scan = new Scanner(outputFile).useLocale(Locale.US)) {
                    double gabarito = scan.nextDouble();
                    if (average == gabarito) {
                        System.out.println(inputFile.getName() + " --- OK");
                        SUCCESS++;
                    }
                    else {
                        FAIL++;
                        System.out.println(inputFile.getName() + " --- Falha");
                        System.out.printf("Esperado: %f, Encontrado: %f\n", gabarito, average);
                    }
                    scan.close();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
        
        System.out.printf("Total de Sucessos: %d -- Total de Falhas: %d\n", SUCCESS, FAIL);
    }   
}

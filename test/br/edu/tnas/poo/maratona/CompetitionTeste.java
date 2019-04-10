package br.edu.tnas.poo.maratona;

import br.edu.tnas.poo.util.FileHelper;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class CompetitionTeste {
    
    public static final String INTPUT_OUTPUT_DIR = "./maratona-input/Competition/";
    private static int SUCCESS = 0;
    private static int FAIL = 0;
    
    public static void main(String[] args) {
        
        Competition competition = new Competition();
        FileHelper inputFileHelper = new FileHelper(INTPUT_OUTPUT_DIR);
        
        inputFileHelper.getFiles().stream()
                .filter(f -> f.getName().endsWith(".in"))
                .forEach(f -> {
                    System.out.println(f.getName());
            File inputFile = new File(f.getAbsolutePath());
            int numSwitches = competition.run(inputFile);
            File outputFile = new File(INTPUT_OUTPUT_DIR.concat(inputFile.getName()
                    .replaceFirst("\\.in", "\\.sol")));
            try {
                try (Scanner scan = new Scanner(outputFile)) {
                    int gabarito = scan.nextInt();
                    if (numSwitches == gabarito) {
                        System.out.println(inputFile.getName() + " --- OK");
                        SUCCESS++;
                    }
                    else {
                        FAIL++;
                        System.out.println(inputFile.getName() + " --- Falha");
                        System.out.printf("Esperado: %d, Encontrado: %d\n", gabarito, numSwitches);
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

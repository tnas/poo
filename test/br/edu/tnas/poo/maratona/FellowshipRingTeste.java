package br.edu.tnas.poo.maratona;

import br.edu.tnas.poo.util.FileHelper;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class FellowshipRingTeste {
    
    public static final String INTPUT_OUTPUT_DIR = "./maratona-input/FellowshipRing/";
    private static int SUCCESS = 0;
    private static int FAIL = 0;
    
    public static void main(String[] args) {
        
        FellowshipRing ring = new FellowshipRing();
        FileHelper inputFileHelper = new FileHelper(INTPUT_OUTPUT_DIR);
        
        inputFileHelper.getFiles().stream()
                .filter(f -> f.getName().endsWith(".in"))
                .forEach(f -> {
                    System.out.println(f.getName());
            File inputFile = new File(f.getAbsolutePath());
            int fairPunches = ring.run(inputFile);
            File outputFile = new File(INTPUT_OUTPUT_DIR.concat(inputFile.getName()
                    .replaceFirst("\\.in", "\\.sol")));
            try {
                try (Scanner scan = new Scanner(outputFile)) {
                    int gabarito = scan.nextInt();
                    if (fairPunches == gabarito) {
                        System.out.println(inputFile.getName() + " --- OK");
                        SUCCESS++;
                    }
                    else {
                        FAIL++;
                        System.out.println(inputFile.getName() + " --- Falha");
                        System.out.printf("Esperado: %s, Encontrado: %s\n", gabarito, fairPunches);
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

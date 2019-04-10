package br.edu.tnas.poo.maratona;

import br.edu.tnas.poo.util.FileHelper;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class JogoEstrategiaTeste {
    
        public static final String INTPUT_DIR = "./maratona-input/JogoEstrategia/";
        public static final String OUTPUT_DIR = "./maratona-output/JogoEstrategia/";
    
        public static void main(String[] args) {
        
        JogoEstrategia jogo = new JogoEstrategia();
        FileHelper inputFileHelper = new FileHelper(INTPUT_DIR);
        
        inputFileHelper.getFiles().forEach(f -> {
            File inputFile = new File(f.getAbsolutePath());
            int vencedor = jogo.rodar(inputFile);
            File outputFile = new File(OUTPUT_DIR.concat(inputFile.getName()));
            try {
                try (Scanner scan = new Scanner(outputFile)) {
                    int gabarito = scan.nextInt();
                    if (vencedor == gabarito) {
                        System.out.println(inputFile.getName() + " --- OK");
                    }
                    else {
                        System.out.println(inputFile.getName() + " --- Falha");
                        System.out.printf("Esperado: %d, Encontrado: %d\n", gabarito, vencedor);
                    }
                    scan.close();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
    }
}

package br.edu.tnas.poo.maratona;

import br.edu.tnas.poo.util.FileHelper;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public abstract class DesafioTeste<T> {
    
    protected static int SUCCESS;
    protected static int FAIL; 
    protected static DesafioTeste _instance;
    
    public abstract String getInputDirectory();
    public abstract String getOutputDirectory();
    public abstract Desafio<T> getDesafio();
    
    public void run() {
        
        SUCCESS = FAIL = 0;
        
        Desafio<T> desafio = getDesafio();
        FileHelper inputFileHelper = new FileHelper(getInputDirectory());
        
        inputFileHelper.getFiles().forEach(f -> {
            File inputFile = new File(f.getAbsolutePath());
            T result = desafio.executar(inputFile);
            File outputFile = new File(getOutputDirectory().concat(inputFile.getName()));
            try {
                try (Scanner scan = new Scanner(outputFile)) {
                    String expected =  scan.next(); 
                    if (String.valueOf(result).equals(expected)) {
                        System.out.println(inputFile.getName() + " --- OK");
                        SUCCESS++;
                    }
                    else {
                        System.out.println(inputFile.getName() + " --- Falha");
                        System.out.printf("Esperado: %s, Encontrado: %s\n", expected, result);
                        FAIL++;
                    }
                    scan.close();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
        
        System.out.printf("Total de Sucessos: %d -- Total de Falhas: %d\n", SUCCESS, FAIL);
    }
    
    public static void main(String[] args) {
        _instance.run();
    }
}

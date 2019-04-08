package br.edu.tnas.poo.aula.estaticofinal;

public class EmpregadoTeste {
    
    public static void main(String[] args) {
        
        System.out.println(
                "Contagem antes da instanciacao: " +
                Empregado.getContagemEmpregados());
        
        Empregado e1 = 
                new Empregado("Jose", "de Alencar");
        Empregado e2 = 
                new Empregado("Machado", "de Assis");
        
        System.out.println(
                "Contagem depois da instanciacao: " +
                Empregado.getContagemEmpregados());
    }
}






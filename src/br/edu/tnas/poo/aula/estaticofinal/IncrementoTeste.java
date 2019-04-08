package br.edu.tnas.poo.aula.estaticofinal;

public class IncrementoTeste {
    
    public static void main(String[] args) {
        
        Incremento valor = new Incremento(5);
        
        for (int i = 1; i <= 3; i++) {
            valor.adicionarSalto();
            System.out.printf(
                "Valor após incremento %d: total = %d\n", i, 
                    valor.getTotal());
        }
    }
}

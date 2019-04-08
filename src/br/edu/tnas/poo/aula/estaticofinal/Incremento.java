package br.edu.tnas.poo.aula.estaticofinal;

public class Incremento {
    
    private int total;
    private final int SALTO;
    
    public Incremento(int valorSalto) {
        this.SALTO = valorSalto;
    }

    public void adicionarSalto() {
        this.total += SALTO;
    }
    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
}

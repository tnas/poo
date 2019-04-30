package br.edu.tnas.poo.aula.interfaces;

public class Quadrado implements FiguraGeometrica {

    private final String nome;
    private final int tamanhoLado;
    
    public Quadrado() {
        this.nome = "Quadrado";
        this.tamanhoLado = 4;
    }
    
    @Override
    public String getNomeFigura() {
        return this.nome;
    }

    @Override
    public int getArea() {
        return this.tamanhoLado*this.tamanhoLado;
    }

    @Override
    public int getPerimetro() {
        return this.tamanhoLado * 4;
    }
}

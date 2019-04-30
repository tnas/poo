package br.edu.tnas.poo.aula.interfaces;

public class Triangulo implements FiguraGeometrica {

    private String nome;
    private int lado1;
    private int lado2;
    private int lado3;
    private int base;
    private int altura;
    
    @Override
    public String getNomeFigura() {
        return nome;
    }

    @Override
    public int getArea() {
        return (base*altura)/2;
    }

    @Override
    public int getPerimetro() {
        return lado1+lado2+lado3;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
}

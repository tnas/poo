package br.edu.tnas.poo.aula.estaticofinal;

public class Empregado {
    
    private static int contador = 0;
    
    private String nome;
    private String sobrenome;
    private double salario;
    
    public Empregado(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        ++contador;    
    }

    public static int getContagemEmpregados() {
        return contador;
    }
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

package br.edu.tnas.poo.aula.abstratas;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public abstract class Funcionario {
    private String nome;
    private String sobrenome;
    private double salario;

    public abstract double calcularPagamento();
    
    /*
     * getters/setters
     */
}

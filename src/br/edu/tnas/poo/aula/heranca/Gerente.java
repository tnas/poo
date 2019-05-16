package br.edu.tnas.poo.aula.heranca;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class Gerente extends Funcionario {
    private final double comissao;

    public Gerente(String nome, String sobrenome, 
            double salario, double comissao) {
        super(nome, sobrenome, salario);
        this.comissao = comissao;
    }
    
    public double calcularPagamento() {
        return this.getSalario() * this.comissao;
    }

    public double getComissao() {
        return comissao;
    }
}

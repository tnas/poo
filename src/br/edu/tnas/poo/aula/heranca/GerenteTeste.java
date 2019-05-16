package br.edu.tnas.poo.aula.heranca;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class GerenteTeste {
    public static void main(String[] args) {
        Gerente ger = new Gerente("Chico", "Buarque", 2000.00, 1.1);
        System.out.println("Nome: " + ger.getNome());
        System.out.println("Sobrenome: " + ger.getSobrenome());
        System.out.println("Salário: " + ger.getSalario());
        System.out.println("Pagamento: " + ger.calcularPagamento());
    }
}

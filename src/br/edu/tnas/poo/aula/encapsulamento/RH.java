package br.edu.tnas.poo.aula.encapsulamento;

public class RH {


    
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Bill Gates");
        estudante.setMatricula("369852147");
        estudante.setDataNascimento(28, 10, 1955);
        System.out.println("Nome do estudante: " + estudante.getNome());
        System.out.println("Idade do estudante (anos): " + estudante.obterIdade());
    } 
}

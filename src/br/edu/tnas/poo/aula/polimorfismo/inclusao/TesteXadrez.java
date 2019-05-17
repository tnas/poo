/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.tnas.poo.aula.polimorfismo.inclusao;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class TesteXadrez {
    public static void main(String[] args) {
        Peca peao = new Peao();
        Peca cavalo = new Cavalo();
        Peca bispo = new Bispo();
        
        peao.mover();
        cavalo.mover();
        bispo.mover();
        
        System.out.println(peao instanceof Peca);
        System.out.println(cavalo instanceof Peca);
        System.out.println(bispo instanceof Peca);
    }
}

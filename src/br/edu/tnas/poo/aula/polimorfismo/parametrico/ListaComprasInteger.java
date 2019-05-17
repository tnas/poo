/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.tnas.poo.aula.polimorfismo.parametrico;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class ListaComprasInteger {
    private Integer[] carrinho;
    private int posicaoLivre = 0;
    
    public void criar(Integer[] car) {
        this.carrinho = car;
    }
        
    public void adicionar(Integer item) {
        carrinho[posicaoLivre] = item;
        posicaoLivre++;
    }
    
    public void imprimirTamanho() {
        System.out.println("Tamanho: " + posicaoLivre);
    }
}

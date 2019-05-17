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
public class ListaCompras<T> {
    private T[] carrinho;
    private int posicaoLivre = 0;
    
    public void criar(T[] car) {
        this.carrinho = car;
    }
    
    public void adicionar(T item) {
        carrinho[posicaoLivre] = item;
        posicaoLivre++;
    }
    
    public void imprimirTamanho() {
        System.out.println("Tamanho: " + posicaoLivre);
    }
}

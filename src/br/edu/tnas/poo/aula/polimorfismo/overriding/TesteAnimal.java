/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.tnas.poo.aula.polimorfismo.overriding;

/**
 *
 * @author thiago
 */
public class TesteAnimal {
    public static void main(String[] args) {
        Animal cao = new Cachorro();
        cao.fazerBarulho();
        Animal gato = new Gato();
        gato.fazerBarulho();
    }
}

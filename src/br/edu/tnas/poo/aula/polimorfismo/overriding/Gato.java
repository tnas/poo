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
public class Gato extends Animal {
    @Override
    public void fazerBarulho() {
        System.out.println("Miar");
    }
}

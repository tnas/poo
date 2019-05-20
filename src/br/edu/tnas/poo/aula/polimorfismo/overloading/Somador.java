/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.tnas.poo.aula.polimorfismo.overloading;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class Somador {
    
    public int somar(int a, int b) {
        return a + b;
    }
    
    public int somar(int a, int b, int c) {
        return a + b + c;
    }
    
    public double somar(double a, double b) {
        return a + b;
    }
}

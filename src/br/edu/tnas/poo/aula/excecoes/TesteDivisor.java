/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.tnas.poo.aula.excecoes;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class TesteDivisor {
    public static void main(String[] args) {
        
        Divisor divisor = new Divisor();
        
        divisor.dividirUmPorZero();
        
        divisor.dividirUmPorZeroControlado();
        
        divisor.dividirPorUMGrafico();
    }
}

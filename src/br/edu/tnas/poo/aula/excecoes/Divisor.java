/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.tnas.poo.aula.excecoes;

import javax.swing.JOptionPane;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class Divisor {
    
    public void dividirUmPorZero() {
        int x = 1/0;
        System.out.println("Valor de x: " + x);
    }
    
    public void dividirUmPorZeroControlado() throws ArithmeticException {
        int x = 1/0;
        System.out.println("Valor de x: " + x);
    }
    
    public void dividirPorUMGrafico() {
        String strDenominador = JOptionPane.showInputDialog(null, 
                "Informe um valor numérico para o denominador", 
                "Denominador da Divisão", JOptionPane.QUESTION_MESSAGE);
        if (strDenominador.equals("0")) {
            throw new DivisaoPorZeroException("Divisão por zero não existe!");
        }
        else {
            int denominador = Integer.valueOf(strDenominador);
            double divisao = (double) 1/denominador;
            System.out.println("Um dividido por " + strDenominador + " é: " + divisao);
        }
        
    }
}

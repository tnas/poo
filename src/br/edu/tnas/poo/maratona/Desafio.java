/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.tnas.poo.maratona;

import java.io.File;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public interface Desafio<T> {
    
    T executar(File input);
}

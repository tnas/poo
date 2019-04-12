package br.edu.tnas.poo.maratona;

import java.io.File;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public interface Desafio<T> {
    
    T executar(File input);
}

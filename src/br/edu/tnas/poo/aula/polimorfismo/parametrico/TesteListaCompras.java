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
public class TesteListaCompras {
    
    public static void main(String[] args) {
        ListaComprasString carString = new ListaComprasString();
        carString.criar(new String[10]);
        carString.adicionar("itemString");
        carString.imprimirTamanho();
        
        ListaComprasInteger carInteger = new ListaComprasInteger();  
        carInteger.criar(new Integer[10]);
        carInteger.adicionar(99);
        carInteger.imprimirTamanho();
        
        ListaCompras<String> carStringP = new ListaCompras<>();
        carStringP.criar(new String[10]);
        carStringP.adicionar("itemString");
        carStringP.imprimirTamanho();
        
        ListaCompras<Integer> carIntegerP = new ListaCompras<>();  
        carIntegerP.criar(new Integer[10]);
        carIntegerP.adicionar(99);
        carIntegerP.imprimirTamanho();
    }
    
    
}

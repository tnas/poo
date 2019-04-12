package br.edu.tnas.poo.maratona;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class JogoEstrategiaTeste extends DesafioTeste<Integer> {
    
    static {
        _instance = new JogoEstrategiaTeste();
    }
    
    @Override
    public String getInputDirectory() {
        return "./maratona-input/JogoEstrategia/";
    }

    @Override
    public String getOutputDirectory() {
        return "./maratona-output/JogoEstrategia/";
    }

    @Override
    public Desafio<Integer> getDesafio() {
        return new JogoEstrategia();
    }
}

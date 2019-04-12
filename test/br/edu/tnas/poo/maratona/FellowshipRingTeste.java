package br.edu.tnas.poo.maratona;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class FellowshipRingTeste extends DesafioTeste<Integer> {
    
    static {
        _instance = new FellowshipRingTeste();
    }
    
    @Override
    public String getInputDirectory() {
        return "./maratona-input/FellowshipRing/";
    }

    @Override
    public String getOutputDirectory() {
        return "./maratona-input/FellowshipRing/";
    }

    @Override
    public Desafio<Integer> getDesafio() {
        return new FellowshipRing();
    }
}

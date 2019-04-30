package br.edu.tnas.poo.aula.interfaces;

public class Fusca implements Veiculo, Motorizado {

    @Override
    public String getTipo() {
        return "veiculo urbano";
    }

    @Override
    public double getPeso() {
        return 1650.0;
    }

    @Override
    public double getPotencia() {
        return 139.0;
    }

    @Override
    public int getRPM() {
        return 8000;
    }
}

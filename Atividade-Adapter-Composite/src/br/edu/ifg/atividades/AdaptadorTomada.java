package br.edu.ifg.atividades;

public class AdaptadorTomada implements TomadaNova { // [cite: 37]
    private TomadaAntiga tomadaAntiga;

    public AdaptadorTomada(TomadaAntiga tomadaAntiga) { // [cite: 38]
        this.tomadaAntiga = tomadaAntiga;
    }

    @Override
    public void fornecerEnergiaNova() {
        tomadaAntiga.fornecerEnergiaAntiga(); // [cite: 38]
    }
}
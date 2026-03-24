package br.edu.ifg.atividades.builder.interfaces;

import br.edu.ifg.atividades.builder.model.Computador;

public class ConcretoBuilder implements ComputadorBuilder {
    private String processador;
    private int memoriaRAM;
    private int armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;
    private boolean tecladoMecanico;
    private boolean monitorAdicional;

    @Override
    public ComputadorBuilder comProcessador(String processador) {
        this.processador = processador;
        return this;
    }

    @Override
    public ComputadorBuilder comMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
        return this;
    }

    @Override
    public ComputadorBuilder comArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }

    @Override
    public ComputadorBuilder comPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
        return this;
    }

    @Override
    public ComputadorBuilder comSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
        return this;
    }

    @Override
    public ComputadorBuilder comTecladoMecanico(boolean tecladoMecanico) {
        this.tecladoMecanico = tecladoMecanico;
        return this;
    }

    @Override
    public ComputadorBuilder comMonitorAdicional(boolean monitorAdicional) {
        this.monitorAdicional = monitorAdicional;
        return this;
    }

    @Override
    public Computador build() {
        return new Computador(processador, memoriaRAM, armazenamento, 
                             placaDeVideo, sistemaOperacional, 
                             tecladoMecanico, monitorAdicional);
    }
}
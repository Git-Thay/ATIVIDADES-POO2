package br.edu.ifg.atividades.builder.interfaces;

import br.edu.ifg.atividades.builder.model.Computador;

public interface ComputadorBuilder {
    ComputadorBuilder comProcessador(String processador); // [cite: 22]
    ComputadorBuilder comMemoriaRAM(int memoriaRAM);     // [cite: 23]
    ComputadorBuilder comArmazenamento(int armazenamento); // [cite: 26]
    ComputadorBuilder comPlacaDeVideo(String placaDeVideo); // [cite: 27]
    ComputadorBuilder comSistemaOperacional(String sistemaOperacional); // [cite: 28]
    ComputadorBuilder comTecladoMecanico(boolean tecladoMecanico); // [cite: 29]
    ComputadorBuilder comMonitorAdicional(boolean monitorAdicional); // [cite: 30]
    Computador build(); // [cite: 32]
}
package br.edu.ifg.atividades.builder.model;

public class Computador {
    private String processador;
    private int memoriaRAM;
    private int armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;
    private boolean tecladoMecanico;
    private boolean monitorAdicional;

    // Construtor privado para restringir a criação direta 
    private Computador() {}

    // Construtor que recebe o Builder (Inner Class ou Implementação)
    public Computador(String processador, int memoriaRAM, int armazenamento, 
                      String placaDeVideo, String sistemaOperacional, 
                      boolean tecladoMecanico, boolean monitorAdicional) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.placaDeVideo = placaDeVideo;
        this.sistemaOperacional = sistemaOperacional;
        this.tecladoMecanico = tecladoMecanico;
        this.monitorAdicional = monitorAdicional;
    }

    @Override
    public String toString() {
        return "Computador {" +
                "\n  Processador: " + processador +
                "\n  RAM: " + memoriaRAM + "GB" +
                "\n  Armazenamento: " + armazenamento + "GB" +
                "\n  Placa de Vídeo: " + (placaDeVideo != null ? placaDeVideo : "Integrada") +
                "\n  S.O: " + sistemaOperacional +
                "\n  Teclado Mecânico: " + (tecladoMecanico ? "Sim" : "Não") +
                "\n  Monitor Adicional: " + (monitorAdicional ? "Sim" : "Não") +
                "\n}";
    }
}
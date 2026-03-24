package br.edu.ifg.atividades;

import br.edu.ifg.atividades.builder.interfaces.ConcretoBuilder;
import br.edu.ifg.atividades.builder.model.Computador;
import br.edu.ifg.atividades.prototype.model.Documento;

public class Main {
    public static void main(String[] args) {

        // --- TESTE BUILDER ---
        System.out.println("=== TESTE PADRÃO BUILDER ===");

        Computador escritorio = new ConcretoBuilder()
                .comProcessador("Intel i3")
                .comMemoriaRAM(8)
                .comArmazenamento(256)
                .comSistemaOperacional("Windows 11")
                .build(); // [cite: 36]

        Computador gamer = new ConcretoBuilder()
                .comProcessador("Ryzen 9")
                .comMemoriaRAM(32)
                .comPlacaDeVideo("RTX 4080")
                .comTecladoMecanico(true)
                .build(); // [cite: 37]

        System.out.println(escritorio);
        System.out.println(gamer);

        // --- TESTE PROTOTYPE ---
        System.out.println("\n=== TESTE PADRÃO PROTOTYPE ===");

        // Modelo Original [cite: 77, 88]
        Documento oficioPadrao = new Documento("Ofício Padrão", "Diretoria de Ensino",
                "Encaminhamos o presente documento para apreciação.",
                "Direção Geral", "24/03/2026", "Normal");

        // Clone 1: Urgente [cite: 96]
        Documento urgente = oficioPadrao.clone();
        urgente.setTitulo("Ofício Urgente - TI");
        urgente.setNivelPrioridade("Alta");

        // Clone 2: Conteúdo novo [cite: 98]
        Documento informativo = oficioPadrao.clone();
        informativo.setData("25/03/2026");
        informativo.setConteudoBase("Conteúdo complementar sobre o vestibular.");

        System.out.println("ORIGINAL:\n" + oficioPadrao);
        System.out.println("CÓPIA 1 (Urgente):\n" + urgente);
        System.out.println("CÓPIA 2 (Nova Data):\n" + informativo);
    }
}
package br.edu.ifg.turismo.subsistemas;

public class SistemaVoos {
    public boolean verificarDisponibilidade(String origem, String destino) {
        System.out.println("Verificando voos de " + origem + " para " + destino + "...");
        return true; // Simula que sempre há voo disponível [cite: 69]
    }
}
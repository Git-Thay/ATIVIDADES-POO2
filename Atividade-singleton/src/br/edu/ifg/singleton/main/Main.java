package br.edu.ifg.singleton.main; // Ajuste o pacote aqui

import br.edu.ifg.singleton.model.Logger; // Importe o Logger

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Módulo de Vendas: Iniciando sistema");

        Logger logger2 = Logger.getInstance();
        logger2.log("Módulo de Estoque: Processando dados de produtos");

        Logger logger3 = Logger.getInstance();
        logger3.log("Módulo de Segurança: Finalizando sistema com sucesso");

        logger1.exibirLogs();

        System.out.println("\n--- COMPROVAÇÃO DE INSTÂNCIA ---");
        System.out.println("ID Logger 1: " + System.identityHashCode(logger1));
        System.out.println("ID Logger 2: " + System.identityHashCode(logger2));
        System.out.println("ID Logger 3: " + System.identityHashCode(logger3));
    }
}
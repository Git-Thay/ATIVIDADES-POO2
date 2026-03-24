package br.edu.ifg.singleton.model;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    // b. Atributo estático para armazenar a instância única [cite: 23]
    private static Logger instancia;

    // a. Atributo para armazenar as mensagens [cite: 17]
    private List<String> logs;

    // b. Construtor privado: impede o uso de 'new' fora desta classe [cite: 22, 42]
    private Logger() {
        logs = new ArrayList<>();
    }

    // b. Método público estático para acesso à instância [cite: 24, 25]
    public static Logger getInstance() {
        if (instancia == null) {
            instancia = new Logger(); // Cria apenas se não existir [cite: 5]
        }
        return instancia;
    }

    // a. Método para adicionar uma mensagem ao log [cite: 19]
    public void log(String mensagem) {
        logs.add(mensagem);
    }

    // a. Método para imprimir todas as mensagens no console [cite: 19]
    public void exibirLogs() {
        System.out.println("--- EXIBINDO LOGS DO SISTEMA ---");
        for (String mensagem : logs) {
            System.out.println(mensagem);
        }
    }
}

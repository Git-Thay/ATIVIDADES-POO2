package br.edu.ifg.atividades;

public class Notebook {
    public void conectar(TomadaNova tomada) { // [cite: 31]
        System.out.println("Notebook conectado."); // [cite: 34]
        tomada.fornecerEnergiaNova(); // [cite: 35]
    }
}
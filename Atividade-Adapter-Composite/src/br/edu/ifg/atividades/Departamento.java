package br.edu.ifg.atividades;

import java.util.ArrayList;
import java.util.List;

public class Departamento implements Funcionario { // [cite: 97]
    private String nome;
    private List<Funcionario> funcionarios = new ArrayList<>(); // [cite: 100]

    public Departamento(String nome) {
        this.nome = nome;
    }

    public void adicionar(Funcionario f) { funcionarios.add(f); } // [cite: 104]
    public void remover(Funcionario f) { funcionarios.remove(f); } // [cite: 105]

    @Override
    public String getNome() { return nome; }

    @Override
    public double getSalario() {
        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.getSalario(); // Cálculo recursivo [cite: 107]
        }
        return total;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Departamento: " + nome); // [cite: 108]
        for (Funcionario f : funcionarios) {
            f.mostrarDetalhes(); // Chamada recursiva [cite: 108]
        }
    }
}
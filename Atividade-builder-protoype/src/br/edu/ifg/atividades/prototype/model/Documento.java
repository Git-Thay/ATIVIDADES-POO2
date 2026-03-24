package br.edu.ifg.atividades.prototype.model;

import br.edu.ifg.atividades.prototype.interfaces.Prototype;

public class Documento implements Prototype {
    private String titulo;
    private String setorResponsavel;
    private String conteudoBase;
    private String assinatura;
    private String data;
    private String nivelPrioridade;

    public Documento(String titulo, String setorResponsavel, String conteudoBase, 
                     String assinatura, String data, String nivelPrioridade) {
        this.titulo = titulo;
        this.setorResponsavel = setorResponsavel;
        this.conteudoBase = conteudoBase;
        this.assinatura = assinatura;
        this.data = data;
        this.nivelPrioridade = nivelPrioridade;
    }

    // Método de clonagem: cria uma nova instância com os dados atuais [cite: 71, 84]
    @Override
    public Documento clone() {
        return new Documento(this.titulo, this.setorResponsavel, this.conteudoBase, 
                             this.assinatura, this.data, this.nivelPrioridade);
    }

    // Getters e Setters para permitir alteração após clonagem [cite: 74, 85]
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setConteudoBase(String conteudoBase) { this.conteudoBase = conteudoBase; }
    public void setData(String data) { this.data = data; }
    public void setNivelPrioridade(String nivelPrioridade) { this.nivelPrioridade = nivelPrioridade; }

    @Override
    public String toString() {
        return "Documento [" + titulo + "] - Setor: " + setorResponsavel + 
               " | Data: " + data + " | Prioridade: " + nivelPrioridade + 
               "\nConteúdo: " + conteudoBase + "\nAssinatura: " + assinatura + "\n";
    }
}
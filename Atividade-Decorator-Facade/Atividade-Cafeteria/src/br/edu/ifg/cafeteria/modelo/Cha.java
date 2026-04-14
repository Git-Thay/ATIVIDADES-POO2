package br.edu.ifg.cafeteria.modelo;

public class Cha implements Bebida {
    @Override
    public String getDescricao() {
        return "Chá";
    }

    @Override
    public double getCusto() {
        return 4.00;
    }
}
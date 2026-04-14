package br.edu.ifg.cafeteria.decoradores;

import br.edu.ifg.cafeteria.modelo.Bebida;

public class Leite extends AdicionalDecorator {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + leite";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 1.50;
    }
}
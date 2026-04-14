package br.edu.ifg.cafeteria.decoradores;

import br.edu.ifg.cafeteria.modelo.Bebida;

public class Chocolate extends AdicionalDecorator {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + chocolate";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 2.00;
    }
}
package br.edu.ifg.cafeteria.decoradores;

import br.edu.ifg.cafeteria.modelo.Bebida;

public class Chantilly extends AdicionalDecorator {
    public Chantilly(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + chantilly";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 2.50;
    }
}
package br.edu.ifg.cafeteria.decoradores;

import br.edu.ifg.cafeteria.modelo.Bebida;

public abstract class AdicionalDecorator implements Bebida {
    protected Bebida bebida;

    public AdicionalDecorator(Bebida bebida) {
        this.bebida = bebida;
    }
}
package br.edu.ifg.cafeteria.modelo;

public class CafeSimples implements Bebida {
    @Override
    public String getDescricao() {
        return "Café simples";
    }

    @Override
    public double getCusto() {
        return 5.00;
    }
}
package br.edu.ifg.turismo;

import br.edu.ifg.turismo.fachada.FacadeCompraPassagem;

public class MainFacade {
    public static void main(String[] args) {
        FacadeCompraPassagem fachada = new FacadeCompraPassagem();

        // O cliente não sabe que existem 4 sistemas diferentes rodando por trás
        fachada.comprarPassagem("Thays Marques", "Goiânia", "São Paulo", 450.00);
    }
}
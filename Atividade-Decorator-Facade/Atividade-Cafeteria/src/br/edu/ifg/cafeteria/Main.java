package br.edu.ifg.cafeteria;

import br.edu.ifg.cafeteria.modelo.*;
import br.edu.ifg.cafeteria.decoradores.*;

public class Main {
    public static void main(String[] args) {
        // 1. Café simples com leite e chocolate
        Bebida pedido1 = new CafeSimples();
        pedido1 = new Leite(pedido1);
        pedido1 = new Chocolate(pedido1);
        exibirPedido(pedido1);

        // 2. Chá com chantilly
        Bebida pedido2 = new Cha();
        pedido2 = new Chantilly(pedido2);
        exibirPedido(pedido2);

        // 3. Café simples com leite, chocolate e chantilly
        Bebida pedido3 = new CafeSimples();
        pedido3 = new Leite(pedido3);
        pedido3 = new Chocolate(pedido3);
        pedido3 = new Chantilly(pedido3);
        exibirPedido(pedido3);
    }

    private static void exibirPedido(Bebida bebida) {
        System.out.println("Pedido: " + bebida.getDescricao());
        System.out.printf("Custo Total: R$ %.2f%n", bebida.getCusto());
        System.out.println("------------------------------------");
    }
}
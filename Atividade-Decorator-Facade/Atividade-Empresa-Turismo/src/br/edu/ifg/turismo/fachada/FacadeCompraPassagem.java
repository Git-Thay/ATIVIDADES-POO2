package br.edu.ifg.turismo.fachada;

import br.edu.ifg.turismo.subsistemas.*;

public class FacadeCompraPassagem {
    private SistemaVoos voos;
    private SistemaReserva reserva;
    private SistemaPagamento pagamento;
    private SistemaNotificacao notificacao;

    public FacadeCompraPassagem() {
        this.voos = new SistemaVoos();
        this.reserva = new SistemaReserva();
        this.pagamento = new SistemaPagamento();
        this.notificacao = new SistemaNotificacao();
    }

    public void comprarPassagem(String passageiro, String origem, String destino, double valor) {
        System.out.println("Iniciando processo de compra para: " + passageiro);

        // 1. Verificar disponibilidade [cite: 89]
        if (!voos.verificarDisponibilidade(origem, destino)) {
            System.out.println("Compra cancelada: Voo indisponível.");
            return;
        }

        // 2. Reservar assento [cite: 90]
        reserva.reservarAssento(passageiro);

        // 3. Processar pagamento [cite: 91]
        if (!pagamento.processarPagamento(passageiro, valor)) {
            System.out.println("Compra cancelada: Falha no pagamento.");
            return;
        }

        // 4. Enviar confirmação [cite: 92]
        notificacao.enviarConfirmacao(passageiro);

        System.out.println("Compra finalizada com sucesso!");
    }
}
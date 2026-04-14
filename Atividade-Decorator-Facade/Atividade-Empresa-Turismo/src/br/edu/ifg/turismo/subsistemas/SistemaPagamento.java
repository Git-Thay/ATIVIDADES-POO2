package br.edu.ifg.turismo.subsistemas;

public class SistemaPagamento {
    public boolean processarPagamento(String passageiro, double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " para o passageiro " + passageiro + "...");
        System.out.println("Pagamento realizado com sucesso!");
        return true;
    }
}
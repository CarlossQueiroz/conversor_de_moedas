package br.com.conversorDeMoedas.Principal;

import br.com.conversorDeMoedas.Modelos.Moeda;
import br.com.conversorDeMoedas.Servicos.MenuOpcoes;
import br.com.conversorDeMoedas.Servicos.RequisicaoHttp;
import br.com.conversorDeMoedas.Servicos.TaxasDeCambio;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        MenuOpcoes opcoes = new MenuOpcoes();
        boolean continuar = true;

        while(continuar){

            opcoes.menuMoedas();
            String moedaOrigem = opcoes.lerMoeda("de origem");
            String moedaDestino = opcoes.lerMoeda("de destino");

            try {
                RequisicaoHttp requisicaoHttp = new RequisicaoHttp();
                TaxasDeCambio taxasDeConversao = requisicaoHttp.requisicao(moedaOrigem);

                if (!taxasDeConversao.getConversion_rates().containsKey(moedaDestino)) {
                    System.out.println("Moeda de destino inválida ou não disponível.");
                    return;
                }

                double valor = opcoes.lerValorConversao();
                double taxa = taxasDeConversao.getConversion_rates().get(moedaDestino);

                Moeda moeda = new Moeda(moedaOrigem,moedaDestino,valor,taxa);
                System.out.println(moeda);

            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
            continuar=opcoes.stop();
        }
    }
}

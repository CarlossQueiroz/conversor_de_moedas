package br.com.conversorDeMoedas.Modelos;

public class ConversorMoedas {
    private String moedaOrigem;
    private String moedaDestino;
    private double valor;
    private double taxaConversao;

    public ConversorMoedas(String moedaOrigem, String moedaDestino, double valor, double taxaConversao) {
        this.moedaOrigem = moedaOrigem;
        this.moedaDestino = moedaDestino;
        this.valor = valor;
        this.taxaConversao = taxaConversao;
    }

    public String getMoedaOrigem() {
        return moedaOrigem;
    }

    public String getMoedaDestino() {
        return moedaDestino;
    }

    public double getValor() {
        return valor;
    }

    public double getTaxaConversao() {
        return taxaConversao;
    }

    @Override
    public String toString() {
        return "ConversorMoedas{" +
                "moedaOrigem='" + moedaOrigem + '\'' +
                ", moedaDestino='" + moedaDestino + '\'' +
                ", valor=" + valor +
                ", taxaConversao=" + taxaConversao +
                '}';
    }
}

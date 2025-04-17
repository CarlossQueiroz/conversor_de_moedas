package br.com.conversorDeMoedas.Modelos;

public class Moeda {
    private String moedaOrigem;
    private String moedaDestino;
    private double valorOriginal;
    private double taxaDeCambio;
    private double valorConvertido;

    public Moeda(String moedaOrigem, String moedaDestino, double valorOriginal, double taxaDeCambio) {
        this.moedaOrigem = moedaOrigem;
        this.moedaDestino = moedaDestino;
        this.valorOriginal = valorOriginal;
        this.taxaDeCambio = taxaDeCambio;
        this.valorConvertido = valorOriginal * taxaDeCambio;
    }

    public String getMoedaOrigem() {
        return moedaOrigem;
    }

    public String getMoedaDestino() {
        return moedaDestino;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    public double getTaxaDeCambio() {
        return taxaDeCambio;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }

    @Override
    public String toString() {
        return String.format("Valor %.2f [%s] corresponde a %.2f [%s]", valorOriginal, moedaOrigem, valorConvertido, moedaDestino);
    }
}

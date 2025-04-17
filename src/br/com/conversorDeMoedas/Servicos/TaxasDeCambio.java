package br.com.conversorDeMoedas.Servicos;

import java.util.Map;

public class TaxasDeCambio {
    private Map<String,Double> conversion_rates;

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    @Override
    public String toString() {
        return "TaxasDeCambio{" +
                "conversion_rates = " + conversion_rates +
                '}';
    }
}

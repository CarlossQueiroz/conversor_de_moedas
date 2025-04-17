package br.com.conversorDeMoedas.Servicos;

import br.com.conversorDeMoedas.Recursos.ConfiguracaoKey;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequisicaoHttp {

    public TaxasDeCambio requisicao(String codMoeda) throws IOException, InterruptedException {
        ConfiguracaoKey config = new ConfiguracaoKey();
        String apiKey = config.getApiKey();

        String endereco = "https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/"+codMoeda;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), TaxasDeCambio.class);
    }
}

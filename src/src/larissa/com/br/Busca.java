package src.larissa.com.br;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Busca {
    public String buscarCotacoes() throws IOException, InterruptedException {

        HttpClient cliente = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/34522f45c48f5af58231a6b7/latest/USD"))
                .GET()
                .build();

        HttpResponse<String> response =
                cliente.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();

    }
    Gson gson = new Gson();
}
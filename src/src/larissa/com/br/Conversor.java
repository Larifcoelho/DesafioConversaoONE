package src.larissa.com.br;
import com.google.gson.Gson;

public class Conversor {
    public double converter (String json, String moeda) {
        Gson gson = new Gson();

        RespostaApi resposta = gson.fromJson(json, RespostaApi.class);

        double taxaBRL = resposta.conversion_rates.get("BRL");
        double taxaDestino = resposta.conversion_rates.get(moeda);

        return taxaDestino/ taxaBRL;
    }

}

package src.larissa.com.br;

public class Calculo {
   public double converter ( double valorEmBRL, String moeda, RespostaApi resposta){

       double taxaBRL = resposta.conversion_rates.get("BRL");
       double taxaDestino = resposta.conversion_rates.get(moeda);

       return valorEmBRL / taxaBRL * taxaDestino;

    }

}

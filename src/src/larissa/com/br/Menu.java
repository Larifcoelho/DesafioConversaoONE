package src.larissa.com.br;

import java.util.Scanner;

public class Menu {
    public void exibir() throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {

            System.out.println("\n === Conversor de Moedas ===");
            System.out.println("1. Real -> Dólar ");
            System.out.println("2. Real -> Libra ");
            System.out.println("3. Real -> Euro ");
            System.out.println("4. Real -> Iene ");
            System.out.println("5. Real -> Peso Argentino ");
            System.out.println("6. Real -> Franco Suiço ");
            System.out.println("0 = Sair ");

            System.out.println("Escolha: ");
            int opcao = scanner.nextInt();

            if (opcao == 0){
                rodando = false;
                System.out.println("Encerrando...");
                break;
            }
            System.out.println("Digite o valor em BRL: ");
            double valor = scanner.nextDouble();

            String moedaDestino = switch (opcao) {
                case 1 -> "USD";
                case 2 -> "GBP";
                case 3 -> "EUR";
                case 4 -> "JPY";
                case 5 -> "ARS";
                case 6 -> "CHF";
                default -> throw new IllegalArgumentException("Opção inválida");

            };

            Busca busca = new Busca();
            String json = busca.buscarCotacoes();

            Conversor conversor = new Conversor();
            RespostaApi resposta =
                    new com.google.gson.Gson().fromJson(json, RespostaApi.class);

            double resultado =
                    conversor.converter(valor, moedaDestino, resposta);

            System.out.printf(
                    "Resultado: %.2f %s%n",
                    resultado,
                    moedaDestino
            );
        }

        scanner.close();
    }
}


        }
    }

}
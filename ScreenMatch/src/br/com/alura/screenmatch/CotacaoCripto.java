package br.com.alura.screenmatch;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CotacaoCripto {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome de uma cripto moeda para ser dita qual é a cotação atual da mesma.");
        var cripto = sc.nextLine();
        var key = "CG-nAxdi63jMUU2ta3dfqBZ6QNV";
        String endereco = "https://www.coingecko.com/en/coins" +cripto+ "&key=" +key;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}

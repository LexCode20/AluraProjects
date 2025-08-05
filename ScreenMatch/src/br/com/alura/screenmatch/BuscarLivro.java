package br.com.alura.screenmatch;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BuscarLivro {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome livro que deseja");
        var livro = sc.nextLine();
        var key = "AIzaSyBGyQTh5xpZXLs_bmvnxfTz7ROx9FvuW-U";
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" +livro+ "&key=" +key;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }
}

package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um filme para busca: ");
		String busca = leitura.nextLine();

		String chave = "6ed5bc22";
		String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=" + chave;

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest req = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

		HttpResponse<String> response = client.send(req, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());

	}

}

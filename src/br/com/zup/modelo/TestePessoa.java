package br.com.zup.modelo;

import br.com.zup.modelo.Ator;
import br.com.zup.modelo.Programador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TestePessoa {

	public static void main(String[] args) {
		
		//Teste Programador
		Programador programador = new Programador("Paulo", "Silva", 25, "Java", 4, "Sim");
		System.out.println(programador);
				
		//Teste Ator
		// Gerador aleatorio
		Random random = new Random();
		// Lista de filmes participados Ator
		List<String> filmes = Arrays.asList("Baywatch", "Hampage", "Um espião e meio", "Hércules");		
		
		Ator ator = new Ator("Dwayne", "Johson", 47, filmes, false, 1972);
		
		int numero = random.nextInt(ator.getFilmesParticipados().size());
		ator.setMelhorFilme(ator.pegarFilme(numero, ator.getFilmesParticipados()));
		
		System.out.println(ator);
		
	}

}

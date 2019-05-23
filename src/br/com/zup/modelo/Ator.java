package br.com.zup.modelo;

import java.util.List;

public class Ator extends Pessoa {
	
	// Atributos únicos
	private List<String> filmesParticipados;
	private boolean temOscar;
	private int anoNascimento;
	private String melhorFilme;
	
	// Construtor
	public Ator(String nome, String sobrenome, int idade, List<String> filmesParticipados, boolean temOscar,
			int anoNascimento) {
		super(nome, sobrenome, idade);
		
		this.filmesParticipados = filmesParticipados;
		this.temOscar = temOscar;
		this.anoNascimento = anoNascimento;
	}

		// Get & Set
	public List<String> getFilmesParticipados() {
		return filmesParticipados;
	}

	public void setFilmesParticipados(List<String> filmesParticipados) {
		this.filmesParticipados = filmesParticipados;
	}

	public boolean isTemOscar() {
		return temOscar;
	}

	public void setTemOscar(boolean temOscar) {
		this.temOscar = temOscar;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getMelhorFilme() {
		return melhorFilme;
	}

	public void setMelhorFilme(String melhorFilme) {
		this.melhorFilme = melhorFilme;
	}
	
	// toString
	public String toString() {
		String modelo = "";
		
		modelo += "Nome -> " + this.getNome() + "\n";
		modelo += "Sobrenome -> " + this.getSobrenome() + "\n";
		modelo += "Idade -> " + this.getIdade() + "\n";
		modelo += "Filmes participados -> " + this.getFilmesParticipados() + "\n";
		modelo += "Tem Oscar -> " + this.isTemOscar() + "\n";
		modelo += "Ano de nascimento -> " + this.getAnoNascimento() + "\n";
		modelo += "Melhor filme -> " + this.melhorFilme + "\n";

		return modelo;
	}
	
	// Melhor filme
	public String pegarFilme(int numero, List<String> melhorFilme) {
		
		String filme = melhorFilme.get(numero);
		
		return filme;
	}
	
	
}

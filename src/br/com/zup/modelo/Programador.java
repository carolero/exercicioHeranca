package br.com.zup.modelo;

public class Programador extends Pessoa {
	
	// Atributos únicos
	private String linguagemUtilizada;
	private int anosDeExperiencia;
	private String gostaDeCafe;

	// Construtor
	public Programador(String nome, String sobrenome, int idade, String linguagemUtilizada, int anosDeExperiencia, String gostaDeCafe) {
		super(nome, sobrenome, idade);
		this.linguagemUtilizada = linguagemUtilizada;
		this.anosDeExperiencia = anosDeExperiencia;
		this.gostaDeCafe = gostaDeCafe;
	}

	// Get & Set
	public String getLinguagemUtilizada() {
		return linguagemUtilizada;
	}

	public void setLinguagemUtilizada(String linguagemUtilizada) {
		this.linguagemUtilizada = linguagemUtilizada;
	}

	public int getAnosDeExperiencia() {
		return anosDeExperiencia;
	}

	public void setAnosDeExperiencia(int anosDeExperiencia) {
		this.anosDeExperiencia = anosDeExperiencia;
	}

	public String getGostaDeCafe() {
		return gostaDeCafe;
	}

	public void setGostaDeCafe(String gostaDeCafe) {
		this.gostaDeCafe = gostaDeCafe;
	}
	
	// toString
	
	public String toString() {
		String modelo = "";
		
		modelo += "Nome -> " + this.getNome() + "\n";
		modelo += "Sobrenome -> " + this.getSobrenome() + "\n";
		modelo += "Idade -> " + this.getIdade() + "\n";
		modelo += "Linguagem usada -> " + this.getLinguagemUtilizada() + "\n";
		modelo += "Anos de experiência -> " + this.getAnosDeExperiencia() + "\n";
		modelo += "Gosta de café? -> " + this.getGostaDeCafe() + "\n";
		
		return modelo;
	}
	
}

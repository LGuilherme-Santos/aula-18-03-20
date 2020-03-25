package br.fai.aula;

public class Girafa extends Animal {
	
	String tipo = "Girafa";
	
	public String getTipo() {
		return this.tipo;
	}

	public Girafa(String nome, int id) {
		setId(id);
		setNome(nome);
	}
	
	@Override
	public String toString() {
		
		return " | " + this.id + " | " + this.nome;
	}
}

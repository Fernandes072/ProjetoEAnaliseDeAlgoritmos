package a02;

public class Aluno {
	
	private String nome;
	private double nota;
	
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	public Aluno() {
		
	}

	public double getNota() {
		return nota;
	}

	@Override
	public String toString() {
		return nome + "(" + nota + ")";
	}
}
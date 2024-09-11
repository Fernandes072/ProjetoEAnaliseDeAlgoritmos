package a12;

public class Aluno implements Comparable {

	protected String nome;
	protected double nota;

	public Aluno(String nome, double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}

	@Override
	public String toString() {
		return nome + " (" + nota + ")";
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Aluno) {
			Aluno outro = (Aluno) o;
			if (nota < outro.nota) {
				return -1;
			} else if (nota > outro.nota) {
				return 1;
			}
		}
		return 0;
	}
}
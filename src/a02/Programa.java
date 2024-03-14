package a02;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(new Aluno("João", 4));
		alunos.add(new Aluno("José", 7));
		alunos.add(new Aluno("Maria", 1));
		alunos.add(new Aluno("Paulo", 9));
		alunos.add(new Aluno("Mônica", 5));
		alunos.add(new Aluno("Magali", 3));
		alunos.add(new Aluno("Cascão", 8));
		alunos.add(new Aluno("Cebolinha", 2));
		
		ordenar(alunos);
		System.out.println("Todos os alunos: " + alunos);
		
		System.out.println("Maior nota: " + alunos.get(alunos.size()-1));
		
		System.out.println("Menor nota: " + alunos.get(0));
		
		System.out.print("3 maiores notas: ");
		for (int i = alunos.size()-1; i > alunos.size()-4; i--) {
			System.out.print(alunos.get(i) + " ");
		}
		
		System.out.println();
		
		System.out.print("3 menores notas: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(alunos.get(i) + " ");
		}
	}

	private static void ordenar(List<Aluno> alunos) {
		for (int atual = 0; atual < alunos.size(); atual++) {
			int menor = atual;
			for (int i = atual; i < alunos.size(); i++) {
				if (alunos.get(i).getNota() < alunos.get(menor).getNota()) {
					menor = i;
				}
			}
			
			Aluno menorAluno = alunos.get(menor);
			Aluno atualAluno = alunos.get(atual);
			
			alunos.add(atual, menorAluno);
			alunos.add(menor, atualAluno);
			
			alunos.remove(atual+1);
			alunos.remove(menor + 1);

		}
	}

}
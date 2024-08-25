package a11;

public class Programa {
	public static void main(String[] args) {
		
		int tamanho = 50000;
		
		Comparable[] alunos1 = new Comparable[tamanho];
		for (int i = 0; i < alunos1.length; i++) {
			Comparable a = new Aluno("teste", 1);
			alunos1[i] = new Aluno("aluno"+(i+1),a.hashCode()/1000);
		}
		
		Comparable[] alunos2 = new Comparable[tamanho];
		for (int i = 0; i < alunos2.length; i++) {
			alunos2[i] = alunos1[i];
		}
		
		Comparable[] alunos3 = new Comparable[tamanho];
		for (int i = 0; i < alunos3.length; i++) {
			alunos3[i] = alunos2[i];
		}
		
		//imprime(alunos1);
		long inicio = System.currentTimeMillis();
		SelectionSort.ordena(alunos1);
		long fim = System.currentTimeMillis();
		//imprime(alunos1);
		System.out.println("Tempo de execução selection: " + (fim-inicio) + "ms");
		
		System.out.println();
		
		//imprime(alunos2);
		inicio = System.currentTimeMillis();
		InsertionSort.ordena(alunos2);
		fim = System.currentTimeMillis();
		//imprime(alunos2);
		System.out.println("Tempo de execução insertion: " + (fim-inicio) + "ms");
		
		System.out.println();
		
		//imprime(alunos3);
		inicio = System.currentTimeMillis();
		MergeSort.ordena(alunos3, 0, alunos3.length);
		fim = System.currentTimeMillis();
		//imprime(alunos3);
		System.out.println("Tempo de execução merge: " + (fim-inicio) + "ms");
	}
	
	private static void imprime(Aluno[] alunos) {
		for (int i = 0; i < alunos.length; ++i) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(alunos[i]);
		}
		System.out.println();
	}
}

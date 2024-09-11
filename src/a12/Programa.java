package a12;

public class Programa {

	public static void main(String[] args) {
		int tamanho = 50000;
		long inicio = 0;
		long fim = 0;

		Comparable[] selection = new Comparable[tamanho];
		for (int i = 0; i < tamanho; i++) {
			Comparable a = new Aluno("teste", 1);
			selection[i] = new Aluno("aluno" + (i + 1), a.hashCode() / 1000);
		}

		Comparable[] insertion = new Comparable[tamanho];
		for (int i = 0; i < tamanho; i++) {
			insertion[i] = selection[i];
		}

		Comparable[] merge = new Comparable[tamanho];
		for (int i = 0; i < tamanho; i++) {
			merge[i] = selection[i];
		}

		Comparable[] quick = new Comparable[tamanho];
		for (int i = 0; i < tamanho; i++) {
			quick[i] = selection[i];
		}

		inicio = System.currentTimeMillis();
		SelectionSort.ordena(selection);
		fim = System.currentTimeMillis();
		System.out.println("Tempo de execução selection: " + (fim - inicio) + "ms");
		System.out.println();

		inicio = System.currentTimeMillis();
		InsertionSort.ordena(insertion);
		fim = System.currentTimeMillis();
		System.out.println("Tempo de execução insertion: " + (fim - inicio) + "ms");
		System.out.println();

		inicio = System.currentTimeMillis();
		MergeSort.ordena(merge, 0, merge.length);
		fim = System.currentTimeMillis();
		System.out.println("Tempo de execução merge: " + (fim - inicio) + "ms");
		System.out.println();

		inicio = System.currentTimeMillis();
		QuickSort.ordena(quick, 0, quick.length);
		fim = System.currentTimeMillis();
		System.out.println("Tempo de execução quick: " + (fim - inicio) + "ms");
		System.out.println();
	}

	private static void imprime(Comparable[] elementos) {
		for (int i = 0; i < elementos.length; ++i) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(elementos[i]);
		}
		System.out.println();
	}
}

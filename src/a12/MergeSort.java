package a12;

public class MergeSort {

	public static void ordena(Comparable[] elementos, int inicio, int fim) {
		// pega o meio
		int meio = (fim + inicio) / 2;
		if ((fim - inicio) > 2) {
			// ordena o lado esquerdo
			ordena(elementos, inicio, meio);
			// ordena o lado direito
			ordena(elementos, meio, fim);
		}
		// junta os dois lados ordenados
		intercala(elementos, inicio, meio, fim);
	}

	private static void intercala(Comparable[] elementos, int inicio, int meio, int fim) {
		Comparable[] resultado = new Comparable[fim - inicio];
		int atual1 = inicio, atual2 = meio, atual = 0;

		while (atual1 < meio && atual2 < fim) {
			if (elementos[atual1].compareTo(elementos[atual2]) < 0) {
				resultado[atual++] = elementos[atual1++];
			} else {
				resultado[atual++] = elementos[atual2++];
			}
		}

		while (atual1 < meio) {
			resultado[atual++] = elementos[atual1++];
		}
		while (atual2 < fim) {
			resultado[atual++] = elementos[atual2++];
		}

		for (int i = 0; i < resultado.length; ++i) {
			elementos[inicio + i] = resultado[i];
		}
	}
}

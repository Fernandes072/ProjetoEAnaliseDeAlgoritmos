package a12;

public class QuickSort {

	public static void ordena(Comparable[] elementos, int inicio, int fim) {
		int qtd = fim - inicio;
		if (qtd > 1) {
			int pivo = particiona(elementos, inicio, fim);
			ordena(elementos, inicio, pivo);
			ordena(elementos, pivo + 1, fim);
		}
	}

	private static int particiona(Comparable[] elementos, int inicio, int fim) {
		int menoresAteAgora = 0;
		int posicaoPivo = fim - 1;

		Comparable pivo = elementos[posicaoPivo];
		for (int i = inicio; i < fim; ++i) {
			if (elementos[i].compareTo(pivo) < 0) {
				troca(elementos, i, inicio + menoresAteAgora);
				menoresAteAgora++;
			}
		}
		troca(elementos, posicaoPivo, inicio + menoresAteAgora);
		return inicio + menoresAteAgora;
	}

	private static void troca(Comparable[] elementos, int p1, int p2) {
		Comparable temp = elementos[p1];
		elementos[p1] = elementos[p2];
		elementos[p2] = temp;
	}
}
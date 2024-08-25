package a11;

public class SelectionSort {

	public static void ordena(Comparable[] elementos) {
		for (int i = 0; i < elementos.length; ++i) {
			Comparable atual = elementos[i];

			// Encontra o menor
			int indiceMenor = buscaMenor(elementos, i, elementos.length);
			Comparable menor = elementos[indiceMenor];

			// Faz a troca
			elementos[indiceMenor] = atual;
			elementos[i] = menor;
		}
	}

	private static int buscaMenor(Comparable[] elementos, int inicio, int fim) {
		int indiceDoMenor = inicio;
		for (int atual = inicio;atual < fim; ++atual) {
			if (elementos[atual].compareTo(elementos[indiceDoMenor]) < 0) {
				indiceDoMenor = atual;
			}
		}
		return indiceDoMenor;
	}
}
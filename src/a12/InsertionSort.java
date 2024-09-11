package a12;

public class InsertionSort {

	public static void ordena(Comparable[] elementos) {
		for (int atual = 1; atual < elementos.length; ++atual) {
			int analise = atual;

			while (analise > 0 && elementos[analise].compareTo(elementos[analise - 1]) < 0) {
				moverParaTras(elementos, analise);
				analise--;
			}
		}
	}

	private static void moverParaTras(Comparable[] elementos, int posicao) {
		Comparable prodAnalise = elementos[posicao];
		elementos[posicao] = elementos[posicao - 1];
		elementos[posicao - 1] = prodAnalise;
	}
}
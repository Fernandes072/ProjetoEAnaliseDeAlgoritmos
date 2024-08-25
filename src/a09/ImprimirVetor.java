package a09;

public class ImprimirVetor {

	public static void main(String[] args) {
		
		int[] numeros = new int[]{1,2,3,4,5,6,7,8,9,10};
		imprimir(numeros, 0, new StringBuilder());

	}
	
	private static StringBuilder imprimir(int[] numeros, int posicao, StringBuilder sb) {
		if (posicao == (numeros.length - 1)) {
			return sb.append(numeros[posicao]);
		}
		return sb.append(imprimir(numeros, posicao + 1, sb));
	}

}

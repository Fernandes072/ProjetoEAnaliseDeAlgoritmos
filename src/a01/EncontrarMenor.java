package a01;

public class EncontrarMenor {

	public static void main(String[] args) {
		Produto[] produtos = new Produto[5];
		produtos[0] = new Produto("Trator",1000000);
		produtos[1] = new Produto("Jipe",46000);
		produtos[2] = new Produto("Brasilia",16000);
		produtos[3] = new Produto("Smart",44000);
		produtos[4] = new Produto("Fusca",17000);

		//int maisBarato = buscaMenor(produtos);
		ordenar(produtos);
		for (int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i]);
		}
		
		
		//System.out.println("O mais barato é " + produtos[maisBarato].nome + "(" + produtos[maisBarato].valor + ")");
	}

	private static void ordenar(Produto[] produtos) {
		for (int i = 0; i < produtos.length; i++) {
			int posicao = i;
			if (posicao > 0) {
				while (produtos[posicao].valor < produtos[posicao - 1].valor) {
					Produto reserva = produtos[posicao];
					produtos[posicao] = produtos[posicao - 1];
					produtos[posicao - 1] = reserva;
					posicao--;
					if(posicao == 0) {
						break;
					}
				}
			}
		}
		
	}

	private static int buscaMenor(Produto[] produtos) {
		int atual = 0;
		int maisBarato = 0;
		for (;atual < 5; ++atual) {
			if (produtos[atual].valor < produtos[maisBarato].valor) {
				maisBarato = atual;
			}
		}
		return maisBarato;
	}

}
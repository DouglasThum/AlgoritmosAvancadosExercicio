import java.util.Arrays;

public class AlgoritmoGuloso {
	
	public static void main(String[] args) {
		int troco = 189;
		int[] moedas = {50, 25, 10, 5, 2, 1};
		darTroco(troco, moedas);
	}
	
	public static void darTroco(int troco, int[] moedas) {
		Arrays.sort(moedas);
		
		int[] quantidade = new int[moedas.length];

		for (int i = moedas.length - 1; i >= 0; i--) {
			int moeda = moedas[i];
			if (troco >= moeda) {
				quantidade[i] = troco / moeda;
				troco -= quantidade[i] * moeda;
			}
		}
		
		if (troco == 0) {
			System.out.println("Troco dado com o menor número de moedas:");
			for (int i = moedas.length - 1; i >= 0; i--) {
				if (quantidade[i] > 0) {
					System.out.println(quantidade[i] + " moeda(s) de " + moedas[i]);
				}
			} 
		} else {
			System.out.println("Não foi possível dar o troco exato.");
		}
	}
}


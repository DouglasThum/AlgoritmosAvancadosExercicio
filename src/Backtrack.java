import java.util.ArrayList;
import java.util.List;

public class Backtrack {

	public static List<List<Integer>> gerarSubconjuntos(List<Integer> S, int n) {
		List<List<Integer>> result = new ArrayList<>();
		int index = 0;
		gerarCombinacoes(S, n, index, new ArrayList<>(), result);
		return result;
	}

	private static void gerarCombinacoes(List<Integer> S, int n, int index,
			List<Integer> temp,	List<List<Integer>> result) {
		if (temp.size() == n) {
			result.add(new ArrayList<>(temp));
			return;
		}

		for (int i = index; i < S.size(); i++) {
			temp.add(S.get(i));
			gerarCombinacoes(S, n, i + 1, temp, result);
			temp.remove(temp.size() - 1);
		}
	}

	public static void main(String[] args) {
		List<Integer> S = List.of(1, 2, 3);
		int n = 1;

		List<List<Integer>> subconjuntos = gerarSubconjuntos(S, n);

		for (List<Integer> subconjunto : subconjuntos) {
			System.out.println(subconjunto);
		}
	}
}

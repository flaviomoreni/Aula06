import java.util.Arrays;

public class OrdemCrescente {

	public static void main(String[] args) {

		int valores[] = { 18, 37, 61, 5, 33, 100, 34, 1, 76, 66, 44, 12, 80, 11, 31, 72, 16, 3, 5, 94, 49, 7, 75, 32,
				79 };

		for (int i = 1; i < valores.length; i++) {
			for (int x = 0; x < i; x++) {
				if (valores[i] < valores[x]) {
					int temp = valores[i];
					valores[i] = valores[x];
					valores[x] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(valores));

	}

}

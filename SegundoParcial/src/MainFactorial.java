import java.util.Scanner;

public class MainFactorial {

	public static int factorialDinamic(int n, int obtenidos[]) {
		if (n == 0) {
			return 1;
		} else if (obtenidos[n] != 0) {
			return obtenidos[n];
		} else {
			int resultado = factorialDinamic(n - 1, obtenidos) * n;
			obtenidos[n] = resultado;
			return resultado;
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int obtenidos[] = new int[n + 1];

		System.out.println(factorialDinamic(n, obtenidos));

	}

}

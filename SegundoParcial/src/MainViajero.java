import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MainViajero {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scn = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ////////////////////////////////////// llenado del grafo/matriz
		// ///////////////////////////
		// /////////////////////////////////////////////////7
		System.out.println("Ingrese el numero de ciudades");

		int nVertices = scn.nextInt();
		int MatrizPonderada[][] = new int[nVertices + 1][nVertices + 1];
		boolean[][] in = new boolean[nVertices + 1][nVertices + 1];
		System.out.print("\nIngrese  los costos de los viajes ( aristas) :\n");
		for (int i = 1; i <= nVertices; i++)
			for (int j = 1; j <= nVertices; j++) {
				in[i][j] = in[j][i] = false;
				if ((i != j) && (i < j)) {
					System.out.print(i + " a la ciudad " + j + ": ");
					MatrizPonderada[j][i] = MatrizPonderada[i][j] = Integer.parseInt(br.readLine());
					if (MatrizPonderada[i][j] == 0)
						MatrizPonderada[j][i] = MatrizPonderada[i][j] = 0;
				}
				if (i == j)
					MatrizPonderada[i][j] = 0;
			}
		// iniciamos siempre en la ciudad 1 y buscamos a su vecino de menor valor
		for (int i = 1; i <= nVertices -1 ; i++) {
			int minimo = 1;
			for (int j = 1; j <= nVertices; j++) {
				if (i == minimo) {
					minimo++;
				}
				if (MatrizPonderada[i][j] != 0 && MatrizPonderada[i][j] < MatrizPonderada[i][minimo]) {
					minimo = j;

				}

			}
			System.out.println(i + "-" + minimo);
			for (int descartar = 1; descartar <= nVertices; descartar++) {
				MatrizPonderada[i][descartar] = 700;// numero ipotetico de un valor que nunca se va alcanzar7
				MatrizPonderada[descartar][i] = 700;

			}
		}

		// ///////////////////////////////////////obtener los destinos mas
		// costoso////////////////////////////////
		/*
		 * int sumaVertice[]=new int[nVertices+1]; for(int x=1;x<=nVertices;x++) { int
		 * sumx=0; for(int y=1;y<=nVertices;y++) { sumx =sumx + MatrizPonderada[x][y]; }
		 * sumaVertice[x]=sumx; }
		 */

		// ///////////////////////////////////////imprimir
		// matriz/////////////////////////////////////////////////
		/*
		 * for (int x = 0; x < MatrizPonderada.length; x++) { System.out.print("|"); for
		 * (int y = 0; y < MatrizPonderada[x].length; y++) {
		 * System.out.print(MatrizPonderada[x][y]); if (y != MatrizPonderada[x].length -
		 * 1) System.out.print("\t"); } System.out.println("|"); }
		 */

	}

}

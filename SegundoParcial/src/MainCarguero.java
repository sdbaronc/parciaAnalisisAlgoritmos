import java.util.ArrayList;

public class MainCarguero {
	public static boolean cabe(long tonCargueroRes, long tonConte) { // este metodo permite saber si el carguero tiene espacio
																	// para el proximo container
		boolean respuesta = false;
		if (tonCargueroRes >= tonConte) {
			respuesta = true;
		}
		return respuesta;
	}

	public static long maxConte(long tonCarguero, long conte[]) {// este metodo permite saber el maximo containers que  le caben
																// al buque segun el peso
		long contContainer = 0;
		for (long conActual : conte) {
			if (cabe(tonCarguero, conActual)) {
				contContainer++;
				tonCarguero = tonCarguero - conActual;

			} else {
				break;
			}
		}
		return contContainer;

	}



	public static void main(String[] args) {
		long carguero = 700;
		long containers[] = { 50 , 55 , 60 , 70 , 80 , 100 , 110, 112 , 118 , 155};/// el array debe estar ordenado del mas pequeño al mas grande.
		                                                                          //se puede ordenar con el metodo Arrayname.sort()

		System.out.println(maxConte(carguero, containers));
		
		

	}

}

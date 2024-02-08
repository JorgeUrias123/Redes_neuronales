public class operaciones_logicas {
	
	public static int AND(int entrada_neurona1, int entrada_neurona2  ) {
		int peso_neurona1 = 1, peso_neurona2 = 1, resultado;
		double umbral = 1.5, mult1, mult2, suma;
		
		mult1 = entrada_neurona1 * peso_neurona1; 
		mult2 = entrada_neurona2 * peso_neurona2;
		suma = mult1 + mult2;
		
		if (suma >= umbral) {
			resultado = 1;
		}else {
			resultado = 0;
		}
		
		return resultado;
	}
	
	public static int OR(int entrada_neurona1, int entrada_neurona2) {
		int peso_neurona1 = 1, peso_neurona2 = 1, resultado;
		double umbral = 0.9, mult1, mult2, suma;
		
		mult1 = entrada_neurona1 * peso_neurona1; 
		mult2 = entrada_neurona2 * peso_neurona2;
		suma = mult1 + mult2;
		
		if (suma >= umbral) {
			resultado = 1;
		}else {
			resultado = 0;
		}
		
		return resultado;
	}
	
	public static int XOR(int entrada_neurona1, int entrada_neurona2) {
		int peso1_neurona1 = 1, peso2_neurona1 = 1, peso1_neurona2 = 1, peso2_neurona2 = 1,resultado;
		double umbral1 = 1.5, umbral2 = 0.5, umbral_def = 0.5, mult1_neurona1, mult2_neurona1, mult1_neurona2, mult2_neurona2, suma1, suma2, suma_def;
		
		mult1_neurona1 = entrada_neurona1 * peso1_neurona1;
		mult2_neurona1 = entrada_neurona1 * peso2_neurona1;
		
		mult1_neurona2 = entrada_neurona2 * peso1_neurona2;
		mult2_neurona2 = entrada_neurona2 * peso2_neurona2;
		
		suma1 = mult1_neurona1 + mult2_neurona2;
		suma2  = mult1_neurona2 + mult2_neurona1;
				
		if (suma1 >= umbral1) {
			suma1 = suma1 * (-1) ;
		}else {
			suma1 = 0;
		}
		
		if (suma2 >= umbral2) {
			suma2 = suma2 * 1;
		}else {
			suma2 = 0;
		}
		
		suma_def = suma1 + suma2;
		
		if (suma_def >= umbral_def) {
			resultado = 1;
		}else {
			resultado = 0;
		}
		
		return resultado;
	}
	
}

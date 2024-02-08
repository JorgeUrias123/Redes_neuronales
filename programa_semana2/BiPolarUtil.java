package semana2;

public class BiPolarUtil {
	
	// CONVIERTE BOOLEANO A DOUBLE
	public static double bipolar2double(final boolean b) {
		return b ? 1.0 : -1.0;
	}
	
	public static double[] bipolar2double(final boolean b[]) {
		double[] resultado = new double[b.length];
	    for (int i = 0; i < b.length; i++) {
	        resultado[i] = b[i] ? 1.0 : -1.0;
	    }
	    return resultado;
	}
	
	public static double[][] bipolar2double(final boolean b[][]) {
	    double[][] resultado = new double[b.length][];
	    for (int i = 0; i < b.length; i++) {
	        resultado[i] = new double[b[i].length];
	        for (int j = 0; j < b[i].length; j++) {
	            resultado[i][j] = b[i][j] ? 1.0 : -1.0;
	        }
	    }
	    return resultado;
	}
	
	// CONVIERTE DOUBLE A BOOLEANO
	public static boolean double2bipolar(final double d) {
		return d == 1.0;
	}
	
	public static boolean[] double2bipolar(final double d[]) {
		boolean[] resultado = new boolean[d.length];
	    for (int i = 0; i < d.length; i++) {
	        resultado[i] = (d[i] == 1);
	    }
	    return resultado;
	}
	
	public static boolean[][] double2bipolar(final double d[][]){
	    boolean[][] bipolar = new boolean[d.length][];
	    for (int i = 0; i < d.length; i++) {
	        bipolar[i] = new boolean[d[i].length];
	        for (int j = 0; j < d[i].length; j++) {
	            bipolar[i][j] = (d[i][j] == 1);
	        }
	    }
	    return bipolar;
	}

}

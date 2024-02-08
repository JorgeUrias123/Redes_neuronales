package semana2;

public class main {

	public static void main(String[] args) {

        double[] input = {1.0, 2.0, 3.0, 4.0, 5.0};

        Matrix columnMatrix = Matrix.createColumnMatrix(input);

        System.out.println("\nMatriz de columna creada:");
        columnMatrix.printMatrix();
		
        Matrix rowMatrix = Matrix.createRowMatrix(input);
        System.out.println("Matriz de fila creada:");
        rowMatrix.printMatrix();
	
	
	}

}

package semana2;

public class Matrix {
    private double[][] data;

    public Matrix(double[][] data) {
        this.data = data;
    }
    
    public void printMatrix() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }
	
	public static Matrix createColumnMatrix(final double input[]) {
		double[][] columnMatrix = new double[input.length][1];
        for (int i = 0; i < input.length; i++) {
            columnMatrix[i][0] = input[i];
        }
        return new Matrix(columnMatrix);
	}
	
	public static Matrix createRowMatrix(final double input[]) {
		double[][] rowMatrix = new double[1][input.length];
        rowMatrix[0] = input;
        return new Matrix(rowMatrix);
	}
	

}

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int entrada1, entrada2, resultado, OP;
		boolean ejecutar = true, ejecutar2 = true;
		
		while(ejecutar) {
			System.out.println("¿Que operacion logica desea ejecutar?: AND=1, OR=2, XOR=3 ");
			OP = scanner.nextInt();
			
			if(OP == 1) {
				while(ejecutar2) {
					System.out.println("Ingrese el valor de la primera entrada (0 o 1):");
			        entrada1 = scanner.nextInt();
			        
			        System.out.println("Ingrese el valor de la segunda entrada (0 o 1):");
			        entrada2 = scanner.nextInt();
			        
			        resultado = operaciones_logicas.AND(entrada1, entrada2);
			        System.out.println("Resultado de la operación AND: " + resultado);
			        
			        System.out.println("¿Desea ejecutar de nuevo la operacion logica AND? (Sí=1 / No=0)");
		            int opcion = scanner.nextInt();
		            ejecutar2 = (opcion == 1);
				}
				
			}else if (OP == 2) {
				while(ejecutar2) {
					System.out.println("Ingrese el valor de la primera entrada (0 o 1):");
			        entrada1 = scanner.nextInt();
			        
			        System.out.println("Ingrese el valor de la segunda entrada (0 o 1):");
			        entrada2 = scanner.nextInt();
			        
			        resultado = operaciones_logicas.OR(entrada1, entrada2);
			        System.out.println("Resultado de la operación OR: " + resultado);
			        
			        System.out.println("¿Desea ejecutar de nuevo la operacion logica OR1? (Sí=1 / No=0)");
		            int opcion = scanner.nextInt();
		            ejecutar2 = (opcion == 1);
				}
			}else if(OP == 3) {
				while(ejecutar2) {
					System.out.println("Ingrese el valor de la primera entrada (0 o 1):");
			        entrada1 = scanner.nextInt();
			        
			        System.out.println("Ingrese el valor de la segunda entrada (0 o 1):");
			        entrada2 = scanner.nextInt();
			        
			        resultado = operaciones_logicas.XOR(entrada1, entrada2);
			        System.out.println("Resultado de la operación XOR: " + resultado);
			        
			        System.out.println("¿Desea ejecutar de nuevo la operacion logica XOR? (Sí=1 / No=0)");
		            int opcion = scanner.nextInt();
		            ejecutar2 = (opcion == 1);
				}
			}
			
	        System.out.println("¿Desea ejecutar de nuevo? (Sí=1 / No=0)");
            int opcion = scanner.nextInt();
            ejecutar = (opcion == 1);
		}
		
        scanner.close();
	}

}

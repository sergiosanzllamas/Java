import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] contactos = new String[7];
	
		Scanner teclado = new Scanner(System.in);

		for(int i=0; i<3; i++) {
			System.out.println("introduzca elk contacto" +i);
			contactos[i] = teclado.next();
		}
		System.out.println("introduzca elk contacto");
		contactos[3] = teclado.next();
	}
}
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		String[] contactos = new String[7];
		int[] edades = { 19, 19, 26, 23, 22 };
System.out.println(" la edad seleccionada es" +edades[4]);
Scanner teclado = new Scanner(System.in);

for(int i=0; i<edades.length; i++) {
	System.out.println(" la edad seleccionada es" +edades[i]);
	contactos[i] = teclado.next();
}
	}

}

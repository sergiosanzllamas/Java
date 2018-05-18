import java.util.Scanner;

public class DoWhilee {



	public static void main(String[] args) {
		int opcion;
		int num1 = 0;
		int num2 = 0;

		opcion = 0;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Menu Calculadora");
			System.out.println("-------------------------------------------");
			System.out.println("1.Sumar dos numeros");
			System.out.println("2.Restar dos numeros");
			System.out.println("3.Multiplicar dos numeros");
			System.out.println("4.Dividir  dos numeros");
			System.out.println("5.POTENCIA dos numeros");
			System.out.println("6.rAIZ CUADRADA dos numeros");
			System.out.println("7.MAXIMO DE dos numeros");
			System.out.println("8.mINIMO dos numeros");
			System.out.println("9.salir");
			System.out.println("Introduzca opcion: ");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Inteoduzca numero1: ");
				num1 = teclado.nextInt();
				System.out.println("Inteoduzca numero2: ");
				num2 = teclado.nextInt();
				System.out.println("resultado es " + (num1 + num2));
				break;
			case 2:
				System.out.println("Inteoduzca numero1: ");
				num1 = teclado.nextInt();
				System.out.println("Inteoduzca numero2: ");
				num2 = teclado.nextInt();
				System.out.println("resultado es " + (num1 - num2));
				break;
			case 3:
				System.out.println("Inteoduzca numero1: ");
				num1 = teclado.nextInt();
				System.out.println("Inteoduzca numero2: ");
				num2 = teclado.nextInt();
				System.out.println("resultado es " + (num1 * num2));
				break;
			case 4:
				System.out.println("Inteoduzca numero1: ");
				num1 = teclado.nextInt();
				System.out.println("Inteoduzca numero2: ");
				num2 = teclado.nextInt();
				System.out.println("resultado es " + (num1 / num2));
				break;
			case 5:
				System.out.println("Inteoduzca la base: ");
				num1 = teclado.nextInt();
				System.out.println("Inteoduzca el exponente: ");
				num2 = teclado.nextInt();
				System.out.println("resultado es " + (Math.pow(num1, num2)));
				break;
			case 6:
				System.out.println("Inteoduzca la base: ");
				num1 = teclado.nextInt();
				System.out.println("resultado es " + (Math.sqrt(num1)));
				break;
			case 7:
				System.out.println("Inteoduzca numero1: ");
				num1 = teclado.nextInt();
				System.out.println("Inteoduzca numero2: ");
				num2 = teclado.nextInt();
				System.out.println("resultado es " + Math.max(num1, num2));
				break;
			case 8:
				System.out.println("Inteoduzca numero1: ");
				num1 = teclado.nextInt();
				System.out.println("Inteoduzca numero2: ");
				num2 = teclado.nextInt();
				System.out.println("resultado es " + Math.min(num1, num2));

				break;
			case 9:
				System.out.println("chao ramon ");
				break;
			default:
				System.out.println("opcion no correcta ");
				break;
			}
		} while (opcion != 9);
	}

}


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 1;
		int numero2 = 10;
		double decimal =  5.8;
String palabra = "askjas";
char caracter = '@';
boolean soyHumano = true;
System.out.println(numero);
System.out.println(palabra);
System.out.println(caracter);
System.out.println(soyHumano);
System.out.println(palabra);
if(numero >0 || numero2<=13) {
	System.out.println("estoy dentro");
}else 
	if(numero == 0) {
		System.out.println("estoy en else");}
else {
		System.out.println("el numero es menor que cero");
	}
switch(numero) {
case 0: System.out.println("SOY CERO");
break;

case 1: System.out.println("SOY uno");
break;
case 2: System.out.println("SOY dos");
break;
default:System.out.println("SOY otro");
break;
}


	}
}
import java.util.Scanner;

public class exercicio {

	private static Scanner numero;

	public static void main(String[] args) {

		numero = new Scanner(System.in);
		double Celsius, Fahrenheit;

		System.out.println("Conversão da temperatura em Fahrenheit para Celsius");
		System.out.println("Digite a temperatura em Fahrenheit:");
		Fahrenheit = numero.nextDouble();
		Celsius = (Fahrenheit - 32) * 5 / 9;
		System.out.print(" A medida na escala Celsius é" + Celsius + "°C");

	}

}
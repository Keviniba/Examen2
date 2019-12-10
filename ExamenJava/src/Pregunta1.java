import java.util.Scanner;

public class Pregunta1 {
	public static void main(String[] args)

	{

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa el numero:");

		int numero = scanner.nextInt();

		for (int i = 1; i <= 10; i++)

		{

			System.out.println(numero + " x " + i + " = " + numero * i);

		}

	}

}

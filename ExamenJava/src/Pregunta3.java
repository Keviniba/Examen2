import java.util.Scanner;

public class Pregunta3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string;
		String stringInvertida = "";
		System.out.println("Dame la string a comprobar si es palindromo en minusculas");
		string = scanner.nextLine();

		for (int x = string.length() - 1; x >= 0; x--)
			stringInvertida = (String) (stringInvertida + string.charAt(x));

		if (string.equals(stringInvertida)) {
			System.out.println("Si es palindromo");
		} else {
			System.out.println("No es palindromo");
		}
	}

}
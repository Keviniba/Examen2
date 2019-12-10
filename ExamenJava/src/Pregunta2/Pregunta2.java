package Pregunta2;


import java.util.Scanner;



public class Pregunta2 {
	public static void main(String[] args) {
		

	Scanner scanner = new Scanner(System.in);
	System.out.println("Dime el primer numero");
	int num1= scanner.nextInt();
	System.out.println("Dime el segundo numero");
	int num2= scanner.nextInt();
	int residuo1 = 21-num1;
	int residuo2 = 21-num2;
	
	
	if(num1>21 || num2>21) {
		System.out.println("Uno o los dos valores es mayor que 21");
	}
	else if(num1 == num2) {
		System.out.println("Los dos valores son iguales");
	}
	else if (residuo1<residuo2){
		System.out.println("El valor mas cercano a 21 es: " + num1);
	}
	else if (residuo1>residuo2) {
		System.out.println("El numero mas cercano a 21 es:" + num2);
		
}}}
	
	
	
	


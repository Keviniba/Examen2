package Pregunta5B;

import javax.swing.JOptionPane;

import Pregunta5.Pregunta5Interfaz.operaciones;

public class Pregunta5Main {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Dame el primer numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Dame el segundo numero"));
		
		operaciones op = new operaciones();
		
		int suma = op.sumar(num1, num2);
		int resta = op.restar(num1, num2);
		int multiplicacion= op.multiplicar(num1, num2);
		int division = op.dividir(num1, num2);
		
		op.mostrarResultados(suma, resta, multiplicacion, division);
	}
}

package java_fundamentos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int num1 = scanner.nextInt();
		System.out.println("Digite a operação: ");
		char op = scanner.next().charAt(0);
		System.out.println("Digite o segundo numero: ");
		int num2 = scanner.nextInt();
		
		int resultado = 0;
		
		ArrayList<String> historico = new ArrayList<String>();
		String entradaHstorico = String.format("%d %c %d = %d", num1, op,num2, resultado);
		historico.add(entradaHstorico);
		System.out.println(entradaHstorico);
		
		scanner.close();
	}
}

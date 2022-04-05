package java_fundamentos;

import java.util.Scanner;

public class Switch {

	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = scanner.nextInt();
		System.out.println("Digite a opera��o: ");
		char op = scanner.next().charAt(0);
		System.out.println("Digite o segundo numero: ");
		int num2 = scanner.nextInt();
		
		int resultado = 0;
		
		switch (op) {
		case '+': 
			resultado = num1+num2;
			break;
		case '-':
			resultado = num1-num2;
			break;
		case '*':
			resultado = num1*num2;
			break;
		case '/':
			resultado = num1/num2;
			break;
		default:
			System.out.println("Opera��o inv�lida");
		}
		System.out.println(String.format("Voc� quer fazer a op %d  %c %d",num1, op, num2));

	}
}

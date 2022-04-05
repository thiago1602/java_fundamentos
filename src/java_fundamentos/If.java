package java_fundamentos;

import java.util.Scanner;

public class If {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = scanner.nextInt();
		System.out.println("Digite a operação: ");
		char op = scanner.next().charAt(0);
		System.out.println("Digite o segundo numero: ");
		int num2 = scanner.nextInt();
		System.out.println(String.format("Você quer fazer a op %d  %c %d",num1, op, num2));
		int resultado = 0;
		if (op == '+') {
			resultado = num1+num2;
		} else if(op == '-'){
			resultado = num1-num2;
		}else if(op == '*') {
			resultado = num1*num2;
		}else if(op == '/') {
			resultado = num1/num2;
		}else {
			 System.out.println("digite uma operação valida");
		}
		System.out.println(String.format("%d %c %d = %d", num1, op,num2, resultado));
	}
}

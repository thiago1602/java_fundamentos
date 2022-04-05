package java_fundamentos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int acao = 1; // 0 = sair; 1 = op; 2 = historico
		int num1 = 0;
		ArrayList<String> historico = new ArrayList<String>();
		while (acao > 0) {
			if (acao == 1) {
				System.out.println("Digite o primeiro numero: ");
				try {
					num1 = scanner.nextInt();
				}catch(InputMismatchException e ) {
					System.out.println(String.format(
							"Ocorreu um erro de formato: %s. "
							+ "Digite um numero", e.getMessage()));
				}
				
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
				
				String entradaHstorico = String.format("%d %c %d = %d", num1, op, num2, resultado);
				historico.add(entradaHstorico);
				System.out.println(entradaHstorico);
			}else if(acao == 2) {
				System.out.println("===Hist�rico");
				System.out.println(String.format("-Voc� ja fez %d op", historico.size()));
				
				//Expressao lambda, substui o for
				historico.forEach(itemHistorico -> System.out.println(itemHistorico));
				//for (int i = 0; i < historico.size(); i++) {
				//	System.out.println(historico.get(i));
				//}
				
			}
			System.out.println("Oque voc� deseja fazer?");
			System.out.println("1. Realizar opera��o");
			System.out.println("2. Visualizar hist�rico");
			System.out.println("0. SAIR");
			acao = scanner.nextInt();
		}
		scanner.close();
	}
}

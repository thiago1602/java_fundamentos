package java_fundamentos;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicios {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	//par e impar
        int N = scanner.nextInt();
        
        if(N % 2 == 0)
            System.out.println("Par");
            
        else
            System.out.println("Ímpar");
        
        //estranho
        
        if(N % 2 != 0)
        {
            System.out.println("Estranho");
        }
        else
        {
            if(N < 10)
            {
                System.out.println("Não é estranho");
            }
            else if(N >= 10 && N <= 20)
            {
                System.out.println("Estranho");
            }
            else
            {
                System.out.println("Não é estranho");
            }
            
            //fatorial
            long fatorial = 1;
            
            for(int i = N; i > 0; i--)
            {
                fatorial *= i;
            }
            
            System.out.println(fatorial);
            
            //tabuada do 2
            for(int i = 1; i <= 10; i++)
            {
                System.out.printf("%d x %d = %d\n", N, i, N * i);
            }
            
            
            //Dado um array de strings com N valores, complete o código abaixo de forma que cada elemento do array 
            //seja exibido em uma linha:   
            ArrayList<String> palavras = new ArrayList<String>();
            
            while(scanner.hasNext())
            {
                palavras.add(scanner.next());
            }
            
            for(int i = 0; i < palavras.size(); i++)
            {
                System.out.println(palavras.get(i));
            }
            
            //Supondo três inteiros: a , b e n; aplicados a seguinte fórmula:
            //(a + 20 x b),(a + 20 x b + 21 x b), ... , (a + 20 x b + 21 x b + ... + 2n-1 x b)
            //Onde serão informados q sequências de a, b e n. Para cada uma, informe no console a série correspondente dos valores em uma única linha,
            //sepados por espaço.
            Scanner in = new Scanner(System.in);

            int t=in.nextInt();
            for(int i=0;i<t;i++)
            {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
            
                int[] result = new int[n] ;

                for(int j = 0; j < n; j++)
                {
                    result[j] = a;
                    for(int k = 0; k <= j; k++)
                    {
                        int exp = (int)Math.pow(2, k);
                        result[j] += exp * b;
                    }
                }

                for(int j = 0; j < n; j++)
                {
                    System.out.printf("%d ", result[j]);
                }

                System.out.print("\n");
            }
        scanner.close();
    }
	
}
}

/**
 * 
 */
package br.com.Dayanaferrer.git;
import java.util.Scanner;
/**
 * @author Dayana Ferreira
 * 	Fa�a um programa que solicite que o usu�rio insira  dois n�meros e exiba a soma, subtra��o, 
 * divis�o e multiplica��o entre�os n�meros, da seguinte forma:

							a + b =
							a - b = 
							a x b = 
							a : b =
 */
public class Exercicio {

	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo n�mero: ");
		int num2 = scan.nextInt();
		
		int resultado = num1+num2;
		System.out.println("A soma dos n�meros �: " + resultado);
		
		int resultadosub = num1-num2;
		System.out.println("A subtra��o �: " + resultadosub);
		
		int resultadomult = num1*num2;
		System.out.println("A multiplica��o dos n�meros �: " + resultadomult);
		
		int resultadodiv = num1/num2;
		System.out.println("A divis�o dos n�meros �: " + resultadodiv);
		
	}

}
/**
 * 
 */
package br.com.Dayanaferrer.git;
import java.util.Scanner;
/**
 * @author Dayana Ferreira
 * 	Faça um programa que solicite que o usuário insira  dois números e exiba a soma, subtração, 
 * divisão e multiplicação entre os números, da seguinte forma:

							a + b =
							a - b = 
							a x b = 
							a : b =
 */
public class Exercicio {

	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		int num2 = scan.nextInt();
		
		int resultado = num1+num2;
		System.out.println("A soma dos números é: " + resultado);
		
		int resultadosub = num1-num2;
		System.out.println("A subtração é: " + resultadosub);
		
		int resultadomult = num1*num2;
		System.out.println("A multiplicação dos números é: " + resultadomult);
		
		int resultadodiv = num1/num2;
		System.out.println("A divisão dos números é: " + resultadodiv);
		
	}

}
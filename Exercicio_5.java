package aula_dia03;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner ler = new Scanner (System.in);
			int idade = 18;
			
			System.out.println("Insira sua idade: ");
			idade = ler.nextInt();
			String mensagem = idade >= 18? "Maior de idade" : "Menor de idade";
			System.out.println(mensagem); // Imprime "Maior de idade"
			}
			
	}



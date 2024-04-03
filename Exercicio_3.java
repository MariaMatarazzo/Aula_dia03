package aula_dia03;

import java.util.Scanner;

public class Exercicio_3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int mes;
		
		System.out.print ("Informe um dia da semana, em números: ");
		mes = ler.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("******* Voce escolheu Janeiro! *******");
			break;
			
		case 2:
			System.out.println("******* Voce escolheu Fevereiro! ********");
			break;
			
		case 3:
			System.out.println("******* Voce escolheu Março! ********");
			break;
		
		case 4:
			System.out.println("******* Voce escolheu Abril!********");
			break;
			
		case 5:
			System.out.println("******* Voce escolheu maio! ********");
			break;
			
		case 6:
			System.out.println("******* Voce escolheu junho! ********");
			break;
			
		case 7:
			System.out.println("******* Voce escolheu julho! ********");
			break;
			
		case 8:
			System.out.println("******* Voce escolheu Agosto! ********");
			break;
			
		case 9:
			System.out.println("******* Voce escolheu Setembro! ********");
			break;
			
		case 10:
			System.out.println("******* Voce escolheu Outubro! ********");
			break;
			
		case 11:
			System.out.println("******* Voce escolheu Novembro! ********");
			break;
			
		case 12:
			System.out.println("******* Voce escolheu Dezembro! ********");
			break;
			
			default:
			System.out.println("O numero é Invalido! Favor digite novamente ");
			
		}	
	}

}

	

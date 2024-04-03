package aula_dia03;
import java.util.Scanner;
public class Exercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		int dia;
		
		System.out.print ("Informe um dia da semana, em números: ");
		dia = ler.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("******* Voce escolheu Domingo! *******");
			break;
			
		case 2:
			System.out.println("******* Voce escolheu Segunda! ********");
			break;
			
		case 3:
			System.out.println("******* Voce escolheu Terça! ********");
			break;
		
		case 4:
			System.out.println("******* Voce escolheu quarta!********");
			break;
			
		case 5:
			System.out.println("******* Voce escolheu quinta! ********");
			break;
			
		case 6:
			System.out.println("******* Voce escolheu sexta! ********");
			break;
			
		case 7:
			System.out.println("******* Voce escolheu sábado! ********");
			break;
			
			default:
			System.out.println("O numero é Invalido! Favor digite novamente ");
			
		}	
	}

}

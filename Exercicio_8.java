package aula_dia03;
import java.util.Scanner;
public class Exercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		double nota1,nota2,nota3,nota4,media;
		
		System.out.print("Insira as notas e veja se o aluno está aprovado ");
		System.out.println();

		System.out.print("informe a primeira nota: ");
		nota1 = ler.nextInt();

		System.out.print("informe a segunda nota: ");
		nota2 = ler.nextInt();

		System.out.print("informe a terceira nota: ");
		nota3 = ler.nextInt();

		System.out.print("informe a quarta nota: ");
		nota4 = ler.nextInt();

		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println();
		System.out.println(" A media do aluno é:  " + media);
		System.out.println();

		String mensagem = media >= 6? "********O aluno está Aprovado********" : "*********O aluno está Reprovado*******";
		System.out.println(mensagem);
		}
			

	}



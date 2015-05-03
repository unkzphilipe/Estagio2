package Calc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("digite o valor posfixa");
		String text = read.nextLine();
		Pilha p = new Pilha(); //criação do objeto pilhaSequencial
		char[] caracter = text.toCharArray(); // criação de um array para separa a string em caracteres
		String valor = "";	 //variavel para axiliar na concatenacao da String
		for (int i = 0; i < caracter.length; i++) { // criação do loop para ler a o vetor de caracter um por um
			int c = 0; //variaveis para ultilização no calculo
			int p1 = 0;
			int p2 = 0;
			
			switch (caracter[i]) {//condição de leitura da string
			// se entrar em alguma condição
			case '+':	
				p1 = new Integer(p.pop());//desempilha e converte para inteiro
				p2 = new Integer(p.pop());
				c = p2 + p1;
				p.push(""+c);//empulha convertendo para String
				break;
			case '-':				
				p1 = new Integer(p.pop());
				p2 = new Integer(p.pop());					
				c = p2 - p1;
				p.push(""+c);
				break;
			case '*':
				p1 = new Integer(p.pop());
				p2 = new Integer(p.pop());
				c = p2 * p1;
				p.push(""+c);
				break;
			case '/':
				p1 = new Integer(p.pop());
				p2 = new Integer(p.pop());
				c = p2 / p1;
				p.push(""+c);
				break;
				
			case ' ':
				if(!valor.equals("")){
					p.push(valor); // se for diferente de vazio, empilhe
					valor = "";
				}
				break;
			default:				
				valor = valor + caracter[i]; //cancatenação de Strings				
				break;
			}			
			
		}
		
		System.out.println("-----------------------------");
		
		// litura do que restou na pilha
		System.out.printf("O valor total é: %s%n", p.getTop());
		
		read.close();
	}

}

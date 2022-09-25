package cpf;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.lang.*;

public class Pessoa {

	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> cpf = new ArrayList();
		Random gerador = new Random();
		
		int soma = 0;
		int aux = 10;
		
		
				
		for (int i=0; i<9; i++) {
			int aleatorio = gerador.nextInt(9);
			cpf.add(aleatorio);
			
		}
		
		System.out.println(cpf);
		
		for (int i=0; i<9 ; i++) {
			soma =+ (cpf.get(i)*aux);
			aux --;
			
		}
		
		int cpf11 = 11 - (soma%11);
		cpf.add(cpf11);
		
		System.out.println(cpf);
		
		aux = 10;
		for (int i=1; i<10 ; i++) {
			soma =+ (cpf.get(i)*aux);
			aux --;
			
		}
		
		int cpf12 = 11 - (soma%11);
		cpf.add(cpf12);
		
		
		System.out.println(cpf);

		System.out.printf("CPF: %d%d%d.%d%d%d.%d%d%d-%d%d",cpf.get(0),cpf.get(1),cpf.get(2),cpf.get(3),cpf.get(4),cpf.get(5),cpf.get(6),cpf.get(7),cpf.get(8),cpf.get(9),cpf.get(10));
		
		
		
		/*int x = n1*10 + n2*9 + n3*8 +n4*7 + n5*6 + n6*5 + n7*4 + n8*3 + n9*2; 
		int n10 = 11 - (x%11);
		
		int y = n2*10 + n3*9 + n4*8 +n5*7 + n6*6 + n7*5 + n8*4 + n9*3 + n10*2;
		int n11 = 11 - (y%11);
			
		System.out.printf("%d%d%d.%d%d%d.%d%d%d-%d%d%",n1,n2,n3,n4,n5,n6,n7,n8,n9,10);*/
		
		
		
		/*1 – DF, GO, MS, MT e TO
		2 – AC, AM, AP, PA, RO e RR
		3 – CE, MA e PI
		4 – AL, PB, PE, RN
		5 – BA e SE
		6 – MG
		7 – ES e RJ
		8 – SP
		9 – PR e SC
		0 – RS*/
		
	}

}

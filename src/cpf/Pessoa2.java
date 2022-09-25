package cpf;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Pessoa2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
		ArrayList<Integer> cpf = new ArrayList();
		
		int soma = 0;
		int aux = 10;
		
		System.out.println("Nome:");
		String nome = sc.next();
		
		System.out.println("Sigla do Estado: (ex: PB, GO, SP, RJ)");
		String estado = sc.next();

				
		for (int i=0; i<8; i++) {
			int aleatorio = gerador.nextInt(9);
			cpf.add(aleatorio);
			
		}
			
			
		if (estado.equals("DF") || estado.equals("GO") || estado.equals("MS") || estado.equals("MT") || estado.equals("TO")){
			cpf.add(1);
		}else if (estado.equals("AC") || estado.equals("AM") || estado.equals("AP") || estado.equals("PA") || estado.equals("RO") || estado.equals("RR")){
			cpf.add(2);
		}else if (estado.equals("CE") || estado.equals("MA") || estado.equals("PI") ){
			cpf.add(3);
		}else if (estado.equals("AL") || estado.equals("PB") || estado.equals("PE") || estado.equals("RE")){
			cpf.add(4);
		}else if (estado.equals("BA") || estado.equals("SE")){
			cpf.add(5);
		}else if (estado.equals("MG") ){
			cpf.add(6);
		}else if (estado.equals("ES") || estado.equals("RJ") ){
			cpf.add(7);
		}else if (estado.equals("SP") ){
			cpf.add(8);
		}else if (estado.equals("PR") || estado.equals("SC") ){
			cpf.add(9);
		}
		

		
		for (int i=0; i<9 ; i++) {
			soma =+ (cpf.get(i)*aux);
			aux --;
			
		}
		
		int cpf10 = 11 - (soma%11);
		cpf.add(cpf10);
		
		
		aux = 10;
		for (int i=1; i<10 ; i++) {
			soma =+ (cpf.get(i)*aux);
			aux --;
			
		}
		
		int cpf11 = 11 - (soma%11);
		cpf.add(cpf11);
		
		System.out.println();
		System.out.println("Seu nome: "+ nome);
		System.out.printf("CPF: %d%d%d.%d%d%d.%d%d%d-%d%d",cpf.get(0),cpf.get(1),cpf.get(2),cpf.get(3),cpf.get(4),cpf.get(5),cpf.get(6),cpf.get(7),cpf.get(8),cpf.get(9),cpf.get(10));
		
		
		
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

package bxComp01;
import java.util.Scanner;

public class Princesa{
 public static void main(String[] args){
	char Alfabeto[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	Scanner input = new Scanner(System.in);

	int n = input.nextInt();
	input.nextLine();

	for (int i = 0; i<n; i++){

		int c = Integer.parseInt(input.nextLine());
		String frase = input.nextLine();

		String fraseMinuscula = frase.toLowerCase();

		char[] fraseArray = fraseMinuscula.toCharArray();

		for(int j=0; j<fraseArray.length; j++){
			int x = 0;
			//char J = fraseMinuscula.charAt(j);
			//String novoJ = String.valueOf(J);
			for(int k = 0; k<Alfabeto.length;k++){

				if(Character.compare(fraseArray[j], Alfabeto[k]) == 0){
					x = k;
					break;
				} 
			}



			if (fraseArray[j] == ' ') fraseArray[j] = ' ';

			else{
				int y = x + c;

				if (x + c > Alfabeto.length){

					 y = (x + c) - Alfabeto.length;

				} 
				fraseArray[j] = Alfabeto[y];
		   }
		}
		//Qysbybcq bm osc Y Eclrc lam Tgtcs Yglby
		String fraseDecodificada = String.valueOf(fraseArray);
		System.out.println(fraseDecodificada);
	}
 }
}
package bxComp01;
import java.util.Scanner;

public class prinx{

 public static void main(String[] args){
	char Alfabeto[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	Scanner input = new Scanner(System.in);

	int n = input.nextInt();
	input.nextLine();

	for (int i = 0; i < n; i++){

		int c = Integer.parseInt(input.nextLine());
		String frase = input.nextLine();
		frase = frase.toLowerCase();

		char[] fraseArray = frase.toCharArray();

		for(int j = 0; j < fraseArray.length; j++){
			if (fraseArray[j] != ' ') {
				int y = c;
				for(int k = 0; k < Alfabeto.length; k++){
					if(Character.compare(fraseArray[j], Alfabeto[k]) == 0){
						y += k ;
						break;
					} 
				}

				if (y > Alfabeto.length - 1){
					 y -= Alfabeto.length;
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
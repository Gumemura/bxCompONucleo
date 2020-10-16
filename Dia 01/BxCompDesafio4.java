package bxComp01;
import java.util.Scanner;

public class BxCompDesafio4 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int casos;
		String sininhos;

		String sequenciacorreta = "EDDDEDEEDEED";

	
		//System.out.print("Insira quantidade de casos: ");
		casos = input.nextInt();
		
		String[] resultado = new String[casos];
		int contadorCertos = 0;
		int limite;
		
		for (int i = 0; i < casos; i++) {
			//System.out.print("Insira as partes do corpo: ");
			sininhos = input.next();
			sininhos = sininhos.replace("-", "");
			sininhos = sininhos.toUpperCase();
			
			if(sininhos.length() >= sequenciacorreta.length()) {
				limite = sequenciacorreta.length();
			}else {
				limite = sininhos.length();
			}
			
			char[] cert = sequenciacorreta.toCharArray(); 
			char[] sinosinput = sininhos.toCharArray(); 
			for(int j = 0; j < limite; j++) {
				if(sinosinput[j] == cert[j]) {
					contadorCertos++;
				}else {
					break;
				}
			}
			//System.out.println(contadorCertos);
			//System.out.println(sequenciacorreta.length());
			float b = contadorCertos;
			float c = sequenciacorreta.length();
			float a = b / c;
			//System.out.println(a);
			
			if(contadorCertos == sequenciacorreta.length()) {
				if(sininhos.length() == sequenciacorreta.length()) {
					resultado[i] = "Cheguei meninaxx!";
				}
			}else {
				resultado[i] = Float.toString(a * 100) + "% de dedicacao...estou ocupada escovando meus gatos!";
			}
			
			contadorCertos = 0;
		}
		
		System.out.println("\n");
		for(int i = 0; i < casos; i++) {
			System.out.println(resultado[i]);
		}
	}
}

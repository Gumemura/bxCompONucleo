//package bxComp01;
import java.util.Scanner;

public class BxCompDesafio2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int casos;
		String partesCorpo;
		
		//System.out.print("Insira quantidade de casos: ");
		casos = input.nextInt();
		
		String[] resultado = new String[casos];
		
		for (int i = 0; i < casos; i++) {
			//System.out.print("Insira as partes do corpo: ");
			partesCorpo = input.next();
			partesCorpo = partesCorpo.toLowerCase();
			
			//Deus
			if(partesCorpo.contains("akh") && partesCorpo.contains("sekhem") && partesCorpo.contains("ren")) {
				if(partesCorpo.contains("ka") || partesCorpo.contains("ba")) {
					resultado[i] = "Tem e uma bagunca espiritual aqui!";
				}else {
					resultado[i] = "Opa, ancestrais e deuses nao empacotam duas vezes.";
				}
			}else if(partesCorpo.contains("khat") && partesCorpo.contains("ka") && partesCorpo.contains("ba") && partesCorpo.contains("sahu") && partesCorpo.contains("sekhem") && partesCorpo.contains("ren") && partesCorpo.contains("shwt") && partesCorpo.contains("ab")) {
				resultado[i] = "Alma mortal pronta para ser empacotada.";
			}else {
				resultado[i] = "Tem e uma bagunca espiritual aqui!";
			}
		}
		
		System.out.println("\n");
		for(int i = 0; i < casos; i++) {
			System.out.println(resultado[i]);
		}
	}
}

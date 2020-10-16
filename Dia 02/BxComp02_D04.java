package bxComp01;
import java.util.Scanner;

public class BxComp02_D04 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String inimigoEntrada = "";
		String[] inimigosDados = new String[2];
		String[] resultado = new String[500];
		Boolean tevevitoria = false;
		String cabo = "Bora Comemora!";
		
		int contador = 0;
		
		int tropasAliadas = input.nextInt() / 2;
		input.nextLine();
		
		while(!inimigoEntrada.equals(cabo)) {
			inimigoEntrada = input.nextLine();
			
			if(!inimigoEntrada.equals(cabo)) {
				inimigosDados = inimigoEntrada.split(" ");
				int numeroInimigos = Integer.parseInt(inimigosDados[1]) / 2;
				if(numeroInimigos <= tropasAliadas * .1f) {
					//Vitoria sem combate
					resultado[contador] = inimigosDados[0] + " aceitou o acordo e agora faz parte do nosso Imperio!";
					tropasAliadas += numeroInimigos;
					tevevitoria = true;
				}else if(numeroInimigos <= tropasAliadas * .7f) {
					//Batalha
					resultado[contador] = "Apos uma grande batalha, vencemos de " + inimigosDados[0] + ", e eles se uniram ao nosso Imperio!";
					tropasAliadas += numeroInimigos / 2;
					tevevitoria = true;
				}else {
					//vaza
					resultado[contador] = "Quale Comandante, melhor meter o pe...";
				}	
				contador++;
			}
		}

		resultado[contador] = "Nosso Imperio agora tem " + tropasAliadas + " soldados!";
		contador++;
		if(tevevitoria) {
			resultado[contador] = "Que Mama-Quilla abencoe as novas terras e seu plantio!";	
			contador++;
		}
		
		for(int i = 0; i < contador; i++) {
			System.out.println(resultado[i]);
		}
	}
}

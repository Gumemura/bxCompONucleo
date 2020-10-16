//package bxComp01;
import java.util.Scanner;

/*
/+390-2526-2637 Tar-Telemmaite#<Telperien>
<Tar+Calion>!Tar-Miriel;+201-3255-3319!
Tar-Aldarion Anardil) +412-0975-128046573<Tar-AnCALime>
Tar+Calion
taR+cAliON
tar-ancalime
Tar-Miriel
TAR-MIRIEL
TELPERIEN
Tar-Telperien
fim
*/

public class bxComp_Dia03_Desafio05 {
	public static void main(String[] args){
		int max = 100;
		String fim = "fim";
		
		Scanner input = new Scanner(System.in);
		
		String info;
		String nomeRei;
		String[][] registros = new String[max][4];
		//Nome => Tar+Calion, Tempo de Vida => 201 anos, Reinado => 3255-3319, Tempo Reinando => 64 anos
		
		String[] devolutiva = new String[max];
		int indexDevolutiva = 0;
		int indexRegistro = 0;
		
		String[] stringArray;
		String[] dataseNumeros;
		
		Boolean achouDatas = false;
		int tempoDeVida = 0;
		int reinadoInicio = 0;
		int reinadoFim = 0;
		int tempoReinando;
		String reiNome = "";
		Boolean pegaNome = false;
		
		
		while(true == true) {
			info = input.nextLine();
			
			if(info.toLowerCase().equals(fim)) {
				//finalizando o role
				break;
			}else {
				if(info.contains(">")) {
					//eh entrada complexa (de registro)
					//exemplo de entrada
					// /+390-2526-2637 Tar-Telemmaite#<Telperien>
					
					stringArray = info.split("");
					
					for (int i = 0; i < stringArray.length; i++) {
						//datas e numero
						if(stringArray[i].equals("+") && !pegaNome) {
							try {
								tempoDeVida = Integer.parseInt(stringArray[i+1] + stringArray[i+2] + stringArray[i+3]);
								reinadoInicio = Integer.parseInt(stringArray[i+5] + stringArray[i+6] + stringArray[i+7] + stringArray[i+8]);
								reinadoFim = Integer.parseInt(stringArray[i+10] + stringArray[i+11] + stringArray[i+12] + stringArray[i+13]);

						    }catch (NumberFormatException e) {
						    	try {
						    		tempoDeVida = Integer.parseInt(stringArray[i+1] + stringArray[i+2]);
									reinadoInicio = Integer.parseInt(stringArray[i+4] + stringArray[i+5] + stringArray[i+6] + stringArray[i+7]);
									reinadoFim = Integer.parseInt(stringArray[i+9] + stringArray[i+10] + stringArray[i+11] + stringArray[i+12]);
						    	}catch (NumberFormatException g) {
						    		achouDatas = false;
						    	}catch(ArrayIndexOutOfBoundsException exception) {
						    		//erro
							    }
						    }catch(ArrayIndexOutOfBoundsException exception) {
						    	//erro
						    }
						}
						
						//nome do rei rainha
						if(stringArray[i].equals(">")) {
							pegaNome = false;
						}
						if(pegaNome) {
							reiNome += stringArray[i];
						}
						if(stringArray[i].equals("<")) {
							pegaNome = true;
						}
					}
					//tempo reinando
					tempoReinando = reinadoFim - reinadoInicio;	
					
					Boolean jatem= true;
					for(int r = 0; r < indexRegistro; r++) {
						if(reiNome.toLowerCase().equals(registros[r][0].toLowerCase())) {
							jatem = false;
							break;
						}
					}
					
					if(jatem) {
						registros[indexRegistro][0] = reiNome;
						registros[indexRegistro][1] = String.valueOf(tempoDeVida);
						registros[indexRegistro][2] = String.valueOf(reinadoInicio) + "-" + String.valueOf(reinadoFim) ;
						registros[indexRegistro][3] = String.valueOf(tempoReinando);
						indexRegistro++;
					}
					reiNome = "";							
	
				}else {
					//buscando por um rei
					nomeRei = info.toLowerCase();
					for(int i = 0; i < max; i++) {
						if(registros[i][0] == null) {
							devolutiva[indexDevolutiva] = "Erro => " + info + " nao encontrado(a)";
							indexDevolutiva++;
							break;
						}else if(nomeRei.equals(registros[i][0].toLowerCase())) {
							devolutiva[indexDevolutiva] = "Nome => " + registros[i][0] + ", Tempo de Vida => " + registros[i][1] + " anos, Reinado => " + registros[i][2] + ", Tempo Reinando => " + registros[i][3] ; 
							indexDevolutiva++;
							break;
						}
					}
				}
			}
		}
		
		for(int i = 0; i < indexDevolutiva; i++) {
			System.out.println(devolutiva[i]);
		}
	}
}

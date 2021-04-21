package gariba_cidades;

import java.util.Scanner;

public class AppCidades {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Cria as cidades
		Cidade c1 = new Cidade("Sao Leopoldo",2);
		Cidade c2 = new Cidade("Novo Hamburgo",4);
		Cidade c3 = new Cidade("Estancia Velha",2);
		Cidade c4 = new Cidade("Ivoti",3);
		Cidade c5 = new Cidade("Dois Irmaos",3);
		Cidade c6 = new Cidade("Campo Bom",4);
		Cidade c7 = new Cidade("Sapiranga",2);
		
		// Cria um vetor para armazenar as cidades
		Cidade [] cidades = new Cidade[8];
		cidades[1] = c1;
		cidades[2] = c2;
		cidades[3] = c3;
		cidades[4] = c4;
		cidades[5] = c5;
		cidades[6] = c6;
		cidades[7] = c7;
		
		//Cria as adjacencias
		Adjacencia ad1 = new Adjacencia(c1, c2, 8); 
		Adjacencia ad2 = new Adjacencia(c1, c6, 16); 
		Adjacencia ad3 = new Adjacencia(c2, c3, 5); 
		Adjacencia ad4 = new Adjacencia(c2, c4, 9); 
		Adjacencia ad5 = new Adjacencia(c2, c6, 6); 
		Adjacencia ad6 = new Adjacencia(c3, c4, 3);
		Adjacencia ad7 = new Adjacencia(c4, c5, 6);
		Adjacencia ad8 = new Adjacencia(c5, c6, 15); 
		Adjacencia ad9 = new Adjacencia(c5, c7, 15); 
		Adjacencia ad10 = new Adjacencia(c6, c7, 9); 
		
		//Cria um vetor para as adjacencias
		Adjacencia [] adj = new Adjacencia[10];
		adj[0] = ad1;		
		adj[1] = ad2;
		adj[2] = ad3;		
		adj[3] = ad4;
		adj[4] = ad5;		
		adj[5] = ad6;
		adj[6] = ad7;		
		adj[7] = ad8;
		adj[8] = ad9;		
		adj[9] = ad10;
		
		//Colocar as adjacencias de cada cidade
		for(int i = 1; i < cidades.length; i++) { // varre o vetor de cidades
			for(int j = 0; j < cidades[i].getAdjac().length; j++) {  //dentro da cidade, faz a quantidade de adjacencias
				for(int k = 0; k < adj.length; k++) {	// varre o vetor das adjacencias
					if(adj[k].verificaAdj(cidades[i])){
						cidades[i].addCidAdjac(adj[k]);
					} // fim if
				} // fim for k
			} // fim for j
		} // fim for i	

		for(int j = 1; j < cidades.length; j++) {
			System.out.println(cidades[j].getName() + " " + cidades[j].getCode());
			for(int i = 0; i < cidades[j].getAdjac().length; i++) {
				System.out.println(cidades[j].getAdjacPos(i).getAdjCode() - cidades[j].getCode());
			}
		}
	/*	
		int flag = 0;
		int origem = 0;
		int destino = 0;
		
		while(flag < 2) {
			if(flag == 0) {
				System.out.println("Escolha a cidade de ORIGEM pelo Código abaixo: \n");
				for(int x = 1; x <= 7; x++) {
					System.out.println(cidades[x].getCode() + " - " + cidades[x].getName());
				}
				
				System.out.println("\nDigite AQUI: ");
				origem = sc.nextInt();
				flag++;
			}
			
			if(flag == 1) {
				System.out.println("Escolha a cidade de DESTINO pelo Código abaixo: \n");
				for(int x = 1; x <= 7; x++) {
					System.out.println(cidades[x].getCode() + " - " + cidades[x].getName());
				}
				
				System.out.println("\nDigite AQUI: ");
				destino = sc.nextInt();
				flag++;
			}
			
		} // fim WHILE menu
		
		if(cidades[origem].verificaAdjacencia(destino)) {
			System.out.println("Essas cidades: " + cidades[origem].getName() + " e " + cidades[destino].getName());
			System.out.println("São adjacentes! Distância direta entre elas: ");
			int codAdj = cidades[origem].getCode() + cidades[destino].getCode();
			
			for(int x = 0; x < adj.length; x++) {
				if(adj[x].getAdjCode() == codAdj) {
					System.out.println(adj[x].getDistancia() + " KM's");
				}
			}
			
		} else {
			System.out.println("ESSAS CIDADES NÃO SÃO ADJACENTES!");
			System.out.println("Rotas possíveis: ");
			int rotas = 0;
			int distRota1 = 0;
			int distRota2 = 0;
			while(rotas == 2) {
				
				// vai percorrer de um em um todas as  adjacencias da ORIGEM
				for(int i = 0; i < cidades[origem].getCodeCidAdjac().length; i++) { 
					
					for(int j = 0; j < cidades[origem].getCidAdj(i) + cidades[i].)
						
					}
				}
					
			}
		}
		
		*/
		sc.close();
		
	} // fim método main
} // fim classe

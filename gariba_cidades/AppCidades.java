package gariba_cidades;

import java.util.Scanner;

public class AppCidades {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Cidade c1 = new Cidade("Sao Leopoldo",1,2);
		Cidade c2 = new Cidade("Novo Hamburgo",2,4);
		Cidade c3 = new Cidade("Estancia Velha",3,2);
		Cidade c4 = new Cidade("Ivoti",4,3);
		Cidade c5 = new Cidade("Dois Irmaos",5,3);
		Cidade c6 = new Cidade("Campo Bom",6,4);
		Cidade c7 = new Cidade("Sapiranga",7,2);
		
		c1.setCodeCidAdjac(2,0);
		c1.setCodeCidAdjac(6,1);
		
		c2.setCodeCidAdjac(1,0);
		c2.setCodeCidAdjac(3,1);
		c2.setCodeCidAdjac(4,2);
		c2.setCodeCidAdjac(6,3);
		
		c3.setCodeCidAdjac(2,0);
		c3.setCodeCidAdjac(4,1);
		
		
		c4.setCodeCidAdjac(2,0);
		c4.setCodeCidAdjac(3,1);
		c4.setCodeCidAdjac(5,2);
		
		c5.setCodeCidAdjac(4,0);
		c5.setCodeCidAdjac(6,1);
		c5.setCodeCidAdjac(7,2);
		
		c6.setCodeCidAdjac(1,0);
		c6.setCodeCidAdjac(2,1);
		c6.setCodeCidAdjac(5,2);
		c6.setCodeCidAdjac(7,3);
		
		c7.setCodeCidAdjac(5,0);
		c7.setCodeCidAdjac(6,1);
		
		
	/*	System.out.println(c1.getCidAdjac());
		System.out.println(c2.getCidAdjac());
		System.out.println(c3.getCidAdjac());
		System.out.println(c4.getCidAdjac());
		System.out.println(c5.getCidAdjac());
		System.out.println(c6.getCidAdjac());
		System.out.println(c7.getCidAdjac());
	*/
		Cidade [] cidades = new Cidade[8];
		cidades[1] = c1;
		cidades[2] = c2;
		cidades[3] = c3;
		cidades[4] = c4;
		cidades[5] = c5;
		cidades[6] = c6;
		cidades[7] = c7;
		
		
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
			while(rotas == 2) {
				
				// vai percorrer de um em um todas as  adjacencias da ORIGEM
				for(int i = 0; i < cidades[origem].getCodeCidAdjac().length; i++) { 
					
					//em cada adjacencia da origem, vai percorrer vendo se há adjacencias com o DESTINO
					for(int j = 0; j < cidades[origem].)
				}
					
			}
		}
		
		
		sc.close();
		
		
	}

}

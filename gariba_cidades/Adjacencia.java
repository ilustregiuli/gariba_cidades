package gariba_cidades;

public class Adjacencia {

	private Cidade cid1;
	private Cidade cid2;
	private int distancia;
	private int adjCode;
	
	public Adjacencia(Cidade cid1, Cidade cid2, int distancia) {
		this.cid1 = cid1;
		this.cid2 = cid2;
		this.distancia = distancia;
		this.adjCode = cid1.getCode() + cid2.getCode();
	}

	public Cidade getCid1() {
		return cid1;
	}

	public void setCid1(Cidade cid1) {
		this.cid1 = cid1;
	}

	public Cidade getCid2() {
		return cid2;
	}

	public void setCid2(Cidade cid2) {
		this.cid2 = cid2;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	public int getAdjCode() {
		return adjCode;
	}

	public void setAdjCode(int adjCode) {
		this.adjCode = adjCode;
	}

	public boolean verificaAdj(Cidade cid) {
		return (cid.getCode() == this.cid1.getCode() || cid.getCode() == this.cid2.getCode());		 
	}
	
	/*public Cidade proximaAjd() {
		return Cidade;
	}
	*/
	
}

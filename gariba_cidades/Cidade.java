package gariba_cidades;

public class Cidade {
	
	private String name;
	private int code;
	private Adjacencia [] adjac;
	

	public Cidade(String name,int qtdCids) {
		this.name = name;
		this.adjac = new Adjacencia[qtdCids];
		criaCodCid(this.name);
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	public Adjacencia[] getAdjac() {
		return adjac;
	}
	
	public Adjacencia getAdjacPos(int pos) {
		return this.adjac[pos];
		
	}

	public void addCidAdjac(Adjacencia cidAdjac) {
		for(int i = 0; i < adjac.length; i++) {
			if(adjac[i] == null) {
				this.adjac[i] = cidAdjac;
				break;
			}
		}
		
	}

	private void criaCodCid(String name) {
		char [] numChar = new char[this.name.length()];
		for(int i = 0; i < this.name.length(); i++) {
			numChar[i] = this.name.charAt(i);
		}
		for(int i = 0; i < numChar.length; i++) {
			this.code += numChar[i];
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		if (code != other.code)
			return false;
		return true;
	}
	
	
	
}

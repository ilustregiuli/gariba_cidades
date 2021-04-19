package gariba_cidades;

public class Cidade {
	
	private String name;
	private int code;
	private int [] codeCidAdjac;
	

	public Cidade(String name, int code,int qtdCids) {
		this.name = name;
		this.code = code;
		this.codeCidAdjac = new int[qtdCids];
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
	
	public String getCidAdjac() {
		String adj = "";
		for(int x = 0; x < codeCidAdjac.length; x++) {
			adj += " " + codeCidAdjac[x];
		}
		return adj;
	}
	

	public int[] getCodeCidAdjac() {
		return codeCidAdjac;
	}

	public void setCodeCidAdjac(int[] codeCidAdjac) {
		this.codeCidAdjac = codeCidAdjac;
	}

	public void setCodeCidAdjac(int code, int index) {
		this.codeCidAdjac[index] = code;
	}

	public boolean verificaAdjacencia(int codCid) {
		boolean result = false;
		for(int x = 0; x < codeCidAdjac.length; x++) {
			if(codCid == codeCidAdjac[x]) {
				result = true;
			}
		}
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		return result;
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

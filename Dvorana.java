package klase2Zadatak1;

public class Dvorana {

	private String imeDvorane;
	private String grad;
	private int brojMesta;

	public Dvorana(String imeDvorane, String grad, int brojMesta) {
		super();
		this.imeDvorane = imeDvorane;
		this.grad = grad;
		this.brojMesta = brojMesta;
	}

	public String getImeDvorane() {
		return imeDvorane;
	}

	public void setImeDvorane(String imeDvorane) {
		this.imeDvorane = imeDvorane;
	}

	public int getBrojMesta() {
		return brojMesta;
	}

	public void setBrojMesta(int brojMesta) {
		this.brojMesta = brojMesta;
	}

	public String getGrad() {
		return grad;
	}

}

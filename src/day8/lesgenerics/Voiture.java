package day8.lesgenerics;

public class Voiture {
	String marque;

	@Override
	public String toString() {
		return "Voiture [marque=" + marque + "]";
	}

	public Voiture(String marque) {
		super();
		this.marque = marque;
	}

}

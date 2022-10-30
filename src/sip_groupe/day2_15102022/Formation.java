package sip_groupe.day2_15102022;

import java.util.ArrayList;

public final class Formation {
	
	private final String nom;
	
	public Formation(String nom, ArrayList<String> chapitres) {
		//super();
		this.nom = nom;
		//this.nom = "OCP";
		this.chapitres = new ArrayList(chapitres);
	}

	private final ArrayList<String>chapitres;

	public String getNom() {
		return nom;
	}

	public ArrayList<String> getChapitres() {
		return new ArrayList(chapitres);
	}

}

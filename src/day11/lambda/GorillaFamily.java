package day11.lambda;
class GorillaFamily {
	String walk = "walk";//attribut d'instance
	static String name = "King Kong";//attribut static
	void everyonePlay(boolean baby) {
		String approach = "amble";
		//approach = "run";
		//baby = false;
		play(() -> walk); //attribut d'instance
		play(() -> name); //attribut de classe
		play(() -> baby ? "hitch a ride" : "run"); //variable locale paramètre de méthode: effectively final
		play(() -> approach); //variable locale: effectively final
	}

	void play(Gorilla g) {
		System.out.println(g.move());
	}
}

package day14_Exceptions;

public class TestTaux {

	public static int maxTaux = 10;

	public static void calculTaux(int valeur) throws TauxDamageException {
		if (valeur > maxTaux)
			throw new TauxDamageException("Taux dépassé");
	}

	public static void main(String[] args) {
		try {
			calculTaux(12);
		} catch (TauxDamageException ex) {

			System.out.println(ex.getMessage());
		}
	}

}

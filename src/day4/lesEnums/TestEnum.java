package day4.lesEnums;

public class TestEnum {

	public static void main(String[] args) {
		Saison s1 = Saison.AUTOMNE;
		System.out.println("******");
		Saison s2 = Saison.HIVER;
		//System.out.println(s1);
		s1.getNbre();
		s1.setNbre(100);
		s1.getNbre();
		//s2.getNbre();

	}

}

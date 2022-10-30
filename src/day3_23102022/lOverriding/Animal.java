package day3_23102022.lOverriding;

public class Animal {

	void info() {
		System.out.println("Animal");
	}

	Animal getAnimal() throws Exception {  //checked exception
		return new Animal();
	}

}

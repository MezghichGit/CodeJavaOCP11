package day3_23102022.lOverriding;

import java.io.IOException;

public class Oiseau extends Animal{
	@Override
	public void info() {
		System.out.println("Animal");
	}
	
	@Override
	Oiseau getAnimal() throws IOException{
		return new Oiseau();
	}
}

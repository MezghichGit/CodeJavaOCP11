package day3_23102022;

public class Animal extends Object{

	int age = 1;
	static int taille=10;
	public Animal() {
		super(); // appel au contructeur par défaut de Object
		System.out.println("Animal");
	}
	
	public Animal (int age)
	{
		System.out.println("Animal avec paramètre int");
		this.age = age;
	}
	
	public void getAge()
	{
		//System.out.println(this.age + taille);
		System.out.println("OCP");
	}
	
  public void getNom()
  {}
}

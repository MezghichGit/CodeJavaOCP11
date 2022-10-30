package day4.lesEnums;

public enum Saison {
	PRINTEMPS(10), HIVER, ETE(30), AUTOMNE(10); // supposed final and static
	private Saison(int v)  //Constructeur private
	{
		this.nbr=v;
		System.out.println("Enum Saision : "+this.nbr);
	}
	private Saison()  //Constructeur private
	{
		//this.nbr=v;
		System.out.println("Enum Saision : "+this.nbr);
	}
	
	int nbr;
	
	public void getNbre()
	{
		System.out.println(nbr);
	}
	
	public void setNbre(int n)
	{
		//System.out.println(nbr);
		this.nbr= n;
	}
}

package day8.lesgenerics;

public class Transporter<T> {
	
	public T contenu;
	
	public Transporter(T t)
	{
		this.contenu = t;
	}
	public Transporter()
	{
	}
	public void info()
	{
		System.out.println("Je transporte : "+contenu.toString());
	}

}

package day6.jdbc;

public class MyRessource implements AutoCloseable{
	
	
	public void precessing() throws Exception
	{
		System.out.println("Precessing...");
		throw new Exception("Oups");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Fermeture de la resssurce");
		
	}

}

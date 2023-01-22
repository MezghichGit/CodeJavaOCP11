package day14_Exceptions.TryWithRessource;



public class JammedTurkeyCage implements AutoCloseable{

	public static void main(String[] args) {
		try(
				JammedTurkeyCage t = new JammedTurkeyCage();
				JammedTurkeyCage t2 = new JammedTurkeyCage();
				)
		{
			//System.out.println("Puts turkeys in");
			throw new IllegalStateException("turkeys run off");
			//throw new RuntimeException("turkeys run off");
		}
		// implicite finally {t.close(); t2.close();}
		catch(IllegalStateException e) {
			System.out.println("Caugth : " +e.getMessage());
			for(Throwable t : e.getSuppressed()) //récupération de toutes les exceptions supprimées
			{
				//System.out.println(t.getMessage());
				t.printStackTrace();
			}
		}
		
		finally {
			//throw new RuntimeException("Autre message");
			System.out.println("Suite du programme...");
		}
	}

	/*
	@Override
	public void close() throws NullPointerException {
		throw new NullPointerException("Cage door does not close");
	}*/
	
	
	@Override
	public void close() throws IllegalStateException {
		//System.out.println("Fermeture ...");
		throw new IllegalStateException("Cage door does not close");
	}

}

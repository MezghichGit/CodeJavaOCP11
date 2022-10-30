package day4.instanceOf_operator;

public class TestJoueur {

	public static void marquer(Joueur j)
	{
	  Joueur temp;
	  if(j instanceof JFoot)	
		{
		 ((JFoot)j).marquerBut();
		 
		}
	  else {
		  ((JBasket)j).marquerPoint(); 
	  }
	}
	public static void main(String[] args) {
		marquer(new JFoot());
		marquer(new JBasket());

	}

}

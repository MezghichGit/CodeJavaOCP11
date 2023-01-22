package day14_Exceptions;

public class TauxDamageException extends Exception{
	
	public TauxDamageException()
	{
		super();
	}
	
	public TauxDamageException(String msg)
	{
		super(msg);
	}
	public TauxDamageException(Exception e)
	{
		super(e);
	}

}

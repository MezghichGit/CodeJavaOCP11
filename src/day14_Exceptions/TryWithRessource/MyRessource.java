package day14_Exceptions.TryWithRessource;

import java.io.Closeable;
import java.io.IOException;

public class MyRessource implements Closeable {

	public void info() throws IllegalArgumentException
	{
		System.out.println("Processing...");
	}

	@Override
	public void close() throws IOException {
		System.out.println("Libération des ressources");
		
	}
}

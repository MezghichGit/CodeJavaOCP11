package day6.jdbc;

import java.io.Closeable;
import java.io.IOException;

public class MyRes implements Closeable {

	@Override
	public void close() throws IOException {
		System.out.println("Closing MyRes");
		
	}

}

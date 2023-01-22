

import java.util.ListResourceBundle;

public class Zoo extends ListResourceBundle{

	@Override
	protected Object[][] getContents() {
	
		return new Object[][]{
			     {"hello","Hello default class file"},
			     {"open","The zoo is open en class file"}
			};
	}
}
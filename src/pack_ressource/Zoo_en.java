package pack_ressource;

import java.util.ListResourceBundle;

public class Zoo_en extends ListResourceBundle{

	@Override
	protected Object[][] getContents() {
	
		return new Object[][]{
			     {"hello","Hello dear US visitor class file from Zoo_en"},
			     {"open","The zoo is open US class file"}
			};
	}

}
package sip_groupe.day2_15102022;
import java.lang.Object;
public class Animal extends Object{

	int id;
	
	@Override
	public boolean equals(Object obj) {
        Animal temp = (Animal)obj;
        return temp.id == this.id;
    }
	
	/*
	@Override
	public String toString() {
		return "Animal [id=" + id + "]";
	}*/


	public void info()
	{
		//
	}
}

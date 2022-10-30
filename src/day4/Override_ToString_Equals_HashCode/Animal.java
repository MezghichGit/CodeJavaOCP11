package day4.Override_ToString_Equals_HashCode;

import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Animal extends Object {

	int age;
	String nom;
	int id;
	/*
	@Override
	public String toString() {
		return "Animal";
	}*/
	
	public void incrementAge(int val)
	{
		age+=val;
	}
	@Override
	public String toString() {
		return "Animal [age=" + age + ", nom=" + nom + ", id=" + id + "]";
	}
	/*@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);}
*/
	/*
	@Override
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Animal))
			return false;
		else {
		     Animal temp = (Animal) obj;
		     return temp.id == this.id;
		}
	}*/

	@Override
	public int hashCode() {
		//return Objects.hash(id, nom);
		return (this.id * 7 * this.nom.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return age == other.age && id == other.id && Objects.equals(nom, other.nom);
	}
}

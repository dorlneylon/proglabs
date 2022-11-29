package main.interfaces;
import main.people.Person;

public interface KidsBusiness {
	public void play(Person... p);
	
	public void play();

	public void doArithmetic() throws Throwable;
}

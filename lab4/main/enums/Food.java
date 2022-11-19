package main.enums;
import java.util.Random;

public enum Food {
	meatballs("тефтели"), casserole("запеканка"), apple("яблоко"), pear("груша"), broccoli("брокколи"), soup("суп"), buckwheat("гречка");
	
	private final String name;

	private Food(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static Food pickRandom() {
		return values()[new Random().nextInt(values().length)];
	}
}

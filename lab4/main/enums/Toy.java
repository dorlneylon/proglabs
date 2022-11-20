package main.enums;

public enum Toy {
	CAR("машинка"), DOLL("кукла"), CUBE("кубик"), BALL("мячик");

	private final String name;
	
	public static Toy pickRandom() {
		return Toy.values()[(int) (Math.random() * Toy.values().length)];
	}

	public String getName() {
		return name;
	}

	private Toy(String name) {
		this.name = name;
	}
}

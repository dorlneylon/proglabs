package main.people;
import main.people.Person;
import main.enums.Food;
import main.interfaces.AnecAbility;

public class FlyMan extends Person implements AnecAbility {
    public FlyMan() {
        super("Карлсон", 999, "Я Карлсон и я живу на крыше! И еще я умею летать! А ты нет, кст.\nК слову, я умею травить анеки, если потребуется.");
    }

	public FlyMan(String name, int age, String greet) {
		super(name, age, greet);
	}
	
	public FlyMan(String name, int age) {
		super(name, age, String.format("Я %s, я летаю и травлю байки. Обожаю анекдоты про Штирлица и поручика Ржевского.", name));
	}
	
	@Override
	public void interact(Person p) {
		System.out.printf("%s так накормил(-а) %s, что тот(-а) уже ничего не съест.\n", getName(), p.getName());
		p.eaten += 6;
	}

    @Override
    public boolean equals(Person comp) {
		message("Два дебила с пропеллерами, охренеть.");
		return super.equals(comp);
	}

    @Override
    protected void ability() {
        if (!sleeps) { System.out.printf("%s:", this.name); sayAnec(); }
        else System.out.println("Спит.");
    }

    @Override
    protected void ability(Person p) {
        if (!isSleeping() && !p.isSleeping()) System.out.printf("%s рассказал анекдот %s.\n", getName(), p.getName());
    }

    @Override
    public void eat(Food f) {
        if (!sleeps && this.eaten < 6) { message("О, еда)"); (this.eaten)++; }
		else if (!sleeps && this.eaten >= 6) { message("Я сыт."); }
        else System.out.printf("%s спит.\n", this.name);
    }

    @Override
    public String toString() {
        if (!sleeps) return String.format("%s: %s", this.name, this.greet);
        else return "Спит.";
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

}

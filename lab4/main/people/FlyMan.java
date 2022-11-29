package main.people;
import main.people.Person;
import main.enums.Food;
import main.interfaces.AnecAbility;
import main.interfaces.Fan;
import main.exceptions.AgeException;

public class FlyMan extends Person implements AnecAbility {
    public FlyMan() {
        super("Карлсон", 15, "Я Карлсон и я живу на крыше! И еще я умею летать! А ты нет, кст.\nК слову, я умею травить анеки, если потребуется.");
    }

	public FlyMan(String name, int age, String greet) throws AgeException {
		super(name, age, greet);
		if (age < 0 || age > 18) {
			throw new AgeException("Неподходящий возраст для летающих людей");
		}	
	}
	
	public FlyMan(String name, int age) {
		super(name, age, String.format("Я %s, я летаю и травлю байки. Обожаю анекдоты про Штирлица и поручика Ржевского.", name));
	}
	
	Fan fan = new Fan() {
		@Override
		public void switchOn() {
			System.out.printf("%s начал летать на своей перделке.\n", getName());
		}
		
		@Override
		public void switchOff() {
			System.out.printf("%s приземлился.\n", getName());
		}
	};

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
	
	public void fly() {
		fan.switchOn();
	}

	public void land() {
		fan.switchOff();
	}
}

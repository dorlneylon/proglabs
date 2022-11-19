package main.people;
import main.people.Person;
import main.enums.Food;
import main.interfaces.DoingNothing;

public class Kid extends Person implements DoingNothing {
    public Kid(String name, int age) {
        super(name, age, "Привет, это я - " + name + "!");
    }

    @Override
    public boolean equals(Person comp) {
        if (!sleeps) Message("Как? Еще один малыш?!");
		return super.equals(comp);
    }

    @Override
    protected void Ability() {
        if (!sleeps) {
            System.out.print(getName() + " подумал о ");
            if (Math.round(Math.random()) == 1) System.out.println("фрекен Бок.");
            else System.out.println("запеканке.");
        } else { System.out.println("Малыш спит."); }
    }    
   

	@Override
	public void Interact(Person p) {
		if (!sleeps && !p.sleeps) {
			Food f = Food.pickRandom();
			System.out.printf("%s дал %s %s.\n", getName(), p.getName(), f.getName());
			p.Eat(f);
		} else if (sleeps) { System.out.println("Малыш спит."); } else { Message("Я не буду его будить!"); }
	}

	/*@Override
    protected void Ability(Person p) {
        if (!p.isSleeping() && isSleeping()) {
			System.out.printf("%s подарил конфетку %s.\n", getName(), p.getName());
			p.eatFood("конфета");
		}
    }*/
	
	// TODO: малыш должен уметь что-то еще.

	@Override
	public void Ability(Person p) {

	}

    @Override
    public void Eat(Food f) {
		if (!sleeps && this.eaten < 5) {
			System.out.printf("%s съел свою жертву. Ей оказался(-лась) %s.\n", getName(), f.getName());
			if (Math.round(Math.random()) == 1) Message("Вкусно!");
			else Message("Не очень.");
			(this.eaten)++;
		} else if (sleeps) { System.out.printf("%s спит.\n"); } else { Message("Я не голоден!"); }
	}

	@Override
	public void Message(String message) {
		System.out.println(getName() + ": " + message);
	}

    @Override
    public String toString() {
        if (!sleeps) return String.format("Вообще я %s, но друзья зовут меня Малыш. Мне %d лет.", getName(), getAge());
        return "Спит.";
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}

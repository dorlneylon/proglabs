package main.people;
import main.people.Person;
import main.enums.*;
import main.interfaces.KidsBusiness;

public class Kid extends Person implements KidsBusiness {
    public Kid(String name, int age) {
        super(name, age, "Привет, это я - " + name + "!");
    }

	@Override
	public void Play(Person... p) {
		if (!sleeps) {
			String s = "Я играю с ";
			for (Person k: p) {
				if (k.getAge() < 18 && !k.isSleeping()) {
					s += k.getName() + ", ";
					k.goSleep();
				}
			}
			s = s.substring(0, s.length() - 2);
			Message(s + ". А остальные слишком взрослые (или спят)!\n");
			System.out.println("Дети так устали, что пошли спать.");
		} else {
			System.out.println("Дети спят, поэтому не могут играть.");
		}
	}

	// TODO: это должно на что-то влиять
	@Override
	public void Play() {
		if (!sleeps) {
			Toy randt = Toy.pickRandom();
			Message("Я играю с " + randt.getName() + ".\n");
		} else {
			System.out.printf("%s спит, поэтому не может играть.\n", this.name);
		}
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
	
	@Override
	public void Ability(Person p) {
		if (!sleeps) {
			if (p.getAge() < 18 && !p.isSleeping()) {
				System.out.printf("%s показал %s, как играть в %s.\n", getName(), p.getName(), Toy.pickRandom().getName());
				System.out.printf("%s и %s поиграли и поели вместе.\n", getName(), p.getName());
				p.Eat(Food.pickRandom());
				Eat(Food.pickRandom());
			} else if (p.isSleeping()) { System.out.println("Малыш не хочет будить его."); } else { Message("Он(-а) какой-то(-ая-то) слишком старый(-ая)."); }
			System.out.printf("Поиграв в новую для %s игру, они поели", p.getName());
		} else {
			System.out.println("Малыш спит.");
		}
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

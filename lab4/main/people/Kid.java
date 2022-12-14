package main.people;
import main.people.Person;
import main.enums.*;
import main.exceptions.*;
import main.interfaces.KidsBusiness;

public class Kid extends Person implements KidsBusiness {
    Toy[] toys = new Toy[3];
	private boolean hw_done = false;

	public Kid(String name, int age) throws AgeException {
		super(name, age, "Привет, это я - " + name + "!");
		maxEat = 6;
		if (age > 18 || age < 0) {
			throw new AgeException("Неподходящий возраст для ребенка!");
		}
		for (int i = 0; i < 3; ++i) toys[i] = Toy.pickRandom();
    }

	public Kid(String name, int age, String greet, Toy[] toys) throws AgeException {
		super(name, age, greet);
		maxEat = 6;
		if (age > 18 || age < 0) {
			throw new AgeException("Неподходящий возраст для ребенка!");
		}
		if (toys.length < 3) {
			for (int i = 0; i < toys.length; ++i) this.toys[i] = toys[i];
			for (int i = toys.length; i < 3; ++i) this.toys[i] = Toy.pickRandom();
		} else {
			for (int i = 0; i < 3; ++i) this.toys[i] = toys[i];
		}
	}

	class Homework {
		public short tasks_left = 5;
		public short a,b;
		public void doArithmetic() {
			if (hw_done) {
				message("Я уже сделал всю домашку!");
				return;
			}
			while (tasks_left --> 0) {
				a = (short) (Math.random() * 50);
				b = (short) (Math.random() * 50);
				message(a + " + " + b + " = " + (a + b));
				message(a + " - " + b + " = " + (a - b));
				message(a + " * " + b + " = " + (a * b));
				if (b == 0) {
					throw new ZeroException();
				}
				message(a + " / " + b + " = " + (a / b));

				hw_done = true;
			}
		}
	}
	@Override
	public void doArithmetic() throws Throwable {
		Homework m = new Homework();
		m.doArithmetic();
		message("Я закончил! Фууух, как же я устал. Пойду посплю...");
		goSleep();
	}

	@Override
	public void play(Person... p) {
		if (!sleeps) {
			String s = "Я играю с ";
			for (Person k: p) {
				if (k.getAge() < 18 && !k.isSleeping()) {
					s += k.getName() + ", ";
					k.goSleep();
				}
			}
			s = s.substring(0, s.length() - 2);
			message(s + "." + (p.length > 1 ? "\n А остальные слишком взрослые (или спят)!\n" : ""));
			System.out.println("Дети так устали, что пошли спать.");
		} else {
			System.out.println("Дети спят, поэтому не могут играть.");
		}
	}

	@Override
	public void play() {
		if (!sleeps) {
			Toy t = toys[(int)(Math.random()*3)];
			message("Я играю с этой игрушкой:" + t.getName() + ".\n");
		} else {
			System.out.printf("%s спит, поэтому не может играть.\n", this.name);
		}
	}

	public void changeToys(Kid k) {
		if (!sleeps && !k.isSleeping()) {
			int l1 = (int)(Math.random()*3);
			int l2 = (int)(Math.random()*3);
			Toy t = toys[l1];
			Toy t2 = k.toys[l2];
			toys[l1] = t2;
			k.toys[l2] = t;
			message("Я меняю игрушки с " + k.getName() + ". У него теперь " + t.getName() + ", а у меня " + t2.getName() + ".\n");
		} else {
			System.out.printf("%s спит, поэтому не может менять игрушки.\n", this.name);
		}
	}

    @Override
    public boolean equals(Person comp) {
        if (!sleeps) message("Как? Еще один малыш?!");
		return super.equals(comp);
    }

    @Override
    protected void ability() {
        if (!sleeps) {
            System.out.print(getName() + " подумал о ");
            if (Math.round(Math.random()) == 1) {
				System.out.println("том, что пора бы поспать, что ли...");
				goSleep();
			}
            else {
				Food x = Food.pickRandom();
				System.out.println("том, что у него где-то есть " + x.getName() + "...");
				eat(x);
			}

        } else { System.out.println("Малыш спит."); }
    }    

	@Override
	public void interact(Person p) {
		if (!sleeps && !p.sleeps) {
			Food f = Food.pickRandom();
			System.out.printf("%s дал %s %s.\n", getName(), p.getName(), f.getName());
			p.eat(f);
		} else if (sleeps) { System.out.println("Малыш спит."); } else { message("Я не буду его будить!"); }
	}
	
	@Override
	public void ability(Person p) {
		if (!sleeps) {
			if (p.getAge() < 18 && !p.isSleeping()) {
				System.out.printf("%s показал %s, как играть в %s.\n", getName(), p.getName(), Toy.pickRandom().getName());
				System.out.printf("%s и %s поиграли и поели вместе.\n", getName(), p.getName());
				p.eat(Food.pickRandom());
				eat(Food.pickRandom());
			} else if (p.isSleeping()) { System.out.println("Малыш не хочет будить его."); } else { message("Он(-а) какой-то(-ая-то) слишком старый(-ая)."); }
			System.out.printf("Поиграв в новую для %s игру, они поели", p.getName());
		} else {
			System.out.println("Малыш спит.");
		}
	}

    @Override
    public void eat(Food f) {
		if (!sleeps && this.eaten < maxEat) {
			System.out.printf("%s съел свою жертву. Ей оказался(-лась) %s.\n", getName(), f.getName());
			if (Math.round(Math.random()) == 1) message("Вкусно!");
			else message("Не очень.");
			(this.eaten)++;
		} else if (sleeps) { System.out.printf("%s спит.\n"); } else { message("Я не голоден!"); }
	}

	@Override
	public void message(String message) {
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

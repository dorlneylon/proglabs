package main.people;
import main.people.Person;
import main.interfaces.DoingNothing;
import java.util.Vector;
import main.enums.Food;
import main.exceptions.AgeException;

public class Woman extends Person implements DoingNothing {
	private Vector<Food> food = new Vector<Food>(3);

    public Woman(String name, int age) throws AgeException {
        super(name, age, "за что я женщина?");
		maxEat = 4;
		if (age < 18) {
			throw new AgeException("Возраст взрослой женщины не может быть меньше 18");
		}

    }

	public Woman(String name, int age, String greet) throws AgeException {
		super(name, age, greet);
		maxEat = 4;
		if (age < 18) {
			throw new AgeException("Возраст взрослой женщины не может быть меньше 18");
		}
	}

	@Override
	public void doNothing() {
		System.out.println("Я женщина, я ничего не делаю");
		System.out.println("⠄⣾⣿⡇⢸⣿⣿⣿⠄⠈⣿⣿⣿⣿⠈⣿⡇⢹⣿⣿⣿⡇⡇⢸⣿⣿⡇⣿⣿⣿\n" +
				"⢠⣿⣿⡇⢸⣿⣿⣿⡇⠄⢹⣿⣿⣿⡀⣿⣧⢸⣿⣿⣿⠁⡇⢸⣿⣿⠁⣿⣿⣿\n" +
				"⢸⣿⣿⡇⠸⣿⣿⣿⣿⡄⠈⢿⣿⣿⡇⢸⣿⡀⣿⣿⡿⠸⡇⣸⣿⣿⠄⣿⣿⣿\n" +
				"⢸⣿⡿⠷⠄⠿⠿⠿⠟⠓⠰⠘⠿⣿⣿⡈⣿⡇⢹⡟⠰⠦⠁⠈⠉⠋⠄⠻⢿⣿\n" +
				"⢨⡑⠶⡏⠛⠐⠋⠓⠲⠶⣭⣤⣴⣦⣭⣥⣮⣾⣬⣴⡮⠝⠒⠂⠂⠘⠉⠿⠖⣬\n" +
				"⠈⠉⠄⡀⠄⣀⣀⣀⣀⠈⢛⣿⣿⣿⣿⣿⣿⣿⣿⣟⠁⣀⣤⣤⣠⡀⠄⡀⠈⠁\n" +
				"⠄⠠⣾⡀⣾⣿⣧⣼⣿⡿⢠⣿⣿⣿⣿⣿⣿⣿⣿⣧⣼⣿⣧⣼⣿⣿⢀⣿⡇⠄\n" +
				"⡀⠄⠻⣷⡘⢿⣿⣿⡿⢣⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣜⢿⣿⣿⡿⢃⣾⠟⢁⠈\n" +
				"⢃⢻⣶⣬⣿⣶⣬⣥⣶⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣷⣶⣶⣾⣿⣷⣾⣾⢣\n" +
				"⡄⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠘\n" +
				"⣿⡐⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⢠⢃\n" +
				"⣿⣷⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⡿⠋⢀⠆⣼\n" +
				"⣿⣿⣷⡀⠄⠈⠛⢿⣿⣿⣿⣿⣷⣶⣶⣶⣶⣶⣿⣿⣿⣿⣿⠿⠋⠠⠂⢀⣾⣿\n" +
				"⣿⣿⣿⣧⠄⠄⢵⢠⣈⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⢋⡁⢰⠏⠄⠄⣼⣿⣿\n" +
				"⢻⣿⣿⣿⡄⢢⠨⠄⣯⠄⠄⣌⣉⠛⠻⠟⠛⢋⣉⣤⠄⢸⡇⣨⣤⠄⢸⣿⣿⣿");
	}

	@Override
	public void interact(Person p) {
		if (!gone) {	
			if (!p.sleeps) { 
				message("Ну я его уложила спать.");
				p.goSleep();
			} else {
				message("Мне его разбудить? Ну ладно... А зачем тогда было укладывать?");
				p.wakeUp();
			}
		}
	}

    private boolean gone = false;
    
    @Override
    public boolean equals(Person comp) {
        if (!(comp.getName().equals(this.name)) || (getAge() != comp.getAge())) {
            if (!gone) message("Мема не будет но они не похожи");
            return false;
        }
        if (!gone) message("Ну получаеца равны да");
        return true;
    }

	public void cook() {
		class Cook {
			public void cook() {
				if (food.size() < 3) {
					food.add(Food.pickRandom());
					message("Я приготовила " + food.lastElement().getName() + ".");
				} else {
					message("Я не буду готовить, у меня уже есть 3 блюда.");
				}
			}
			public void available() {
				if (food.size() > 0) {
					message("У меня есть:");
					for (Food f:food)
					System.out.println(f.getName());
				} else
					message("У меня пока что нет еды, ее надо сначала приготовить.");
			}
		}
		Cook cook = new Cook();
		cook.cook();
		cook.available();
	}
   
    @Override
    protected void ability(Person hungry) {
		if (food.size() > 0) {
			message("Вот, " + hungry.getName() + ", есть " + food.firstElement().getName() + ".");
			hungry.eat(food.firstElement());
			food.remove(0);
		} else {
			message("У меня нет еды, ее надо сначала приготовить.");
			if (hungry.eaten > 5) {
				hungry.message("Да не очень-то и хотелось...");
			} else {
				hungry.message("Блин, а я голоден...");
			}
		}
	}

	@Override
	public void goSleep() {
		if (!gone) {
			message("Я устала, пошла спать.");
			super.goSleep();
		}
	}

	@Override
	public void wakeUp() {
		if (!gone) {
			message("Я проснулась.");
			super.wakeUp();
		}
	}

	public void goAway() {
		if (!gone) {
			message("Я ушла.");
			gone = true;
		}
	}

	public void comeBack() {
		if (gone) {
			message("Я вернулась.");
			gone = false;
		}
	}

	@Override
    protected void ability() {
        if (!gone && !sleeps) message("Я могу приготовить еду, но для этого надо показать, кому.");
        else System.out.printf("%s ушла.\n", getName());
    }
    
    @Override
    public void eat(Food f) {
		if (!gone && !sleeps && this.eaten < maxEat && food.contains(f)) {
			System.out.printf("%s съела %s. Реакции не будет женщины жоско держут покерфейс лол\n", getName(), f.getName());
			(this.eaten)++;
			food.remove(f);
		} else if (this.eaten >= maxEat) {
			message("Я сыта, не буду больше есть.");
		} else System.out.printf("%s ушла или спит. А может быть, она еще просто не приготовила эту еду.\n", getName());
	}

    @Override
    public String toString() {
        return gone ? String.format("%s ушла.", getName()) : String.format("%s: %s", getName(), getGreet());
    }

    public void superPower(Person... p) throws AgeException {
        System.out.printf("%s уложила указанных людей спать, а сама пошла в магазин.", getName());
        for (Person k:p) {
			if (!(k.equals(new Woman(this.name, this.age)))) k.goSleep();
			else System.out.printf("Ну, было бы странно, если бы %s уложила себя спать.\n", this.name);
		}
    }
}

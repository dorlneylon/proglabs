package main.people;
import main.people.Person;
import main.interfaces.DoingNothing;
import main.enums.Food;

public class Woman extends Person implements DoingNothing {
    public Woman(String name, int age) {
        super(name, age, "чзх за что я женщина?");
    }

	public Woman(String name, int age, String greet) {
		super(name, age, greet);
	}

	@Override
	public void doNothing() {
		System.out.println("Я женщина, я ничего не делаю");
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

    @Override
    protected void ability(Person hungry) {
		if (!gone) {
			if (hungry.getAge() < 18) {
				message("Я не могу дать " + hungry.getName() + " еды, он слишком маленький!");
			} else {
				Food f = Food.pickRandom();
				message("Я дала " + hungry.getName() + " " + f.getName() + ".");
				hungry.eat(f);
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
   
	@Override
    protected void ability() {
        if (!gone) message("Я могу приготовить еду, но для этого надо показать, кому.");
        else System.out.printf("%s ушла.\n", getName());
    }
    
	// TODO: доделать реакцию на еду
    @Override
    public void eat(Food f) {
		if (!gone) {
			System.out.printf("%s съела %s. Реакция будет допилена позже лол\n", getName(), f.getName());
			(this.eaten)++;
		}
		else System.out.printf("%s ушла.", getName());
	}

    @Override
    public String toString() {
        return gone ? String.format("%s ушла.", getName()) : String.format("%s: %s", getName(), getGreet());
    }

    public void superPower(Person... p) {
        System.out.printf("%s уложила указанных людей спать, а сама пошла в магазин. Когда вернется - неизвестно.", getName());
        for (Person k:p) {
			if (!(k.equals(new Woman(this.name, this.age)))) k.goSleep();
			else System.out.printf("Ну, было бы странно, если бы %s уложила себя спать.\n", this.name);
		}
        this.gone = true;
    }
}

package main.people;
import main.people.Person;
import main.interfaces.DoingNothing;
import main.enums.Food;
import main.exceptions.AgeException;

public class Woman extends Person implements DoingNothing {
    public Woman(String name, int age) throws AgeException {
        super(name, age, "за что я женщина?");
		if (age < 18) {
			throw new AgeException("Возраст взрослой женщины не может быть меньше 18");
		}

    }

	public Woman(String name, int age, String greet) throws AgeException {
		super(name, age, greet);
		if (age < 18) {
			throw new AgeException("Возраст взрослой женщины не может быть меньше 18");
		}
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
    
    @Override
    public void eat(Food f) {
		if (!gone && !sleeps && this.eaten < 4) {
			System.out.printf("%s съела %s. Реакции не будет женщины жоско держут покерфейс лол\n", getName(), f.getName());
			(this.eaten)++;
		} else if (this.eaten >= 4) {
			message("Я сыта, не буду больше есть.");
		} else System.out.printf("%s ушла или спит.", getName());
	}

    @Override
    public String toString() {
        return gone ? String.format("%s ушла.", getName()) : String.format("%s: %s", getName(), getGreet());
    }

    public void superPower(Person... p) throws AgeException {
        System.out.printf("%s уложила указанных людей спать, а сама пошла в магазин. Когда вернется - неизвестно.", getName());
        for (Person k:p) {
			if (!(k.equals(new Woman(this.name, this.age)))) k.goSleep();
			else System.out.printf("Ну, было бы странно, если бы %s уложила себя спать.\n", this.name);
		}
        this.gone = true;
    }
}

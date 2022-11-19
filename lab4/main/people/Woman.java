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
	public void DoNothing() {
		System.out.println("Я женщина, я ничего не делаю");
	}

	@Override
	public void Interact(Person p) {
		if (!gone) {	
			if (!p.sleeps) { 
				Message("Ну я его уложила спать.");
				p.goSleep();
			} else {
				Message("Мне его разбудить? Ну ладно... А зачем тогда было укладывать?");
				p.wakeUp();
			}
		}
	}

    private boolean gone = false;
    
    @Override
    public boolean equals(Person comp) {
        if (!(comp.getName().equals(this.name)) || (getAge() != comp.getAge())) {
            if (!gone) Message("Мема не будет но они не похожи");
            return false;
        }
        if (!gone) Message("Ну получаеца равны да");
        return true;
    }

    @Override
    protected void Ability(Person hungry) {
        if (!gone) System.out.printf("%s приготовила тефтели %s\n", getName(), hungry.getName());
        else System.out.println(this.name + " ушла и вернуться, собственно, не обещала.");
    }
    
    @Override
    protected void Ability() {
        if (!gone) Message("Я могу приготовить еду, но для этого надо показать, кому.");
        else System.out.println("Фрекен Бок ушла.");
    }
    
	// TODO: доделать реакцию на еду
    @Override
    public void Eat(Food f) {
		if (!gone) {
			System.out.printf("%s съела %s. Реакция будет допилена позже лол\n", getName(), f.getName());
			(this.eaten)++;
		}
		else System.out.printf("%s ушла.", getName());
	}

    @Override
    public String toString() {
        return gone ? "Фрекен Бок ушла." : String.format("%s: %s", getName(), getGreet());
    }

    public void SuperPower(Person... p) {
        System.out.printf("%s уложила указанных людей спать, а сама пошла в магазин. Когда вернется - неизвестно.", getName());
        for (Person k:p) {
			if (!(k.equals(new Woman(this.name, this.age)))) k.goSleep();
			else System.out.printf("Ну, было бы странно, если бы %s уложила себя спать.\n", this.name);
		}
        this.gone = true;
    }
}

package main.people;
import main.people.Person;
import main.enums.Food;
import main.interfaces.AnecAbility;


public class RandMan extends Person implements AnecAbility {
    public RandMan(String name, int age) {
        super(name, age);
    }

    public RandMan(String name, int age, String greet) {
        super(name, age, greet);
    }
	
	@Override
	public void interact(Person p) {
		message("Я могу анекдот рассказать ему... А так собственно я ничего не умею, я же просто рандом");
		sayAnec();
		p.message("Ниче не понятно...");
	}

    @Override
    public boolean equals(Person comp) {
        return comp.getName() == getName() && comp.getAge() == getAge();
    }

    @Override
    protected void ability() {
        System.out.printf("%s: ", getName());
        sayAnec();
    }

    @Override
    protected void ability(Person p) {
        message(String.format("А у тебя, %s, спина белая\n", p.getName()));
    }

    @Override
    public void eat(Food f) {
        System.out.printf("%s съел %s.Он вообще съест что хочешь.\n", getName(), f.getName());
    }

    @Override
    public String toString() {
        return String.format("%s: Меня зовут %s. Мне %d лет.", getName(), getName(), getAge());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}

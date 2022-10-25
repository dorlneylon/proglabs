package main.people;
import main.people.Person;
import main.interfaces.AnecAbility;


public class RandMan extends Person implements AnecAbility {
    public RandMan(String name, int age) {
        super(name, age);
    }

    public RandMan(String name, int age, String greet) {
        super(name, age, greet);
    }

    @Override
    public boolean equals(Person comp) {
        return comp.getName() == getName() && comp.getAge() == getAge();
    }

    @Override
    protected void Ability() {
        System.out.printf("%s: ", getName());
        SayAnec();
    }

    @Override
    protected void Ability(Person p) {
        Message(String.format("А у тебя, %s, спина белая\n", p.getName()));
    }

    @Override
    protected void Eat(String food) {
        System.out.printf("%s съел %s.\n", getName(), food);
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

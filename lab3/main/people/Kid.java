package main.people;
import main.people.Person;
import main.interfaces.DoingNothing;

public class Kid extends Person implements DoingNothing {
    public Kid(String name, int age) {
        super(name, age, "Привет, это я - " + name + "!");
    }

    @Override
    public boolean equals(Person comp) {
        if (!sleeps) Message("Как? Еще один малыш?!");
        return false;
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
    protected void Ability(Person p) {
        if (!p.isSleeping() && isSleeping()) System.out.printf("%s подарил конфетку %s.\n", getName(), p.getName());
    }

    @Override
    protected void Eat(String food) {
        if (!sleeps) Message((!(food.equals("пельмени"))) ? "М-м-м, я люблю " + food + "." : "Фу-у!");
        else System.out.println(getName() + " спит.");
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

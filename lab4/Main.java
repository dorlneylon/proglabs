import main.people.*;
import main.enums.Food;

public class Main {
    public static void main(String[] args) {
        Kid k = new Kid("Кекус", 666);
        Woman b = new Woman("Фрекен Бок", 1337);
        FlyMan q = new FlyMan("Карлссон", 42);
        RandMan rr = new RandMan("Рандом", 28);
        Person[] persons = {k, b, q, rr};

        for (Person p : persons) test(p);
    }

    public static void test(Person p) {
        RandMan TestPerson = new RandMan("tester", 20);
        System.out.println(p.toString());
        p.Greet();
        p.showAbility();
        p.showAbility(TestPerson);
        p.goSleep();
        System.out.println(p.isSleeping());
        p.wakeUp();
        System.out.println(p.isSleeping());

		p.Interact(TestPerson);
		for (int i = 0; i < 10; ++i) p.Eat(Food.pickRandom());
        System.out.println(p.hashCode());
    }
}

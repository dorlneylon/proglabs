import main.people.*;
import main.enums.Food;

public class Main {
    public static void main(String[] args) {
        Kid k = new Kid("Кекус", 2);
        Woman b = new Woman("Фрекен Бок", 17);
        FlyMan q = new FlyMan("Карлссон", 4);
        RandMan rr = new RandMan("Рандом", 8);
        Person[] persons = {k, b, q, rr};

        for (Person p : persons) test(p);
    }

    public static void test(Person p) {
        RandMan TestPerson = new RandMan("tester", 15);
        System.out.println(p.toString());
        p.Greet();
        p.showAbility();
        p.showAbility(TestPerson);
        p.goSleep();
        System.out.println(p.isSleeping());
        p.wakeUp();
        System.out.println(p.isSleeping());

		p.Eat(Food.pickRandom());

		p.Interact(TestPerson);
		for (int i = 0; i < 10; ++i) p.Eat(Food.pickRandom());
        System.out.println(p.hashCode());
    }
}

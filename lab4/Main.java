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

		testKid(k);
    }

	public static void testKid(Kid p) {
		Kid TestKid = new Kid("TestKid", 8);
		

		TestKid.interact(p);
		p.interact(TestKid);
		p.play(TestKid);
		p.play();

		p.changeToys(TestKid);
		p.play();
	}

    public static void test(Person p) {
        RandMan TestPerson = new RandMan("tester", 15);
        System.out.println(p.toString());
        p.greet();
        p.showAbility();
        p.showAbility(TestPerson);
        p.goSleep();
        System.out.println(p.isSleeping());
        p.wakeUp();
        System.out.println(p.isSleeping());

		p.eat(Food.pickRandom());

		p.interact(TestPerson);
		for (int i = 0; i < 10; ++i) p.eat(Food.pickRandom());
        System.out.println(p.hashCode());
    }
}

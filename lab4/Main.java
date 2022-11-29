import main.people.*;
import main.enums.Food;

public class Main {
    public static void main(String[] args) throws Throwable {
        Kid k = new Kid("Кекус", 2);
        Woman b = new Woman("Фрекен Бок", 19);
        FlyMan q = new FlyMan("Карлссон", 4);
        RandMan rr = new RandMan("Рандом", 8);
        Person[] persons = {k, b, q, rr};

        for (Person p : persons) test(p);

		testKid(k);


		Woman kek = new Woman("Вумен", 11);
		RandMan nn = new RandMan("НоуСтракчер", 10101);
	}

	public static void testKid(Kid p) throws Throwable {
		Kid TestKid = new Kid("TestKid", 8);
		

		TestKid.interact(p);
		p.interact(TestKid);
		p.play(TestKid);
		p.play();

		p.changeToys(TestKid);
		p.play();
		
		p.doArithmetic();
	}

    public static void test(Person p) throws Throwable {
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

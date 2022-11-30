package main.tests;
import main.people.*;
import main.enums.*;

public class TestFund {

	public TestFund(FlyMan m) throws Throwable {
		testFlyMan(m);
	}

	public TestFund(Woman w) throws Throwable {
		testWoman(w);
	}

	public TestFund(Kid k) throws Throwable {
		testKid(k);
	}
	
	public TestFund(Person p) throws Throwable {
		testBasics(p);
	}

	public void testBasics(Person p) throws Throwable {
		RandMan TestPerson = new RandMan("tester", 15);
		System.out.println(p.toString());
		p.greet();
		p.goSleep();
		System.out.println(p.isSleeping());
		p.wakeUp();
		System.out.println(p.isSleeping());

		for (int i = 0; i < 10; ++i) p.eat(Food.pickRandom());
		System.out.println(p.hashCode());	
	
		
		p.showAbility();
		p.showAbility(TestPerson);	
	}

	public void testKid(Kid k) throws Throwable {
		testBasics(k);

		Kid TestKid = new Kid("TestKid", 8);

		TestKid.interact(k);
		k.interact(TestKid);
		k.play(TestKid);
		k.play();

		k.changeToys(TestKid);
		k.play();
		
		k.doArithmetic();
	}

	public void testWoman(Woman w) throws Throwable {
		testBasics(w);
		w.cook();
		w.goAway();
		w.doNothing();
		w.comeBack();
		w.showAbility(new RandMan("adsfasdf", 10));
		w.superPower(w, new RandMan("asdasd", 4));	
	}

	public void testFlyMan(FlyMan m) throws Throwable {
		testBasics(m);
		m.fly();
		m.land();
		m.sayAnec();
		for (int i = 0; i < 10; ++i) { m.fly(); m.land(); }
		m.eat(Food.pickRandom());
		m.fly();
		m.sayAnec();
	}
}

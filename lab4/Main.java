import main.people.*;
import main.tests.TestFund;

public class Main {
    public static void main(String[] args) throws Throwable {
        Kid k = new Kid("Кекус", 2);
        Woman b = new Woman("Фрекен Бок", 19);
        FlyMan q = new FlyMan("Карлссон", 4);
        RandMan rr = new RandMan("Рандом", 8);
        Person[] persons = {k, b, q, rr};

		for (Person p : persons) {
			TestFund test = new TestFund(p);
		}

		Woman kek = new Woman("Вумен", 11);
		RandMan nn = new RandMan("НоуСтракчер", 10101);
	}

}

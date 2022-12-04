import main.people.*;
import main.tests.TestFund;

public class Main {
    public static void main(String[] args) throws Throwable {
        Kid k = new Kid("Кекус", 2);
        Woman b = new Woman("Фрекен Бок", 19);
        FlyMan q = new FlyMan("Карлсон", 4);
        RandMan rr = new RandMan("Рандом", 8);

		TestFund.testBasics(rr);
		TestFund.testKid(k);
		TestFund.testWoman(b);
		TestFund.testFlyMan(q);

//		Woman kek = new Woman("Вумен", 11);
//		RandMan nn = new RandMan("НоуСтракчер", 10101);
	}
}

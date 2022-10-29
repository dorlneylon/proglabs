import main.people.*;

public class Main {
    public static void main(String[] args) {
        Kid k = new Kid("Кекус", 666);
        Bok b = new Bok(1337);
        Karlsson q = new Karlsson();
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
        System.out.println(p.hashCode());
    }
}

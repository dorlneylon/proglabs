import main.people.*;

public class Main {
    public static void main(String[] args) {
        Kid k = new Kid("Кекус", 666);
        Bok b = new Bok(1337);
        Karlsson q = new Karlsson();
        RandMan rr = new RandMan("даун", 28);
        q.Greet();
        q.showAbility();
        
        rr.Greet();
        rr.showAbility();
        rr.eatFood("хуй без соли");
        
        k.equals(b);
        k.eatFood("пельмени");
        k.eatFood("тефтели");
        q.showAbility();

        k.showAbility();

        b.SuperPower(k, rr, q);
        k.Greet();
        b.Greet();
        b.showAbility();
        b.eatFood("a");
        System.out.println(k.toString());
        k.showAbility();
        k.eatFood("пирожок");
        k.eatFood("пельмени");
    }
}

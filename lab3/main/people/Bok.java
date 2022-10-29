package main.people;
import main.people.Person;
import main.interfaces.DoingNothing;

public class Bok extends Person implements DoingNothing {
    public Bok(int age) {
        super("Фрекен Бок", age, "Фрекен Бок, а не Freaking Боg.");
    }

    private boolean gone = false;
    
    @Override
    public boolean equals(Person comp) {
        if (!(comp.getName().equals("Фрекен Бок")) || (getAge() != comp.getAge())) {
            if (!gone) Message("Мема не будет но он не похож");
            return false;
        }
        if (!gone) Message("Ну получаеца равны да");
        return true;
    }

    @Override
    protected void Ability(Person hungry) {
        if (!gone) System.out.printf("%s приготовила тефтели %s\n", getName(), hungry.getName());
        else System.out.println("Фрекен Бок ушла и вернуться, собственно, не обещала.");
    }
    
    @Override
    protected void Ability() {
        if (!gone) Message("Я могу приготовить еду, но для этого надо показать, кому.");
        else System.out.println("Фрекен Бок ушла.");
    }
    
    @Override
    protected void Eat(String food) {
        if (!gone) Message(!(food.equals("тефтели") || food.equals("запеканка")) ? "Так че я буду есть чью-то там еду" : "Да ладно, я ж малышу готовила.");
        else System.out.println("Фрекен Бок ушла.");
    }

    @Override
    public String toString() {
        return gone ? "Фрекен Бок ушла." : String.format("%s: %s", getName(), getGreet());
    }

    public void SuperPower(Person... p) {
        System.out.println("Фрекен Бок уложила указанных людей спать, а сама пошла в магазин.");
        for (Person k:p) {
            if (!k.equals(new Bok(k.getAge()))) k.goSleep();
            else System.out.println("Ну было бы странно, если бы Фрекен Бок и себя уложила спать, конечно.");
        }
        this.gone = true;
    }
}

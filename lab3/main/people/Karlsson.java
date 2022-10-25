package main.people;
import main.people.Person;
import main.interfaces.AnecAbility;

public class Karlsson extends Person implements AnecAbility {
    public Karlsson() {
        super("Карлсон", 999, "Я Карлсон и я живу на крыше! И еще я умею летать! А ты нет, кст.\nК слову, я умею травить анеки, если потребуется.");
    }

    @Override
    public boolean equals(Person comp) {
        if (!sleeps) Message("Это С К А М.");
        return false;
    }

    @Override
    protected void Ability() {
        if (!sleeps) {System.out.print("Карлсон: "); SayAnec(); System.out.print("\n");}
        else System.out.println("Спит.");
    }

    @Override
    protected void Ability(Person p) {
        if (!isSleeping() && !p.isSleeping()) System.out.printf("%s рассказал анекдот %s.\n", getName(), p.getName());
    }

    @Override
    protected void Eat(String food) {
        if (!sleeps) Message("Ы, еда)");
        else System.out.println("Карлсон спит.");
    }

    @Override
    public String toString() {
        if (!sleeps) return String.format("Карлсон: Я ДЕД ИНСАЙД МНЕ 9 ЛЕТ Я ХОЧУ В ПСИХОКИДС");
        else return "Спит.";
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

}

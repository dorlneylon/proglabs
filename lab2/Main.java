import main.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Zangoose("Billy Harrington", 20);
        Pokemon p2 = new Clauncher("Slave", 5);
        Pokemon p3 = new Clawitzer("300$", 10);
        Pokemon p4 = new Bellsprout("BoyNextDoor", 2);
        Pokemon p5 = new Weepinbell("Van Darkholme", 10);
        Pokemon p6 = new Victreebell("Dungeon master", 40);
        
        b.addAlly(p1); b.addAlly(p2); b.addAlly(p3);
        b.addFoe(p4); b.addFoe(p5); b.addFoe(p6);

        b.go();
    }

}

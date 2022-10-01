package pokemons;
import ru.ifmo.se.pokemon.*;
import moves.*;

public class Zangoose extends Pokemon {
    public Zangoose(String name, int lvl) {
        super(name, lvl);
        setStats(73.0, 115.0, 60.0, 60.0, 60.0, 90.0);
        setMove(new PoisonJab(), new Scratch(), new FurySwipes(), new ShadowBall());
    }
}
package pokemons;
import ru.ifmo.se.pokemon.*;
import moves.*;

public class Clawitzer extends Pokemon {
    public Clawitzer(String name, int lvl) {
        super(name, lvl);
        setStats(71.0, 73.0, 88.0, 120.0, 89.0, 59.0);
        setMove(new Bubble(), new Waterfall(), new WaterPulse(), new ShadowBall());
    }
}
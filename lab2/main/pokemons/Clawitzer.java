package main.pokemons;

import main.moves.Bubble;
import main.moves.ShadowBall;
import main.moves.WaterPulse;
import main.moves.Waterfall;
import ru.ifmo.se.pokemon.Pokemon;

public class Clawitzer extends Pokemon {
    public Clawitzer(String name, int lvl) {
        super(name, lvl);
        setStats(71.0, 73.0, 88.0, 120.0, 89.0, 59.0);
        setMove(new Bubble(), new Waterfall(), new WaterPulse(), new ShadowBall());
    }
}
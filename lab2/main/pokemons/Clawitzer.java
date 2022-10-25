package main.pokemons;

import main.moves.ShadowBall;
import ru.ifmo.se.pokemon.Pokemon;


public class Clawitzer extends Clauncher {
    public Clawitzer(String name, int lvl) {
        super(name, lvl);
        setStats(71.0, 73.0, 88.0, 120.0, 89.0, 59.0);
        addMove(new ShadowBall());
    }
}

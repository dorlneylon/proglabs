package main.pokemons;

import main.moves.Bubble;
import main.moves.WaterPulse;
import main.moves.Waterfall;
import ru.ifmo.se.pokemon.Pokemon;

public class Clauncher extends Pokemon {
    public Clauncher(String name, int lvl) {
        super(name, lvl);
        setStats(50.0, 53.0, 62.0, 58.0, 63.0, 44.0);
        setMove(new Bubble(), new Waterfall(), new WaterPulse());
    }
}

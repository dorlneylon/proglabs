package main.pokemons;

import main.moves.*;
import ru.ifmo.se.pokemon.Pokemon;

public class Bellsprout extends Pokemon {
    public Bellsprout(String name, int lvl) {
        super(name,lvl);
        setStats(50.0,75.0,35.0,70.0,30.0,40.0);
        setMove(new RazorLeaf(), new SleepPowder());
    }
}

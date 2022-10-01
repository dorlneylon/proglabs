package main.pokemons;

import main.moves.FurySwipes;
import main.moves.PoisonJab;
import main.moves.Scratch;
import main.moves.ShadowBall;
import ru.ifmo.se.pokemon.Pokemon;

public class Zangoose extends Pokemon {
    public Zangoose(String name, int lvl) {
        super(name, lvl);
        setStats(73.0, 115.0, 60.0, 60.0, 60.0, 90.0);
        setMove(new PoisonJab(), new Scratch(), new FurySwipes(), new ShadowBall());
    }
}
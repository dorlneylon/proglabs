package main.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class PoisonJab extends SpecialMove {
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) Effect.poison(p);
    }

    @Override
    protected String describe() { return "использует Poison Jab"; }

    public PoisonJab() { super(Type.POISON, 80.0, 1.0); };
}
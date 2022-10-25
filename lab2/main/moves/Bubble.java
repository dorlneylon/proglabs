package main.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Bubble extends SpecialMove {
    public Bubble() {
        super(Type.WATER, 65.0, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1 && p.getStat(Stat.SPEED) > -6) {
            p.setMod(Stat.SPEED, (int)p.getStat(Stat.SPEED)-1);
        }
    }

    @Override
    protected String describe() {
        return "uses Bubble";
    }
}

package main.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ShadowBall extends SpecialMove {
    public ShadowBall() { super(Type.GHOST, 80.0, 1.0); }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.2 && p.getStat(Stat.SPECIAL_DEFENSE) > -6) {
            p.setMod(Stat.SPECIAL_DEFENSE, (int)p.getStat(Stat.SPECIAL_DEFENSE)-1);
        }
    }

    @Override
    protected String describe() { return "использует Shadow Ball"; }
}

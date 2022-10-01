package main.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class WaterPulse extends SpecialMove {
    public WaterPulse() {
        super(Type.WATER, 60.0, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.2) Effect.confuse(p);
    }

    @Override
    protected String describe() {
        return "uses Water Pulse";
    }
}

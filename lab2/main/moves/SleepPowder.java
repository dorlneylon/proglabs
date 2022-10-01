package main.moves;

import ru.ifmo.se.pokemon.*;

public class SleepPowder extends SpecialMove {
    public SleepPowder() {
        super(Type.GRASS, 0.0, 0.75);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.sleep(p);
    }

    @Override
    protected String describe() {
        return "использует Sleep Powder";
    }
}

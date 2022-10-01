package moves;
import ru.ifmo.se.pokemon.*;

public class Waterfall extends SpecialMove {
    public Waterfall() {
        super(Type.WATER, 80.0, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.2) Effect.flinch(p);
    }

    @Override
    protected String describe() {
        return "использует Waterfall";
    }
}

package main.moves;
import ru.ifmo.se.pokemon.*;

public class Swagger extends SpecialMove {
    public Swagger() {
        super(Type.NORMAL,0.0,0.85);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        if (p.getStat(Stat.ATTACK) < 6) {
            p.setMod(Stat.ATTACK, p.getStat(Stat.ATTACK)+1);
            Effect.confuse(p);
        }
    }

    @Override
    protected String describe() {
        return "использует Swagger";
    }
}

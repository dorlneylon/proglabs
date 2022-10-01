package main.moves;
import ru.ifmo.se.pokemon.*;

public class Growth extends SpecialMove {
    public Growth() {}

    @Override
    protected void applySelfEffects(Pokemon p) {
        if (p.getStat(Stat.ATTACK) < 6) {
            p.setMod(Stat.ATTACK, (int)p.getStat(Stat.ATTACK)+1);
        }
        if (p.getStat(Stat.SPECIAL_ATTACK) < 6) {
            p.setMod(Stat.SPECIAL_ATTACK, (int)p.getStat(Stat.SPECIAL_ATTACK)+1);
        }

    }

    @Override
    protected String describe() {
        return "uses Growth";
    }
}

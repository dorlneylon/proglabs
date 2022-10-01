package main.moves;

import ru.ifmo.se.pokemon.*;

public class RazorLeaf extends PhysicalMove {
    public RazorLeaf() {
        super(Type.GRASS, 55.0, 0.95);

    }
    
    @Override
    protected double calcCriticalHit(Pokemon var1, Pokemon var2) {
        if ((3*var1.getStat(Stat.SPEED)) / 512.0 > Math.random()) {
            return 2.0;
        } else {
            return 1.0;
        }
    }


    @Override
    protected String describe() {
        return "использует Razor Leaf";
    }
}

package main.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class FurySwipes extends PhysicalMove {
    public FurySwipes() {
        super(Type.NORMAL, 18.0, 0.8);
        hits = (int)(Math.random()*4 + 2);
    }

    @Override
    protected String describe() {
        return "uses Fury Swipes";
    }
}

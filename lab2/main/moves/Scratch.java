package main.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Scratch extends PhysicalMove {
    public Scratch() { super(Type.NORMAL, 40.0, 1.0); }

    @Override
    protected String describe() { return "uses Scratch"; }
}

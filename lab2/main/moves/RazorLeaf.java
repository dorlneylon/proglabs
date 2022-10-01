package main.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class RazorLeaf extends PhysicalMove {
    public RazorLeaf() {
        super(Type.GRASS, 55.0, 0.95);

    }

    @Override
    protected String describe() {
        return "использует Razor Leaf";
    }
}

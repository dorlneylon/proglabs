package moves;
import ru.ifmo.se.pokemon.*;

public class FurySwipes extends PhysicalMove {
    public FurySwipes() {
        super(Type.NORMAL, 18.0, 0.8);
        hits = (int)(Math.random()*4 + 2);
    }

    @Override
    protected String describe() {
        return "использует Fury Swipes";
    }
}
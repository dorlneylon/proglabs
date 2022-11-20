package main.interfaces;
import main.enums.Anecdotes;

public interface AnecAbility {
    public default void sayAnec() {
        int take = (int)(Math.round(4*Math.random() + 1));
        if (take == 1) System.out.println(Anecdotes.Anec1.anec);
        if (take == 2) System.out.println(Anecdotes.Anec2.anec);
        if (take == 3) System.out.println(Anecdotes.Anec3.anec);
        if (take == 4) System.out.println(Anecdotes.Anec4.anec);
        if (take == 5) System.out.println(Anecdotes.Anec5.anec);
    }
}

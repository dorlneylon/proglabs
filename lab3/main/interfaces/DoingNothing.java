package main.interfaces;

public interface DoingNothing {
    public default void DoNothing() {
        System.out.println("Тишина вокруг.");
    }
}

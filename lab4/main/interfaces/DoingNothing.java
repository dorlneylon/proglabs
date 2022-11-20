package main.interfaces;

public interface DoingNothing {
    public default void doNothing() {
        System.out.println("Тишина вокруг.");
    }
}

package main;
import ru.ifmo.se.pokemon.*;
import main.pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Zangoose("Фистинг мастер", 20);
        Pokemon p2 = new Clauncher("Fucking slave", 5);
        Pokemon p3 = new Clawitzer("Dungeon master", 10);
        Pokemon p4 = new Bellsprout("ЕБаклак", 2);
        Pokemon p5 = new Weepinbell("А мой дед...", 10);
        Pokemon p6 = new Victreebell("Дурак твой дед", 40);
    }
}

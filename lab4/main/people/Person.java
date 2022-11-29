package main.people;
import main.enums.*;

public abstract class Person {
    final protected String name, greet;
    final protected int age;
    protected boolean sleeps = false;  
	protected int eaten = 0;    
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.greet = "Я вас категорически приветствую.";
    }

    Person(String name, int age, String greet) {
        this.name = name;
        this.age = age;
        this.greet = greet;
    }
	
	@Override
    public abstract String toString();

    protected abstract void ability();

	public abstract void interact(Person p);
    
    protected abstract void ability(Person p);

    public void greet() {
        System.out.println(greet);
    }
    
    public abstract void eat(Food f);
    
    protected void message(String smt) {
        System.out.printf("%s: %s\n", this.name, smt);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    
    public boolean isSleeping() {
        return this.sleeps;
    }

    public String getGreet() {
        return this.greet;
    }

	@Override
    public int hashCode() {
        return (237*(name.hashCode()) + age)%(int)(1e9 + 7);
    } 
    
	public void showAbility() {
        ability();
    }


    public void showAbility(Person p) {
        ability(p);
    }


    public boolean equals(Person comp) {
        return (comp.getName().equals(this.name)) && (comp.getAge() == this.age);
    }
    
    public void changeCondition() {
        this.sleeps = !(this.sleeps);
    }
    
    public void goSleep() {
        this.sleeps = true;
    }
    
    public void wakeUp() {
        this.sleeps = false;
    }

}

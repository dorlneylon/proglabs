package main.people;

public abstract class Person {
    final protected String name, greet;
    final protected int age;
    protected boolean sleeps = false;  
    
    
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

    // Герой описывает себя
    public abstract String toString();

    protected abstract void Ability();
    
    protected abstract void Ability(Person p);

    public void Greet() {
        System.out.println(greet);
    }
    
    protected abstract void Eat(String food);
    
    protected void Message(String smt) {
        System.out.printf("%s: %s\n\n", this.name, smt);
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

    public int hashCode() {
        return (237*(name.hashCode()) + age)%(int)(1e9 + 7);
    }
    
    public void showAbility() {
        Ability();   
    }
    
    public void showAbility(Person p) {
        Ability(p);
    }

    public void eatFood(String food) {
        Eat(food);
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

package OOP;

// animal abstract class
public abstract class Animal {
    // abstract method
    public abstract void sound();

    // non-abstract method
    public void eat() {
        System.out.println("This animal eats food");
    }
}

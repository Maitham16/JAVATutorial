package OOP;

// Dog class extends Animal class
public class Dog extends Animal {
    public void sound() {
        System.out.println("Woof");
    }

    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override // overrides the toString() method
    public void eat() {
        System.out.println("This dog eats bones and meat");
    }
}

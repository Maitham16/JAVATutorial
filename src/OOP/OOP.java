package OOP;

public class OOP {

    // main method
    public static void main(String[] args) {
        // create an object of Dog class
        Dog dog = new Dog();

        // call the eat() method
        dog.eat();

        // call the sound() method
        dog.sound();

        // call the setBreed() method
        dog.setBreed("Pug");

        // call the getBreed() method
        System.out.println("The breed of the dog is " + dog.getBreed());
   
    }
    
}

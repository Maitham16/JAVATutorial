package Generics;

public class Box <T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.set(10);
        stringBox.set("Hello World");

        System.out.println(integerBox.get());
        System.out.println(stringBox.get());
    }
}

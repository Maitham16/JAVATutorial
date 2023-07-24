public class Exceptionals {

    // main method
    public static void main(String[] args) {

        // try-catch block
        // try {
        //     // Code that might throw an exception
        //     int x = 0;
        //     int y = 10 / x;
        // } catch (ArithmeticException e) {
        //     // This block will handle the exception
        //     System.out.println("Caught an exception: " + e.getMessage());
        // }

        // try-catch-catch block
        try {
            // Code that might throw an exception
            int[] arr = new int[5];
            arr[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        }

        // try-catch-finally block
        try {
            // Code that might throw an exception
        } catch (Exception e) {
            // This block will handle the exception
        } finally {
            // This block always executes
            System.out.println("Finally block executed");
        }

        // checkAge method
        Exceptionals myObj = new Exceptionals();
        myObj.checkAge(15);
    }

    void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

}

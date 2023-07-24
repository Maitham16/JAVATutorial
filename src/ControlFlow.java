// Java control flow statements
// if-then statement
// if-then-else
// switch-case
// while loop
// do-while loop
// for loop
// break statement
// continue statement
// return statement

public class ControlFlow {

    public static void main(String[] args) {

        ControlFlow cf = new ControlFlow();
        // call functions if-then
        System.out.println("if-then statement");
        cf.ifThen(10);
        System.out.println();
        // call functions if-then-else
        System.out.println("if-then-else statement");
        cf.ifThenElse(10);
        System.out.println();
        // call functions switch-case
        System.out.println("switch-case statement");
        cf.switchCase(3);
        System.out.println();
        // call functions while loop
        System.out.println("while loop");
        cf.whileLoop(10);
        System.out.println();
        // call functions do-while loop
        System.out.println("do-while loop");
        cf.doWhileLoop(10);
        System.out.println();
        // call functions for loop
        System.out.println("for loop");
        cf.forLoop(10);
        System.out.println();
        // call functions break statement
        System.out.println("break statement");
        cf.breakStatement(10);
        System.out.println();
        // call functions continue statement
        System.out.println("continue statement");
        cf.continueStatement(10);
        System.out.println();
        // call functions return statement
        System.out.println("return statement");
        System.out.println(cf.returnStatement(1));
        System.out.println();
    }

    // if-then function
    public void ifThen(int x) {
        x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }
    }

    // if-then-else function
    public void ifThenElse(int x) {
        x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is less than or equal to 5");
        }
    }

    // switch-case function
    public void switchCase(int x) {
        int day = x;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6: 
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }        
    }

    // while loop function
    public void whileLoop(int x) {
        x = 10;
        while (x > 0) {
            System.out.println("x is " + x);
            x--;
        }
    }

    // do-while loop function   
    public void doWhileLoop(int x) {
        x = 10;
        do {
            System.out.println("x is " + x);
            x--;
        } while (x > 0);
    }

    // for loop function
    public void forLoop(int x) {
        x = 10;
        for (int i = 0; i < x; i++) {
            System.out.println("i is " + i);
        }
    }

    // break statement function
    public void breakStatement(int x) {
        x = 10;
        while (x > 0) {
            System.out.println("x is " + x);
            x--;
            if (x == 5) {
                System.out.println("x is 5, break statement");
                break;
            }
        }
    }

    // continue statement function
    public void continueStatement(int x) {
        x = 10;
        while (x > 0) {
            x--;
            if (x == 5) {
                System.out.println("x is 5, continue statement");
                continue;
            }
            System.out.println("x is " + x);
        }
    }

    // return statement function
    public int returnStatement(int x) {
        x = x*5;
        return x;
    }
}

// 1D Array in Java - int[] array;
// xD array or multidimensional array in Java - int[][] array;
public class Array {

    // main function
    public static void main(String[] args) {

        // declare array
        int[] array = new int[5];

        // assign values to array
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 5;
        array[4] = 8;

        // print array
        System.out.println("Array address: " + array);

        // print array elements
        System.out.println("Array elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // declare and initialize array
        int[] array2 = { 1, 2, 3, 5, 8 };

        // print array
        System.out.println("Array2 address: " + array2);

        // print array elements for-each loop
        for (int i : array2) {
            System.out.println(i);
        }

        // declare and initialize array
        int[][] array3 = { { 1, 2, 3 }, { 5, 8, 13 } };

        // print array
        System.out.println("Array3 address: " + array3);

        // print array elements
        System.out.println("Array3 elements: ");
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.println(array3[i][j]);
            }
        }

        // declare and initialize array 5x5
        int[][] array4 = { { 11, 22, 33, 54, 85 }, { 13, 21, 34, 55, 89 }, { 14, 23, 37, 61, 97 }, { 17, 24, 81, 65, 16 }, { 11, 87, 68, 25, 13 } };

        // print array
        System.out.println("Array4 address: " + array4);

        // print array elements
        System.out.println("Array4 elements: ");
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                System.out.println(array4[i][j]);
            }
        }
    
        // print array4 as 5 by 5 matrix each row in a new line
        System.out.println("Array4 elements: ");
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }
    }
}

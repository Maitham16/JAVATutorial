// Operators in Java
// Arithmetic Operators: +, -, *, /, %, ++, --
// Relational Operators: ==, !=, >, <, >=, <=
// Logical Operators: &&, ||, !
// Bitwise Operators: &, |, ^, ~, <<, >>, >>>
// Assignment Operators: =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=
// Misc Operators: ?:, instanceof
public class Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a + b = " + (a + b));   // ADDITION result is 30
        System.out.println("a - b = " + (a - b));   // SUBTRACTION result is -10
        System.out.println("a * b = " + (a * b));   // MULTIPLICATION result is 200
        System.out.println("b / a = " + (b / a));   // DIVISION result is 2
        System.out.println("b % a = " + (b % a));   // MODULUS result is 0
        System.out.println("a == b = " + (a == b)); // EQUAL result is false
        System.out.println("a != b = " + (a != b));  // NOT EQUAL result is true
        System.out.println("a > b = " + (a > b));   // GREATER THAN result is false
        System.out.println("a < b = " + (a < b));   // LESS THAN result is true
        System.out.println("!(a < b) = " + !(a < b));   // NOT
        System.out.println("(a < b) && (a < 30) = " + ((a < b) && (a < 30)));   // AND
        System.out.println("(a < b) || (a < 30) = " + ((a < b) || (a < 30)));   // OR
        System.out.println("a & b = " + (a & b));   // AND  10 & 20 = 0
        System.out.println("a | b = " + (a | b));   // OR   10 | 20 = 30
        System.out.println("a ^ b = " + (a ^ b));   // XOR  10 ^ 20 = 30
        System.out.println("~a = " + (~a)); // -11  10 = 0000 1010
        System.out.println("a << 2 = " + (a << 2)); // 10 * 2^2 = 40    0000 1010 << 2 = 0010 1000
        System.out.println("a >> 2 = " + (a >> 2)); // 10 / 2^2 = 2    0000 1010 >> 2 = 0000 0010
        System.out.println("a >>> 2 = " + (a >>> 2)); // 10 / 2^2 = 2   0000 1010 >>> 2 = 0000 0010
        System.out.println("a += b = " + (a += b)); // 10 + 20 = 30   0000 1010 += 0001 0100 = 0001 1110
        System.out.println("a -= b = " + (a -= b)); // 30 - 20 = 10  0001 1110 -= 0001 0100 = 0000 1010
        System.out.println("a *= b = " + (a *= b)); // 30 * 20 = 600    0000 1010 *= 0001 0100 = 0110 0000
        System.out.println("a /= b = " + (a /= b)); // 30 / 20 = 1
        System.out.println("a %= b = " + (a %= b)); // 10 % 20 = 10
        System.out.println("a &= b = " + (a &= b)); // 30 & 20 = 20
        System.out.println("a |= b = " + (a |= b)); // 30 | 20 = 30
        System.out.println("a ^= b = " + (a ^= b)); // 30 ^ 20 = 10
        System.out.println("a <<= 2 = " + (a <<= 2)); // 10 * 2^2 = 40   0000 1010 << 2 = 0010 1000
        System.out.println("a >>= 2 = " + (a >>= 2)); // 10 / 2^2 = 2   0000 1010 >> 2 = 0000 0010
        System.out.println("a >>>= 2 = " + (a >>>= 2)); // 10 / 2^2 = 2  0000 1010 >>> 2 = 0000 0010
        System.out.println("a < b ? a : b = " + (a < b ? a : b));   // TERNARY OPERATOR 10 < 20 ? 10 : 20 = 10
    }
}

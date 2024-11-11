/*Java Type Casting
Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte*/

public class Narrowing_02 {
    public static void main(String[] args) {
        double valueDoubled = 98567.235d;
        int value = (int) valueDoubled; // changing the type manually
        System.out.println("This is the doubled value" + " " + valueDoubled);
        System.out.println("This is the value after converting into int" + " " + value + "\n");
    }
}

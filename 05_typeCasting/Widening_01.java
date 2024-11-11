/*Java Type Casting
Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte*/

public class Widening_01 {
    public static void main(String [] args) {
        int value = 90;
        double valueDoubled = value;// converting the value automatically from int to double.
        System.out.print("This is the integer value" + " " + value + "\n");
        System.out.print("This is the value after get doubled" + " " + valueDoubled + "\n");
    }
}

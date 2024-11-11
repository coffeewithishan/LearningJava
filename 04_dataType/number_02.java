public class number_02 {
    public static void main(String[] args) {
        byte mybyteNum = 100; // The byte data type can store whole numbers from -128 to 127
        System.out.println("The type is byte" + " " + mybyteNum);
        short myShortNum = 10000; // The short data type can store whole numbers from -32,768 to 32767
        System.out.println("The type is short" + " " + myShortNum);
        int myIntnum = 100000; // The int data type can store whole numbers from -2147483648 to 2147483647
        System.out.println("The type is int" + " " + myIntnum);
        //The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value. Note that you should end the value with an "L"
        long myLongNum = 10000000000L;
        System.out.println("The type is long" + " " + myLongNum);

        float myFloatNum = 100.0f; // The float data type can store decimal numbers
        System.err.println("This type is float" + " " + myFloatNum);

        double mydoubleNum = 19.99d;
        System.out.println("This type is double" + " " + mydoubleNum);
    }
}
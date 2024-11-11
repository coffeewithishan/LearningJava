/*Java divides the operators into the following groups:

Arithmetic operators
Assignment operators
Comparison operators
Logical operators
Bitwise operators */
public class basic_01 {
    public static void main(String[] args){
        // Arithmetic operators
        int num1 = 10;
        int num2 = 100;
        int num3 = 20;
        int sum = num1 + num2 + num3;
        int sub = num2 - num1 - num3;
        float div = (float) num3 / num2;
        int mod = num2 % num1;
        int mult = num1 * num2 * num3;
        double powe = Math.pow(num2, 2);
        System.out.println("Sum: " + sum);
        System.out.println("Subtraction:" + sub);
        System.out.print("Division:" + div);
        System.out.println("Modulus:" + mod);
        System.out.println("Multiplication:" + mult);
        System.out.println("Power calculation:" + powe);
    }
}
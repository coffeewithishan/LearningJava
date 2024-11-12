// Syntax:
    // variable = (condition) ? expressionTrue :  expressionFalse;

public class shortHand_04 {
    public static void main(String[] args) {
        int x = 10;
        int y = 50;
        boolean greater = (x > y) ? true : false ;
        System.out.println(greater);

        int age = 21;
        String ageVal = (age >= 18) ? "You are young" : "You are not young";
        System.out.println(ageVal);
    }
}
public class logicalOperators_04 {
    public static void main(String[] args) {
        int x = 100;
        int y = 150;
        System.err.println(x < y && x > 50); // true
        System.err.println(x > y && x > 50); // false
        System.err.println(x < y || x > 50); // true
        System.err.println(x > y || x > 50); // true
    }
}
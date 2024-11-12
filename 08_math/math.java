public class math {
    public static void main(String [] args){
        // The Math.max(x,y) method can be used to find the highest value of x and y
        int x = 15654;
        float y = 65847.02f;
        float highest = Math.max(x,y);
        System.out.println("The highest value is: " + highest);
        // The Math.min(x,y) method can be used to find the lowest value of x and y
        float minimum = Math.min(x,y);
        System.out.println("The lowest value is:" + minimum);
        // The Math.min(x,y) method can be used to find the lowest value of x and y
        System.out.println(Math.sqrt(65)); // The Math.sqrt(x) method returns the square root of x
        // The Math.abs(x) method returns the absolute (positive) value of x
        double abs = Math.abs(-86.75);
        System.out.println("This is the absolute positive value:" + abs); // it converts the negative to positive value
        // Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        double random = Math.random();
        System.out.println(random);
        // to get proper control on this
        int randomNumber = (int) (Math.random() + 1 * 100); // same as js
        System.out.println("integer random number is: " + randomNumber);
    }
}
public class doWhile_02 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while(i <= 10 );

        int age = 40;
        do {
            System.out.println("This is the value of age:" + " " + age);
            age++;
        } while (age <= 50);
    }
}
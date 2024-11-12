public class elseIf_03 {
    public static void main (String[] args){
        int age = 65;
        if (age < 18) {
            System.out.println("You are under aged");
        }
        else if (age == 18){
            System.out.println("You are young");
        }
        else if (age == 30){
            System.out.println("You are at mid age");
        }
        else if (age > 60){
            System.out.println("You are a senior citizen");
        }
    }
}
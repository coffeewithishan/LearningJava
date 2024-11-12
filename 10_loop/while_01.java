public class while_01{
    public static void main(String [] args){
        int i = 0;
        while (i <= 10) {
            System.out.println("This is the value of i:" + " " + i);
            i++; // otherwise it will be infinite loop
        }
        int j = 5;
        while(j < 20){
            System.out.println("This is the value of j:" +" " +j);
            j++; // otherwise it will be infinite loop
        }
    }
}
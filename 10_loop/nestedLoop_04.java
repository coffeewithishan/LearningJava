public class nestedLoop_04 {
    public static void main(String[] args) {
        int n = 10;
        int m = 5;
        int p = 6;
        for (int i = 0; i <= n; i++ ){
            System.out.println("This is the outer loop1" + " value of i = " + i);
        }
        for(int j = 0; j <= m; j++){
            System.out.println("This is the inner loop2" + " value of j =" + j);
        }
        for(int k = 0; k <= p; k++){
            System.out.println("this is the inner loop3" + " value of k = " + k);
        }
    }
}
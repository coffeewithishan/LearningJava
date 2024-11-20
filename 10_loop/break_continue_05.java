// The break statement can also be used to jump out of a loop.

// The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

public class break_continue_05 {
    public static void main (String [] args){
        for(int i = 0; i <= 5; i++){
            System.out.println(i);
            if (i == 5) {
                System.out.println("Loop breaks the value of = " + i);
                break;
            }
            
        }
        // eg of continue
        for(int k = 0; k <= 5; k ++){
            //System.out.println(k);
            if(k == 3){ // 3 will be skipped
                
                continue;
            }
            System.out.println(k);
            
        }
    }
}


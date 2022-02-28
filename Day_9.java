import java.util.*;

public class Solution {
    public static int CalcFactorial(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        int fact1 = CalcFactorial(n-1);
        int fact2 = n * fact1;
        return fact2;
    }
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int ans = CalcFactorial(n);
        System.out.println(ans);
        in.close();  
    }
}

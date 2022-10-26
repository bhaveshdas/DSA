import java.io.*;
import java.util.*;

public class climb_stair {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int path = climbStairs(n,new int[n+1]);
        System.out.print(path);
    }
    
    public static int climbStairs(int n, int[] qb){
        if(n<0){
            return 0;
        }
        else if(n==0){
            return 1;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        int path1 = climbStairs(n-1, qb);
        int path2 = climbStairs(n-2, qb);
        int path3 = climbStairs(n-3, qb);
        qb[n]=path1+path2+path3;
        return qb[n];
    }
}

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n+1];
        // looping from 0 to n-1
        for(int i=0;i<n;i++) {
            a[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int y = scn.nextInt();
        n = n + 1;
        // looping from n-1 to x
        for(int i=n-1;i>x-1;i--) {
            a[i] = a[i-1];
        }
        a[x-1] = y;
        // looping from 0 to n-1
        for(int i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }
    
    }
}

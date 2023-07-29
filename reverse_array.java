import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int[] reverseArray(int arr[]){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int temp = arr[l];
            arr[l] =arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            arr[i]=scn.nextInt();
        }
        int revered[] = reverseArray(arr);
        
        for(int i=0; i<n;i++){
           // arr[i]=scn.nextInt();
            System.out.print(revered[i]);
        }
        
        
    }
}

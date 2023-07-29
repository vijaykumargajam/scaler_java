import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static boolean increseArray(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1]){
                
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       // int arr[]={2,2,5,8};
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=scn.nextInt();
          //System.out.println(n);
            //System.out.print(arr[i]);
         }       
        System.out.println(increseArray(arr));
    }
}

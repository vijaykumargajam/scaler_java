import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {A[i] = sc.nextInt();}
        int last_element = A[N - 1];
        // Moving all elements except the last one to one step right
        for (int i = N -1; i >= 1; i--) {
            A[i] = A[i - 1];
        }
        A[0] = last_element;
        for (int i = 0; i < N; i++) {
            System.out.print(A[i]);
            System.out.print(" ");
        }
    }
}

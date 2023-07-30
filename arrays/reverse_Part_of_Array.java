public class Solution {
    public int[] solve(int[] A, int B, int C) {
        // Iterate until B index is smaller than C index
        while(B < C) {
            // swap two elements A[B] and A[C]
            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;
    
            // increase B and decrease C
            B++;
            C--;
        }
        return A;
    }
}

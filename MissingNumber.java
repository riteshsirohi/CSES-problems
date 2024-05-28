
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        long[] x = new long[(int) n];

        for(int i=0;i<n-1;i++){
           x[i]= scn.nextLong();
        }
        long expectsum = n*(n+1)/2;
        long actualsum = 0;
        for(int i=0;i<n;i++){
            actualsum+=x[i];
        }
        System.out.println(expectsum-actualsum);
    }
}

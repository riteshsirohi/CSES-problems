import java.util.Scanner;

public class IncreasingArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long[] arr = new long[(int) n];

        for(int i=0;i<n;i++){
            arr[i]= scn.nextLong();
        }
        long count=0;

        for (int i=1;i< arr.length;i++){
              if(arr[i-1]>arr[i]){
                 count+=Math.abs(arr[i]-arr[i-1]);
                 arr[i]=arr[i-1];
              }
        }
        System.out.println(count);
    }
}

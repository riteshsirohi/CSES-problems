import java.util.ArrayList;
import java.util.Scanner;

public class TwoSets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long sum = 0;
        StringBuilder ans = new StringBuilder();

         sum = n*(n+1)/2;

        if(sum%2==0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
            return;
        }

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        boolean[] vis = new boolean[(int) (n+1)];

        long list1sum = 0;
        long max = n;

        while (list1sum<sum/2){
            long remainingsum = sum/2-list1sum;

            if (remainingsum>max){
                list1.add((int) max);
                 vis[(int) max] = true;
                 list1sum+=max;
                 max--;
            }else{
                list1.add((int) remainingsum);
                vis[(int) remainingsum] = true;
                list1sum = sum/2;
            }
        }
        for (long i=1;i<=n;i++) {
            if (!vis[(int) i]) {
                list2.add((int) i);
            }
        }

        ans.append(list1.size()).append("\n");
        for (long x:list1){
            ans.append(x+ " ");
        }

        ans.append("\n");

        ans.append(list2.size()).append("\n");
        for (long y:list2){
            ans.append(y+" ");
        }
        System.out.println(ans);
    }
}

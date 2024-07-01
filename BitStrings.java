import java.util.Scanner;

public class BitStrings {

    public static void main(String[] args) {
        long mod = 1000000007;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        long ans=1;
        for (int i=0;i<n;i++){
            ans = (ans*2)%mod;
        }
        System.out.println(ans);


    }

}

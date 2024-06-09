import java.util.Scanner;

public class TwoKnights {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long K = scn.nextInt();

        for (long k=1;k<=K;k++){
            long total_ways = (k*k)*(k*k-1)/2;

            long attack_ways = 4*(k-2)*(k-1);

            long ans = Math.abs(total_ways-attack_ways);

            System.out.println(ans);
        }

    }
}

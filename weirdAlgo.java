import java.util.Scanner;

public class weirdAlgo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();

        System.out.print(n+ " ");
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            System.out.print(n+ " ");
        }
    }
}

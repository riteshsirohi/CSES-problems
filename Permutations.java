import java.util.Scanner;

public class Permutations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        if (N == 1) {
            result.append("1 ");
        } else if (N <= 3) {
            result.append("NO SOLUTION");
        } else {
            for (int i = 2; i <= N; i += 2) {
                result.append(i).append(" ");
            }
            for (int i = 1; i <= N; i += 2) {
                result.append(i).append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }
}

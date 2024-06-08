import java.util.Scanner;

public class NumberSprial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long t = scn.nextLong();
        long row = 0;
        long col = 0;
        StringBuilder ans = new StringBuilder();

        for (int i=0;i<t;i++) {
            row = scn.nextInt();
            col = scn.nextInt();


            if (row > col) {
                if (row % 2 == 0) {
                  ans.append((row * row) - col + 1).append("\n");
                } else {
                    ans.append((row - 1) * (row - 1) + col).append("\n");
                }
            } else {
                if (col % 2 == 0) {
                    ans.append((col - 1) * (col - 1) + row).append("\n");
                } else {
                    ans.append((col * col) - row + 1).append("\n");
                }
            }
        }
        System.out.println(ans);

    }
}

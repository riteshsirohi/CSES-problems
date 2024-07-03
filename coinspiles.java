import java.util.Scanner;

public class coinspiles {

    static boolean choose(long a, long b){
        long length = a+b;

        return length%3==0 && Math.min(a,b)*2>=Math.max(a,b);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long t = scn.nextLong();
        StringBuilder ans = new StringBuilder();
        long a,b;

        for (long i=0;i<t;i++){
            a= scn.nextLong();
            b= scn.nextLong();

            if (choose(a,b)){
                ans.append("YES\n");
            }else {
                ans.append("NO\n");
            }
        }
        System.out.println(ans);
    }
}

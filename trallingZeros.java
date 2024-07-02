import java.util.Scanner;

public class trallingZeros {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();

      long a = 0, b=0;
      int i=2,j=5;

      while (n>=i){
          a+=n/i;
          i*=2;
      }
      while (n>=j){
          b+=n/j;
          j*=5;
      }
      long ans = Math.min(a,b);
        System.out.println(ans);

    }
}

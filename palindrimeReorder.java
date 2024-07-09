import java.util.Scanner;

public class palindrimeReorder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        int[] freq = new int[26];
        for (char ch:s.toCharArray()){
            freq[ch-'A']++;
        }

        int oddcount=0;
        for (int count:freq){
          if(count%2!=0){
              oddcount++;
          }
        }
        if (oddcount>1){
            System.out.println("NO SOLUTION");
            return;
        }
        StringBuilder first = new StringBuilder();
        StringBuilder middle = new StringBuilder();
        StringBuilder last = new StringBuilder();

        for (int i=0;i<26;i++){
            if (freq[i]%2!=0){
                middle.append((char) (i+'A'));
            }
            for (int j=0;j<freq[i]/2;j++){
                first.append((char) (i+'A'));
            }
        }
        last.append(first).reverse();
        System.out.println(first.toString()+middle.toString()+last.toString());


    }
}

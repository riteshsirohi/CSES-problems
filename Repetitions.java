import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String n = scn.nextLine();

       char[] arr = n.toCharArray();
       int ans=0;
       int count = 1;

       for(int i=1;i<arr.length;i++){
           if(arr[i]!=arr[i-1]){
               ans = Math.max(ans,count);
               count=1;
           }else {
               count+=1;
           }
       }
       ans=Math.max(ans,count);
        System.out.println(ans);
    }
}

import java.util.*;
public class ReverseOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        // String rev = "";                            //  using extra string
        // for(int i=sb.length()-1;i>=0;i--){
        //     rev=rev+sb.charAt(i);

        // }
        // System.out.println(rev);
        /* 
        int i=0;
        int j=sb.length()-1;
        while(i<j){                                        // without using extra string
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;

        }
        System.out.println(sb); 
        */
        sb.reverse();                       // by using built-in function
        System.out.println(sb);
        sc.close();
    }
}

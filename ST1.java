import java.util.*;
public class ST1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        int v = 0;
        int c = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                if(ch=='a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u'){
                    v=v+1;
                }
                else{
                    c=c+1;
                }
            }
        }
        System.out.println("count of vowels is : " + v);
        System.out.println("count of constanant is : " + c);
        sc.close();
    }
}
import java.util.*;
public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Aayush");
        System.out.println(sb);
        System.out.println(sb.charAt(1));
        sb.setCharAt(1,'a');
        System.out.println(sb);
        sb.setCharAt(5,'s');
        System.out.println(sb);
        sb.setCharAt(5,'h');
        sb.insert(2,'a');
        System.out.println(sb);
        sb.insert(3,'y');
        System.out.println(sb);
        sb.delete(2, 4);   // sb.delete(start, end)  'start' is included but 'end' is Not include
        System.out.println(sb);
        sb.delete(0,4);
        System.out.println(sb);
        sb.setCharAt(0, 'A');
        System.out.println(sb);
        sb.insert(0,'A');
        sb.insert(1,'a');
        sb.insert(2,'y');
        sb.insert(3,'u');
        sb.insert(4,'s');
        sb.insert(5,'h');
        System.out.println(sb);
        sb.delete(6,8);
        System.out.println(sb);
        sb.append(" ");
        sb.append("Chauhan");
        System.out.println(sb);
        sb.append('n');
        System.out.println(sb);
       sb.delete(sb.length()-1, sb.length());
       System.out.println(sb);
       System.out.println(sb.length());
       // StringBuilder from user as input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string which you make to StringBuilder : ");
        String c = sc.nextLine();
        StringBuilder sb1 = new StringBuilder(c);
        System.out.println(sb1);
        sc.close();

    }
}
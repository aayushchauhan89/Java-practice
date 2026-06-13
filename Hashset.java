import java.util.HashSet;
public class Hashset{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(6);
        set.add(5);
        set.add(11);
        set.add(18);
        set.add(38);
        set.add(6);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(11)+ " " + set.contains(19));
        set.remove(18);
        System.out.println(set);
        System.out.println(set.size());
    }
}
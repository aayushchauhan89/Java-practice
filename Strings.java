import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        // String sr=sc.nextLine();
        // System.out.println(sr);
        // String NAME=name+ " " + sr;
        // System.out.println(NAME);         // concatenation
        // System.out.println(sr.length());  // to find the length of string
        // System.out.println(name.charAt(1));
        // if(name.charAt(3)=='u'){
        //     System.out.println("just for you!!");  // Accessing Character
        // }
        // String Nam = "aayu";
        // int c = name.compareTo(Nam);
        // if(c==0){
        //     System.out.println("str are equal");
        // }
        // else if(c>0){
        //     System.out.println("name is large str");
        // }
        // else{
        //     System.out.println("Nam is large than name");  // NOTE :- "aayu" > "Aayu" kyunki a ki ASCII IS LARGE than A
                                                              // we avoid "==" for campare bcoz sometimes it doesn't work
        // }




        // System.out.println(name.substring(1, 4));
        // String r=name.substring(0,4);
        // if(r.compareTo("aayu")==0){            // substring(start,end)   "start" is include but "end" is not include
        //     System.out.println("Aayush babu learned!!");
        // }
        sc.close();
    }
}

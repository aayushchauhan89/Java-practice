class Student{
    
    static String batch = "23-27";
    
    int rn;
    String name;
    Student(int r, String n){
        rn = r;
        name = n;
    }
    Student(String n, int r){
        name = n;
        rn = r;
    }
    
     
}
public class finalkeyword {
    public static void main(String [] args){
        Student s1 = new Student(3,"aayu");
        
        
        Student s2 = new Student("golu", 5);
        s1.batch = "22-26";
        System.out.println(s1.name + " " + s1.batch);
        
        System.out.println(s2.name + " " + s2.batch);
        

    }
}

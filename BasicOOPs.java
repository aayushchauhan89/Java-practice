class Student{
        String name;
        int rn;
        double cgpa;
        public void display(){
            System.out.println(name + " " + rn + " " + cgpa);
        }
    }
public class BasicOOPs{
    
    
    public static void main(String []args){
        Student s1 = new Student();
        s1.name = "Aayush";
        s1.rn = 3;
        s1.cgpa = 8.6;

        Student s2 = new Student();
        s2.name = "Golu";
        s2.rn = 8;
        s2.cgpa = 8.45;

        change(s1);
        s1.display();
    }
    public static void change(Student s){
        s.cgpa = 8.5;
    }
}
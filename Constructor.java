class Student{
    String name;
    int rn ;
    double cgpa;
    int marks [];
    int id;
    double atten;
    Student(String s, int x, double d,int []a){
        name = s;
        rn = x;
        cgpa = d;
        
        marks = a;
    }
    Student(int id , double atten){
        this.id = id;
        this.atten = atten;
    }
    
    void print(){
        System.out.println(name + " " + rn + " " + cgpa + " "+ marks[2]);
    }
    void display(){
        System.out.println(id + " " + atten);
    }
}
public class Constructor {
    public static void main(String[] args) {
        int a[] = {80,83,78,96};
        Student s = new Student("kitto",3,8.45,a);
        
        
        System.out.println(s.cgpa);
        s.print();
        Student s1 = new Student(1071,90.82);
        s1.display();
        
    }
}

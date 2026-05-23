class Student{
    void issue(){
        System.out.println("Attendence");
    }
}
class Employee{
    void issue(){
        System.out.println("low Salary");
    }
}
class India{
    void issue(){
        System.out.println("Civic sense");
    }
}
public class Polymor {
    public static void main(String[] args) {
        Student s = new Student();
        Employee e = new Employee();
        India i = new India();
        s.issue();
        e.issue();
        i.issue();
    }
    
}
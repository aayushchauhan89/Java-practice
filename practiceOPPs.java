class employee{
    int emp_id;
    String emp_name;
    double emp_salary;
    void set(int id, String name , double s){
        emp_id=id;
        emp_name=name;
        emp_salary=s;
    }
}
class manager extends employee{
    String department;
    void setDEpt(String dept){
        department=dept;
        System.out.println(emp_id + " " + emp_name + " " +emp_salary+ " " + department);
    }
}
public class practiceOPPs {
    public static void main(String[] args) {
        manager m = new manager();
        m.set(1,"Aayush",120000);
        m.setDEpt("Software engineer");
    }
}

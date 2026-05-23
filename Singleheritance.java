class parent{
    int a = 10;
    int b = 20;
    void sum(){
        System.out.println("sum is : " + (a+b));
    }
}
class child extends parent{
    int c=2;
    void multiply(){
        System.out.println("multiply is  : " + (a*b*c));
    }
}
public class Singleheritance {
    public static void main(String[] args) {
        child c = new child();
        c.sum();
        c.multiply();
        System.out.println(c.a);
    }
}



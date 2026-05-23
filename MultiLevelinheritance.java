class A{
    void sum(int a, int b){
        System.out.println("sum : " + (a+b) );
    }
}
class B extends A{
    void mul(int a, int b){
        System.out.println("mul : " + (a*b));
    }
}
class C extends B{
    void diff(int a ,int b){
        System.out.println("differnce : " + (a-b));
    }
}
public class MultiLevelinheritance {
    public static void main(String[] args) {
        C c1 = new C();
        c1.sum(2,3);
        c1.mul(3,4);
        c1.diff(2,4);
    }
    
}

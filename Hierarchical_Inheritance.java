class parent {
    void sum(int a, int b){
        System.out.println("sum : " + (a+b) );
    }
}
class child1 extends parent{
    void div(int a, int b){
        System.out.println("div is : " + (a/b));
    }
}
class child2 extends parent{
    void prod(int a, int b, int c){
        System.out.println("prod : " + (a*b*c));
    }
}
public class Hierarchical_Inheritance {

    public static void main(String[] args) {
        child1 c1 = new child1();
        child2 c2 = new child2();
        c1.sum(2,3);
        c1.div(4,2);
        c2.sum(5,4);
        c2.prod(2,3,4);
    }
}
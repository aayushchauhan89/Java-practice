class hello{
    int a = 10;
    int b = 20;
    void sum(){
        int r = a+b;
        System.out.println(r);
    }

}
class hey extends hello{
    int c = 15;
    void sum(){
        int r2 = a+b+c;
        System.out.println(r2);
    }
}
public class MethodOverRiddingatCollege {
    public static void main(String[] args) {
        hey h1 = new hey();
        h1.sum();
        hello h2 = new hello();
        h2.sum();
    }
}
 
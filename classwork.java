class Hello{
int a = 10;
int b = 20;
void sum(){
    int r = a+b;
    System.out.println(r);
}
}
class Hey extends Hello{
    int c = 20;
    void mul(){
        int r1 = a*b*c;
        System.out.println(r1);
    }

}
class demo extends Hey {
    int d = 2;
    void mul2(){
        int r2 = a*b*c*d;
        System.out.println(r2);
    }
}
public class classwork {
    public static void main(String[] args) {
        // Hey h1 = new Hey();
        demo h1 = new demo();

        h1.sum();
        System.out.println(h1.a);
        // h1.mul();
        h1.mul2();
    }
}

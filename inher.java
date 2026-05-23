import java.util.*;

class operation{
    int x ;
    int y;
    operation(){

    }
    operation(int x, int y){
        this.x = x;
        this.y = y;
    }
    void result1(){
        System.out.println("sum is : " + (x+y));
    }
}
class sub extends operation{
    sub(){};
    sub(int x, int y){
        super(x,y);
    }
    int z = 8; x
    void result2(){
        System.out.println("sub : " + (x-y+z));
    }
}
class multiply extends sub{
    multiply(){};
    multiply(int x, int y){
        super(x,y);
    }
    void result3(){
        System.out.println("mul : " + (x*y*z));
    }
}
public class inher {
    public static void main(String [] args){
        operation o = new operation(3,2);
        o.result1();
        sub s = new sub(3,2);
        s.result2();
        multiply m = new multiply(3,2);
        m.result3();

    }
}
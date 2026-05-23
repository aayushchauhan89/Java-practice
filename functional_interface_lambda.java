@FunctionalInterface
interface MyfunInterface{
    int multiply(int a , int b);
}
public class functional_interface_lambda {
    public static void main(String [] args){
        MyfunInterface mul=(a,b)->{
            return a*b;
        };
        int res = mul.multiply(5,7);
        System.out.println("multiplication is : " + res);
        
    }
}

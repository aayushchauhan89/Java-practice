class Complex{
    int x;
    int y;

    Complex(int x, int y){
        this.x = x;
        this.y = y;
    }

    void print(){
        if(y>=0){
            System.out.println(x + " + " + y + "i");
        
        }
        else{
            System.out.println(x + " - "+(-y)+ "i");
        }
    }
    void add(Complex z){
        x = x + z.x;
        y = y + z.y;
    }
    void multiply(Complex z){
        x = x*z.x - y*z.y;
        y = x*z.y + y*z.x;
    }

}
public class ComplexNumberClass {
    public static void main(String [] args){
        Complex z1 = new Complex(2,3);
        Complex z2 = new Complex(7,-9);
        z1.print();
        z2.print();
        z1.add(z2);
        z1.print();
        z1.multiply(z2);
        z1.print();
    }
}

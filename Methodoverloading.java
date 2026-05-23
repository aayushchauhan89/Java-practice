class Prints{
    void show(int a){
        System.out.println("given number square is : " + (a*a));
    }
    void show(String msg){
        System.out.println("my name is " + msg);
    }
    void show(double b){
        System.out.println("any floating point number : " + b);
    }
}
public class Methodoverloading {
    public static void main(String[] args) {
        Prints p = new Prints();
        p.show(18);
        p.show("Aayu");
        p.show(4.5);

    }
}

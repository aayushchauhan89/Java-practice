class example {
    void sum(int a, int b){
        System.out.println("sum : " + (a+b));
    }
}
class demo extends example{
    void sum(int a, int b){
        System.out.println("product : " + (a*b));
    }
}
public class methodoverridding {
    public static void main(String[] args) {
        example e = new demo();
        e.sum(2,3);
    }
}

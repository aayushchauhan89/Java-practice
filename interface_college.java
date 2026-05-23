interface hello{
    int a=10;
    int b = 20;
    void sum();
}
// class demo implements hello {
//     public void sum(){
//         int r = a+b;
//         System.out.println(r);
//     }
// }
// class example implements hello{
//     public void sum(){
//         int r2 = a*b;
//         System.out.println(r2);
//     }
// }
interface bello  {
    int c = 35;
    void print();
    
}
class run implements hello,bello{
    public void sum(){
        System.out.println(a);
    }
    public void print(){
        System.out.println(c);
    }
}
public class interface_college{
    public static void main(String[] args) {
        // demo d = new demo();
        // d.sum();
        // example e = new example();
        // e.sum();
        run r = new run();
        r.sum();
        r.print();

    }
}
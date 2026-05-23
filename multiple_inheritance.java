interface A{
    void show();
}
interface B{
    void display();
}
class demo implements A,B{
    public void show(){
        System.out.println("namaskar from A");
    }
    public void display(){
        System.out.println("Namaskar from B");
    }
}
public class multiple_inheritance {
    public static void main(String[] args) {
        demo d = new demo();
        d.show();
        d.display();
    }
}

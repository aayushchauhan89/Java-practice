interface example{
    void display();
}
class run implements example {
    public void display (){
        System.out.println("bharat mata ki jai");
    }
}
public class interface_in_java {
    public static void main(String[] args) {
    example e = new run();
        e.display();
    }
}

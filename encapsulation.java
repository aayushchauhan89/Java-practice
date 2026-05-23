class hello {
    int age ;
    String name ;
    void show(){
        System.out.println("my name is" + " " + name + " and I am " + age + " year old");
    }
}
public class encapsulation {
    public static void main(String [] args){
        hello h = new hello();
        h.name = "Aayush chauhan";
        h.age = 20;
        h.show();
    }
}

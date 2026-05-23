class hello{
    int a = 10;
    int b=  20;
    hello(){
        System.out.println("this is user define constructer");
    }
    hello(int n){
        System.out.println(n);
    }
    void sum(){
        int r = a+b;
        System.out.println(r);
    }
    void sum(int c){
        int r2= a+b+c;
        System.out.println(r2);
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		hello h1 = new hello();
        hello h2 = new hello(10);
		h1.sum();
        h1.sum(15);
        h2.sum(20); 

	} 
}
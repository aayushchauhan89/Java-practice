class PrivateKeyword{
    String name;
    private int rn ;
    double cgpa;
    void setter( String s, int x, double c){
        name = s;
        rn = x;
        cgpa = c;
    }
    void getter(){
        System.out.println(name + " "+ rn + " "+ cgpa);
    }
}
public class PrivateK {
    public static void main(String [] args){
        PrivateKeyword p = new PrivateKeyword();
        
        System.out.println(p.name + " " +  " " + p.cgpa);
        p.setter("aayu", 3, 8.7);
        p.getter();

    }
}

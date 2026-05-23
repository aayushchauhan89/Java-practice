public class ClassNotFoundException_example{
    public static void main(String [] args){
        try{
            Class.forName("demo");
            
        }
        catch(ClassNotFoundException e){
            System.out.println("class not found" + e.getMessage());
        }
    }
}
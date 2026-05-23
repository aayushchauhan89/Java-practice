public class throw_example{
    public static void main(String [] args){
        int age = 17;
        // if(age<18){
        //     throw new ArithmeticException("you are choota baccha");
        // }
        // else{
        //     System.out.println("you are bada baccha");
        // }
        try{
            if(age<18){
                throw new ArithmeticException("not eligible");
            }
            else{
                System.out.println("eligible");
            }
        }
        catch(ArithmeticException e){
            System.out.println("exception caught : " + e.getMessage());
        }
    }
}
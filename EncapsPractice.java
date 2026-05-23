class student{
    private int s_id;
    private String s_name;
    private String s_branch;
    public void setID(int id){
        s_id=id;
    }
    public int getID(){
        return s_id;
    }
    public void setName(String name){
        s_name=name;
    }
    public String getName(){
        return s_name;
    }
    public void setBranch(String branch){
        s_branch=branch;
    }
    public String getBranch(){
        return s_branch;
    }

}
public class EncapsPractice {
    public static void main(String[] args) {
    student s1 = new student();
    s1.setID(1);
    s1.setName("Aayu");
    s1.setBranch("CSE AIML");
    System.out.println(s1.getID() + " " + s1.getName() + " " + s1.getBranch());        
    }
}

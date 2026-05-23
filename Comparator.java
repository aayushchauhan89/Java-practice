import java.util.Arrays;

class student implements Comparable<student>{
    String name;
    int rn;
    double cgpa;
    student(String name, int rn, double cgpa){
        this.name = name;
        this.rn = rn;
        this.cgpa = cgpa;
    }

    public int compareTo(student s){
        return Double.compare(this.cgpa, s.cgpa);
    }
}

public class Comparator{
    public static void main(String[] args) {
        student s1 = new student("aayu", 3, 8.5);
        student s2 = new student("viv", 16, 8.1);
        student s3 = new student("kittu", 5, 8.3);
        student [] arr = {s1,s2,s3}; 
        Arrays.sort(arr);
        for(student s: arr){
            System.out.println(s.name + " " + s.rn + " "+ s.cgpa);
        }
    }
}
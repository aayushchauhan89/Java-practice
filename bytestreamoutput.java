import java.io.*;
public class bytestreamoutput {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("output.txt");
        String data = "aayu";
        byte b [] = data.getBytes();
        fos.write(b);
        fos.close();
        System.out.println("File write successful!");
    }
}

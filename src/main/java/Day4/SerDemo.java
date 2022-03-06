package Day4;

import java.io.*;

public class SerDemo {
    public static void main(String[] args) {
        Student st = new Student("Leo", 23);
        try{
            OutputStream fileout = new FileOutputStream("C:\\Users\\natur\\Desktop\\student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(st);
            out.close();
            fileout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

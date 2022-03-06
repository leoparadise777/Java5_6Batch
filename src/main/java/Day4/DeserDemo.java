package Day4;

import java.io.*;

public class DeserDemo {
    public static void main(String[] args) {
        Student student = null;
        try {
            InputStream filein = new FileInputStream("C:\\Users\\natur\\Desktop\\student.ser");
            ObjectInputStream in = new ObjectInputStream(filein);
            student = (Student) in.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(student.getAge());
        System.out.println(student.getName());
    }
}

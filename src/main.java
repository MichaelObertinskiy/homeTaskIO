import java.io.*;

public class main {
    public static void main(String[] args) {

        try (FileInputStream firstFile = new FileInputStream("D:\\A-Level\\Home_Task_4_IO\\DirFiles\\firstFile.txt");
             FileOutputStream secondFile = new FileOutputStream("D:\\A-Level\\Home_Task_4_IO\\DirFiles\\secondFile.txt")) {
            byte[] buffer = new byte[firstFile.available()];

            firstFile.read(buffer, 0, buffer.length);

            secondFile.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

}




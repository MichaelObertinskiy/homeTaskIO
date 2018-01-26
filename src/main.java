import java.io.*;

public class main {
    public static void main(String[] args) {

        int symbol = 0;
        Integer x = symbol;
        symbol = newFileRead();
        fileWrite("\nline: " + x.toString(symbol));

    }

    public static int newFileRead() {
        int lineNumber = 0;
        FileReader file;
        BufferedReader bf;
        try {
            file = new FileReader("D:/A-Level/Home_Task_4_IO/src/file.txt");
            bf = new BufferedReader(file);
            try {
                while (bf.readLine() != null) {
                    lineNumber++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return lineNumber;
    }


    public static void fileWrite(String str) {
        FileWriter flWr = null;
        try {
            flWr = new FileWriter("D:/A-Level/Home_Task_4_IO/src/file.txt", true);
            flWr.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                flWr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}




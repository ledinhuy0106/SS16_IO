import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DuplicateWordsInFile {
    public static void main(String[] args) {
        String fileName = "demo.txt";
        Reader file;
        BufferedReader bufferedReader;
        try {
            file = new FileReader(fileName);
            bufferedReader = new BufferedReader(file);
            List<String> stringList = new ArrayList<>();
            List<String> listDulicate = new ArrayList<>();
            String[] list;
            String lines;
            while ((lines = bufferedReader.readLine()) != null) {
                list = lines.split(" ");
                for (String string : list) {
                    if (stringList.contains(string)&&!listDulicate.contains(string)) {
                        listDulicate.add(string);
                    } else {
                        stringList.add(string);
                    }
                }
            }
            for (String string : listDulicate) {
                System.out.println(string);
            }
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

}

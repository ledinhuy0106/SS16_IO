import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ImportAndCountWords {
    public static void main(String[] args) {
        String fileName = "demo.txt";
        FileReader fileReader;
        BufferedReader bufferedReader;
        int count = 0;
        try {
            fileReader = new FileReader(fileName);
            bufferedReader= new BufferedReader(fileReader);
            String[] list;
            String lines;
            while ((lines=bufferedReader.readLine())!=null){
                list= lines.split(" ");
                count += list.length;
            }
            System.out.println("Số lượng từ trong file là: "+ count);
        } catch (IOException e) {
            System.out.println("Lỗi" + e.getMessage());
        }
    }
}

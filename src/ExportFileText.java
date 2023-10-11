import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExportFileText {
    public static void main(String[] args) {
        BufferedWriter fileWriter;
        String content = "Lê Đình Uy";
        FileWriter fileWriter1;
        try {
            fileWriter1 = new FileWriter("demo.txt");
            fileWriter = new BufferedWriter(fileWriter1);
            fileWriter.write(content);
            System.out.println("Thành công..");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Có lỗi khi ghi file");
        }
    }
}

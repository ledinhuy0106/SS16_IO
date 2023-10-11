import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLinesInFile {
    public static void main(String[] args) {
        String fileName="demo.txt";
        FileReader fileReader;
        int countLines = 0;
        BufferedReader bufferedReader;
        try{
            fileReader=new FileReader(fileName);
            bufferedReader=new BufferedReader(fileReader);
            while (bufferedReader.readLine()!=null){
                countLines++;
            }
            System.out.println("Số dòng trong file là:"+countLines);
        }catch (IOException e){
            System.out.println("Lỗi"+ e.getMessage());
        }
    }
}

package rikkei.academy;

import java.io.*;

public class FileCopyExample {
    public static void main(String[] args) throws IOException {
        copyFile("src/rikkei/academy/source.txt","src/rikkei/academy/target.txt");
    }
    public static void copyFile(String path1,String path2)  {
        try {
            //Tạo đối tượng để đọc tệp tin
            FileReader fileReader = new FileReader(path1);
            // /đọc từng dòng của file
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //Tạo đối tượng ghi file
            FileWriter fileWriter = new FileWriter(path2,true);
            //tạo dòng chữ
            String line = "";
            // duyệt qua từng dòng của file source

            int count = 0;
            while ((line = bufferedReader.readLine())!= null){
                //ghi vào file target thông qua đối tượng source
                count += line.length();
                fileWriter.write(line+"\n");
                System.out.println(line);
            }
            fileWriter.close();//đóng quá trình ghi file
            System.out.println("kí tự trong tệp : "+count);
        }catch (Exception e){
            System.err.println("không tìm thấy file");
        }
    }
}
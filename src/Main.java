import java.io.File;

public class Main {
    public static void main(String[] args) {
        ReadFileExample file;
        File example;
        try{
            //Tao file
            file = new ReadFileExample();
            example =  file.createFile("G:\\codegym\\module2\\thTinhTongCacSoTrongFileText\\src\\example.txt");
            //Quay ve file vua tao de nhap so
            //Goi phuong thuc tinh tong.
            file.readFileText(example);
        } catch (Exception ex){
            System.err.println("Error: "+ex.getMessage());
        }
    }
}
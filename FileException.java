import java.beans.ConstructorProperties;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class FileException {

    public static void main(String[] args)  {
        try {
            File f = createFile(args[0]);
            System.out.println(f.getName() +"파일이 성공적으로 생성됨");
        } catch(Exception e) {
            System.out.println(e.getMessage() + "다시 입력 해주세요.");
        }
    }

    static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals(""))
            throw new Exception("파일명이 유효하지 않음.");
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}














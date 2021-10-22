import java.beans.ConstructorProperties;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class ExceptionThrowEx {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생");
            throw e;

        } catch (Exception e) {
            System.out.println("에러 메시지: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}












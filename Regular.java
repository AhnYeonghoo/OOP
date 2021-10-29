import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
    public static void main(String[] args)  {
        String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0","car","combat","count","date","disc"};
        Pattern p = Pattern.compile("c[a-z]*"); // c로 시작하는 a-z 사이의 영소문자
        for(int i = 0; i < data.length; i++){
            Matcher m = p.matcher(data[i]);
            if(m.matches())
                System.out.print(data[i] + ",");
        }

    }


}








import java.util.Arrays;
import java.util.Scanner;

public class week_eight_E {
    public static void main(String[] args) {
       for(int i=100;i<=333;i++)
       {
           int a=i*1,b=i*2,c=i*3;
           String s = ""+a+b+c;
           char [] strs = s.toCharArray();
           Arrays.sort(strs);
           if(check(strs))
               System.out.println(s);
       }
    }

    private static boolean check(char[] strs) {
        for(int i=0;i<strs.length;i++)
            if(strs[i]-'0'!=i+1)
                return false;
            return true;
    }
}

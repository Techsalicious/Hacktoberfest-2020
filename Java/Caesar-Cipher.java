import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {

         int n=0;
         for (int i = 0; i < s.length(); i++) {
            if((int)s.charAt(i) >=65 && (int)s.charAt(i) <=90 ){
                
                if((int)s.charAt(i) >=65 && (int)s.charAt(i)+k >90){
            n=((((int)s.charAt(i)-90)+k)%26)+64;
            if(n==64)
                n=90;
                    s=replace(s,n,i);
                }
                else{
                    //System.out.println(s.charAt(i));
                    s=replace(s,s.charAt(i)+k,i);
                }
            }
            else if((int)s.charAt(i) >=97 && (int)s.charAt(i) <= 122){
                
                if((int)s.charAt(i) >=97 && (int)s.charAt(i)+k >122){

                      n=((((int)s.charAt(i)-122)+k)%26)+96;
                      if(n==96)
                        n=122;
                    s=replace(s,n,i);
                }
                else{
                    
                //    System.out.println(s.charAt(i));
                    s=replace(s,s.charAt(i)+k,i);
                }
            }
            
        
         }
         return s;


    }
private static String replace(String s, int k, int i) {
        // TODO Auto-generated method stub
        StringBuffer sb=new StringBuffer(s);
        sb.replace(i, i+1,(String.valueOf((char)k)));
        //System.out.println(sb);
        return new String(sb);
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

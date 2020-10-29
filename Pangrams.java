import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the pangrams function below.
    static String pangrams(String s) {

List<Integer> lAscii=new ArrayList<Integer>();
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if((int)c >=65 &&(int)c <=90 ){
            //    System.out.println(" if "+c+" ascii "+(int)c);
                if(!lAscii.contains((int)c)){
                    lAscii.add((int)c);
                    sum+=(int)c;
                }
            }
            else if(((int)c >=97 &&(int)c <=122 )){
        //        System.out.println(" else "+c+" ascii "+(int)c+" ascii-32 "+((int)c -32));
                if(!lAscii.contains(Math.abs((int)c-32))){
                    lAscii.add(Math.abs(32-(int)c));
                    sum+=Math.abs(32-(int)c);
                }
            }
            
        }
        
        
        if(sum==2015)
            return "pangram";
        
        return "not pangram";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

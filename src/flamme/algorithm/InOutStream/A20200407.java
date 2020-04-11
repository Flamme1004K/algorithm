package flamme.algorithm.InOutStream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class A20200407 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        ArrayList<String> strList = new ArrayList<String>();
        int count = 0;
        while((line=in.readLine())!=null){
            if(line.isEmpty()||count>100
                    ||line.length()>100 || !Pattern.matches("^([a-zA-Z0-9 ]+)", line)) {
                break;
            }
            else
            {
                strList.add(line);
            }
        }

        for(String str : strList) {
            System.out.println(str);
        }
    }
}

package flamme.algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class A202004071 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        ArrayList<String> strList = new ArrayList<String>();
        int count = 0;
        while((line=in.readLine())!=null){
            if(count>100 || line.length()>100) {
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

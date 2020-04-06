package flamme.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AplusB4 {
    public static void main(String[] args) throws IOException {
        BufferedReader rr = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while (input != null){
            String[] b;
            String numberGroup = rr.readLine();
            b = numberGroup.split(" ");
            if(b.length==2){
                int b0 = Integer.parseInt(b[0]);
                int b1 = Integer.parseInt(b[1]);
                int sum = b0+b1;
                if(sum > 0) System.out.println(b0 + b1);
                else if(sum ==0) break;
            }
        }
    }
}

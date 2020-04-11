package flamme.algorithm.InOutStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AplusB3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input =  "";
        while ((input = br.readLine()) != null) {
            String[] b = input.split(" ");
            if(b.length==2){
                int sum = Integer.parseInt(b[0])+Integer.parseInt(b[1]);
                input = String.valueOf(sum);
                System.out.println(input);
            }
        }
    }
}

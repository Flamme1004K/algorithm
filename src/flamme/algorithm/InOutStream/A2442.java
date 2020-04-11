package flamme.algorithm.InOutStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine())*2;
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<input; i++){
            if(i%2==1) {
                for(int j = 0; j<(input-i)/2; j++){
                    builder.append(" ");
                }
                for(int j = 1; j<i+1; j++){
                    builder.append("*");
                }
                builder.append("\n");
            }
        }
        System.out.println(builder);
    }
}

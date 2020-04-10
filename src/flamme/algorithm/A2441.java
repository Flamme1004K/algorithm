package flamme.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        StringBuilder builder = new StringBuilder();
        for (int i = input; i>0; i--) {
            for (int j = i; j < input; j++){
                builder.append(" ");
            }
            for (int j = 0; j<i; j++) {
                builder.append("*");
            }
            builder.append("\n");
        }
        System.out.println(builder);

    }
}

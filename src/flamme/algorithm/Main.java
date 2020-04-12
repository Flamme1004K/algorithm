package flamme.algorithm;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());

        for(int i = 1; i < input; i++) {
            for(int j = 1; j < i; j++) bw.write(" ");
            for(int j = 0; j < (input - i)*2 +1; j++) bw.write("*");
            bw.write("\n");
        }
        for(int i = 0; i < input; i++) {
            for(int j = 1; j < input - i; j++) bw.write(" ");
            for(int j = 0; j < i * 2 + 1; j++) bw.write("*");
            bw.write("\n");
        }

        bw.flush();
    }
}

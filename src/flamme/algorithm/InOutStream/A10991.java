package flamme.algorithm.InOutStream;

import java.io.*;

public class A10991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        for(int i = 1; i<=input; i++) {
            for ( int j = input; j>i; j--) bw.write(" ");
            for ( int j = 1; j <= i; j++) bw.write("* ");
            bw.newLine();
        }
        bw.flush();
    }
}

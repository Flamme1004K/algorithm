package flamme.algorithm.InOutStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i = 1; i < input; i++) {
            sb1.append("*");
            sb2.append(sb1+"\n");
        }
        System.out.println(sb2);
        /*
        for(int i=1; i<=input; i++) {
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
         */
    }
}

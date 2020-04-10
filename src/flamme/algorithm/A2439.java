package flamme.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        for (int i = 0; i < input; i++) {
            for (int j = 1; j < input - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i = input; i<input; --i) {
            sb1.append("*");
        }
        sb2.append(sb1+"\n");
        System.out.println(sb2);
    }

     */
}

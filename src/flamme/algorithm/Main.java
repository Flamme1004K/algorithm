package flamme.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        StringBuilder star = new StringBuilder();
        StringBuilder blank = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < input; i++) {
            star.append("*");
            blank.append(" ");
        }
        for(int i = 1; i < input; i++) {
            result.append(blank.substring(i)+star.substring(0,i)+"\n");
        }
        for(int i = 0; i < input; i++) {
            result.append(blank.substring(0,i)+star.substring(i)+"\n");
        }

        System.out.println(result);
    }
}

package flamme.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AplusB {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String a = in.readLine();
        String b = in.readLine();

        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);

        System.out.println(aInt+bInt);

    }
}

//Julia Zhu
//May 16, 2018

import java.io.*;
import java.math.BigInteger;

public class Problem13 {
    public static void main(String[] args) throws IOException {
        BigInteger sum = new BigInteger("0");
        BufferedReader reader = new BufferedReader(new FileReader("./Problem13.txt"));
        String line = reader.readLine();
        while (line != null) {
            sum = sum.add(new BigInteger(line));
            line = reader.readLine();
        }
        String result = sum.toString();
        System.out.println(result.substring(0,9));
    }
}

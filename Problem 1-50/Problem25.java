//Julia Zhu
//June 6, 2018

import java.math.BigInteger;

public class Problem25 {
    public static void main(String[] args) {
        BigInteger f1 = new BigInteger("1");
        BigInteger f2 = new BigInteger("1");
        int count = 2;
        while (true) {
            BigInteger f3 = f1.add(f2);
            count++;
            if (f3.toString().length() == 1000)
                break;
            f1 = f2;
            f2 = f3;
        }
        System.out.println(count);
    }
}

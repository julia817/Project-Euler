//Julia Zhu
//May 18, 2018

import java.math.BigInteger;

public class Problem16 {
    public static void main(String[] args) {
        BigInteger n = new BigInteger("2");
        for (int i=0; i<1000-1; i++) {
            n = n.multiply(new BigInteger("2"));
        }
        int sum = 0;
        String s = n.toString();
        for (int i=0; i<s.length(); i++) {
            sum += (s.charAt(i)-'0');
        }
        System.out.println(sum);
    }
}

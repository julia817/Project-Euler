//Julia Zhu
//May 23, 2018

import java.math.BigInteger;

class Problem20 {
    public static void main(String[] args) {
        BigInteger result = new BigInteger("1");
        for (int i=2; i<=100; i++) {
            result = result.multiply(new BigInteger(Integer.toString(i)));
        }
        String str = result.toString();
        int sum = 0;
        for (int i=0; i<str.length(); i++) {
            sum += str.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}

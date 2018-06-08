//Julia Zhu
//June 9, 2018

import java.util.*;
import java.math.BigInteger;

public class Problem29 {
    public static void main(String[] args) {
        ArrayList<BigInteger> list = new ArrayList<BigInteger>();
        for (int a=2; a<=100; a++) {
            for (int b=2; b<=100; b++) {
                BigInteger a_bi = new BigInteger(Integer.toString(a));
                BigInteger result = a_bi.pow(b);
                if (!(list.contains(result)))
                    list.add(result);
            }
        }
        System.out.println(list.size());
    }
}

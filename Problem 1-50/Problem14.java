//Julia Zhu
//May 17, 2018

import java.util.*;

public class Problem14 {
    public static void main(String[] args) {
        int len = 0;
        long num = 0;
        for (long i=2; i<1000000; i++) {
            int size = seq(i);
            if (size>len) {
                len = size;
                num = i;
            }
        }
        System.out.println(num);
    }

    //count length of the sequence
    public static int seq(long n) {
        int count = 0;
        while (n!=1) {
            if (n%2 == 0) {
                n /= 2;
                count ++;
            }
            else {
                n = 3*n+1;
                count ++;
            }
        }
        return count;
    }
}

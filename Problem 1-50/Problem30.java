//Julia Zhu
//June 9, 2018

import java.lang.*;

public class Problem30 {
    public static void main(String[] args) {
        int sum_numbers = 0;
        for (int i=10; i<1000000; i++) {
            int sum = 0;
            String s = Integer.toString(i);
            int digit = 0;
            for (int j=0; j<s.length(); j++) {
                digit = s.charAt(j)-'0';
                sum += Math.pow(digit, 5);
            }
            if (sum == i)
                sum_numbers += i;
        }
        System.out.println(sum_numbers);
    }
}

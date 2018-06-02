//Julia Zhu
//May 10, 2018

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        int num = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=100; i<1000; i++) {
            for (int j=i; j<1000; j++) {
                int prod = i*j;
                if (pal(prod)) {
                    list.add(prod);
                }
            }
        }
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list.get(0));
    }

    //Check if n is a palindrome
    public static boolean pal(int n) {
        //Store every digit of n in a list
        ArrayList<Integer> list = new ArrayList<Integer>();
        int last = 0;
        for(int i=n; i>10; i = i/10) {
            int digit = i%10;
            list.add(digit);
            last = i;
        }
        list.add(last/10);

        //loop and check if the pairs of digits are equal
        int len = list.size();
        for(int i=0; i<len/2; i++) {
            if (list.get(i) != list.get(len-i-1))
                return false;
        }
        return true;
    }
}

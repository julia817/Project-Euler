//Julia Zhu
//June 11, 2018

public class Problem34 {
    public static void main(String[] args) {
        int[] fractorial = new int[10];
        for (int i=0; i<=9; i++) {
            fractorial[i] = fract(i);
        }
        int sum = 0;
        for (int i=10; i<1000000; i++) {
            String num = Integer.toString(i);
            int sum_digits = 0;
            for (int j=0; j<num.length(); j++) {
                sum_digits += fractorial[num.charAt(j)-'0'];
            }
            if (sum_digits==i)
                sum += i;
        }
        System.out.println(sum);
    }

    public static int fract(int n) {
        if (n==0 || n==1)
            return 1;
        else
            return n*fract(n-1);
    }
}

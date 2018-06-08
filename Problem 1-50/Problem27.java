//Julia Zhu
//June 8, 2018

public class Problem27 {
    public static void main(String[] args) {
        int count_result = 0;
        int a_result = 0;
        int b_result = 0;
        for (int a=-999; a<=999; a++) {
            outer:
            for (int b=-1000; b<=1000; b++) {
                int n = 0;
                inner:
                while (true) {
                    if (n*n+a*n+b < 3)
                        continue outer;
                    if (prime(n*n+a*n+b))
                        n++;
                    else
                        break inner;
                }
                if ((n+1) > count_result) {
                    a_result = a;
                    b_result = b;
                    count_result = n+1;
                }
            }

        }
        System.out.println(a_result*b_result);
    }

    public static boolean prime (int n) {
        if (n%2 == 0)
            return false;
        for (int i=3; i*i<=n; i++) {
            if (n%i == 0)
                return false;
        }
        return true;
    }
}

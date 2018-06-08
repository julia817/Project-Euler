//Julia Zhu
//May 7, 2018

public class Problem02 {
    public static void main(String[] args) {
        int sum = 2;
        int a = 1;
        int b = 2;
        int fib = 3;
        while (fib<4000000) {
            if (fib%2==0)
                sum = sum + fib;
            a = b;
            b = fib;
            fib = a + b;
        }
        System.out.println(sum);
    }
}

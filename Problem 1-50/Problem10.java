//Julia Zhu
//May 14, 2018

public class Problem10 {
    public static void main(String[] args) {
        long sum = 5;
        for (long i=5; i<2000000; i++) {
            if (prime(i))
                sum += i;
        }
        System.out.println(sum);
    }

    //check if n is a prime number
    public static boolean prime (long n) {
        if (n%2 == 0)
            return false;
        for (long i=3; i*i<=n; i+=2) {
            if (n%i == 0)
                return false;
        }
        return true;
    }
}

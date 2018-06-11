//Julia Zhu
//June 11, 2018

public class Problem37 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=10; i<1000000; i++) {
            if (prime(i) && left(Integer.toString(i)) && right(Integer.toString(i))) {
                sum += i;
            }

        }
        System.out.println(sum);
    }

    public static boolean left (String s) {
        for (int i=1; i<s.length(); i++) {
            if (!(prime(Integer.parseInt(s.substring(i,s.length())))))
                return false;
        }
        return true;
    }

    public static boolean right (String s) {
        for (int i=s.length()-1; i>=1; i--) {
            if (!prime(Integer.parseInt(s.substring(0,i))))
                return false;
        }
        return true;
    }
    public static boolean prime (int n) {
        if (n==0 || n==1)
            return false;
        if (n==2)
            return true;
        if (n%2 == 0)
            return false;
        for (int i=3; i*i<=n; i+=2) {
            if (n%i == 0)
                return false;
        }
        return true;
    }
}

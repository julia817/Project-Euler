//Julia Zhu
//May 9, 2018

//import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        long input = 600851475143L;
        long max = 0;
        //ArrayList<Long> list = new ArrayList<Long>();
        //for (long i=3; i<input/2; i=i+2) {
        for(long i=3; i*i<=input; i=i+2) {
            if (input%i == 0)
                if (prime(i)) {
                    //list.add(i);
                    max = i;
                }
        }
        //System.out.println(list.get(list.size()-1));
        System.out.println(max);
    }

    //check if n is a prime number
    public static boolean prime(long n){
        for (long i=2; i<=n/2; i++) {
            if (n%i == 0)
                return false;
        }
        return true;
    }
}

//Julia Zhu
//May 11, 2018

public class Problem7 {
    public static void main(String[] args) {
        int count = 0;
        int num = 1;
        while(count < 10001) {
            num++;
            if(prime(num))
                count++;
        }
        System.out.println(num);
    }

    //Check if n is a prime number
    public static boolean prime(int n){
        for (int i=2; i<=n/2; i++) {
            if (n%i == 0)
                return false;
        }
        return true;
    }
}

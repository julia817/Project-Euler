//Julia Zhu
//May 7, 2018

public class Problem1 {
    public static void main(String[] args) {
        int sum = 23;
        for(int i=10; i<1000; i++) {
            if (mult(i))
                sum = sum + i;
        }
        System.out.println(sum);
    }

    //check if n is multiples of 3 or 5
    public static boolean mult(int n) {
        if (n%3==0)
            return true;
        if (n%5==0)
            return true;
        else
            return false;
    }
}

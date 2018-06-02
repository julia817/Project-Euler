//Julia Zhu
//May 11, 2018

public class Problem6 {
    public static void main(String[] args) {
        int sum_sq = 0;
        int sq_sum = 0;
        for (int i=1; i<=100; i++) {
            sum_sq += i*i;
            sq_sum += i;
        }
        sq_sum *= sq_sum;

        System.out.println(sq_sum-sum_sq);
    }
}

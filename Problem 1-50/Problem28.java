//Julia Zhu
//June 9, 2018

public class Problem28 {
    public static void main(String[] args) {
        int sum = 1;
        int num = 1;
        for (int i=2; i<1001; i+=2) {
            for (int j=0; j<4; j++) {
                num += i;
                sum += num;
            }
        }
        System.out.println(sum);
    }
}

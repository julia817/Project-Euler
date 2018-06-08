//Julia Zhu
//May 30, 2018

public class Problem21 {
    public static void main(String[] args) {
        int sum = 0;
        int[] list = new int[10000];
        for (int i=2; i<10000; i++) {
            list[i] = d(i);
        }
        for (int i=2; i<10000; i++) {
            for (int j=i+1; j<10000; j++) {
                if ((i!=j) && (list[i]==j) && (i==list[j])) {
                    sum += (i+j);
                    break;
                }
            }
        }
        System.out.println(sum);
    }

    public static int d(int n) {
        int sum = 0;
        for (int i=1; i<n; i++) {
            if (n%i == 0)
                sum += i;
        }
        return sum;
    }
}

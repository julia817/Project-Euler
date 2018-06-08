//Julia Zhu
//May 16, 2018

public class Problem12 {
    public static void main(String[] args) {
        int count = 2;
        int tri = 0;
        int n = 1;
        while (count < 500) {
            count = 2;
            tri += n;
            for (int i=2; i*i<tri; i++) {
                if (tri%i == 0)
                    count ++;
            }
            count *= 2;
            n++;
        }
        System.out.println(tri);
    }
}

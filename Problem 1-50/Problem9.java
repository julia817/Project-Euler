//Julia Zhu
//May 14, 2018

public class Problem9 {
    public static void main(String[] args) {
        int a=3, b=4, c=5;
        //while (a+b+c<1000)
        for (int i=3; i<998; i++) {
            for (int j=i+1; j<999; j++) {
                for (int k=j+1; k<1000; k++) {
                    if ( i+j+k == 1000) {
                        if ( (i*i+j*j) == k*k) {
                            a = i;
                            b = j;
                            c = k;
                        }
                    }
                }
            }
        }
        System.out.println(a*b*c);
    }
}

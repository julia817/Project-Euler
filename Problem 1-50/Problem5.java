//Julia Zhu
//May 11, 2018

public class Problem5 {
    public static void main(String[] args) {
        boolean result = false;
        int input = 100;
        while(result == false) {
            if(test(input))
                result = true;
            else
                input++;
        }
        System.out.println(input);
    }

    //Check if n is evenly-divisible by 1~20
    public static boolean test (int n) {
        for (int i=2; i<=20; i++) {
            if (n%i != 0)
                return false;
        }
        return true;
    }
}

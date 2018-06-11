//Julia Zhu
//June 11, 2018

public class Problem36 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=0; i<1000000; i++) {
            String decimal = Integer.toString(i);
            String binary = Integer.toBinaryString(i);
            if(palindrome(decimal) && palindrome(binary))
                sum += i;
        }
        System.out.println(sum);
    }

    public static boolean palindrome(String s) {
        if (s.length()==0 || s.length()==1)
            return true;
        else if (s.charAt(0) == s.charAt(s.length()-1))
            return palindrome(s.substring(1, s.length()-1));
        return false;
    }
}

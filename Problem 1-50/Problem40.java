//Julia Zhu
//June 10, 2018


public class Problem40 {
    public static void main(String[] args) {
        StringBuffer fraction = new StringBuffer("");
        int num = 1;
        while (fraction.length()<1000000) {
            fraction.append(Integer.toString(num));
            num++;
        }
        int result = (fraction.charAt(1-1)-'0')*(fraction.charAt(10-1)-'0')*(fraction.charAt(100-1)-'0')
        *(fraction.charAt(1000-1)-'0')*(fraction.charAt(10000-1)-'0')*(fraction.charAt(100000-1)-'0')*(fraction.charAt(1000000-1)-'0');
        System.out.println(result);
    }
}

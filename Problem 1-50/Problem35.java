//Julia Zhu
//June 11, 2018

public class Problem35 {
    public static void main(String[] args) {
        int count = 13;
        outer:
        for (int i=100; i<1000000; i++) {
            if (!(prime(i)))
                continue outer;
            else {
                //ArrayList<Integer> digits = new ArrayList<Integer>();
                String num = Integer.toString(i);
                inner:
                for (int j=1; j<num.length(); j++) {
                    StringBuffer rotation = new StringBuffer();
                    for (int x=j; x<num.length(); x++) {
                        rotation.append(Character.toString(num.charAt(x)));
                    }
                    for (int y=0; y<j; y++) {
                        rotation.append(Character.toString(num.charAt(y)));
                    }
                    if (!(prime(Integer.parseInt(rotation.toString()))))
                        continue outer;
                }
            }
            count++;
        }
        System.out.println(count);
    }

    public static boolean prime (int n) {
        if (n%2 == 0)
            return false;
        for (int i=3; i*i<=n; i+=2) {
            if (n%i == 0)
                return false;
        }
        return true;
    }
}

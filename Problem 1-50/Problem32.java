//Julia Zhu
//June 10, 2018

import java.util.*;

public class Problem32 {
    public static void main(String[] args) {
        //store all products in an arraylist
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i=1; i<1000; i++) {
            for (int j=i+1; j<10000; j++) {
                int prod = i*j;
                StringBuffer nums = new StringBuffer(Integer.toString(prod));
                nums.append(Integer.toString(i));
                nums.append(Integer.toString(j));
                if (nums.length()!=9)
                    continue;
                else if (nums.indexOf("0")>0)
                    continue;
                else if (duplicate(nums))
                    continue;
                else {
                    if (!(result.contains(prod)))
                        result.add(prod);
                }
            }
        }
        //loop the arraylist to get the sum of all products
        int sum = 0;
        for (int i=0; i<result.size(); i++) {
            sum += result.get(i);
            System.out.println(result.get(i));
        }
        System.out.println(sum);
    }

    //check if there are duplicate numbers
    public static boolean duplicate(StringBuffer sb) {
        for (int i=0; i<8; i++) {
            for (int j=i+1; j<9; j++) {
                if(sb.charAt(i) == sb.charAt(j))
                    return true;
            }
        }
        return false;
    }
}

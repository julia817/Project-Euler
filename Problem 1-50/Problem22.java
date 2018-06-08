//Julia zhu
//May 31, 2018
import java.io.*;
import java.util.Arrays;

public class Problem22 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("./Problem22_names.txt"));
        String input = "";
        String line = reader.readLine();
        while (line != null) {
            input = input.concat(line);
            line = reader.readLine();
        }
        String[] list = input.split(",");

        Arrays.sort(list);

        int sum = 0;
        for (int i=0; i<list.length; i++) {
            int score = 0;
            for (int j=1; j<list[i].length()-1; j++) {
                score += (list[i].charAt(j)-'A'+1);
                if (i==937)
                    System.out.println(list[i].charAt(j));
            }
            score *= (i+1);
            sum += score;

        }
        System.out.println(sum);
    }
}

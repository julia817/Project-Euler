//Julia Zhu
//May 14, 2018

import java.io.*;

public class Problem11 {
    public static void main(String[] args) throws IOException {
        //store numbers in a 2D array
        int[][] grid = new int[20][20];
        BufferedReader reader = new BufferedReader(new FileReader("./Problem11.txt"));
        String line = reader.readLine();
        int linecount = 0;
        while (line != null) {
            String[] s = line.split(" ");
            for(int i=0; i<20; i++) {
                grid[linecount][i] = Integer.parseInt(s[i]);
            }
            linecount++;
            line = reader.readLine();
        }

        int prod = 1;
        //horizontal
        for (int i=0; i<20; i++) {
            for (int j=0; j<=16; j++) {
                int hori = grid[i][j]*grid[i][j+1]*grid[i][j+2]*grid[i][j+3];
                if (hori>prod)
                    prod = hori;
            }
        }
        //vertical
        for (int i=0; i<=16; i++) {
            for (int j=0; j<20; j++) {
                int ver = grid[i][j]*grid[i+1][j]*grid[i+2][j]*grid[i+3][j];
                if(ver>prod)
                    prod = ver;
            }
        }
        //diagonal (upper left to lower right)
        for(int i=0; i<=16; i++) {
            for (int j=0; j<=16; j++) {
                int diag = grid[i][j]*grid[i+1][j+1]*grid[i+2][j+2]*grid[i+3][j+3];
                if (diag>prod)
                    prod = diag;
            }
        }
        //diagonal (upper right to lower left)
        for (int i=0; i<=16; i++) {
            for (int j=3; j<20; j++) {
                int diag2 = grid[i][j]*grid[i+1][j-1]*grid[i+2][j-2]*grid[i+3][j-3];
                if (diag2>prod)
                    prod = diag2;
            }
        }
        System.out.println(prod);
    }
}

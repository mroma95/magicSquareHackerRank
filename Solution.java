package magicSquare;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        int [][] magic={{8, 1, 6, 3, 5, 7, 4, 9, 2},
                        {6, 1, 8, 7, 5, 3, 2, 9, 4},
                        {8, 3, 4, 1, 5, 9, 6, 7, 2},
                        {6, 7, 2, 1, 5, 9, 8, 3, 4},
                        {4, 9, 2, 3, 5, 7, 8, 1, 6},
                        {2, 9, 4, 7, 5, 3, 6, 1, 8},
                        {2, 7, 6, 9, 5, 1, 4, 3, 8},
                        {4, 3, 8, 9, 5, 1, 2, 7, 6}};
        int[] s_1D=new int[9];
        int min=Integer.MAX_VALUE;
        int index=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                s_1D[index++]=s[i][j];
            }
        }
        for (int i = 0; i < magic.length; i++) {
            int x=0;
            for (int j = 0; j < s_1D.length; j++) {
                x+=Math.abs(s_1D[j]-magic[i][j]);
            }
            if(x<min)min=x;
        }

        return min;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        System.out.println(result);

        scanner.close();
    }
}

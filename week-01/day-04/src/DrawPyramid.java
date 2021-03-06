import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfLines = input.nextInt();
        int maxWidth = numberOfLines * 2;
        int centerOfPyramid = maxWidth / 2;
        // Loop starts adding * from center of every line.
        for (int i = 0; i <= numberOfLines - 1; i++) {
            String line = "";
            for (int j = 0; j <= maxWidth; j++) {
                if ( j < centerOfPyramid - i || j > centerOfPyramid + i) {
                    line += " ";

                } else {
                    line += "*";

                }
            }
            System.out.println(line);
        }
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was
    }
}

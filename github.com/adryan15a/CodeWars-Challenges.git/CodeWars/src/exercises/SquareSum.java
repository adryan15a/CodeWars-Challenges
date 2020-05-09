package exercises;

public class SquareSum {

	/*
    Complete the square sum function so that it squares each number passed into it and then sums the results together.
    For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
    */

    public static int squareSum(int[] n) {
        double result = 0;
        for (int i = 0; i < n.length; i++) {
            result += Math.pow((double) n[i], 2.0);
        }
        return (int) result;
    }
}

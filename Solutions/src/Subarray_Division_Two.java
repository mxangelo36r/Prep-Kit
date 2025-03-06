import java.util.List;

public class Subarray_Division_Two {

    /**
     * Problem Statement: Chocolate Sharing
     *
     * Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
     *
     * Lily decides to share a contiguous segment of the bar selected such that:
     *
     * 1. The length of the segment matches Ron's birth month.
     * 2. The sum of the integers on the squares is equal to his birth day.
     *
     * Determine how many ways she can divide the chocolate.
     *
     * Input:
     * - An array of integers representing the numbers on the chocolate squares.
     * - An integer representing Ron's birth day.
     * - An integer representing Ron's birth month.
     *
     * Output:
     * - Return the number of ways Lily can divide the chocolate to satisfy the conditions.
     *
     * Example:
     * Suppose the chocolate bar is represented by the array [2, 2, 1, 3, 2],
     * Ron's birth day is 4, and his birth month is 2.
     *
     * The possible segments are:
     * - [2, 2] -> Sum is 4, length is 2
     * - [1, 3] -> Sum is 4, length is 2
     *
     * There are 2 ways to divide the chocolate.
     */

    // Solution

    public static int birthday(List<Integer> s, int d, int m) {
        // Variable that tracks the count of shareable pieces
        int count = 0;

        // Sliding window approach:
        // We iterate over the list 's' to find all contiguous segments of length 'm'.
        // For each segment, we calculate the sum of its elements and check if it equals 'd'.
        // If it does, we increment the count.

        // The loop runs from the start of the list to the point where a full segment of length 'm' can still be formed.
        // This is why the loop condition is 'i <= s.size() - m'.
        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0; // Initialize the sum for the current segment

            // Inner loop to calculate the sum of the current segment of length 'm'
            for (int j = i; j < i + m; j++) {
                sum += s.get(j); // Add each element in the segment to the sum
            }

            // Check if the calculated sum equals Ron's birth day 'd'
            if (sum == d) {
                count++; // If it does, increment the count of valid segments
            }
        }

        // Return the total count of valid segments found
        return count;
    }
}

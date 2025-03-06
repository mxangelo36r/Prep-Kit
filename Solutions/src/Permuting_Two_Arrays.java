import java.util.Collections;
import java.util.List;

public class Permuting_Two_Arrays {

    /**
     * Problem Statement: Permuting Two Array
     * You are given two arrays of integers, A and B, each of size n, and an integer k.
     * Your task is to determine if there exists a permutation of the arrays such that
     * for every index i (0 ≤ i < n), the sum of the elements at that index in the two
     * arrays is at least k. In other words, you need to check if there is a permutation
     * such that:
     *
     * A'[i] + B'[i] >= k
     *
     * for all i, where A' and B' are permutations of A and B, respectively.
     *
     * Input:
     * - Two integer arrays A and B, each of size n.
     * - An integer k.
     *
     * Output:
     * - Return "YES" if such a permutation exists, otherwise return "NO".
     *
     * Example:
     * Input: A = [1, 2, 3], B = [7, 8, 9], k = 10
     * Output: "YES"
     *
     * Explanation:
     * After sorting, A becomes [1, 2, 3] and B becomes [9, 8, 7].
     * The sums are:
     * - 1 + 9 = 10
     * - 2 + 8 = 10
     * - 3 + 7 = 10
     * Since all sums are at least k, the output is "YES".
     */

    // Solution:

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {

        // Variable that tracks the output
        String result = "YES";
        // Sorts A, as well as B in reverse to compare against each other in opposite directions
        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());

        for (int i = 0; i < A.size(); i++) {

            if (A.get(i) + B.get(i) < k) { // Comparing the sum of A[i] and B[i] against k - if not satisified then returns "NO"

                result = "NO";
            }
        }

        return result;
    }
}

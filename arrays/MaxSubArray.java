public class MaxSubArray {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int maxSumIncluding = 0;
        int maxSumTotal = 0;
        int maxSum = 0;
        for (Integer val : A) {
            maxSumIncluding = maxSumIncluding + val;
            maxSumTotal = Math.max(maxSumIncluding, val);
            maxSum = Math.max(maxSumTotal, maxSum);
        }
        return maxSum;
    }
}

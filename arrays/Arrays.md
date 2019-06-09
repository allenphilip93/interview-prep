
# Arrays Problems

## Questions <a name="questions"></a>
| # | Title | Description | Solution |
|---| ----- | -------- | ------- |
| 1 | Spiral Matrix | Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order. | [Java](#spiral-matrix) |
| 2 | Max Sum Contiguous Subarray | Find the contiguous subarray within an array (containing at least one number) which has the largest sum. | [Java](#max-sum-cont-array) |
| 3 | Min Steps in Infinite Grid | You are in an infinite 2D grid where you can move in any of the 8 directions. You are given a sequence of points and  **the order in which you need to cover the points**. Give the minimum number of steps in which you can achieve it. You start from the first point. | [Java](#minsteps-infinite-grid) |
| 4 | Add One To Number | Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ). The digits are stored such that the most significant digit is at the head of the list. | [Java](#add-one-to-number) |
| 5 | Max Non Negative SubArray | Find out the maximum sub-array of non negative numbers from an array. The sub-array should be continuous. That is, a sub-array created by choosing the second and fourth element and skipping the third element is invalid. Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B). | [Java](#max-nonneg-subarray) |
| 6 | Spiral Matrix II | Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order. | [Java](#spiral-matrix-2) |
| 7 | Pascal Triangle | Given numRows, generate the first numRows of Pascal’s triangle. Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1. | [Java](#pascal-triangle) |
| 8 | Noble Number | Given an integer array, find if an integer p exists in the array such that the number of integers greater than p in the array equals to p. If such an integer is found return 1 else return -1. | [Java](#noble-number) |
| 9 | Largest Number | Given a list of non negative integers, arrange them such that they form the largest number. | [Java](#largest-number) |
| 10 | Wave Array | Given an array of integers, sort the array into a wave like array and return it, In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5..... | [Java](#wave-array) |
| 11 | Max Distance | Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <= A[j]. If there is no solution possible, return -1. | [Java](#max-distance) |
| 12 | Find Duplicates in Array | Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times. | [Java](#find-duplicates-array) |

## Solutions
<a name="spiral-matrix"></a>
**Spiral Matrix** [Back](#questions) <br>
```java
public class SpiralOrder {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> res = new ArrayList<>();
        // final int X_max = A.get(0).size();
        // final int Y_max = A.size();
    
        // Set/Update the starting points
        int x = 0, y = 0;
        // Set/Update the ending points
        int X = A.get(0).size(), Y = A.size();
        
        while (x < X && y < Y) {
            // Go right to last before
            for (int i = x; i < X; i++)
                res.add(A.get(y).get(i));
            y++;
            
            // Go down to last before
            for (int i = y; i < Y; i++)
                res.add(A.get(i).get(X-1));
            X--;
            
            if (x < X && y < Y) {
                // Go left to last before
                for (int i = X-1; i >= x; i--)
                    res.add(A.get(Y-1).get(i));
                Y--;
            
                // Go up to last before
                for (int i = Y-1; i >= y; i--)
                    res.add(A.get(i).get(x));
                x++;
            }
        }
        return res;
    }   
}
```
<a name="max-sum-cont-array"></a>
**Max Sum Contiguous Subarray** [Back](#questions) <br>
```java
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

```
<a name="max-sum-cont-array"></a>
**Min Steps in Infinite Grid** [Back](#questions) <br>
```java
public class MinStepsInfiniteGrid {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int numSteps = 0;
        for(int i = 1; i < X.size(); i++){
            numSteps += Math.max( Math.abs(X.get(i) - X.get(i-1)), Math.abs(Y.get(i) - Y.get(i-1)) ); 
        }
        return numSteps;
    }
}
```
<a name="add-one-to-number"></a>
**Min Steps in Infinite Grid** [Back](#questions) <br>
```java
public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int N = A.size();
        int carry = 0;
        ArrayList<Integer> result = new ArrayList<>();
        if (A.size() > 0) {
            int startIdx = 0;
            // Skip trailing zeros
            for (; startIdx < N && A.get(startIdx) == 0; startIdx++);
            // Add 1
            if (startIdx > N-1)
                result.add(1);
            for (int idx=N-1; idx >= startIdx; idx--) {
                int sum;
                if (idx == N-1)
                    sum = A.get(idx) + 1;
                else
                    sum = A.get(idx) + carry;
                carry = ((sum > 9) ? 1 : 0);
                result.add(sum%10);
            }
            if (carry == 1) {
                result.add(1);
            }
            // Reverse the result
            for (int index=0; index < result.size()/2; index++) {
                int temp = result.get(index);
                result.set(index, result.get(result.size()-1-index));
                result.set(result.size()-1-index, temp);
            }
        } else {
            result.add(1);
        }
        return result;
    }
}
```
<a name="max-nonneg-subarray"></a>
**Max Non Negative SubArray** [Back](#questions) <br>
```java
public class Solution {
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
	    long maxSum = 0;
	    long newSum = 0;
	    ArrayList<Integer> maxArray = new ArrayList<Integer>();
	    ArrayList<Integer> newArray = new ArrayList<Integer>();
	    for (Integer i : a) {
	        if (i >= 0) {
	            newSum += i;
	            newArray.add(i);
	        } else {
	            newSum = 0;
	            newArray = new ArrayList<Integer>();
	        }
	        if ((maxSum < newSum) || ((maxSum == newSum) && (newArray.size() > maxArray.size()))) {
	            maxSum = newSum;
	            maxArray = newArray;
	        }
	    }
	    return maxArray;
	}
}
```
<a name="spiral-matrix-2"></a>
**Spiral Matrix II** [Back](#questions) <br>
```java
public class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        int max = A * A;
        int val = 1;
        // Create an empty result list
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i=0; i < A; i++) {
            res.add(new ArrayList<Integer>());
            for (int j=0; j < A; j++) {
                res.get(i).add(0);
            }
        }
        // Start and end indices
        int x = 0, y = 0, X = A, Y = A;
        // Spiral traversal
        while (x < X && y < Y) {
            // go right
            for (int i = x; i < X; i++, val++) {
                res.get(y).set(i, val);
            }
            y++;
            
            // go down
            for (int i = y; i < Y; i++, val++) {
                res.get(i).set(X-1, val);
            }
            X--;
            
            if (x < X && y < Y) {
                // go left
                for (int i = X-1; i >= x; i--, val++) {
                    res.get(Y-1).set(i, val);
                }
                Y--;
                
                // go top
                for (int i = Y-1; i >= y; i--, val++) {
                    res.get(i).set(x, val);
                }
                x++;
            }
        }
        return res;
    }
}
```
<a name="pascal-triangle"></a>
**Pascal Triangle** [Back](#questions) <br>
```java
public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.get(0).add(1);
        for (int row=1; row < A; row++) {
            res.add(new ArrayList<>());
            res.get(row).add(1);
            for (int index=0; index < row-1; index++) {
                res.get(row).add(res.get(row-1).get(index) + res.get(row-1).get(index+1));
            }
            res.get(row).add(1);
        }
        return res;
    }
}
```
<a name="noble-number"></a>
**Noble Number** [Back](#questions) <br>
```java
public class Solution {
    public int solve(ArrayList<Integer> A) {
        // Total runtime: O(n log n) due to sort
        Collections.sort(A);
        
        for(int i = 0; i < A.size(); i++) {
            // Handle duplicates (only check for rightmost duplicate), skip others
            if(i < A.size() - 1 && A.get(i) == A.get(i + 1)) {
                continue;
            }
            // Check if the remaining values to the right are equal to the current value
            if(A.size() - i - 1 == A.get(i)) {
                return 1;
            }
        }
        
        return -1;
    }
}
```
<a name="largest-number"></a>
**Largest Number** [Back](#questions) <br>
```java
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> A) {
        List<String> B = new ArrayList<>();
        boolean hasNonZero = false;
        for (Integer i : A) {
            if (i != 0)
                hasNonZero = true;
            B.add(i.toString());
        }
        if (!hasNonZero)
            return "0";
        Collections.sort(B, new Comparator<String>(){ 
            // A comparison function which is used by  
            // sort() in printLargest() 
            @Override
            public int compare(String X, String Y) { 
                // first append Y at the end of X 
                String XY=X + Y; 
                  
                // then append X at the end of Y 
                String YX=Y + X; 
                  
                // Now see which of the two formed numbers  
                // is greater 
                return XY.compareTo(YX) > 0 ? -1:1; 
            } 
        });
        StringBuilder res = new StringBuilder();
        Iterator it = B.iterator();
        while(it.hasNext()) 
            res.append(it.next());
        return res.toString();
    }
}
```
<a name="wave-array"></a>
**Wave Array** [Back](#questions) <br>
```java
public class Solution {
	public ArrayList<Integer> wave(ArrayList<Integer> a) {
	    Collections.sort(a);
	    for(int i = 0; i < a.size() - 1; i = i + 2) {
	       int temp = a.get(i);
	       a.set(i, a.get(i + 1));
	       a.set(i+1, temp);
	    }
	    return a;
	}	
}
```
<a name="max-distance"></a>
**Max Distance** [Back](#questions) <br>
```java
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> A) {
        int[] Lmin = new int[A.size()];
        int[] Rmax = new int[A.size()];
        int min = A.get(0);
        for (int index = 0; index < A.size(); index++) {
            min = Math.min(A.get(index), min);
            Lmin[index] = min;
        }
        int max = A.get(A.size()-1);
        for (int index = A.size()-1; index >= 0; index--) {
            max = Math.max(A.get(index), max);
            Rmax[index] = max;
        }
        
        /* Traverse both arrays from left to right to find optimum j - i 
           This process is similar to merge() of MergeSort */
        int left = 0, right = 0, maxDiff = 0; 
        while (left < A.size() && right < A.size()) { 
            if (Lmin[left] <= Rmax[right]) { 
                maxDiff = Math.max(maxDiff, right - left); 
                right = right + 1; 
            } else {
                left = left + 1; 
            }
        } 
  
        return maxDiff; 
    }
}
```
<a name="find-duplicates-array"></a>
**Find Duplicates in Array** [Back](#questions) <br>
```java
public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i < a.size(); i++) {
            if (set.contains(a.get(i))) {
                return i;
            } else {
                set.add(a.get(i));
            }
        }
        return -1;
    }
}
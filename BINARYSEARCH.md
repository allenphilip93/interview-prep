# Binary Search Problems

## Questions <a name="questions"></a>
| # | Title | Description | Solution |
|---| ----- | -------- | ------- |
| 1 | Square root of integer | Implement int sqrt(int x). Compute and return the square root of x. If x is not a perfect square, return floor(sqrt(x)) | [Java](#ques-1) |
| 2 | Painter's Partition Problem | You have to paint N boards of length {A0, A1, A2, A3 … AN-1}. There are K painters available and you are also given how much time a painter takes to paint 1 unit of board. You have to get this job done as soon as possible under the constraints that any painter will only paint contiguous sections of board. | [Java](#ques-2) |
| 3 | Matrix Search | Write an efficient algorithm that searches for a value in an m x n matrix. | [Java](#ques-3) |
| 4 | Implement Power Function | Implement pow(x, n) % d. In other words, given x, n and d, find (x^n % d) | [Java](#ques-4) |
| 5 | Rotated Array Search | Suppose a sorted array is rotated at some pivot unknown to you beforehand. You are given a target value to search. If found in the array, return its index, otherwise return -1. | [Java](#ques-5) |
| 6 | Median of array | There are two sorted arrays A and B of size m and n respectively. Find the median of the two sorted arrays ( The median of the array formed by merging both the arrays ).The overall run time complexity should be O(log (m+n)). | [Java](#ques-6) |
| 7 |  |  | [Java](#ques-7) |
| 8 |  |  | [Java](#ques-8) |
| 9 |  |  | [Java](#ques-9) |

## Solutions
<a name="ques-1"></a>
**Square root of integer** [Back](#questions) <br>
```java
public class Solution {
	public int sqrt(int a) {
	    long low = 1;
	    long high = a;
	    while (low<=high) {
	        long mid = (high + low) / 2;
	        if (mid*mid == a) {
	            return (int) mid;
	        }
	        if (mid*mid > a) {
	            high = mid - 1;
	        } else {
	            low = mid + 1;
	        }
	    }
	    // if we did not find an exact match the high variable is smaller than low
	    // and therefore contains the floor value of sqrt.
	    return (int) high;
	}
}
```
<a name="ques-2"></a>
**Painter's Partition Problem** [Back](#questions) <br>
```java
public class Solution {
    public int paint(int A, int B, ArrayList<Integer> C) {
        long total = 0, max = Long.MIN_VALUE;
        for(Integer c : C){
            total += c;
            max = Math.max(max,c);
        }
        long l = max, h = total;
        while(l<h){
            long mid = (l + (h-l)/2);
            long reqPainters = getRequiredPainters(C,mid);
            if(reqPainters <= A) h = mid;
            else l = mid + 1;
        }
        long ans = ((l%10000003)*(B%10000003))%10000003;
        return (int)ans;
    }
    public long getRequiredPainters(ArrayList<Integer> A , long k){
        long total = 0, reqPainters = 1;
        for(Integer a : A){
            total += a;
            if(total > k){
                total = a;
                reqPainters++;
            }
        }
        return reqPainters;
    }
}
```
<a name="ques-3"></a>
**Matrix Search** [Back](#questions) <br>
```java
public class Solution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
        int N = a.size() * a.get(0).size();
        int rows = a.size();
        int cols = a.get(0).size();
        int start = 0, end = N-1;
        while (start <= end) {
            int mid = (start + end)/2;
            int row = mid / cols;
            int col = mid % cols;
            // System.out.println("MID : " + mid + " VAL : " + a.get(row).get(col) + " TARGET " + b);
            if (a.get(row).get(col) == b) {
                return 1;
            } else if (a.get(row).get(col) < b) { 
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            // System.out.println("START : " + start + " | " + "END : " + end);
        }
        return 0;
    }
}
```
<a name="ques-4"></a>
**Implement Power Function** [Back](#questions) <br>
```java
public class Solution {
    public int pow(int x, int n, int d) {
        int power = 1;
        int val = 1;
        int temp = x % d;
        while (n > 0) {
            if ((power + power) <= n) {
                power = power + power;
                temp = ( ((temp)%d) * ((temp)%d) ) % d;
            } else {
                n = n - power;
                val = ( ((val)%d) * ((temp)%d) ) % d;
                power = 1;
                temp = x % d;
            }
        }
        return (val+d) % d;
    }
}
```
<a name="ques-5"></a>
**Rotated Array Search** [Back](#questions) <br>
```java
```
<a name="ques-6"></a>
**Median of array** [Back](#questions) <br>
```java
public class Solution {
    public double findMedianSortedArrays(final List<Integer> A, final List<Integer> B) {
	    int len = A.size() + B.size();
	    if(len % 2 == 1) return findKth(A, 0, B, 0, len / 2 + 1);
	    else return (findKth(A, 0, B, 0, len / 2) + findKth(A, 0, B, 0, len / 2 + 1)) / 2.0;
	}
	
	public int findKth(List<Integer> A, int A_start, List<Integer> B, int B_start, int k){
	    if(A_start >= A.size()) return B.get(B_start + k - 1);
	    if(B_start >= B.size()) return A.get(A_start + k - 1);
	    if(k == 1) return Math.min(A.get(A_start), B.get(B_start));
	    
	    int A_key = A_start + k / 2 - 1 < A.size() ? A.get(A_start + k / 2 - 1) : Integer.MAX_VALUE;
	    int B_key = B_start + k / 2 - 1 < B.size() ? B.get(B_start + k / 2 - 1) : Integer.MAX_VALUE;
	    
	    if(A_key < B_key){
	        return findKth(A, A_start + k / 2, B, B_start, k - k / 2);
	    }
	    else
	       return findKth(A, A_start, B, B_start + k / 2, k - k / 2);
	}
}
```
<a name="ques-7"></a>
** ** [Back](#questions) <br>
```java
```
<a name="ques-8"></a>
** ** [Back](#questions) <br>
```java
```
<a name="ques-9"></a>
** ** [Back](#questions) <br>
```java
```
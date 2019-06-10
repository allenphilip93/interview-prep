# Interview Programming Questions

Solutions to the common DSA problems in Java

## Programming
* [Bit Manipulation](https://github.com/architsingla13/InterviewBit-Solutions#bitmanipulation)
* [Array](https://github.com/architsingla13/InterviewBit-Solutions#array)
* [String](https://github.com/architsingla13/InterviewBit-Solutions#string)
* [Linked List](https://github.com/architsingla13/InterviewBit-Solutions#linkedlist)
* [Stack](https://github.com/architsingla13/InterviewBit-Solutions#stack)
* [Queue](https://github.com/architsingla13/InterviewBit-Solutions#queue)
* [Heap](https://github.com/architsingla13/InterviewBit-Solutions#heaps)
* [Trees](https://github.com/architsingla13/InterviewBit-Solutions#trees)
* [Hash Map](https://github.com/architsingla13/InterviewBit-Solutions#hashmap)
* [Hashing](https://github.com/architsingla13/InterviewBit-Solutions#hashing)
* [Math](https://github.com/architsingla13/InterviewBit-Solutions#math)
* [Two Pointers](https://github.com/architsingla13/InterviewBit-Solutions#twopointers)
* Sort
* Recursion
* [Binary Search](https://github.com/architsingla13/InterviewBit-Solutions#binarysearch)
* Binary Search Tree
* Breadth-First Search
* Depth-First Search
* [Backtracking](https://github.com/architsingla13/InterviewBit-Solutions#backtracking)
* Dynamic Programming
* Greedy
* Graph
* Geometry
* Simulation
* Design

<a name="array"></a>
## Arrays


|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Spiral Array](https://www.interviewbit.com/problems/spiral-order-matrix-i/)      | [Java](#ques-1)  | _O(n*m)_         | _O(1)_          | Easy         |  |
|2| [Min Steps](https://www.interviewbit.com/problems/min-steps-in-infinite-grid/) You are in an infinite 2D grid where you can move in any of the 8 directions. You are given a sequence of points and  **the order in which you need to cover the points**. Give the minimum number of steps in which you can achieve it. You start from the first point.     | [Java](#ques-2)  | _O(n)_         | _O(1)_          | Easy         |  |
|3| [Add One to Number](https://www.interviewbit.com/problems/add-one-to-number/) Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ). The digits are stored such that the most significant digit is at the head of the list.     | [Java](#ques-3)  | _O(n)_         | _O(1)_          | Easy         |  |
|4| [Max Sum Contiguous Subarray](https://www.interviewbit.com/problems/max-sum-contiguous-subarray/)      | [Java](#ques-4)  | _O(n)_         | _O(1)_          | Medium         | Kadane's Algo :- previous MSS should be positive for optimal subarray|
|5| [Maximum Absolute Difference](https://www.interviewbit.com/problems/maximum-absolute-difference/)      | [Java](#ques-5)  | _O(n)_         | _O(1)_          | Medium         | Carefully look the given exp and how it can be written down|
|6| [Repeat and Missing Number Array](https://www.interviewbit.com/problems/repeat-and-missing-number-array/)      | [Java](#ques-6)  | _O(n)_         | _O(1)_          | Medium         | Look for overflows and equations|
|7| [Flip](https://www.interviewbit.com/problems/flip/)      | [Java](#ques-7)  | _O(n)_         | _O(1)_          | Medium         | |
|7| [Max Non Negative SubArray](https://www.interviewbit.com/problems/max-non-negative-subarray/) Find out the maximum sub-array of non negative numbers from an array. The sub-array should be continuous. That is, a sub-array created by choosing the second and fourth element and skipping the third element is invalid. Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).     | [Java](#ques-8)  | _O(n)_         | _O(1)_          | Easy         | Check for overflows and tie constraints properly|
|8| [Spiral Order Matrix II](https://www.interviewbit.com/problems/spiral-order-matrix-ii/) Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.     | [Java](#ques-9)  | _O(n*n)_         | _O(n*n)_          | Easy         | |
|9| [Pascal Triangle](https://www.interviewbit.com/problems/pascal-triangle/) Given numRows, generate the first numRows of Pascal’s triangle. Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.     | [Java](#ques-10)  | _O(n*n)_         | _O(n*n)_          | Easy         | |
|10| [Kth Row of Pascal's Triangle](https://www.interviewbit.com/problems/kth-row-of-pascals-triangle/)      | [Java](#ques-11)  | _O(n*n)_         | _O(n)_          | Easy         | Think in terms of if previous calculated list is needed or not |
|11| [Anti Diagonals](https://www.interviewbit.com/problems/anti-diagonals/)      | [Java](#ques-12)  | _O(n)_         | _O(1)_          | Easy         |  |
|12| [Noble Integer](https://www.interviewbit.com/problems/noble-integer/) Given an integer array, find if an integer p exists in the array such that the number of integers greater than p in the array equals to p. If such an integer is found return 1 else return -1.     | [Java](#ques-13)  | _O(nlogn)_         | _O(1)_          | Easy         |  |
|13| [Triplets with Sum between given range](https://www.interviewbit.com/problems/triplets-with-sum-between-given-range/)      | [Java](#ques-14)  | _O(n)_         | _O(1)_          | Medium         | Bookmarked |
|14| [Largest Number](https://www.interviewbit.com/problems/largest-number/) Given a list of non negative integers, arrange them such that they form the largest number.     | [Java](#ques-15)  | _O(n)_         | _O(n)_          | Medium         | Comparator |
|15| [Wave Array](https://www.interviewbit.com/problems/wave-array/) Given an array of integers, sort the array into a wave like array and return it, In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....     | [Java](#ques-16)  | _O(nlogn)_         | _O(1)_          | Easy         |  |
|16| [Hotel Bookings Possible](https://www.interviewbit.com/problems/hotel-bookings-possible/)      | [Java](#ques-17)  | _O(nlogn)_         | _O(1)_          | Medium         |  Bookmarked|
|17| [Find Duplicate in Array](https://www.interviewbit.com/problems/find-duplicate-in-array/) Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.    | [Java](#ques-18)  | _O(n)_         | _O(1)_          | Easy         |  |
|18| [Max Distance](https://www.interviewbit.com/problems/max-distance/) Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <= A[j]. If there is no solution possible, return -1.     | [Java](#ques-19)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked|
|19| [Min Unsorted Subarray](https://www.interviewbit.com/problems/maximum-unsorted-subarray/)      | [Java](#ques-20)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked|
|20| [Maximum Consecutive Gap](https://www.interviewbit.com/problems/maximum-consecutive-gap/)      | [Java](#ques-21)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked, PigeonHole Sorting using bucket method|
|21| [Rotate Matrix](https://www.interviewbit.com/problems/rotate-matrix/)      | [Java](#ques-22)  | _O(n*n)_         | _O(1)_          | Medium         |  Good Question|
|22| [MAXSPPROD](https://www.interviewbit.com/problems/maxspprod/) You are given an array A containing N integers. The special product of each ith integer in this array is defined as the product of the following: LeftSpecialValue: For an index i, it is defined as the index j such that A[j]>A[i](i>j). If multiple A[j]’s are present in multiple positions, the LeftSpecialValue is the maximum value of j. RightSpecialValue: For an index i, it is defined as the index j such that A[j]>A[i](j>i). If multiple A[j]s are present in multiple positions, the RightSpecialValue is the minimum value of j. Write a program to find the maximum special product of any integer in the array.     | [Java](#ques-23)  | _O(n)_         | _O(n)_          | Medium         |  Good Question|
|23| [Next Permutation](https://www.interviewbit.com/problems/next-permutation/)      | [Java](#ques-24)  | _O(nlogn)_(only if already highest perm, else O(n + logn))         | _O(1)_          | Medium         |  Good Question, Analyse diff examples, Bookmarked|
|24| [Find Permutation](https://www.interviewbit.com/problems/find-permutation/)      | [Java](#ques-25)  | _O(n)_         | _O(1)_          | Medium         |  Good Question, Bookmarked|
|25| [Set Matrix Zeros](https://www.interviewbit.com/problems/set-matrix-zeros/) Given an m x n matrix of 0s and 1s, if an element is 0, set its entire row and column to 0. Do it in place.     | [Java](#ques-26)  | _O(n*m)_         | _O(1)_          | Medium         |  Good Question|
|26| [First Missing Integer](https://www.interviewbit.com/problems/first-missing-integer/)      | [Java](#ques-27)  | _O(n)_         | _O(1)_          | Medium         |  Good Question, Bookmarked|
|27| [Merge Overlapping Intervals](https://www.interviewbit.com/problems/merge-overlapping-intervals/)      | [Java](#ques-28)  | _O(nlogn)_         | _O(1)_          | Medium         |  Good Question, Bookmarked|
|28| [Merge Intervals](https://www.interviewbit.com/problems/merge-intervals/) Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).     | [Java](#ques-29)  | _O(n)_         | _O(1)_          | Medium         |  Good Question, Good Edge Cases|
|29| [N/3 Repeat Number](https://www.interviewbit.com/problems/n3-repeat-number/)      | [Java](#ques-30)  | _O(n)_         | _O(1)_          | Medium         |  Good Question, Moore's Voting Algo|

<a name="maths"></a>
## Math


|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [All Factors](https://www.interviewbit.com/problems/all-factors/)      | [Java](#ques-31)  | _O(sqrt(n))_         | _O(1)_          | Easy         | Keep notice of edge cases - like i^2 = A |
|2| [Binary Representation](https://www.interviewbit.com/problems/binary-representation/)      | [Java](#ques-32)  | _O(log(n))_         | _O(1)_          | Easy         |  |
|3| [Prime](https://www.interviewbit.com/problems/prime-numbers/)      | [Java](#ques-33)  | _O(sqrt(N)loglog(n))_         | _O(1)_          | Easy         | Sieve of Eratosthenes |
|4| [Verify Prime](https://www.interviewbit.com/problems/verify-prime/)      | [Java](#ques-34)  | _O(sqrt(N))_         | _O(1)_          | Easy         |  |
|5| [Prime Sum](https://www.interviewbit.com/problems/prime-sum/)      | [Java](#ques-35)  | _O(sqrt(N)loglog(n) + N)_         | _O(1)_          | Easy         |  |
|6| [Sum of pairwise Hamming Distance](https://www.interviewbit.com/problems/sum-of-pairwise-hamming-distance/)      | [Java](#ques-36)  | _O(N)_         | _O(1)_          | Medium         | Good idea on how to use mod for large test cases, and good solution |
|7| [FizzBuzz](https://www.interviewbit.com/problems/fizzbuzz/)      | [Java](#ques-37)  | _O(N)_         | _O(1)_          | Easy         |  |
|8| [Power Of Two Integers](https://www.interviewbit.com/problems/power-of-two-integers/)      | [Java](#ques-38)  | _O(sqrt(N)*log(N))_         | _O(1)_          | Easy         | Think easy solution |
|9| [Excel Column Number](https://www.interviewbit.com/problems/excel-column-number/)      | [Java](#ques-39)  | _O(N)_         | _O(1)_          | Easy         | |
|10| [Excel Column Title](https://www.interviewbit.com/problems/excel-column-title/)      | [Java](#ques-40)  | _O(logn)_         | _O(1)_          | Easy         | Good Question|
|11| [Palindrome Integer](https://www.interviewbit.com/problems/palindrome-integer/)      | [Java](#ques-41)  | _O(number of digits)_         | _O(1)_          | Easy         | |
|12| [Reverse Integer](https://www.interviewbit.com/problems/reverse-integer/)      | [Java](#ques-42)  | _O(number of digits)_         | _O(1)_          | Easy         | |
|13| [GCD](https://www.interviewbit.com/problems/greatest-common-divisor/)      | [Java](#ques-43)  | _O(log(min a,b))_         | _O(1)_          | Easy         | Eucledian Algo, Good Question|
|14| [Trailing Zeroes](https://www.interviewbit.com/problems/trailing-zeros-in-factorial/)      | [Java](#ques-44)  | _O((A)^1/5)_         | _O(1)_          | Easy         | Good Question|
|15| [Sorted Permutation Rank](https://www.interviewbit.com/problems/sorted-permutation-rank/)      | [Java](#ques-45)  | _O(A^2)_         | _O(1)_          | Medium         | Good Question, Consider usage of factorial in case of modulo|
|16| [Largest Coprime Divisor](https://www.interviewbit.com/problems/largest-coprime-divisor/)      | [Java](#ques-46)  | _O(A^2)_         | _O(1)_          | Medium         | Bookmarked|
|17| [Sorted Permutation Rank with Repeats](https://www.interviewbit.com/problems/sorted-permutation-rank-with-repeats/)      | [Java](#ques-47)  | _O(A^2)_         | _O(1)_          | Medium         | Bookmarked, Multiplicative Inverse Modulo(use long in case of modulo) |
|18| [ReArrange Array](https://www.interviewbit.com/problems/rearrange-array/)      | [Java](#ques-48)  | _O(A)_         | _O(1)_          | Medium         | Bookmarked, Encoding 2 values in one |
|19| [Grid Unique Paths](https://www.interviewbit.com/problems/grid-unique-paths/)      | [Java](#ques-49)  | _O(min(row,col))_         | _O(1)_          | Easy         | Bookmarked, DP or Combinatorial |
|20| [Numbers of length N and value less than K](https://www.interviewbit.com/problems/numbers-of-length-n-and-value-less-than-k/)      | [Java](#ques-50)  | _O(B)_         | _O(1)_          | Medium         | Bookmarked |

<a name="binarysearch"></a>
## BinarySearch


|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [SQRT](https://www.interviewbit.com/problems/square-root-of-integer/)      | [Java](#ques-51)  | _O(log(n))_         | _O(1)_          | Easy         | Keep check for out of range in case of Multiplication else use division  |
|2| [Count Element Occurence](https://www.interviewbit.com/problems/count-element-occurence/)      | [Java](#ques-52)  | _O(log(n))_         | _O(1)_          | Easy         |   |
|3| [Rotated Array](https://www.interviewbit.com/problems/rotated-array/)      | [Java](#ques-53)  | _O(log(n))_         | _O(1)_          | Easy         |  Bookmarked |
|4| [Matrix Median](https://www.interviewbit.com/problems/matrix-median/)      | [Java](#ques-54)  | _O(log(2^32)*r*log(c))_ = O(32 * r * log(c))         | _O(1)_          | Medium         |  Bookmarked |
|5| [Matrix Search](https://www.interviewbit.com/problems/matrix-search/)      | [Java](#ques-55)  | _O(log(rc))_ = O(log(r) + log(c))         | _O(1)_          | Easy         |  Bookmarked |
|6| [Sorted Insert Position](https://www.interviewbit.com/problems/sorted-insert-position/)      | [Java](#ques-56)  | _O(log(n))_          | _O(1)_          | Easy         |   |
|7| [Implement Power Function](https://www.interviewbit.com/problems/implement-power-function/)      | [Java](#ques-57)  | _O(log(power))_          | _O(1)_          | Easy         |  Handle Negative value carefully, Bookmarked |
|8| [Rotated Sorted Array Search](https://www.interviewbit.com/problems/rotated-sorted-array-search/)      | [Java](#ques-58)  | _O(log(n))_          | _O(1)_          | Easy         |   |
|9| [Search for a Range](https://www.interviewbit.com/problems/search-for-a-range/)      | [Java](#ques-59)  | _O(log(n))_          | _O(1)_          | Easy         |   |
|10| [Painter's Partition Problem](https://www.interviewbit.com/problems/painters-partition-problem/)      | [Java](#ques-60)  | _O(Nlog(sum(array)))_          | _O(1)_          | Medium         | Bookmarked, Example to use BS in monotonic functions   |
|11| [Allocate Books](https://www.interviewbit.com/problems/allocate-books/)      | [Java](#ques-61)  | _O(Nlog(sum(array)))_          | _O(1)_          | Medium         | Bookmarked, Example to use BS in monotonic functions   |
|12| [Median of Array](https://www.interviewbit.com/problems/median-of-array/)      | [Java](#ques-62)  | _O(log(m+n))_          | _O(1)_          | Hard         | Bookmarked   |

<a name="strings"></a>
## String


|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Palindrome String](https://www.interviewbit.com/problems/palindrome-string/)      | [Java](#ques-63)  | _O(n)_         | _O(1)_          | Easy         |   |
|2| [Longest Common Prefix](https://www.interviewbit.com/problems/longest-common-prefix/)      | [Java](#ques-64)  | _O(n*min(String Length))_         | _O(1)_          | Easy         |   |
|3| [Count And Say](https://www.interviewbit.com/problems/count-and-say/)      | [Java](#ques-65)  | _O(n*max(String Length))_         | _O(1)_          | Easy         |   |
|4| [Minimum Characters required to make a String Palindromic](https://www.interviewbit.com/problems/minimum-characters-required-to-make-a-string-palindromic/)      | [Java](#ques-66)  | _O(n)_         | _O(1)_          | Easy         |   |
|5| [Longest Palindromic Substring](https://www.interviewbit.com/problems/longest-palindromic-substring/)      | [Java](#ques-67)  | _O(n*n)_         | _O(1)_          | Medium         |  Bookmarked, 1 length is always palindrome |
|6| [StrStr](https://www.interviewbit.com/problems/implement-strstr/)      | [Java](#ques-68)  | _O(n)_         | _O(m)_          | Medium         |  Bookmarked, KMP Algo |
|7| [Compare Version Numbers](https://www.interviewbit.com/problems/compare-version-numbers/)      | [Java](#ques-69)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked|
|8| [Atoi](https://www.interviewbit.com/problems/atoi/)      | [Java](#ques-70)  | _O(n)_         | _O(1)_          | Easy         |  Bookmarked|
|9| [Length of Last Word](https://www.interviewbit.com/problems/length-of-last-word/)      | [Java](#ques-71)  | _O(n)_         | _O(1)_          | Easy         |  |
|10| [Reverse the String](https://www.interviewbit.com/problems/reverse-the-string/)      | [Java](#ques-72)  | _O(n)_         | _O(n)_          | Easy         | Bookmarked, Ask if split function can be used|
|11| [Valid Number](https://www.interviewbit.com/problems/valid-number/)      | [Java](#ques-73)  | _O(n)_         | _O(1)_          | Easy         | Bookmarked, Lots of corner cases|
|12| [Valid Ip Addresses](https://www.interviewbit.com/problems/valid-ip-addresses/)      | [Java](#ques-74)  | _O(n)_         | _O(1)_          | Easy         | Bookmarked, Placing 3 dots|
|13| [Roman To Integer](https://www.interviewbit.com/problems/roman-to-integer/)      | [Java](#ques-75)  | _O(n)_         | _O(1)_          | Easy         | Bookmarked|
|14| [Integer To Roman](https://www.interviewbit.com/problems/integer-to-roman/)      | [Java](#ques-76)  | _O(n)_         | _O(1)_          | Easy         | Bookmarked, Ask if you can have diff arrays to store value|
|15| [Add Binary Strings](https://www.interviewbit.com/problems/add-binary-strings/)      | [Java](#ques-77)  | _O(n)_         | _O(1)_          | Easy         | Bookmarked, Shorter Solution|
|16| [Power of 2](https://www.interviewbit.com/problems/power-of-2/)      | [Java](#ques-78)  | _O(logn)_         | _O(1)_          | Easy         | Bookmarked, Use of CompareTo function|
|17| [Multiply Strings](https://www.interviewbit.com/problems/multiply-strings/)      | [Java](#ques-79)  | _O(n*m)_         | _O(1)_          | Easy         | Bookmarked|
|18| [Justified Text](https://www.interviewbit.com/problems/justified-text/)      | [Java](#ques-80)  | _O(n*n)_         | _O(n)_          | HARD         | Bookmarked, Used Greedy Approach|
|19| [ZigZag String](https://www.interviewbit.com/problems/zigzag-string/)      | [Java](#ques-81)  | _O(n)_         | _O(1)_          | Medium         | Bookmarked|
|20| [Pretty Json](https://www.interviewbit.com/problems/pretty-json/)      | [Java](#ques-82)  | _O(n)_         | _O(1)_          | Medium         | Bookmarked|
|21| [Stringoholics](https://www.interviewbit.com/problems/stringoholics/)      | [Java](#ques-83)  | _O(n*m, n*maxNum)_         | _O(n+m)_ n is input array length, m is average size of each string          | HARD         | Bookmarked, Covers many concepts - KMP, LCM|

<a name="bitmanipulation"></a>
## BitManipulation


|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Min XOR Value](https://www.interviewbit.com/problems/min-xor-value/)      | [Java](#ques-84)  | _O(nlogn)_         | _O(1)_          | Easy         | Bookmarked  |
|2| [Single Number](https://www.interviewbit.com/problems/single-number/)      | [Java](#ques-85)  | _O(n)_         | _O(1)_          | Easy         |  |
|3| [Number of 1 Bits](https://www.interviewbit.com/problems/number-of-1-bits/)      | [Java](#ques-86)  | _O(1)_         | _O(1)_          | Easy         | Bookmarked, 2nd Solution with bits trick |
|4| [Reverse Bits](https://www.interviewbit.com/problems/reverse-bits/)      | [Java](#ques-87)  | _O(1)_         | _O(1)_          | Easy         | Bookmarked, 2nd Solution |
|5| [Single Number II](https://www.interviewbit.com/problems/single-number-ii/)      | [Java](#ques-88)  | _O(n)_         | _O(1)_          | Medium         | Bookmarked, 3x+1 |
|6| [Divide Integers](https://www.interviewbit.com/problems/divide-integers/)      | [Java](#ques-89)  | _O(log(dividend))_         | _O(1)_          | Medium         | Bookmarked, 1 approach is to subtract divisor, but takes O(dividend) time |
|7| [Different Bits Sum Pairwise](https://www.interviewbit.com/problems/different-bits-sum-pairwise/)      | [Java](#ques-90)  | _O(n)_         | _O(1)_          | Medium         | Bookmarked |

<a name="twopointers"></a>
## TwoPointers


|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Merge Two Sorted Lists II](https://www.interviewbit.com/problems/merge-two-sorted-lists-ii/)      | [Java](#ques-91)  | _O(n+m)_         | _O(1)_          | Easy         |   |
|2| [Intersection Of Sorted Arrays](https://www.interviewbit.com/problems/intersection-of-sorted-arrays/)      | [Java](#ques-92)  | _O(n+m)_         | _O(1)_          | Easy         |   |
|3| [Minimize the absolute difference](https://www.interviewbit.com/problems/minimize-the-absolute-difference/)      | [Java](#ques-93)  | _O(maxArrayLength)_         | _O(1)_          | Easy         | Bookmarked, Abs diff can be minimized either decreasing max element or increasing min element  |
|4| [Remove Duplicates from Sorted Array](https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array/)      | [Java](#ques-94)  | _O(n)_         | _O(1)_          | Easy         | Bookmarked, Removing Element increases complexity, just set elements with 2nd pointer  |
|5| [Remove Duplicates from Sorted Array 2](https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array-ii/)      | [Java](#ques-95)  | _O(n)_         | _O(1)_          | Easy         | Bookmarked  |
|6| [Remove Element from Array](https://www.interviewbit.com/problems/remove-element-from-array/)      | [Java](#ques-96)  | _O(n)_         | _O(1)_          | Easy         |   |
|6| [Remove Element from Array](https://www.interviewbit.com/problems/remove-element-from-array/)      | [Java](#ques-97)  | _O(n)_         | _O(1)_          | Easy         |   |
|7| [Sort by Color](https://www.interviewbit.com/problems/sort-by-color/)      | [Java](#ques-98)  | _O(n)_         | _O(1)_          | Easy         |   |
|8| [Diffk](https://www.interviewbit.com/problems/diffk/)      | [Java](#ques-99)  | _O(n)_         | _O(1)_          | Easy         |  Bookmarked, Start both pointers from 0 and not from opp. extreme ends|
|9| [3 Sum](https://www.interviewbit.com/problems/3-sum/)      | [Java](#ques-100)  | _O(n^2 + nlogn)_         | _O(1)_          | Easy         |  Bookmarked|
|10| [3 Sum Zero](https://www.interviewbit.com/problems/3-sum-zero/)      | [Java](#ques-101)  | _O(n^2 + nlogn)_         | _O(1)_          | Medium         |  Bookmarked, Handle Duplicates|
|11| [Max Continuous Series of 1s](https://www.interviewbit.com/problems/max-continuous-series-of-1s/)      | [Java](#ques-102)  | _O(n)_         | _O(1)_          | Medium         |  Bookmarked, Keeping window size having zeroes <= B|
|12| [Array 3 Pointers](https://www.interviewbit.com/problems/array-3-pointers/)      | [Java](#ques-103)  | _O(maxArrayLength)_         | _O(1)_          | Medium         | Bookmarked, Abs diff can be minimized either decreasing max element or increasing min element   |
|13| [Counting Triangles](https://www.interviewbit.com/problems/counting-triangles/)      | [Java](#ques-104)  | _O(n^2)_         | _O(1)_          | Medium         | Bookmarked, (A+B) > C by sorting the array   |
|14| [Container With Most Water](https://www.interviewbit.com/problems/container-with-most-water/)      | [Java](#ques-105)  | _O(n)_         | _O(1)_          | Medium         | Bookmarked   |

<a name="linkedlist"></a>
## LinkedList


|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Intersection of Linked Lists](https://www.interviewbit.com/problems/intersection-of-linked-lists/)      | [Java](#ques-106)  | _O(n+m)_         | _O(1)_          | Easy         |   |
|2| [Reverse Linked List](https://www.interviewbit.com/problems/reverse-linked-list/)      | [Java](#ques-107)  | _O(n)_         | _O(1)_          | Easy         |   |
|3| [Palindrome List](https://www.interviewbit.com/problems/palindrome-list/)      | [Java](#ques-108)  | _O(n)_         | _O(n)_          | Easy         |  Use Stack or reverse half linked list |
|4| [Remove Duplicates from Sorted List](https://www.interviewbit.com/problems/remove-duplicates-from-sorted-list/)      | [Java](#ques-109)  | _O(n)_         | _O(1)_          | Easy         |   |
|5| [Remove Duplicates from Sorted List 2](https://www.interviewbit.com/problems/remove-duplicates-from-sorted-list-ii/)      | [Java](#ques-110)  | _O(n)_         | _O(1)_          | Easy         |   |
|6| [Merge Two Sorted Lists](https://www.interviewbit.com/problems/merge-two-sorted-lists/)      | [Java](#ques-111)  | _O(n)_         | _O(1)_          | Easy         |   |
|6| [Merge Two Sorted Lists](https://www.interviewbit.com/problems/merge-two-sorted-lists/)      | [Java](#ques-112)  | _O(n)_         | _O(1)_          | Easy         |   |
|7| [Remove Nth Node from List End](https://www.interviewbit.com/problems/remove-nth-node-from-list-end/)      | [Java](#ques-113)  | _O(n)_         | _O(1)_          | Easy         |   |
|8| [Rotate List](https://www.interviewbit.com/problems/rotate-list/)      | [Java](#ques-114)  | _O(n)_         | _O(1)_          | Easy         |   |
|9| [Reverse Lists 2](https://www.interviewbit.com/problems/reverse-link-list-ii/)      | [Java](#ques-115)  | _O(n)_         | _O(1)_          | Easy         |  Bookmarked |
|10| [Reorder List](https://www.interviewbit.com/problems/reorder-list/)      | [Java](#ques-116)  | _O(n)_         | _O(1)_          | Medium         |  Bookmarked, Reverse Half and merge alternate |
|11| [Swap List Nodes in pairs](https://www.interviewbit.com/problems/swap-list-nodes-in-pairs/)      | [Java](#ques-117)  | _O(n)_         | _O(1)_          | Medium         |   |
|12| [K reverse linked list](https://www.interviewbit.com/problems/k-reverse-linked-list/)      | [Java](#ques-118)  | _O(n)_         | _O(1)_          | Medium         |   |
|13| [Add Two Numbers as Lists](https://www.interviewbit.com/problems/add-two-numbers-as-lists/)      | [Java](#ques-119)  | _O(n)_         | _O(1)_          | Easy         |   |
|14| [List Cycle](https://www.interviewbit.com/problems/list-cycle/)      | [Java](#ques-120)  | _O(n)_         | _O(1)_          | Medium         |  Bookmarked |
|15| [Partition List](https://www.interviewbit.com/problems/partition-list/)      | [Java](#ques-121)  | _O(n)_         | _O(1)_          | Easy         |   |
|16| [Sort List](https://www.interviewbit.com/problems/sort-list/)      | [Java](#ques-122)  | _O(nlogn)_         | _O(1)_          | Medium         |   |

<a name="stack"></a>
## Stack


|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Simplify Directory Path](https://www.interviewbit.com/problems/simplify-directory-path/)      | [Java](#ques-123)  | _O(n)_         | _O(n)_          | Easy         |   |
|2| [Redundant Braces](https://www.interviewbit.com/problems/redundant-braces/)      | [Java](#ques-124)  | _O(n)_         | _O(n)_          | Easy         |   |
|3| [Nearest Smaller Element](https://www.interviewbit.com/problems/nearest-smaller-element/)      | [Java](#ques-125)  | _O(n)_         | _O(n)_          | Easy         |   |
|4| [Evaluate Expression](https://www.interviewbit.com/problems/evaluate-expression/)      | [Java](#ques-126)  | _O(n)_         | _O(n)_          | Easy         |   |
|5| [Min Stack](https://www.interviewbit.com/problems/min-stack/)      | [Java](#ques-127)  | _O(1)_         | _O(1)_          | Easy         |  Bookmarked, Doing Min in O(1) space is good one|
|6| [Largest Rectangle in Histogram](https://www.interviewbit.com/problems/largest-rectangle-in-histogram/)      | [Java](#ques-128)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked, Do read brute force and think in terms of stack|
|7| [Rain Water Trapped](https://www.interviewbit.com/problems/rain-water-trapped/)      | [Java](#ques-129)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked |


<a name="queue"></a>
## Queue

|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Sliding Window Maximum](https://www.interviewbit.com/problems/sliding-window-maximum/)      | [Java](#ques-130)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked, Finding Min is reverse of current logic|


<a name="backtracking"></a>
## Backtracking

|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [ReverseLinkedList](https://www.interviewbit.com/problems/reverse-link-list-recursion/)      | [Java](#ques-131)  | _O(n)_         | _O(n)_          | Easy         |  Bookmarked |
|2| [Modular Expression](https://www.interviewbit.com/problems/modular-expression/)      | [Java](#ques-132)  | _O(log(power))_         | _O(1)_          | Easy         |  Bookmarked, Modular Exponentiation |
|3| [Subset](https://www.interviewbit.com/problems/subset/)      | [Java](#ques-133)  | _O(2^n)_         | _O(n)_          | Easy         |  Bookmarked, Backtracking general algo |
|4| [Combinations](https://www.interviewbit.com/problems/combinations/)      | [Java](#ques-134)  | _O(nCk)_         | _O(n)_          | Easy         |  Bookmarked, Backtracking general algo |
|5| [Combination Sum](https://www.interviewbit.com/problems/combination-sum/)      | [Java](#ques-135)  | _O(2^n)_         | _O(targetSum)_          | Easy         |  Bookmarked, Backtracking general algo, Use Map for checking duplicates |
|6| [Combination Sum 2](https://www.interviewbit.com/problems/combination-sum-ii/)      | [Java](#ques-136)  | _O(2^n)_         | _O(targetSum)_          | Easy         |   |
|7| [SubSets 2](https://www.interviewbit.com/problems/subsets-ii/)      | [Java](#ques-137)  | _O(2^n)_         | _O(n)_          | Easy         |  Bookmarked, Either use hashmap or skip continuous elements in recursion function |
|8| [Letter Phone](https://www.interviewbit.com/problems/letter-phone/)      | [Java](#ques-138)  | _O(3^n)_         | _O(n)_          | Easy         |   |
|9| [Palindrome Partitioning](https://www.interviewbit.com/problems/palindrome-partitioning/)      | [Java](#ques-139)  | _O(2^n)_         | _O(n)_          | Easy         |  Bookmarked, can maintain 2-D array to keep true/false whether start-end is palindrome or not (DP) |
|10| [Generate all Parentheses II](https://www.interviewbit.com/problems/generate-all-parentheses-ii/)      | [Java](#ques-140)  | _O(2^n)_         | _O(2n)_          | Easy         |   |
|11| [Permutations](https://www.interviewbit.com/problems/permutations/)      | [Java](#ques-141)  | _O(n!)_         | _O(n)_          | Medium         | Bookmarked, Either use visited array or remove integer from input array then add back while backtracking  |
|12| [Gray Code](https://www.interviewbit.com/problems/gray-code/)      | [Java](#ques-142)  | _O(2^n)_         | _O(n)_          | Medium         | Bookmarked, Other Solution of using reverse of (N-1) and prefixing 1 is good  |
|13| [Kth Permutation Sequence](https://www.interviewbit.com/problems/kth-permutation-sequence/)      | [Java](#ques-143)  | _O(nk)_         | _O(n)_          | Medium         | Bookmarked, Use Maths plus recursion, first digit = k/(n-1)!+1  |
|14| [NQueens](https://www.interviewbit.com/problems/nqueens/)      | [Java](#ques-144)  | _O(n*n)_         | _O(n)_          | Medium         | Bookmarked  |


<a name="hashing"></a>
## Hashing

|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Colorful Number](https://www.interviewbit.com/problems/colorful-number/)      | [Java](#ques-145)  | _O(n*n)_         | _O(n)_          | Easy         |   |
|2| [Largest Continuous Sequence Zero Sum](https://www.interviewbit.com/problems/largest-continuous-sequence-zero-sum/)      | [Java](#ques-146)  | _O(n)_         | _O(n)_          | Easy         |  Bookmarked, 3 conditions - element 0, sum 0 or sum repeated |
|3| [2 Sum](https://www.interviewbit.com/problems/2-sum/)      | [Java](#ques-147)  | _O(n)_         | _O(1)_          | Easy         |   |
|4| [4 Sum](https://www.interviewbit.com/problems/4-sum/)      | [Java](#ques-148)  | _O(n*n+nlogn)_         | _O(n)_          | Medium         |  Bookmarked, Either use n^3 solution using 2 pointers and hashSet for unique sets or or use customised sorting plus hashSet |
|5| [Valid Sudoku](https://www.interviewbit.com/problems/valid-sudoku/)      | [Java](#ques-149)  | _O(n*n)_         | _O(n*n)_          | Medium         |  Bookmarked, check row, col and box, keep different maps |
|6| [Diffk II](https://www.interviewbit.com/problems/diffk-ii/)      | [Java](#ques-150)  | _O(n)_         | _O(n)_          | Easy         |   |
|7| [Anagrams](https://www.interviewbit.com/problems/anagrams/)      | [Java](#ques-151)  | _O(n*m)_ , where m = average length of string       | _O(n)_          | Medium         |  Bookmarked, Good Concept |
|8| [Equal](https://www.interviewbit.com/problems/equal/)      | [Java](#ques-152)  | _O(n*n)_        | _O(n)_          | Medium         |  Bookmarked |
|9| [Copy List](https://www.interviewbit.com/problems/copy-list/)      | [Java](#ques-153)  | _O(n)_        | _O(n)_          | Medium         |   |
|10| [Longest Substring Without Repeat](https://www.interviewbit.com/problems/longest-substring-without-repeat/)      | [Java](#ques-154)  | _O(n)_        | _O(n)_          | Medium         | Bookmarked  |
|11| [Window String](https://www.interviewbit.com/problems/window-string/)      | [Java](#ques-155)  | _O(n)_        | _O(n)_          | Medium         | Bookmarked, Use 2 pointers and map to keep count of characters included - plus and minus   |
|12| [Fraction](https://www.interviewbit.com/problems/fraction/)      | [Java](#ques-156)  | _O(n)_        | _O(n)_          | Medium         | Bookmarked   |
|13| [Points on the Straight Line](https://www.interviewbit.com/problems/points-on-the-straight-line/)      | [Java](#ques-157)  | _O(n*n)_        | _O(n)_          | Medium         | Bookmarked, Slope should be same, Consider first point as start and rest as end and create map and repeat; Keep edge cases like which slopes are valid and others keep in diff variables   |
|14| [Substring Concatenation](https://www.interviewbit.com/problems/substring-concatenation/)      | [Java](#ques-158)  | _O(n*n)_        | _O(n)_          | Medium         | Bookmarked, Brute force but just using hashmap for string match   |


<a name="heaps"></a>
## Heaps

|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [N max pair combinations](https://www.interviewbit.com/problems/n-max-pair-combinations/)      | [Java](#ques-159)  | _O(nlogn)_         | _O(n)_          | Medium         |  Bookmarked, Create a min heap and loop through n^2 pairs  |
|2| [Magician and Chocolates](https://www.interviewbit.com/problems/magician-and-chocolates/)      | [Java](#ques-160)  | _O(klogn)_         | _O(n)_          | Easy         |    |
|3| [Merge K Sorted Lists](https://www.interviewbit.com/problems/merge-k-sorted-lists/)      | [Java](#ques-161)  | _O(Nlogk)_, where k = initial lists and N = total sum of nodes from all lists         | _O(k)_          | Medium         |    |


<a name="hashmaps"></a>
## HashMap

|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Distinct Numbers in Window](https://www.interviewbit.com/problems/distinct-numbers-in-window/)      | [Java](#ques-162)  | _O(n)_         | _O(n)_          | Easy         |    |
|2| [LRU](https://www.interviewbit.com/problems/lru-cache/)      | [Java](#ques-163)  | _O(1)_ for get and O(n) for set         | _O(n)_          | Easy         |    |
|3| [Ways to form Max Heap](https://www.interviewbit.com/problems/ways-to-form-max-heap/)      | [Java](#ques-164)  | _O(log2n^2)_          | _O(log2n)_          | Hard         |  Bookmarked, T(n) = n-1Cl*T(l)*T(r), where r = n-1-l  |


<a name="trees"></a>
## Trees

|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Valid Binary Search Tree](https://www.interviewbit.com/problems/valid-binary-search-tree/)      | [Java](#ques-165)  | _O(n)_         | _O(log2n)_          | Easy         |    |
|2| [Next Greater Number BST](https://www.interviewbit.com/problems/next-greater-number-bst/)      | [Java](#ques-166)  | _O(logn)_         | _O(1)_          | Easy         |  Bookmarked, Good Question plus also know inorder using 1 stack  |
|3| [Max Depth of Binary Tree](https://www.interviewbit.com/problems/max-depth-of-binary-tree/)      | [Java](#ques-167)  | _O(n)_         | _O(n)_          | Easy         |    |
|4| [Vertical Order traversal of Binary Tree](https://www.interviewbit.com/problems/vertical-order-traversal-of-binary-tree/)      | [Java](#ques-168)  | _O(n)_         | _O(n)_          | Easy         |    |
|5| [Inorder Traversal](https://www.interviewbit.com/problems/inorder-traversal/)      | [Java](#ques-169)  | _O(n)_         | _O(n)_          | Easy         |  Bookmarked  |
|6| [PreOrder Traversal](https://www.interviewbit.com/problems/preorder-traversal/)      | [Java](#ques-170)  | _O(n)_         | _O(n)_          | Easy         |  Bookmarked  |
|6| [PreOrder Traversal](https://www.interviewbit.com/problems/preorder-traversal/)      | [Java](#ques-171)  | _O(n)_         | _O(n)_          | Easy         |  Bookmarked  |
|7| [PostOrder Traversal](https://www.interviewbit.com/problems/postorder-traversal/)      | [Java](#ques-172)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked, Using 2 stacks is easy  |
|8| [Hotel Reviews](https://www.interviewbit.com/problems/hotel-reviews/)      | [Java](#ques-173)  | _O(Sum of all input strings length)_         | _O(n)_          | Medium         |  Bookmarked, Use tries or Hashset   |
|9| [Balanced Binary Tree](https://www.interviewbit.com/problems/balanced-binary-tree/)      | [Java](#ques-174)  | _O(n)_         | _O(n)_          | Easy         |     |
|10| [Identical Binary Trees](https://www.interviewbit.com/problems/identical-binary-trees/)      | [Java](#ques-175)  | _O(n)_         | _O(n)_          | Easy         |     |
|11| [Symmetric Binary Tree](https://www.interviewbit.com/problems/symmetric-binary-tree/)      | [Java](#ques-176)  | _O(n)_         | _O(n)_          | Easy         |     |
|12| [Inorder Traversal of Cartesian Tree](https://www.interviewbit.com/problems/inorder-traversal-of-cartesian-tree/)      | [Java](#ques-177)  | _O(n)_         | _O(n)_          | Easy         |     |
|13| [Sorted Array To Balanced BST](https://www.interviewbit.com/problems/sorted-array-to-balanced-bst/)      | [Java](#ques-178)  | _O(n)_         | _O(n)_          | Easy         |     |
|14| [Binary Tree From Inorder And Postorder](https://www.interviewbit.com/problems/binary-tree-from-inorder-and-postorder/)      | [Java](#ques-179)  | _O(n)_         | _O(n)_          | Easy         |  Bookmarked   |
|15| [Construct Binary Tree From Inorder And Preorder](https://www.interviewbit.com/problems/construct-binary-tree-from-inorder-and-preorder/)      | [Java](#ques-180)  | _O(n)_         | _O(n)_          | Easy         |     |
|16| [Kth Smallest Element In Tree](https://www.interviewbit.com/problems/kth-smallest-element-in-tree/)      | [Java](#ques-181)  | _O(n)_         | _O(n)_          | Easy         |  Bookmarked, Can be done without extra space as well   |
|17| [2-Sum Binary Tree](https://www.interviewbit.com/problems/2sum-binary-tree/)      | [Java](#ques-182)  | _O(n)_         | _O(logn)_          | Medium         |  Bookmarked, Can be done in O(n) space with sorted array   |
|18| [BST Iterator](https://www.interviewbit.com/problems/bst-iterator/)      | [Java](#ques-183)  | _O(1)_         | _O(logn)_          | Easy         |  Bookmarked, Can be done in O(n) space with array   |
|19| [Recover Binary Search Tree](https://www.interviewbit.com/problems/recover-binary-search-tree/)      | [Java](#ques-184)  | _O(n)_         | _O(1)_          | Medium         |  Bookmarked; Morris Algo - attaching current to inorder predecessor, Can be done in O(n) space with array, rest concept is same  |
|20| [Invert the Binary Tree](https://www.interviewbit.com/problems/invert-the-binary-tree/)      | [Java](#ques-185)  | _O(n)_         | _O(n)_          | Easy         |  Bookmarked  |
|21| [ZigZag Level Order Traversal BT](https://www.interviewbit.com/problems/zigzag-level-order-traversal-bt/)      | [Java](#ques-186)  | _O(n)_         | _O(n)_          | Easy         |  Can be solved using 2 stacks or queue  |
|22| [Min Depth of Binary Tree](https://www.interviewbit.com/problems/min-depth-of-binary-tree/)      | [Java](#ques-187)  | _O(n)_         | _O(n)_          | Easy         |    |
|23| [Path Sum](https://www.interviewbit.com/problems/path-sum/)      | [Java](#ques-188)  | _O(n)_         | _O(n)_          | Easy         |    |
|24| [Sum Root to Leaf Numbers](https://www.interviewbit.com/problems/sum-root-to-leaf-numbers/)      | [Java](#ques-189)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked,  mod can be used even before number is formed |
|25| [Root to Leaf Paths With Sum](https://www.interviewbit.com/problems/root-to-leaf-paths-with-sum/)      | [Java](#ques-190)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked |
|26| [Populate Next Right Pointers Tree](https://www.interviewbit.com/problems/populate-next-right-pointers-tree/)      | [Java](#ques-191)  | _O(n)_         | _O(1)_          | Medium         |  Bookmarked, If Space was not constant then using queue is very easy |
|27| [Least Common Ancestor](https://www.interviewbit.com/problems/least-common-ancestor/)      | [Java](#ques-192)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked |
|28| [Shortest Unique Prefix](https://www.interviewbit.com/problems/shortest-unique-prefix/)      | [Java](#ques-193)  | _O(n*m)_         | _O(total unique characters)_          | Medium         |  Bookmarked, either use count of unique flag at each node, update the child's property and not current node |
|29| [Flatten Binary Tree to Linked List](https://www.interviewbit.com/problems/flatten-binary-tree-to-linked-list/)      | [Java](#ques-194)  | _O(n)_         | _O(1)_          | Medium         |  Bookmarked, Can be solved using stack or recursion |
|30| [Order of People Heights](https://www.interviewbit.com/problems/order-of-people-heights/)      | [Java](#ques-195)  | _O(nlogn)_         | _O(n)_          | Medium         |  Bookmarked, Solve it like a puzzle, good question |


## Solutions
### Arrays
<a name="ques-1"></a>
**Spiral Array Matrix** [Back](#array) <br>
```java
public class Solution {
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
<a name="ques-2"></a>
**Min Steps in Infinite Grid** [Back](#arrays) <br>
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
<a name="ques-3"></a>
**Add one to number** [Back](#arrays) <br>
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
<a name="ques-4"></a>
**Max Sum Contiguous Subarray** [Back](#arrays) <br>
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
<a name="ques-5"></a>
**Maximum Absolute Difference** [Back](#arrays) <br>
```java
```
<a name="ques-6"></a>
**Repeat and Missing Number Array** [Back](#arrays) <br>
```java
```
<a name="ques-7"></a>
**Flip** [Back](#arrays) <br>
```java
```
<a name="ques-8"></a>
**Max Non Negative SubArray** [Back](#arrays) <br>
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
<a name="ques-9"></a>
**Spiral Order Matrix II** [Back](#arrays) <br>
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
<a name="ques-10"></a>
**Pascal Triangle** [Back](#arrays) <br>
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
<a name="ques-11"></a>
**Kth Row of Pascal's Triangle** [Back](#arrays) <br>
```java
```
<a name="ques-12"></a>
**Anti Diagonals** [Back](#arrays) <br>
```java
```
<a name="ques-13"></a>
**Noble Integer** [Back](#arrays) <br>
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
<a name="ques-14"></a>
**Triplets with Sum between given range** [Back](#arrays) <br>
```java
```
<a name="ques-15"></a>
**Largest Number** [Back](#arrays) <br>
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
<a name="ques-16"></a>
**Wave Array** [Back](#arrays) <br>
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
<a name="ques-17"></a>
**Hotel Bookings Possible** [Back](#arrays) <br>
```java
```
<a name="ques-18"></a>
**Find Duplicate in Array** [Back](#arrays) <br>
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
```
<a name="ques-19"></a>
**Max Distance** [Back](#arrays) <br>
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
<a name="ques-20"></a>
**Min Unsorted Subarray** [Back](#arrays) <br>
```java
```
<a name="ques-21"></a>
**Maximum Consecutive Gap** [Back](#arrays) <br>
```java
```
<a name="ques-22"></a>
**Rotate Matrix** [Back](#arrays) <br>
```java
public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        // Bounds 
        int x=0, X=a.size();
        
        while (x < X) {
            for (int i=0; i < X-1; i++) {
                int currX = x + i; // row 
                int currY = x; // col
                int temp = a.get(currX).get(currY);
                // System.out.println("DO WHILE");
                do {
                    int nextX = currY;  // row -> prev col
                    int nextY = X - 1 - currX; // col -> total - row
                    int newtemp = a.get(nextX).get(nextY);
                    a.get(nextX).set(nextY, temp);
                    temp = newtemp;
                    // System.out.println("Curr X : " + currX + " Y : " + currY);
                    // System.out.println("Next X : " + nextX + " Y : " + nextY);
                    // System.out.println("Exit X : " + (x+i) + " Y : " + x);
                    // System.out.println("Setting A[" + nextX + "][" + nextY + "] : " + temp);
                    currX = nextX;
                    currY = nextY;
                } while (currX != (x+i) || currY != x);
            }
            X = X - 2;
            x = x + 1;
        }
    }
}
```
<a name="ques-23"></a>
**MAXSPPROD** [Back](#arrays) <br>
```java
public class Solution {
    public int maxSpecialProduct(ArrayList<Integer> A) {
        int n = A.size();
        int[] left = new int[n];
        int[] right = new int[n];
        
        Deque<Integer> q = new ArrayDeque<>();
        q.addLast(0);
        
        for(int i = 1; i < n; i++){
            while(!q.isEmpty()){
                if(A.get(q.getLast()) > A.get(i)) break;
                q.removeLast();
            }
            left[i] = (q.isEmpty()) ? 0 : q.getLast();
            q.addLast(i);
        }
        q = new ArrayDeque<>();
        q.addLast(n - 1);
        for(int i = n - 2; i >= 0; i--){
            while(!q.isEmpty()){
                if(A.get(q.getLast()) > A.get(i)) break;
                q.removeLast();
            }
            right[i] = (q.isEmpty()) ? 0 : q.getLast();
            q.addLast(i);
        }
        long mx = -1;
        for(int i = 0; i < n; i++){
            mx = Long.max(mx, 1L * left[i] * right[i]);
        }
        return (int)(mx % 1000000007);
    }
}
```
<a name="ques-24"></a>
**Next Permutation** [Back](#arrays) <br>
```java
```
<a name="ques-25"></a>
**Find Permutation** [Back](#arrays) <br>
```java
```
<a name="ques-26"></a>
**Set Matrix Zeros** [Back](#arrays) <br>
```java
public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        
        for (int i=0; i < a.size(); i++) {
            for (int j=0; j < a.get(i).size(); j++) {
                if (a.get(i).get(j) == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        
        for (int i=0; i < a.size(); i++) {
            for (int j=0; j < a.get(i).size(); j++) {
                if (row.contains(i) || col.contains(j)) {
                    a.get(i).set(j, 0);
                }
            }
        }
    }
}
```
<a name="ques-27"></a>
**First Missing Integer** [Back](#arrays) <br>
```java
```
<a name="ques-28"></a>
**Merge Overlapping Intervals** [Back](#arrays) <br>
```java
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if (intervals == null) return null;
        
        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        ArrayList<Interval> merged = new ArrayList<>();
        
        for (Interval current : intervals) {
            if (merged.isEmpty() || merged.get(merged.size() -1).end < current.start) {
                merged.add(current);
            } else {
                merged.get(merged.size() -1).end = Math.max(current.end, 
                                                   merged.get(merged.size() -1).end);
            }
        }
        return merged;
    }
}
```
<a name="ques-29"></a>
**Merge Intervals** [Back](#arrays) <br>
```java
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        for (Interval i : intervals) {
            if (i.start > i.end) {
                int temp = i.start;
                i.start = i.end;
                i.end = temp;
            }
        }
        if (newInterval.start > newInterval.end) {
            int temp = newInterval.start;
            newInterval.start = newInterval.end;
            newInterval.end = temp;
        }
        
        PriorityQueue<Interval> minheap = new PriorityQueue<>(
            new Comparator<Interval>() {
                public int compare(Interval i1, Interval i2) {
                    if (i1.start > i2.start) {
                        return 1;
                    } else if (i1.start < i2.start) {
                        return -1;
                    } else {
                        if (i1.end >= i2.end) {
                            return 1;
                        } else {
                            return -1;
                        }
                    }
                }
            });
        minheap.add(newInterval);
        for (Interval interval : intervals) {
            minheap.add(interval);
        }
        
        ArrayList<Interval> res = new ArrayList<>();
        int maxEnd = 0;
        while (minheap.size() > 0) {
            Interval interval = minheap.poll();
            maxEnd = Math.max(maxEnd, interval.end);
            // System.out.println("OUTER || START : " + interval.start + " END : " + interval.end);
            while (minheap.size() > 0 && minheap.peek().start <= maxEnd) {
                Interval inter = minheap.poll();
                maxEnd = Math.max(maxEnd, inter.end);
                // System.out.println("INNER || START : " + inter.start + " END : " + inter.end);
            }
            if (minheap.size() == 0 || minheap.peek().start > maxEnd) {
                res.add(new Interval(interval.start, maxEnd));
            }
        }
        return res;
    }
}
```
<a name="ques-30"></a>
**N/3 Repeat Number** [Back](#arrays) <br>
```java
```

### Math
<a name="ques-31"></a>
**All Factors** [Back](#maths) <br>
```java
```
<a name="ques-32"></a>
**Binary Representation** [Back](#maths) <br>
```java
```
<a name="ques-33"></a>
**Prime** [Back](#maths) <br>
```java
```
<a name="ques-34"></a>
**Verify Prime** [Back](#maths) <br>
```java
```
<a name="ques-35"></a>
**Prime Sum** [Back](#maths) <br>
```java
```
<a name="ques-36"></a>
**Sum of pairwise Hamming Distance** [Back](#maths) <br>
```java
```
<a name="ques-37"></a>
**FizzBuzz** [Back](#maths) <br>
```java
```
<a name="ques-38"></a>
**Power Of Two Integers** [Back](#maths) <br>
```java
```
<a name="ques-39"></a>
**Excel Column Number** [Back](#maths) <br>
```java
```
<a name="ques-40"></a>
**Excel Column Title** [Back](#maths) <br>
```java
```
<a name="ques-41"></a>
**Palindrome Integer** [Back](#maths) <br>
```java
```
<a name="ques-42"></a>
**Reverse Integer** [Back](#maths) <br>
```java
```
<a name="ques-43"></a>
**GCD** [Back](#maths) <br>
```java
```
<a name="ques-44"></a>
**Trailing Zeroes** [Back](#maths) <br>
```java
```
<a name="ques-45"></a>
**Sorted Permutation Rank** [Back](#maths) <br>
```java
```
<a name="ques-46"></a>
**Largest Coprime Divisor** [Back](#maths) <br>
```java
```
<a name="ques-47"></a>
**Sorted Permutation Rank with Repeats** [Back](#maths) <br>
```java
```
<a name="ques-48"></a>
**ReArrange Array** [Back](#maths) <br>
```java
```
<a name="ques-49"></a>
**Grid Unique Paths** [Back](#maths) <br>
```java
```
<a name="ques-50"></a>
**Numbers of length N and value less than K** [Back](#maths) <br>
```java
```

### Binary Search
<a name="ques-51"></a>
**SQRT** [Back](#binarysearch) <br>
```java
```
<a name="ques-52"></a>
**Count Element Occurence** [Back](#binarysearch) <br>
```java
```
<a name="ques-53"></a>
**Rotated Array** [Back](#binarysearch) <br>
```java
```
<a name="ques-54"></a>
**Matrix Median** [Back](#binarysearch) <br>
```java
```
<a name="ques-55"></a>
**Matrix Search** [Back](#binarysearch) <br>
```java
```
<a name="ques-56"></a>
**Sorted Insert Position** [Back](#binarysearch) <br>
```java
```
<a name="ques-57"></a>
**Implement Power Function** [Back](#binarysearch) <br>
```java
```
<a name="ques-58"></a>
**Rotated Sorted Array Search** [Back](#binarysearch) <br>
```java
```
<a name="ques-59"></a>
**Search for a Range** [Back](#binarysearch) <br>
```java
```
<a name="ques-60"></a>
**Painter's Partition Problem** [Back](#binarysearch) <br>
```java
```
<a name="ques-61"></a>
**Allocate Books** [Back](#binarysearch) <br>
```java
```
<a name="ques-62"></a>
**Median of Array** [Back](#binarysearch) <br>
```java
```

### Strings
<a name="ques-63"></a>
**Palindrome String** [Back](#strings) <br>
```java
```
<a name="ques-64"></a>
**Longest Common Prefix** [Back](#strings) <br>
```java
```
<a name="ques-65"></a>
**Count And Say** [Back](#strings) <br>
```java
```
<a name="ques-66"></a>
**Minimum Characters required to make a String Palindromic** [Back](#strings) <br>
```java
```
<a name="ques-67"></a>
**Longest Palindromic Substring** [Back](#strings) <br>
```java
```
<a name="ques-68"></a>
**StrStr** [Back](#strings) <br>
```java
```
<a name="ques-69"></a>
**Compare Version Numbers** [Back](#strings) <br>
```java
```
<a name="ques-70"></a>
**Atoi** [Back](#strings) <br>
```java
```
<a name="ques-71"></a>
**Length of Last Word** [Back](#strings) <br>
```java
```
<a name="ques-72"></a>
**Reverse the String** [Back](#strings) <br>
```java
```
<a name="ques-73"></a>
**Valid Number** [Back](#strings) <br>
```java
```
<a name="ques-74"></a>
**Valid Ip Addresses** [Back](#strings) <br>
```java
```
<a name="ques-75"></a>
**Roman To Integer** [Back](#strings) <br>
```java
```
<a name="ques-76"></a>
**Integer To Roman** [Back](#strings) <br>
```java
```
<a name="ques-77"></a>
**Add Binary Strings** [Back](#strings) <br>
```java
```
<a name="ques-78"></a>
**Power of 2** [Back](#strings) <br>
```java
```
<a name="ques-79"></a>
**Multiply Strings** [Back](#strings) <br>
```java
```
<a name="ques-80"></a>
**Justified Text** [Back](#strings) <br>
```java
```
<a name="ques-81"></a>
**ZigZag String** [Back](#strings) <br>
```java
```
<a name="ques-82"></a>
**Pretty Json** [Back](#strings) <br>
```java
```
<a name="ques-83"></a>
**Stringoholics** [Back](#strings) <br>
```java
```

### Bit Manipulation
<a name="ques-84"></a>
**Min XOR Value** [Back](#bitmanipulation) <br>
```java
```
<a name="ques-85"></a>
**Single Number** [Back](#bitmanipulation) <br>
```java
```
<a name="ques-86"></a>
**Number of 1 Bits** [Back](#bitmanipulation) <br>
```java
```
<a name="ques-87"></a>
**Reverse Bits** [Back](#bitmanipulation) <br>
```java
```
<a name="ques-88"></a>
**Single Number II** [Back](#bitmanipulation) <br>
```java
```
<a name="ques-89"></a>
**Divide Integers** [Back](#bitmanipulation) <br>
```java
```
<a name="ques-90"></a>
**Different Bits Sum Pairwise** [Back](#bitmanipulation) <br>
```java
```

### Two Pointers
<a name="ques-91"></a>
**Merge Two Sorted Lists II** [Back](#twopointers) <br>
```java
```
<a name="ques-92"></a>
**Intersection Of Sorted Arrays** [Back](#twopointers) <br>
```java
```
<a name="ques-93"></a>
**Minimize the absolute difference** [Back](#twopointers) <br>
```java
```
<a name="ques-94"></a>
**Remove Duplicates from Sorted Array** [Back](#twopointers) <br>
```java
```
<a name="ques-95"></a>
**Remove Duplicates from Sorted Array 2** [Back](#twopointers) <br>
```java
```
<a name="ques-96"></a>
**Remove Element from Array** [Back](#twopointers) <br>
```java
```
<a name="ques-97"></a>
**Remove Element from Array** [Back](#twopointers) <br>
```java
```
<a name="ques-98"></a>
**Sort by Color** [Back](#twopointers) <br>
```java
```
<a name="ques-99"></a>
**Diffk** [Back](#twopointers) <br>
```java
```
<a name="ques-100"></a>
**3 Sum** [Back](#twopointers) <br>
```java
```
<a name="ques-101"></a>
**3 Sum Zero** [Back](#twopointers) <br>
```java
```
<a name="ques-102"></a>
**Max Continuous Series of 1s** [Back](#twopointers) <br>
```java
```
<a name="ques-103"></a>
**Array 3 Pointers** [Back](#twopointers) <br>
```java
```
<a name="ques-104"></a>
**Counting Triangles** [Back](#twopointers) <br>
```java
```
<a name="ques-105"></a>
**Container With Most Water** [Back](#twopointers) <br>
```java
```

### Linked List
<a name="ques-106"></a>
**Intersection of Linked Lists** [Back](#linkedlist) <br>
```java
```
<a name="ques-107"></a>
**Reverse Linked List** [Back](#linkedlist) <br>
```java
```
<a name="ques-108"></a>
**Palindrome List** [Back](#linkedlist) <br>
```java
```
<a name="ques-109"></a>
**Remove Duplicates from Sorted List** [Back](#linkedlist) <br>
```java
```
<a name="ques-110"></a>
**Remove Duplicates from Sorted List 2** [Back](#linkedlist) <br>
```java
```
<a name="ques-111"></a>
**Merge Two Sorted Lists** [Back](#linkedlist) <br>
```java
```
<a name="ques-112"></a>
**Merge Two Sorted Lists** [Back](#linkedlist) <br>
```java
```
<a name="ques-113"></a>
**Remove Nth Node from List End** [Back](#linkedlist) <br>
```java
```
<a name="ques-114"></a>
**Rotate List** [Back](#linkedlist) <br>
```java
```
<a name="ques-115"></a>
**Reverse Lists 2** [Back](#linkedlist) <br>
```java
```
<a name="ques-116"></a>
**Reorder List** [Back](#linkedlist) <br>
```java
```
<a name="ques-117"></a>
**Swap List Nodes in pairs** [Back](#linkedlist) <br>
```java
```
<a name="ques-118"></a>
**K reverse linked list** [Back](#linkedlist) <br>
```java
```
<a name="ques-119"></a>
**Add Two Numbers as Lists** [Back](#linkedlist) <br>
```java
```
<a name="ques-120"></a>
**List Cycle** [Back](#linkedlist) <br>
```java
```
<a name="ques-121"></a>
**Partition List** [Back](#linkedlist) <br>
```java
```
<a name="ques-122"></a>
**Sort List** [Back](#linkedlist) <br>
```java
```

### Stack
<a name="ques-123"></a>
**Simplify Directory Path** [Back](#stack) <br>
```java
```
<a name="ques-124"></a>
**Redundant Braces** [Back](#stack) <br>
```java
```
<a name="ques-125"></a>
**Nearest Smaller Element** [Back](#stack) <br>
```java
```
<a name="ques-126"></a>
**Evaluate Expression** [Back](#stack) <br>
```java
```
<a name="ques-127"></a>
**Min Stack** [Back](#stack) <br>
```java
```
<a name="ques-128"></a>
**Largest Rectangle in Histogram** [Back](#stack) <br>
```java
```
<a name="ques-129"></a>
**Rain Water Trapped** [Back](#stack) <br>
```java
```

### Queue
<a name="ques-130"></a>
**Sliding Window Maximum** [Back](#queue) <br>
```java
```

### Backtracking
<a name="ques-131"></a>
**ReverseLinkedList** [Back](#backtracking) <br>
```java
```
<a name="ques-132"></a>
**Modular Expression** [Back](#backtracking) <br>
```java
```
<a name="ques-133"></a>
**Subset** [Back](#backtracking) <br>
```java
```
<a name="ques-134"></a>
**Combinations** [Back](#backtracking) <br>
```java
```
<a name="ques-135"></a>
**Combination Sum** [Back](#backtracking) <br>
```java
```
<a name="ques-136"></a>
**Combination Sum 2** [Back](#backtracking) <br>
```java
```
<a name="ques-137"></a>
**SubSets 2** [Back](#backtracking) <br>
```java
```
<a name="ques-138"></a>
**Letter Phone** [Back](#backtracking) <br>
```java
```
<a name="ques-139"></a>
**Palindrome Partitioning** [Back](#backtracking) <br>
```java
```
<a name="ques-140"></a>
**Generate all Parentheses II** [Back](#backtracking) <br>
```java
```
<a name="ques-141"></a>
**Permutations** [Back](#backtracking) <br>
```java
```
<a name="ques-142"></a>
**Gray Code** [Back](#backtracking) <br>
```java
```
<a name="ques-143"></a>
**Kth Permutation Sequence** [Back](#backtracking) <br>
```java
```
<a name="ques-144"></a>
**NQueens** [Back](#backtracking) <br>
```java
```

### Hashing
<a name="ques-145"></a>
**Colorful Number** [Back](#hashing) <br>
```java
```
<a name="ques-146"></a>
**Largest Continuous Sequence Zero Sum** [Back](#hashing) <br>
```java
```
<a name="ques-147"></a>
**2 Sum** [Back](#hashing) <br>
```java
```
<a name="ques-148"></a>
**4 Sum** [Back](#hashing) <br>
```java
```
<a name="ques-149"></a>
**Valid Sudoku** [Back](#hashing) <br>
```java
```
<a name="ques-150"></a>
**Diffk II** [Back](#hashing) <br>
```java
```
<a name="ques-151"></a>
**Anagrams** [Back](#hashing) <br>
```java
```
<a name="ques-152"></a>
**Equal** [Back](#hashing) <br>
```java
```
<a name="ques-153"></a>
**Copy List** [Back](#hashing) <br>
```java
```
<a name="ques-154"></a>
**Longest Substring Without Repeat** [Back](#hashing) <br>
```java
```

<a name="ques-155"></a>
**Window String** [Back](#hashing) <br>
```java
```
<a name="ques-156"></a>
**Fraction** [Back](#hashing) <br>
```java
```
<a name="ques-157"></a>
**Points on the Straight Line** [Back](#hashing) <br>
```java
```
<a name="ques-158"></a>
**Substring Concatenation** [Back](#hashing) <br>
```java
```

### Heaps
<a name="ques-159"></a>
**N max pair combinations** [Back](#heaps) <br>
```java
```
<a name="ques-160"></a>
**Magician and Chocolates** [Back](#heaps) <br>
```java
```
<a name="ques-161"></a>
**Merge K Sorted Lists** [Back](#heaps) <br>
```java
```

### HashMaps
<a name="ques-162"></a>
**Distinct Numbers in Window** [Back](#hashmaps) <br>
```java
```
<a name="ques-163"></a>
**LRU** [Back](#hashmaps) <br>
```java
```
<a name="ques-164"></a>
**Ways to form Max Heap** [Back](#hashmaps) <br>
```java
```

### Trees
<a name="ques-165"></a>
**Valid Binary Search Tree** [Back](#trees) <br>
```java
```
<a name="ques-166"></a>
**Next Greater Number BST** [Back](#trees) <br>
```java
```
<a name="ques-167"></a>
**Max Depth of Binary Tree** [Back](#trees) <br>
```java
```
<a name="ques-168"></a>
**Vertical Order traversal of Binary Tree** [Back](#trees) <br>
```java
```
<a name="ques-169"></a>
**Inorder Traversal** [Back](#trees) <br>
```java
```
<a name="ques-170"></a>
**PreOrder Traversal** [Back](#trees) <br>
```java
```
<a name="ques-171"></a>
**PreOrder Traversal** [Back](#trees) <br>
```java
```
<a name="ques-172"></a>
**PostOrder Traversal** [Back](#trees) <br>
```java
```
<a name="ques-173"></a>
**Hotel Reviews** [Back](#trees) <br>
```java
```
<a name="ques-174"></a>
**Balanced Binary Tree** [Back](#trees) <br>
```java
```
<a name="ques-175"></a>
**Identical Binary Trees** [Back](#trees) <br>
```java
```
<a name="ques-176"></a>
**Symmetric Binary Tree** [Back](#trees) <br>
```java
```
<a name="ques-177"></a>
**Inorder Traversal of Cartesian Tree** [Back](#trees) <br>
```java
```
<a name="ques-178"></a>
**Sorted Array To Balanced BST** [Back](#trees) <br>
```java
```
<a name="ques-179"></a>
**Binary Tree From Inorder And Postorder** [Back](#trees) <br>
```java
```
<a name="ques-180"></a>
**Construct Binary Tree From Inorder And Preorder** [Back](#trees) <br>
```java
```
<a name="ques-181"></a>
**Kth Smallest Element In Tree** [Back](#trees) <br>
```java
```
<a name="ques-182"></a>
**2-Sum Binary Tree** [Back](#trees) <br>
```java
```
<a name="ques-183"></a>
**BST Iterator** [Back](#trees) <br>
```java
```
<a name="ques-184"></a>
**Recover Binary Search Tree** [Back](#trees) <br>
```java
```
<a name="ques-185"></a>
**Invert the Binary Tree** [Back](#trees) <br>
```java
```
<a name="ques-186"></a>
**ZigZag Level Order Traversal BT** [Back](#trees) <br>
```java
```
<a name="ques-187"></a>
**Min Depth of Binary Tree** [Back](#trees) <br>
```java
```
<a name="ques-188"></a>
**Path Sum** [Back](#trees) <br>
```java
```
<a name="ques-189"></a>
**Sum Root to Leaf Numbers** [Back](#trees) <br>
```java
```
<a name="ques-190"></a>
**Root to Leaf Paths With Sum** [Back](#trees) <br>
```java
```
<a name="ques-191"></a>
**Populate Next Right Pointers Tree** [Back](#trees) <br>
```java
```
<a name="ques-192"></a>
**Least Common Ancestor** [Back](#trees) <br>
```java
```
<a name="ques-193"></a>
**Shortest Unique Prefix** [Back](#trees) <br>
```java
```
<a name="ques-194"></a>
**Flatten Binary Tree to Linked List** [Back](#trees) <br>
```java
```
<a name="ques-195"></a>
**Order of People Heights** [Back](#trees) <br>
```java
```
<a name="ques-196"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-197"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-198"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-199"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-200"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-201"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-202"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-203"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-204"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-205"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-206"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-207"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-208"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-209"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-210"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-211"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-212"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-213"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-214"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-215"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-216"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-217"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-218"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-219"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-220"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-221"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-222"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-223"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-224"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-225"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-226"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-227"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-228"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-229"></a>
**** [Back](#trees) <br>
```java
```
<a name="ques-230"></a>
**** [Back](#questions) <br>
```java
```
<a name="ques-231"></a>
**** [Back](#questions) <br>
```java
```
<a name="ques-232"></a>
**** [Back](#questions) <br>
```java
```
<a name="ques-233"></a>
**** [Back](#questions) <br>
```java
```
<a name="ques-234"></a>
**** [Back](#questions) <br>
```java
```
<a name="ques-235"></a>
**** [Back](#questions) <br>
```java
```
<a name="ques-236"></a>
**** [Back](#questions) <br>
```java
```
<a name="ques-237"></a>
**** [Back](#questions) <br>
```java
```


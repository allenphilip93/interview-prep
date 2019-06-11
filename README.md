# Interview Preparation

## Content
* [Bit Manipulation](https://github.com/allenphilip93/interview-prep#bitmanipulation)
* [Array](https://github.com/allenphilip93/interview-prep#arrays)
* [String](https://github.com/allenphilip93/interview-prep#string)
* [Linked List](https://github.com/allenphilip93/interview-prep#linkedlist)
* [Stack](https://github.com/allenphilip93/interview-prep#stack)
* [Queue](https://github.com/allenphilip93/interview-prep#queue)
* [Heap](https://github.com/allenphilip93/interview-prep#heaps)
* [Trees](https://github.com/allenphilip93/interview-prep#trees)
* [Hash Map](https://github.com/allenphilip93/interview-prep#hashmap)
* [Hashing](https://github.com/allenphilip93/interview-prep#hashing)
* [Math](https://github.com/allenphilip93/interview-prep#math)
* [Two Pointers](https://github.com/allenphilip93/interview-prep#twopointers)
* [Binary Search](https://github.com/allenphilip93/interview-prep#binarysearch)
* [Backtracking](https://github.com/allenphilip93/interview-prep#backtracking)
* Dynamic Programming
* Greedy
* Graph
* Low Level Design
* High Level Design

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
|13| [Triplets with Sum between given range](https://www.interviewbit.com/problems/triplets-with-sum-between-given-range/)      | [Java](#ques-14)  | _O(n)_         | _O(1)_          | Medium         | |
|14| [Largest Number](https://www.interviewbit.com/problems/largest-number/) Given a list of non negative integers, arrange them such that they form the largest number.     | [Java](#ques-15)  | _O(n)_         | _O(n)_          | Medium         | Comparator |
|15| [Wave Array](https://www.interviewbit.com/problems/wave-array/) Given an array of integers, sort the array into a wave like array and return it, In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....     | [Java](#ques-16)  | _O(nlogn)_         | _O(1)_          | Easy         |  |
|16| [Hotel Bookings Possible](https://www.interviewbit.com/problems/hotel-bookings-possible/)      | [Java](#ques-17)  | _O(nlogn)_         | _O(1)_          | Medium         |  
|17| [Find Duplicate in Array](https://www.interviewbit.com/problems/find-duplicate-in-array/) Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.    | [Java](#ques-18)  | _O(n)_         | _O(1)_          | Easy         |  |
|18| [Max Distance](https://www.interviewbit.com/problems/max-distance/) Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <= A[j]. If there is no solution possible, return -1.     | [Java](#ques-19)  | _O(n)_         | _O(n)_          | Medium         |  
|19| [Min Unsorted Subarray](https://www.interviewbit.com/problems/maximum-unsorted-subarray/)      | [Java](#ques-20)  | _O(n)_         | _O(n)_          | Medium         |  
|20| [Maximum Consecutive Gap](https://www.interviewbit.com/problems/maximum-consecutive-gap/)      | [Java](#ques-21)  | _O(n)_         | _O(n)_          | Medium         |  PigeonHole Sorting using bucket method|
|21| [Rotate Matrix](https://www.interviewbit.com/problems/rotate-matrix/)      | [Java](#ques-22)  | _O(n*n)_         | _O(1)_          | Medium         |  Good Question|
|22| [MAXSPPROD](https://www.interviewbit.com/problems/maxspprod/) You are given an array A containing N integers. The special product of each ith integer in this array is defined as the product of the following: LeftSpecialValue: For an index i, it is defined as the index j such that A[j]>A[i](i>j). If multiple A[j]’s are present in multiple positions, the LeftSpecialValue is the maximum value of j. RightSpecialValue: For an index i, it is defined as the index j such that A[j]>A[i](j>i). If multiple A[j]s are present in multiple positions, the RightSpecialValue is the minimum value of j. Write a program to find the maximum special product of any integer in the array.     | [Java](#ques-23)  | _O(n)_         | _O(n)_          | Medium         |  Good Question|
|23| [Next Permutation](https://www.interviewbit.com/problems/next-permutation/)      | [Java](#ques-24)  | _O(nlogn)_(only if already highest perm, else O(n + logn))         | _O(1)_          | Medium         |  Good Question, Analyse diff examples, 
|24| [Find Permutation](https://www.interviewbit.com/problems/find-permutation/)      | [Java](#ques-25)  | _O(n)_         | _O(1)_          | Medium         |  Good Question, 
|25| [Set Matrix Zeros](https://www.interviewbit.com/problems/set-matrix-zeros/) Given an m x n matrix of 0s and 1s, if an element is 0, set its entire row and column to 0. Do it in place.     | [Java](#ques-26)  | _O(n*m)_         | _O(1)_          | Medium         |  Good Question|
|26| [First Missing Integer](https://www.interviewbit.com/problems/first-missing-integer/)      | [Java](#ques-27)  | _O(n)_         | _O(1)_          | Medium         |  Good Question, 
|27| [Merge Overlapping Intervals](https://www.interviewbit.com/problems/merge-overlapping-intervals/)      | [Java](#ques-28)  | _O(nlogn)_         | _O(1)_          | Medium         |  Good Question, 
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
|5| [Prime Sum](https://www.interviewbit.com/problems/prime-sum/) Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.     | [Java](#ques-35)  | _O(sqrt(N)loglog(n) + N)_         | _O(1)_          | Easy         |  |
|6| [Sum of pairwise Hamming Distance](https://www.interviewbit.com/problems/sum-of-pairwise-hamming-distance/)      | [Java](#ques-36)  | _O(N)_         | _O(1)_          | Medium         | Good idea on how to use mod for large test cases, and good solution |
|7| [FizzBuzz](https://www.interviewbit.com/problems/fizzbuzz/)      | [Java](#ques-37)  | _O(N)_         | _O(1)_          | Easy         |  |
|8| [Power Of Two Integers](https://www.interviewbit.com/problems/power-of-two-integers/) Given a positive integer which fits in a 32 bit signed integer, find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers.     | [Java](#ques-38)  | _O(sqrt(N)*log(N))_         | _O(1)_          | Easy         | Think easy solution |
|9| [Excel Column Number](https://www.interviewbit.com/problems/excel-column-number/) Given a column title as appears in an Excel sheet, return its corresponding column number.     | [Java](#ques-39)  | _O(N)_         | _O(1)_          | Easy         | |
|10| [Excel Column Title](https://www.interviewbit.com/problems/excel-column-title/) Given a positive integer, return its corresponding column title as appear in an Excel sheet.     | [Java](#ques-40)  | _O(logn)_         | _O(1)_          | Easy         | Good Question|
|11| [Palindrome Integer](https://www.interviewbit.com/problems/palindrome-integer/) Determine whether an integer is a palindrome. Do this without extra space.     | [Java](#ques-41)  | _O(number of digits)_         | _O(1)_          | Easy         | |
|12| [Reverse Integer](https://www.interviewbit.com/problems/reverse-integer/)      | [Java](#ques-42)  | _O(number of digits)_         | _O(1)_          | Easy         | |
|13| [GCD](https://www.interviewbit.com/problems/greatest-common-divisor/)      | [Java](#ques-43)  | _O(log(min a,b))_         | _O(1)_          | Easy         | Eucledian Algo, Good Question|
|14| [Trailing Zeroes](https://www.interviewbit.com/problems/trailing-zeros-in-factorial/)      | [Java](#ques-44)  | _O((A)^1/5)_         | _O(1)_          | Easy         | Good Question|
|15| [Sorted Permutation Rank](https://www.interviewbit.com/problems/sorted-permutation-rank/) Given a string, find the rank of the string amongst its permutations sorted lexicographically. Assume that no characters are repeated.     | [Java](#ques-45)  | _O(A^2)_         | _O(1)_          | Medium         | Good Question, Consider usage of factorial in case of modulo|
|16| [Largest Coprime Divisor](https://www.interviewbit.com/problems/largest-coprime-divisor/)      | [Java](#ques-46)  | _O(A^2)_         | _O(1)_          | Medium         | 
|17| [Sorted Permutation Rank with Repeats](https://www.interviewbit.com/problems/sorted-permutation-rank-with-repeats/)      | [Java](#ques-47)  | _O(A^2)_         | _O(1)_          | Medium         | Multiplicative Inverse Modulo(use long in case of modulo) |
|18| [ReArrange Array](https://www.interviewbit.com/problems/rearrange-array/) Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.     | [Java](#ques-48)  | _O(A)_         | _O(1)_          | Medium         | Encoding 2 values in one |
|19| [Grid Unique Paths](https://www.interviewbit.com/problems/grid-unique-paths/) A robot is located at the top-left corner of an A x B grid. The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked ‘Finish’ in the diagram below). How many possible unique paths are there?     | [Java](#ques-49)  | _O(min(row,col))_         | _O(1)_          | Easy         | DP or Combinatorial |
|20| [Numbers of length N and value less than K](https://www.interviewbit.com/problems/numbers-of-length-n-and-value-less-than-k/) Given a set of digits (A) in sorted order, find how many numbers of length B are possible whose value is less than number C.     | [Java](#ques-50)  | _O(B)_         | _O(1)_          | Medium         | |

<a name="binarysearch"></a>
## Binary Search


|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [SQRT](https://www.interviewbit.com/problems/square-root-of-integer/) Implement int sqrt(int x). Compute and return the square root of x. If x is not a perfect square, return floor(sqrt(x))     | [Java](#ques-51)  | _O(log(n))_         | _O(1)_          | Easy         | Keep check for out of range in case of Multiplication else use division  |
|2| [Count Element Occurence](https://www.interviewbit.com/problems/count-element-occurence/)      | [Java](#ques-52)  | _O(log(n))_         | _O(1)_          | Easy         |   |
|3| [Rotated Array](https://www.interviewbit.com/problems/rotated-array/) Suppose a sorted array is rotated at some pivot unknown to you beforehand. You are given a target value to search. If found in the array, return its index, otherwise return -1.     | [Java](#ques-53)  | _O(log(n))_         | _O(1)_          | Easy         |  |
|4| [Matrix Median](https://www.interviewbit.com/problems/matrix-median/)      | [Java](#ques-54)  | _O(log(2^32)*r*log(c))_ = O(32 * r * log(c))         | _O(1)_          | Medium         |  |
|5| [Matrix Search](https://www.interviewbit.com/problems/matrix-search/) Write an efficient algorithm that searches for a value in an m x n matrix.     | [Java](#ques-55)  | _O(log(rc))_ = O(log(r) + log(c))         | _O(1)_          | Easy         |  |
|6| [Sorted Insert Position](https://www.interviewbit.com/problems/sorted-insert-position/)      | [Java](#ques-56)  | _O(log(n))_          | _O(1)_          | Easy         |   |
|7| [Implement Power Function](https://www.interviewbit.com/problems/implement-power-function/) Implement pow(x, n) % d. In other words, given x, n and d, find (x^n % d)     | [Java](#ques-57)  | _O(log(power))_          | _O(1)_          | Easy         |  Handle Negative value carefully, |
|8| [Rotated Sorted Array Search](https://www.interviewbit.com/problems/rotated-sorted-array-search/)      | [Java](#ques-58)  | _O(log(n))_          | _O(1)_          | Easy         |   |
|9| [Search for a Range](https://www.interviewbit.com/problems/search-for-a-range/)      | [Java](#ques-59)  | _O(log(n))_          | _O(1)_          | Easy         |   |
|10| [Painter's Partition Problem](https://www.interviewbit.com/problems/painters-partition-problem/) You have to paint N boards of length {A0, A1, A2, A3 … AN-1}. There are K painters available and you are also given how much time a painter takes to paint 1 unit of board. You have to get this job done as soon as possible under the constraints that any painter will only paint contiguous sections of board.     | [Java](#ques-60)  | _O(Nlog(sum(array)))_          | _O(1)_          | Medium         | Example to use BS in monotonic functions   |
|11| [Allocate Books](https://www.interviewbit.com/problems/allocate-books/)      | [Java](#ques-61)  | _O(Nlog(sum(array)))_          | _O(1)_          | Medium         | Example to use BS in monotonic functions   |
|12| [Median of Array](https://www.interviewbit.com/problems/median-of-array/) There are two sorted arrays A and B of size m and n respectively. Find the median of the two sorted arrays ( The median of the array formed by merging both the arrays ).The overall run time complexity should be O(log (m+n)).     | [Java](#ques-62)  | _O(log(m+n))_          | _O(1)_          | Hard         |   |

<a name="strings"></a>
## String


|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Palindrome String](https://www.interviewbit.com/problems/palindrome-string/) Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.     | [Java](#ques-63)  | _O(n)_         | _O(1)_          | Easy         |   |
|2| [Longest Common Prefix](https://www.interviewbit.com/problems/longest-common-prefix/) Write a function to find the longest common prefix string amongst an array of strings. Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.     | [Java](#ques-64)  | _O(n*min(String Length))_         | _O(1)_          | Easy         |   |
|3| [Count And Say](https://www.interviewbit.com/problems/count-and-say/) The count-and-say sequence is the sequence of integers beginning as follows: 1, 11, 21, 1211, 111221, ...     | [Java](#ques-65)  | _O(n*max(String Length))_         | _O(1)_          | Easy         |   |
|4| [Minimum Characters required to make a String Palindromic](https://www.interviewbit.com/problems/minimum-characters-required-to-make-a-string-palindromic/)      | [Java](#ques-66)  | _O(n)_         | _O(1)_          | Easy         |   |
|5| [Longest Palindromic Substring](https://www.interviewbit.com/problems/longest-palindromic-substring/)      | [Java](#ques-67)  | _O(n*n)_         | _O(1)_          | Medium         |  1 length is always palindrome |
|6| [StrStr](https://www.interviewbit.com/problems/implement-strstr/) Locate a substring ( needle ) in a string ( haystack )     | [Java](#ques-68)  | _O(n)_         | _O(m)_          | Medium         |  KMP Algo |
|7| [Compare Version Numbers](https://www.interviewbit.com/problems/compare-version-numbers/)      | [Java](#ques-69)  | _O(n)_         | _O(n)_          | Medium         |  
|8| [Atoi](https://www.interviewbit.com/problems/atoi/) Implement atoi to convert a string to an integer.     | [Java](#ques-70)  | _O(n)_         | _O(1)_          | Easy         |  
|9| [Length of Last Word](https://www.interviewbit.com/problems/length-of-last-word/)      | [Java](#ques-71)  | _O(n)_         | _O(1)_          | Easy         |  |
|10| [Reverse the String](https://www.interviewbit.com/problems/reverse-the-string/)      | [Java](#ques-72)  | _O(n)_         | _O(n)_          | Easy         | Ask if split function can be used|
|11| [Valid Number](https://www.interviewbit.com/problems/valid-number/)      | [Java](#ques-73)  | _O(n)_         | _O(1)_          | Easy         | Lots of corner cases|
|12| [Valid Ip Addresses](https://www.interviewbit.com/problems/valid-ip-addresses/)      | [Java](#ques-74)  | _O(n)_         | _O(1)_          | Easy         | Placing 3 dots|
|13| [Roman To Integer](https://www.interviewbit.com/problems/roman-to-integer/)      | [Java](#ques-75)  | _O(n)_         | _O(1)_          | Easy         | 
|14| [Integer To Roman](https://www.interviewbit.com/problems/integer-to-roman/)      | [Java](#ques-76)  | _O(n)_         | _O(1)_          | Easy         | Ask if you can have diff arrays to store value|
|15| [Add Binary Strings](https://www.interviewbit.com/problems/add-binary-strings/)      | [Java](#ques-77)  | _O(n)_         | _O(1)_          | Easy         | Shorter Solution|
|16| [Power of 2](https://www.interviewbit.com/problems/power-of-2/)      | [Java](#ques-78)  | _O(logn)_         | _O(1)_          | Easy         | Use of CompareTo function|
|17| [Multiply Strings](https://www.interviewbit.com/problems/multiply-strings/)      | [Java](#ques-79)  | _O(n*m)_         | _O(1)_          | Easy         | 
|18| [Justified Text](https://www.interviewbit.com/problems/justified-text/)      | [Java](#ques-80)  | _O(n*n)_         | _O(n)_          | HARD         | Used Greedy Approach|
|19| [ZigZag String](https://www.interviewbit.com/problems/zigzag-string/)      | [Java](#ques-81)  | _O(n)_         | _O(1)_          | Medium         | 
|20| [Pretty Json](https://www.interviewbit.com/problems/pretty-json/)      | [Java](#ques-82)  | _O(n)_         | _O(1)_          | Medium         | 
|21| [Stringoholics](https://www.interviewbit.com/problems/stringoholics/)      | [Java](#ques-83)  | _O(n*m, n*maxNum)_         | _O(n+m)_ n is input array length, m is average size of each string          | HARD         | Covers many concepts - KMP, LCM|
|22| [Amazing Substring]() You are given a string S, and you have to find all the amazing substrings of S. Amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).     | [Java](#ques-84)  | _O(n)_         | _O(1)_          | Medium         | 

<a name="bitmanipulation"></a>
## BitManipulation


|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Min XOR Value](https://www.interviewbit.com/problems/min-xor-value/)      | [Java](#ques-85)  | _O(nlogn)_         | _O(1)_          | Easy         |  |
|2| [Single Number](https://www.interviewbit.com/problems/single-number/)      | [Java](#ques-86)  | _O(n)_         | _O(1)_          | Easy         |  |
|3| [Number of 1 Bits](https://www.interviewbit.com/problems/number-of-1-bits/)      | [Java](#ques-87)  | _O(1)_         | _O(1)_          | Easy         | 2nd Solution with bits trick |
|4| [Reverse Bits](https://www.interviewbit.com/problems/reverse-bits/)      | [Java](#ques-88)  | _O(1)_         | _O(1)_          | Easy         | 2nd Solution |
|5| [Single Number II](https://www.interviewbit.com/problems/single-number-ii/) Given an array of integers, every element appears thrice except for one which occurs once.     | [Java](#ques-89)  | _O(n)_         | _O(1)_          | Medium         | 3x+1 |
|6| [Divide Integers](https://www.interviewbit.com/problems/divide-integers/)      | [Java](#ques-90)  | _O(log(dividend))_         | _O(1)_          | Medium         | 1 approach is to subtract divisor, but takes O(dividend) time |
|7| [Different Bits Sum Pairwise](https://www.interviewbit.com/problems/different-bits-sum-pairwise/) We define f(X, Y) as number of different corresponding bits in binary representation of X and Y. For example, f(2, 7) = 2, since binary representation of 2 and 7 are 010 and 111, respectively. The first and the third bit differ, so f(2, 7) = 2. You are given an array of N positive integers, A1, A2 ,…, AN. Find sum of f(Ai, Aj) for all pairs (i, j) such that 1 ≤ i, j ≤ N.     | [Java](#ques-91)  | _O(n)_         | _O(1)_          | Medium         | |

<a name="twopointers"></a>
## TwoPointers


|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Merge Two Sorted Lists II](https://www.interviewbit.com/problems/merge-two-sorted-lists-ii/)      | [Java](#ques-92)  | _O(n+m)_         | _O(1)_          | Easy         |   |
|2| [Intersection Of Sorted Arrays](https://www.interviewbit.com/problems/intersection-of-sorted-arrays/) Find the intersection of two sorted arrays OR in other words, Given 2 sorted arrays, find all the elements which occur in both the arrays.     | [Java](#ques-93)  | _O(n+m)_         | _O(1)_          | Easy         |   |
|3| [Minimize the absolute difference](https://www.interviewbit.com/problems/minimize-the-absolute-difference/) Given three sorted arrays A, B and C of not necessarily same sizes. Minimize | max(a,b,c) - min(a,b,c) |.     | [Java](#ques-94)  | _O(maxArrayLength)_         | _O(1)_          | Easy         | Abs diff can be minimized either decreasing max element or increasing min element  |
|4| [Remove Duplicates from Sorted Array](https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array/)      | [Java](#ques-95)  | _O(n)_         | _O(1)_          | Easy         | Removing Element increases complexity, just set elements with 2nd pointer  |
|5| [Remove Duplicates from Sorted Array 2](https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array-ii/) Given a sorted array, remove the duplicates in place such that each element can appear atmost twice and return the new length.     | [Java](#ques-96)  | _O(n)_         | _O(1)_          | Easy         |  |
|6| [Remove Element from Array](https://www.interviewbit.com/problems/remove-element-from-array/)      | [Java](#ques-97)  | _O(n)_         | _O(1)_          | Easy         |   |
|7| [Sort by Color](https://www.interviewbit.com/problems/sort-by-color/)      | [Java](#ques-98)  | _O(n)_         | _O(1)_          | Easy         |   |
|8| [Diffk](https://www.interviewbit.com/problems/diffk/) Given an array ‘A’ of sorted integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.     | [Java](#ques-99)  | _O(n)_         | _O(1)_          | Easy         |  Start both pointers from 0 and not from opp. extreme ends|
|9| [3 Sum](https://www.interviewbit.com/problems/3-sum/)      | [Java](#ques-100)  | _O(n^2 + nlogn)_         | _O(1)_          | Easy         |  
|10| [3 Sum Zero](https://www.interviewbit.com/problems/3-sum-zero/)      | [Java](#ques-101)  | _O(n^2 + nlogn)_         | _O(1)_          | Medium         |  Handle Duplicates|
|11| [Max Continuous Series of 1s](https://www.interviewbit.com/problems/max-continuous-series-of-1s/)      | [Java](#ques-102)  | _O(n)_         | _O(1)_          | Medium         |  Keeping window size having zeroes <= B|
|12| [Array 3 Pointers](https://www.interviewbit.com/problems/array-3-pointers/) You are given 3 arrays A, B and C. All 3 of the arrays are sorted. Find i, j, k such that : max(abs(A[i] - B[j]), abs(B[j] - C[k]), abs(C[k] - A[i])) is minimized. Return the minimum max(abs(A[i] - B[j]), abs(B[j] - C[k]), abs(C[k] - A[i]))     | [Java](#ques-103)  | _O(maxArrayLength)_         | _O(1)_          | Medium         | Abs diff can be minimized either decreasing max element or increasing min element   |
|13| [Counting Triangles](https://www.interviewbit.com/problems/counting-triangles/)      | [Java](#ques-104)  | _O(n^2)_         | _O(1)_          | Medium         | A+B) > C by sorting the array   |
|14| [Container With Most Water](https://www.interviewbit.com/problems/container-with-most-water/) Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 'n' vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.     | [Java](#ques-105)  | _O(n)_         | _O(1)_          | Medium         |   |

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
|7| [Remove Nth Node from List End](https://www.interviewbit.com/problems/remove-nth-node-from-list-end/)      | [Java](#ques-112)  | _O(n)_         | _O(1)_          | Easy         |   |
|8| [Rotate List](https://www.interviewbit.com/problems/rotate-list/)      | [Java](#ques-113)  | _O(n)_         | _O(1)_          | Easy         |   |
|9| [Reverse Lists 2](https://www.interviewbit.com/problems/reverse-link-list-ii/) Reverse a linked list from position m to n. Do it in-place and in one-pass.     | [Java](#ques-114)  | _O(n)_         | _O(1)_          | Easy         |  |
|10| [Reorder List](https://www.interviewbit.com/problems/reorder-list/)      | [Java](#ques-115)  | _O(n)_         | _O(1)_          | Medium         |  Reverse Half and merge alternate |
|11| [Swap List Nodes in pairs](https://www.interviewbit.com/problems/swap-list-nodes-in-pairs/)      | [Java](#ques-116)  | _O(n)_         | _O(1)_          | Medium         |   |
|12| [K reverse linked list](https://www.interviewbit.com/problems/k-reverse-linked-list/)      | [Java](#ques-117)  | _O(n)_         | _O(1)_          | Medium         |   |
|13| [Add Two Numbers as Lists](https://www.interviewbit.com/problems/add-two-numbers-as-lists/)      | [Java](#ques-118)  | _O(n)_         | _O(1)_          | Easy         |   |
|14| [List Cycle](https://www.interviewbit.com/problems/list-cycle/) Find the cycle in the linkedlist if it exists.     | [Java](#ques-119)  | _O(n)_         | _O(1)_          | Medium         |  |
|15| [Partition List](https://www.interviewbit.com/problems/partition-list/) Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.     | [Java](#ques-120)  | _O(n)_         | _O(1)_          | Easy         |   |
|16| [Sort List](https://www.interviewbit.com/problems/sort-list/) Merge sort     | [Java](#ques-121)  | _O(nlogn)_         | _O(1)_          | Medium         |   |
|17| [Insertion Sort List](https://www.interviewbit.com/problems/insertion-sort-list/) Insertion sort     | [Java](#ques-122)  | _O(n^2)_         | _O(1)_          | Medium         |   |

<a name="stack"></a>
## Stack


|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Simplify Directory Path](https://www.interviewbit.com/problems/simplify-directory-path/)      | [Java](#ques-123)  | _O(n)_         | _O(n)_          | Easy         |   |
|2| [Redundant Braces](https://www.interviewbit.com/problems/redundant-braces/)      | [Java](#ques-124)  | _O(n)_         | _O(n)_          | Easy         |   |
|3| [Nearest Smaller Element](https://www.interviewbit.com/problems/nearest-smaller-element/)      | [Java](#ques-125)  | _O(n)_         | _O(n)_          | Easy         |   |
|4| [Evaluate Expression](https://www.interviewbit.com/problems/evaluate-expression/)      | [Java](#ques-126)  | _O(n)_         | _O(n)_          | Easy         |   |
|5| [Min Stack](https://www.interviewbit.com/problems/min-stack/)      | [Java](#ques-127)  | _O(1)_         | _O(1)_          | Easy         |  Doing Min in O(1) space is good one|
|6| [Largest Rectangle in Histogram](https://www.interviewbit.com/problems/largest-rectangle-in-histogram/)      | [Java](#ques-128)  | _O(n)_         | _O(n)_          | Medium         |  Do read brute force and think in terms of stack|
|7| [Rain Water Trapped](https://www.interviewbit.com/problems/rain-water-trapped/)      | [Java](#ques-129)  | _O(n)_         | _O(n)_          | Medium         |  |


<a name="queue"></a>
## Queue

|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Sliding Window Maximum](https://www.interviewbit.com/problems/sliding-window-maximum/)      | [Java](#ques-130)  | _O(n)_         | _O(n)_          | Medium         |  Finding Min is reverse of current logic|


<a name="backtracking"></a>
## Backtracking

|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [ReverseLinkedList](https://www.interviewbit.com/problems/reverse-link-list-recursion/)      | [Java](#ques-131)  | _O(n)_         | _O(n)_          | Easy         |  |
|2| [Modular Expression](https://www.interviewbit.com/problems/modular-expression/)      | [Java](#ques-132)  | _O(log(power))_         | _O(1)_          | Easy         |  Modular Exponentiation |
|3| [Subset](https://www.interviewbit.com/problems/subset/) Given a set of distinct integers, S, return all possible subsets in lexicographically sorted order.     | [Java](#ques-133)  | _O(2^n)_         | _O(n)_          | Easy         |  Backtracking general algo |
|4| [Combinations](https://www.interviewbit.com/problems/combinations/) Given two integers n and k, return all possible combinations of k numbers out of 1 2 3 ... n. Make sure the combinations are sorted.     | [Java](#ques-134)  | _O(nCk)_         | _O(n)_          | Easy         |  Backtracking general algo |
|5| [Combination Sum](https://www.interviewbit.com/problems/combination-sum/) Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T. The same repeated number may be chosen from C unlimited number of times.     | [Java](#ques-135)  | _O(2^n)_         | _O(targetSum)_          | Easy         |  Backtracking general algo, Use Map for checking duplicates |
|6| [Combination Sum 2](https://www.interviewbit.com/problems/combination-sum-ii/) Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.     | [Java](#ques-136)  | _O(2^n)_         | _O(targetSum)_          | Easy         |   |
|7| [SubSets 2](https://www.interviewbit.com/problems/subsets-ii/) Given a collection of integers that might contain duplicates, S, return all possible subsets in lexicographically sorted fashion.     | [Java](#ques-137)  | _O(2^n)_         | _O(n)_          | Easy         |  Either use hashmap or skip continuous elements in recursion function |
|8| [Letter Phone](https://www.interviewbit.com/problems/letter-phone/) Given a digit string, return all possible letter combinations that the number could represent.     | [Java](#ques-138)  | _O(3^n)_         | _O(n)_          | Easy         |   |
|9| [Palindrome Partitioning](https://www.interviewbit.com/problems/palindrome-partitioning/) Given a string s, partition s such that every string of the partition is a palindrome. Return all possible palindrome partitioning of s.     | [Java](#ques-139)  | _O(2^n)_         | _O(n)_          | Easy         |  can maintain 2-D array to keep true/false whether start-end is palindrome or not (DP) |
|10| [Generate all Parentheses II](https://www.interviewbit.com/problems/generate-all-parentheses-ii/) Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses of length 2*n.     | [Java](#ques-140)  | _O(2^n)_         | _O(2n)_          | Easy         |   |
|11| [Permutations](https://www.interviewbit.com/problems/permutations/) Given a collection of numbers, return all possible permutations.     | [Java](#ques-141)  | _O(n!)_         | _O(n)_          | Medium         | Either use visited array or remove integer from input array then add back while backtracking  |
|12| [Gray Code](https://www.interviewbit.com/problems/gray-code/) The gray code is a binary numeral system where two successive values differ in only one bit. Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.     | [Java](#ques-142)  | _O(2^n)_         | _O(n)_          | Medium         | Other Solution of using reverse of (N-1) and prefixing 1 is good  |
|13| [Kth Permutation Sequence](https://www.interviewbit.com/problems/kth-permutation-sequence/)      | [Java](#ques-143)  | _O(nk)_         | _O(n)_          | Medium         | Use Maths plus recursion, first digit = k/(n-1)!+1  |
|14| [NQueens](https://www.interviewbit.com/problems/nqueens/) The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.     | [Java](#ques-144)  | _O(n*n)_         | _O(n)_          | Medium         |  |


<a name="hashing"></a>
## Hashing

|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Colorful Number](https://www.interviewbit.com/problems/colorful-number/) A number can be broken into different contiguous sub-subsequence parts. Suppose, a number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245. And this number is a COLORFUL number, since product of every digit of a contiguous subsequence is different     | [Java](#ques-145)  | _O(n*n)_         | _O(n)_          | Easy         |   |
|2| [Largest Continuous Sequence Zero Sum](https://www.interviewbit.com/problems/largest-continuous-sequence-zero-sum/) Find the largest continuous sequence in a array which sums to zero.     | [Java](#ques-146)  | _O(n)_         | _O(n)_          | Easy         |  3 conditions - element 0, sum 0 or sum repeated |
|3| [2 Sum](https://www.interviewbit.com/problems/2-sum/)      | [Java](#ques-147)  | _O(n)_         | _O(1)_          | Easy         |   |
|4| [4 Sum](https://www.interviewbit.com/problems/4-sum/)      | [Java](#ques-148)  | _O(n*n+nlogn)_         | _O(n)_          | Medium         |  Either use n^3 solution using 2 pointers and hashSet for unique sets or or use customised sorting plus hashSet |
|5| [Valid Sudoku](https://www.interviewbit.com/problems/valid-sudoku/)      | [Java](#ques-149)  | _O(n*n)_         | _O(n*n)_          | Medium         |  check row, col and box, keep different maps |
|6| [Diffk II](https://www.interviewbit.com/problems/diffk-ii/) Given an array A of integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.     | [Java](#ques-150)  | _O(n)_         | _O(n)_          | Easy         |   |
|7| [Anagrams](https://www.interviewbit.com/problems/anagrams/) Given an array of strings, return all groups of strings that are anagrams. Represent a group by a list of integers representing the index in the original list. Look at the sample case for clarification.     | [Java](#ques-151)  | _O(n*m)_ , where m = average length of string       | _O(n)_          | Medium         |  Good Concept |
|8| [Equal](https://www.interviewbit.com/problems/equal/) Given an array A of integers, find the index of values that satisfy A + B = C + D, where A,B,C & D are integers values in the array.     | [Java](#ques-152)  | _O(n*n)_        | _O(n)_          | Medium         |  |
|9| [Copy List](https://www.interviewbit.com/problems/copy-list/) A linked list is given such that each node contains an additional random pointer which could point to any node in the list or NULL. Return a deep copy of the list.     | [Java](#ques-153)  | _O(n)_        | _O(n)_          | Medium         |   |
|10| [Longest Substring Without Repeat](https://www.interviewbit.com/problems/longest-substring-without-repeat/) Given a string, find the length of the longest substring without repeating characters.     | [Java](#ques-154)  | _O(n)_        | _O(n)_          | Medium         |  |
|11| [Window String](https://www.interviewbit.com/problems/window-string/) Given a string S and a string T, find the minimum window in S which will contain all the characters in T in linear time complexity. Note that when the count of a character C in T is N, then the count of C in minimum window in S should be at least N.     | [Java](#ques-155)  | _O(n)_        | _O(n)_          | Medium         | Use 2 pointers and map to keep count of characters included - plus and minus   |
|12| [Fraction](https://www.interviewbit.com/problems/fraction/)      | [Java](#ques-156)  | _O(n)_        | _O(n)_          | Medium         |   |
|13| [Points on the Straight Line](https://www.interviewbit.com/problems/points-on-the-straight-line/) Given n points on a 2D plane, find the maximum number of points that lie on the same straight line.     | [Java](#ques-157)  | _O(n*n)_        | _O(n)_          | Medium         | Slope should be same, Consider first point as start and rest as end and create map and repeat; Keep edge cases like which slopes are valid and others keep in diff variables   |
|14| [Substring Concatenation](https://www.interviewbit.com/problems/substring-concatenation/) You are given a string, S, and a list of words, L, that are all of the same length. Find all starting indices of substring(s) in S that is a concatenation of each word in L exactly once and without any intervening characters.     | [Java](#ques-158)  | _O(n*n)_        | _O(n)_          | Medium         | Brute force but just using hashmap for string match   |


<a name="heaps"></a>
## Heaps

|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [N max pair combinations](https://www.interviewbit.com/problems/n-max-pair-combinations/)      | [Java](#ques-159)  | _O(nlogn)_         | _O(n)_          | Medium         |  Create a min heap and loop through n^2 pairs  |
|2| [Magician and Chocolates](https://www.interviewbit.com/problems/magician-and-chocolates/) Given N bags, each bag contains Ai chocolates. There is a kid and a magician. In one unit of time, kid chooses a random bag i, eats Ai chocolates, then the magician fills the ith bag with floor(Ai/2) chocolates. Given Ai for 1 <= i <= N, find the maximum number of chocolates kid can eat in K units of time.     | [Java](#ques-160)  | _O(klogn)_         | _O(n)_          | Easy         |    |
|3| [Merge K Sorted Lists](https://www.interviewbit.com/problems/merge-k-sorted-lists/) Merge k sorted linked lists and return it as one sorted list.     | [Java](#ques-161)  | _O(Nlogk)_, where k = initial lists and N = total sum of nodes from all lists         | _O(k)_          | Medium         |    |


<a name="hashmaps"></a>
## HashMap

|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Distinct Numbers in Window](https://www.interviewbit.com/problems/distinct-numbers-in-window/) You are given an array of N integers, A1, A2 ,…, AN and an integer K. Return the of count of distinct numbers in all windows of size K. Formally, return an array of size N-K+1 where i’th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,…, Ai+k-1.     | [Java](#ques-162)  | _O(n)_         | _O(n)_          | Easy         |    |
|2| [LRU](https://www.interviewbit.com/problems/lru-cache/)      | [Java](#ques-163)  | _O(1)_ for get and O(n) for set         | _O(n)_          | Easy         |    |
|3| [Ways to form Max Heap](https://www.interviewbit.com/problems/ways-to-form-max-heap/)      | [Java](#ques-164)  | _O(log2n^2)_          | _O(log2n)_          | Hard         |  T(n) = n-1Cl*T(l)*T(r), where r = n-1-l  |


<a name="trees"></a>
## Trees

|  Id  | Problem           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Valid Binary Search Tree](https://www.interviewbit.com/problems/valid-binary-search-tree/)      | [Java](#ques-165)  | _O(n)_         | _O(log2n)_          | Easy         |    |
|2| [Next Greater Number BST](https://www.interviewbit.com/problems/next-greater-number-bst/)      | [Java](#ques-166)  | _O(logn)_         | _O(1)_          | Easy         |  Good Question plus also know inorder using 1 stack  |
|3| [Max Depth of Binary Tree](https://www.interviewbit.com/problems/max-depth-of-binary-tree/)      | [Java](#ques-167)  | _O(n)_         | _O(n)_          | Easy         |    |
|4| [Vertical Order traversal of Binary Tree](https://www.interviewbit.com/problems/vertical-order-traversal-of-binary-tree/)      | [Java](#ques-168)  | _O(n)_         | _O(n)_          | Easy         |    |
|5| [Inorder Traversal](https://www.interviewbit.com/problems/inorder-traversal/)      | [Java](#ques-169)  | _O(n)_         | _O(n)_          | Easy         |   |
|6| [PreOrder Traversal](https://www.interviewbit.com/problems/preorder-traversal/)      | [Java](#ques-170)  | _O(n)_         | _O(n)_          | Easy         |   |
|6| [PreOrder Traversal](https://www.interviewbit.com/problems/preorder-traversal/)      | [Java](#ques-171)  | _O(n)_         | _O(n)_          | Easy         |   |
|7| [PostOrder Traversal](https://www.interviewbit.com/problems/postorder-traversal/)      | [Java](#ques-172)  | _O(n)_         | _O(n)_          | Medium         |  Using 2 stacks is easy  |
|8| [Hotel Reviews](https://www.interviewbit.com/problems/hotel-reviews/) Given a set of reviews provided by the customers for different hotels and a string containing “Good Words”, you need to sort the reviews in descending order according to their “Goodness Value” (Higher goodness value first). We define the “Goodness Value” of a string as the number of “Good Words” in that string.     | [Java](#ques-173)  | _O(Sum of all input strings length)_         | _O(n)_          | Medium         |  Use tries or Hashset   |
|9| [Balanced Binary Tree](https://www.interviewbit.com/problems/balanced-binary-tree/) Given two binary trees, write a function to check if they are equal or not. Two binary trees are considered equal if they are structurally identical and the nodes have the same value.     | [Java](#ques-174)  | _O(n)_         | _O(n)_          | Easy         |     |
|10| [Identical Binary Trees](https://www.interviewbit.com/problems/identical-binary-trees/)      | [Java](#ques-175)  | _O(n)_         | _O(n)_          | Easy         |     |
|11| [Symmetric Binary Tree](https://www.interviewbit.com/problems/symmetric-binary-tree/) Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).     | [Java](#ques-176)  | _O(n)_         | _O(n)_          | Easy         |     |
|12| [Inorder Traversal of Cartesian Tree](https://www.interviewbit.com/problems/inorder-traversal-of-cartesian-tree/)      | [Java](#ques-177)  | _O(n)_         | _O(n)_          | Easy         |     |
|13| [Sorted Array To Balanced BST](https://www.interviewbit.com/problems/sorted-array-to-balanced-bst/)      | [Java](#ques-178)  | _O(n)_         | _O(n)_          | Easy         |     |
|14| [Binary Tree From Inorder And Postorder](https://www.interviewbit.com/problems/binary-tree-from-inorder-and-postorder/)      | [Java](#ques-179)  | _O(n)_         | _O(n)_          | Easy         |    |
|15| [Construct Binary Tree From Inorder And Preorder](https://www.interviewbit.com/problems/construct-binary-tree-from-inorder-and-preorder/)      | [Java](#ques-180)  | _O(n)_         | _O(n)_          | Easy         |     |
|16| [Kth Smallest Element In Tree](https://www.interviewbit.com/problems/kth-smallest-element-in-tree/) Given a binary search tree, write a function to find the kth smallest element in the tree.     | [Java](#ques-181)  | _O(n)_         | _O(n)_          | Easy         |  Can be done without extra space as well   |
|17| [2-Sum Binary Tree](https://www.interviewbit.com/problems/2sum-binary-tree/)      | [Java](#ques-182)  | _O(n)_         | _O(logn)_          | Medium         |  Can be done in O(n) space with sorted array   |
|18| [BST Iterator](https://www.interviewbit.com/problems/bst-iterator/) Implement an iterator over a binary search tree (BST) with next() and hasnext() functions. Your iterator will be initialized with the root node of a BST.     | [Java](#ques-183)  | _O(1)_         | _O(logn)_          | Easy         |  Can be done in O(n) space with array   |
|19| [Recover Binary Search Tree](https://www.interviewbit.com/problems/recover-binary-search-tree/)      | [Java](#ques-184)  | _O(n)_         | _O(1)_          | Medium         |   Morris Algo - attaching current to inorder predecessor, Can be done in O(n) space with array, rest concept is same  |
|20| [Invert the Binary Tree](https://www.interviewbit.com/problems/invert-the-binary-tree/)      | [Java](#ques-185)  | _O(n)_         | _O(n)_          | Easy         |   |
|21| [ZigZag Level Order Traversal BT](https://www.interviewbit.com/problems/zigzag-level-order-traversal-bt/)      | [Java](#ques-186)  | _O(n)_         | _O(n)_          | Easy         |  Can be solved using 2 stacks or queue  |
|22| [Min Depth of Binary Tree](https://www.interviewbit.com/problems/min-depth-of-binary-tree/)      | [Java](#ques-187)  | _O(n)_         | _O(n)_          | Easy         |    |
|23| [Path Sum](https://www.interviewbit.com/problems/path-sum/) Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.     | [Java](#ques-188)  | _O(n)_         | _O(n)_          | Easy         |    |
|24| [Sum Root to Leaf Numbers](https://www.interviewbit.com/problems/sum-root-to-leaf-numbers/) Represent numbers as paths from root to all leaves and sum them all up.     | [Java](#ques-189)  | _O(n)_         | _O(n)_          | Medium         |  mod can be used even before number is formed |
|25| [Root to Leaf Paths With Sum](https://www.interviewbit.com/problems/root-to-leaf-paths-with-sum/)      | [Java](#ques-190)  | _O(n)_         | _O(n)_          | Medium         |  |
|26| [Populate Next Right Pointers Tree](https://www.interviewbit.com/problems/populate-next-right-pointers-tree/)      | [Java](#ques-191)  | _O(n)_         | _O(1)_          | Medium         |  If Space was not constant then using queue is very easy |
|27| [Least Common Ancestor](https://www.interviewbit.com/problems/least-common-ancestor/) Find the lowest common ancestor in an unordered binary tree given two values in the tree.     | [Java](#ques-192)  | _O(n)_         | _O(n)_          | Medium         |  |
|28| [Shortest Unique Prefix](https://www.interviewbit.com/problems/shortest-unique-prefix/) Find shortest unique prefix to represent each word in the list.     | [Java](#ques-193)  | _O(n*m)_         | _O(total unique characters)_          | Medium         |  either use count of unique flag at each node, update the child's property and not current node |
|29| [Flatten Binary Tree to Linked List](https://www.interviewbit.com/problems/flatten-binary-tree-to-linked-list/) Given a binary tree, flatten it to a linked list (right skewed binary tree) in-place.     | [Java](#ques-194)  | _O(n)_         | _O(1)_          | Medium         |  Can be solved using stack or recursion |
|30| [Order of People Heights](https://www.interviewbit.com/problems/order-of-people-heights/) You are given the following : A positive number N, Heights : A list of heights of N persons standing in a queue, Infronts : A list of numbers corresponding to each person (P) that gives the number of persons who are taller than P and standing in front of P. You need to return list of actual order of persons’s height     | [Java](#ques-195)  | _O(nlogn)_         | _O(n)_          | Medium         |  Solve it like a puzzle, good question |


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
public class Solution {
     public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 2; i < A; i++) {
            if (isPrime(i) && isPrime(A - i)) {
                arr.add(i);
                arr.add(A - i);
                return arr;
            }
        }
        return arr;
    }

    public boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
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
public class Solution {
    public boolean isPower(int a) {
        if(a==1) return true;
	    for (int i = 2; i*i <= a; i++) {
	      int p = a;
	      while(p%i == 0){
	        p/=i;
	      }
	      if(p == 1) return true;
	    }
	    return false;       
    }
}
```
<a name="ques-39"></a>
**Excel Column Number** [Back](#maths) <br>
```java
public class Solution {
	public int titleToNumber(String a) {
	    int num = 0;
	    for (int i = a.length() - 1, j = 0; i >= 0; i--) {
	        num += (int) Math.pow(26, j) * (a.charAt(i) - 'A' + 1);
	        j++;
	    }
	    return num;
	}
}
```
<a name="ques-40"></a>
**Excel Column Title** [Back](#maths) <br>
```java
public class Solution {
    public String convertToTitle(int A) {
        String res = "";
        while (A > 0) {
            char ref = 'A';
            int c = ((A-1) % 26) + (int)ref;
            A = (A-1) / 26;
            // System.out.println((char) c);
            res = (char)c + res;
        }
        return res;
    }
}
```
<a name="ques-41"></a>
**Palindrome Integer** [Back](#maths) <br>
```java
public class Solution {
	public boolean isPalindrome(int a) {
	    if(a == check(a))
	        return true;
	    else
	        return false;
	}
	
	public int check(int num){
        int reverted = 0;
        while (num > 0) {
            reverted = reverted*10 + num%10;
            num /= 10;
        }
      return reverted;
	}
}
```
<a name="ques-42"></a>
**Reverse Integer** [Back](#maths) <br>
```java
public class Solution {
    public int reverse(int A) {
        boolean isNeg = (A < 0) ? true : false;
        A = Math.abs(A);
        int temp = A;
        int dgts = 0;
        while (temp > 0) {
            temp = temp / 10;
            dgts++;
        }
        dgts--;
        double res = 0.;
        while (A > 0) {
            int rem = A % 10;
            A = A / 10;
            res = res + Math.pow(10, dgts) * rem;
            dgts--;
        }
        if (res )
        if (isNeg) { 
            res = res * -1;
        }
        return (int) res;
    }
}
```
<a name="ques-43"></a>
**GCD** [Back](#maths) <br>
```java
public class Solution {
	public int gcd(int a, int b) {
	    if(a == 0) return b;
	    return gcd(b%a, a);
	}
}
```
<a name="ques-44"></a>
**Trailing Zeroes** [Back](#maths) <br>
```java
```
<a name="ques-45"></a>
**Sorted Permutation Rank** [Back](#maths) <br>
```java
public class Solution {
    public int findRank(String A) {
        Set<Character> countSet = new TreeSet<>();
        for (int index=0; index < A.length(); index++) {
            countSet.add(A.charAt(index));
        }
        long rank = 0;
        // System.out.println(countSet);
        for (int index=0; index < A.length(); index++) {
            for (Character c : countSet) {
                if (c != A.charAt(index)) {
                    // System.out.println("No match for " + c);
                    int perm=A.length()-index-1;
                    rank = rank + factorial(perm);
                    // System.out.println("Rank : " + rank);
                } else {
                    // System.out.println("Match for " + c);
                    // System.out.println("Rank : " + rank);
                    break;
                }
            }
            countSet.remove(A.charAt(index));
        }
        return (int) ((rank+1) % 1000003);
    }
    
    long[] fact = new long[100];
    private long factorial(int f) {
        if (f == 0 || f == 1) {
            return 1;
        }
        if (fact[f] == 0l) {
            fact[f] = f * (factorial(f-1) %1000003) %1000003;
        }
        return fact[f];
    }
}
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
public class Solution {
	public void arrange(ArrayList<Integer> A) {
	   	    int n = A.size();
	    for (int i = 0; i < n; i++) A.set(i, A.get(i) + (A.get(A.get(i)) % n) * n );
	    for (int i = 0; i < n; i++) A.set(i, A.get(i) / n);
	}
}
```
<a name="ques-49"></a>
**Grid Unique Paths** [Back](#maths) <br>
```java
public class Solution {
	public int uniquePaths(int a, int b) {
	      /* If either 1 row or 1 column are there then the only way to end
	         is to traverse through that row or column respectively.*/
	    if(a==1 || b==1)
	      return 1;
	      /*If there are more than one row and column then u need to move 
	        either right or down reducing one row or one column respectively
	        and adding that way in answer*/
	    else{
	        int ans = 0;
	        ans = uniquePaths(a-1,b)+uniquePaths(a,b-1);
	        return ans;
	    }
	}
}
```
<a name="ques-50"></a>
**Numbers of length N and value less than K** [Back](#maths) <br>
```java
public class Solution {
    public boolean zeroPresent(ArrayList<Integer> A,int num){
        for(int i=0;i<A.size();i++){
            if(A.get(i)==num){
                return true;
            }
        }
        return false;
    }
    public int calculate(ArrayList<Integer> A,ArrayList<Integer> number,int index,int B){
        if(index==B){
            return 0;
        }
        int lessthan = 0;
        for(int i=0;i<A.size();i++){
            if(A.get(i) < number.get(index)){
                if(A.get(i)==0&&index==0&&B>1)
                    lessthan--;
                lessthan++;
            }
        }
        int result = lessthan*((int)Math.pow(A.size(),B-index-1));
        boolean isPresent = zeroPresent(A,number.get(index));
        if(isPresent){
            result = result+(calculate(A,number,index+1,B));
        }
        return result;
    }
    public int solve(ArrayList<Integer> A, int B, int C) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        while(C!=0){
            number.add(0,C%10);
            C /= 10;
        }
        if(number.size()<B){
            return 0;
        }
        else if(number.size()>B){
            boolean isZero = zeroPresent(A,0);
            if(isZero&&B>1){
                return (A.size()-1)*((int)Math.pow(A.size(),B-1));
            }else{
                return (int)Math.pow(A.size(),B);
            }
        }else{
            return calculate(A,number,0,B);
        }
    }
}
```

### Binary Search
<a name="ques-51"></a>
**SQRT** [Back](#binarysearch) <br>
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
<a name="ques-56"></a>
**Sorted Insert Position** [Back](#binarysearch) <br>
```java
```
<a name="ques-57"></a>
**Implement Power Function** [Back](#binarysearch) <br>
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
<a name="ques-58"></a>
**Rotated Sorted Array Search** [Back](#binarysearch) <br>
```java
public class Solution {
    // DO NOT MODIFY THE LIST
    public int search(final List<Integer> a, int b) {
        int start = 0, end = a.size()-1;
        while (start <= end) {
            int mid = (start + end) >>> 1;
            // System.out.println("START : " + start + " END : " + end + " MID : " + mid);
            if (b == a.get(mid)) {
                return mid;
            }
            if (a.get(start) < a.get(end)) {
                // proper linear structure
                if (b > a.get(mid)) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                // System.out.println("START : " + a.get(start) + " END : " + a.get(end) + " MID : " + a.get(mid));
                if (a.get(mid) > a.get(start)) {
                    if (b < a.get(mid) && b > a.get(end)) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (b > a.get(mid) && b < a.get(start)) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        }
        return -1;
    }
}

```
<a name="ques-59"></a>
**Search for a Range** [Back](#binarysearch) <br>
```java
```
<a name="ques-60"></a>
**Painter's Partition Problem** [Back](#binarysearch) <br>
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
<a name="ques-61"></a>
**Allocate Books** [Back](#binarysearch) <br>
```java
```
<a name="ques-62"></a>
**Median of Array** [Back](#binarysearch) <br>
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

### String
<a name="ques-63"></a>
**Palindrome String** [Back](#strings) <br>
```java
public class Solution {
    public int isPalindrome(String A) {
        int front = 0;
        int tail = A.length()-1;
        while (front < tail) {
            String frontStr = A.charAt(front) + "";
            String tailStr = A.charAt(tail) + "";
            // System.out.println("Checking @ " + front + " " + frontStr + " and @ " + tail + " " + tailStr);
            if (frontStr.equalsIgnoreCase(tailStr)) {
                front++;
                tail--;
                continue;
            } else if (!Character.isLetter(frontStr.charAt(0)) && !Character.isDigit(frontStr.charAt(0))) {
                front++;
            } else if (!Character.isLetter(tailStr.charAt(0)) && !Character.isDigit(tailStr.charAt(0))) {
                tail--;
            } else {
                return 0;
            }
        }
        return 1;
    }
}
```
<a name="ques-64"></a>
**Longest Common Prefix** [Back](#strings) <br>
```java
public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        StringBuilder sb = new StringBuilder();
        int minLength = Integer.MAX_VALUE;
        for (String s : A) {
            minLength = Math.min(minLength, s.length());
        }
        for (int index=0; index < minLength; index++) {
            char c = A.get(0).charAt(index);
            boolean match = true;
            for (String str : A) {
                if (str.charAt(index) != c) {
                    match = false;
                    break;
                }
            }
            if (match) {
                sb.append(c);
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
```
<a name="ques-65"></a>
**Count And Say** [Back](#strings) <br>
```java
public class Solution {
    public String countAndSay(int A) {
        int res = 1;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb_next = new StringBuilder();
        sb.append(1);
        for (int index = 0; index < A-1; index++) {
            int digit = Integer.valueOf(sb.charAt(0) + "");
            int count = 1;
            for (int pos = 1; pos < sb.length(); pos++) {
                if (sb.charAt(pos-1) == sb.charAt(pos)) {
                    count++;
                } else {
                    sb_next.append(count);
                    sb_next.append(digit);
                    count = 1;
                    digit = Integer.valueOf(sb.charAt(pos)+ "");
                }
                // System.out.println(sb_next);
            }
            sb_next.append(count);
            sb_next.append(digit);
            // System.out.println("SB : " + sb + " NEXT : " + sb_next);
            sb = sb_next;
            sb_next = new StringBuilder();
        }
        return sb.toString();
    }
}
```
<a name="ques-66"></a>
**Minimum Characters required to make a String Palindromic** [Back](#strings) <br>
```java
public class Solution {
    public int solve(String A) {
        int n = A.length();
        int ans = n;
        while(n>1 && !isPalindrome(A, n)) {
            n--;
        }
        return ans-n;
    }
    public boolean isPalindrome(String A, int len) {
        int i=0, j=len-1;
        while(i<=j && (A.charAt(i) == A.charAt(j))) {
            i++;j--;
        }
        if(i>j) {
            return true;
        }
        return false;
    }
}
```
<a name="ques-67"></a>
**Longest Palindromic Substring** [Back](#strings) <br>
```java
public class Solution {

    private int start, end, maxLength;

    // finds the longest palindrome with [left, right] as center
    private void checkPalindrome(String A, int left, int right) {
        while (left >= 0 && right < A.length() && A.charAt(left) == A.charAt(right)) {
            if (right - left + 1 > maxLength) {
                start = left;
                end = right + 1;
                maxLength = right - left + 1;
            }
            left--;
            right++;
        }
    }

    public String longestPalindrome(String A) {
        start = 0; end = 0; maxLength = 0;
        for (int i = 0; i < A.length(); i++) {
            checkPalindrome(A, i, i); // odd length, center in i
            checkPalindrome(A, i, i + 1); // even length, center between i and i + 1
        }
        return A.substring(start, end);
    }
}
```
<a name="ques-68"></a>
**StrStr** [Back](#strings) <br>
```java
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int strStr(final String A, final String B) {
        if (B.isEmpty() || A.isEmpty()) {
            return -1;
        }
        int[] kmp = new int[B.length()];
        int start = 0;
        String s = "0 ";
        for (int index=1; index < B.length(); index++) {
            if (B.charAt(start) == B.charAt(index)) {
                start++;
                kmp[index] = start;
            } else {
                start = 0;
            }
            s = s + kmp[index] + " ";
        }
        // kmp[2] = 1;
        System.out.println("KMP : " + s);
        int patternIdx = 0;
        int index = 0;
        while(index < A.length()) {
            System.out.println("Checking A @ " + index + " B @ " + patternIdx);
            if (A.charAt(index) == B.charAt(patternIdx)) {
                patternIdx++;
                if (patternIdx == B.length()) {
                    return (index - B.length() + 1);
                }
                index++;
            } else {
                if (patternIdx != 0)
                    patternIdx = kmp[patternIdx-1];
                else
                    index++;
            }
        }
        return -1;
    }
}
```
<a name="ques-69"></a>
**Compare Version Numbers** [Back](#strings) <br>
```java
```
<a name="ques-70"></a>
**Atoi** [Back](#strings) <br>
```java
public class Solution {
	public int atoi(final String A) {
	    int idx;
	    long num;
	    int n = A.length();
	    boolean sign = true;
	    
	    idx = 0;
	    
	    while (idx < n && A.charAt(idx) == ' ')
	        idx++;
	        
	    if (idx == n)
	        return 0;
	    
	    if (A.charAt(idx) == '-') {
	        sign = false;
	        idx++;
	    } else if (A.charAt(idx) == '+') {
	        idx++;
	    }
	    
	    num = 0;
	    
	    while (idx < n && A.charAt(idx) >= '0' && A.charAt(idx) <= '9') {
	        
	        num = Math.abs(num);
	        num = num * 10 + A.charAt(idx) - '0';
	        
	        if (!sign)
	            num = -num;
	        
	        if (num > Integer.MAX_VALUE)
	            return Integer.MAX_VALUE;
	            
	        else if (num < Integer.MIN_VALUE)
	            return Integer.MIN_VALUE;
	            
	        idx++;
	            

	    }
	    
	    return (int) num;
	    
	}
}
```
<a name="ques-71"></a>
**Length of Last Word** [Back](#strings) <br>
```java
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String s) {
        int len = 0;
        
        int i = s.length()-1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        
        for (i=i; i>=0; i--) {
            if (s.charAt(i) == ' ') {
                return len;
            }
            len++;
        }
        
        return len;
    }
}
```
<a name="ques-72"></a>
**Reverse the String** [Back](#strings) <br>
```java
public class Solution {
    public String reverseWords(String a) {
        String[] arr = a.split(" ");
        for (int index=0; index < arr.length/2; index++) {
            String temp = arr[index];
            arr[index] = arr[arr.length-1-index];
            arr[arr.length-1-index] = temp;
        }
        String res = "";
        for (String s : arr) {
            res = res + s + " ";
        }
        return res.trim();
    }
}
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
public class Solution {
    public int romanToInt(String A) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char prev = ' ';
        for (int index=0; index < A.length(); index++) {
            char curr = A.charAt(index);
            if (prev != ' ' && map.get(prev) < map.get(curr))
                res = res - 2 * map.get(prev);
            res = res + map.get(curr);
            prev = curr;
        }
        return res;
    }
}
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
public class Solution {
    public int power(String A) {
        StringBuilder sb = new StringBuilder();
        if ("0".equals(A) || "1".equals(A))
            return 0;
        int curr = 0;
        while (!"1".equals(A)) {
            for (int index=0; index < A.length(); index++) {
                Integer digit = Integer.valueOf(A.charAt(index) + "");
                curr = curr + digit;
                if (curr < 2) {
                    if (!sb.toString().isEmpty())
                        sb.append("0");
                } else {
                    sb.append(curr/2);
                    curr = curr % 2;
                }
                if (index != A.length()-1)
                    curr = curr * 10;
            }
            // System.out.println(sb);
            if (curr % 2 == 1)
                return 0;
            A = sb.toString();
            sb = new StringBuilder();
        }
        return 1;
    }
}
```
<a name="ques-79"></a>
**Multiply Strings** [Back](#strings) <br>
```java
```
<a name="ques-80"></a>
**Justified Text** [Back](#strings) <br>
```java
public class Solution {
    public ArrayList<String> fullJustify(ArrayList<String> A, int B) {
        ArrayList<String> res = new ArrayList<>();
        int numwords = 0, wordsize = 0;
        StringBuilder sb = new StringBuilder();
        for (int index=0; index < A.size(); index++) {
            wordsize = wordsize + A.get(index).length();
            numwords++;
            int nextwordsize = 0;
            if ((index+1) < A.size()) {
                nextwordsize = wordsize + A.get(index+1).length();
            }
            int spaces = numwords - 1;
            if ((wordsize + spaces) <= B && ((nextwordsize + spaces + 1) > B || nextwordsize == 0)) {
                int blanks = B - wordsize;
                sb.append(A.get(index));
                if (index < A.size() - 1)
                    res.add(formatString(sb.toString(), wordsize, numwords, B));
                else {
                    int b = B - sb.toString().length();
                    for (int i=0; i < b; i++)
                        sb.append(" ");
                    res.add(sb.toString());
                }
                wordsize = 0;
                numwords = 0;
                sb = new StringBuilder();
            } else {
                sb.append(A.get(index) + " ");
            }
        }
        return res;
    }
    
    public String formatString(String str, int wordsize, int numwords, int B) {
        String[] s = str.split(" ");
        int spaces = B - wordsize;
        int eachspace = 0, remspace = 0;
        if (numwords > 1) {
            eachspace = spaces / (numwords - 1);
            remspace = spaces % (numwords - 1);
        }
        StringBuilder sb = new StringBuilder();
        // System.out.println("Formatting : " + sb);
        // System.out.println("Words : " + numwords + " Spaces : " + spaces + " Each : " + eachspace + " Rem : " + remspace);
        for (int index=0; index < s.length-1; index++) {
            sb.append(s[index]);
            for (int i =0; i < eachspace; i++) {
                sb.append(" ");
            }
            if (remspace > 0)
                sb.append(" ");
            remspace--;
        }
        sb.append(s[s.length-1]);
        if (numwords == 1) {
            int b = B - sb.toString().length();
            for (int i=0; i < b; i++)
                sb.append(" ");
        }
        return sb.toString();
    }
}
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
public class Solution {

    final int M = (int) 1e9+7;

    int maxLenSubString(String t){
        int[] lps = new int[t.length()];
        lps[0] = 0;
        int len = 0;
        int n = t.length();
        int i =1;
        int max= 0;

        while(i<n){
            if(t.charAt(i) == t.charAt(len)){
                len++;
                lps[i] = len;
                i++;
                max = Math.max(max,len);
            }
            else{
                if(len == 0){
                    lps[i] = 0;
                    i++;
                }
                else{
                    len = lps[len-1];
                }
            }
        }

        return max;
    }

    long pow(long a, long p){

        long ans = 1;
        while(p>0){
            if(p%2L == 1L){
                ans = (ans * a)%M;
            }
            a = (a*a)%M;
            p /= 2;
        }

        return ans%M;
    }

    void updateLcmMap(Map<Integer, Integer> m, Integer num){

        int i = 2;

        while(i<=num && i > 1){
            int count = 0;

            while(num % i == 0){
                count++;
                num /= i;
            }

            if(count == 0){
                i++;
                continue;
            }

            if(m.containsKey(i)){
                int v = m.get(i);
                if(v < count){
                    m.put(i,count);
                }
            }
            else{
                m.put(i,count);
            }

            i++;
        }
    }

    long getLcm(ArrayList<Integer> lens){

        Map<Integer, Integer> m = new HashMap<>();

        for(Integer num : lens){
            updateLcmMap(m, num);
        }

        long prod = 1;
        for(Map.Entry<Integer, Integer> entry : m.entrySet()){

            int k = entry.getKey();
            int v = entry.getValue();

            long p = pow(k,v) % M;

            prod = (prod * p) % M;
        }

        return prod % M;
    }

    public int solve(ArrayList<String> A) {

        ArrayList<Integer> lens = new ArrayList<>();

        for(String t: A){
            int maxLen = maxLenSubString(t);
            int n = t.length();

            if(n%(n-maxLen) == 0){
                n -= maxLen;
            }

            long sum = 0;
            int i =1;
            do{
                sum += i;
                i++;
            }while(sum % ((long) n) != 0L);

            lens.add(i-1);
        }

        long lcm = getLcm(lens) % M;

        return (int)lcm % M;
    }
}
```
<a name="ques-84"></a>
**Amazing Substring** [Back](#strings) <br>
```java
public class Solution {
    public int solve(String A) {
        long  res = 0;
        for (long outer=0; outer < A.length(); outer++) {
            String str = A.charAt(outer) + "";
            if ("A".equalsIgnoreCase(str) ||"E".equalsIgnoreCase(str) ||"I".equalsIgnoreCase(str) ||
                "O".equalsIgnoreCase(str) ||"U".equalsIgnoreCase(str)) {
                res = res + (A.length()-outer);
            }
        }
        return (int) res % 10003;
    }
}
```

### Bit Manipulation
<a name="ques-85"></a>
**Min XOR Value** [Back](#bitmanipulation) <br>
```java
public class Solution {
    public int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A);
        int min = Integer.MAX_VALUE;
        for (int i=0; i < A.size()-1; i++) {
            min = Math.min(A.get(i) ^ A.get(i+1), min);
        }
        return min;
    }
}
```
<a name="ques-86"></a>
**Single Number** [Back](#bitmanipulation) <br>
```java
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int res = 0;
        for (Integer val : A) {
            res = res ^ val;
        }
        return res;
    }
}
```
<a name="ques-87"></a>
**Number of 1 Bits** [Back](#bitmanipulation) <br>
```java
public class Solution {
	public int numSetBits(long a) {
	    int count = 0;
	    while (a > 0){
	        count+= a%2;
	        a = a>> 1;
	    }
	    return count;
	}
}
```
<a name="ques-88"></a>
**Reverse Bits** [Back](#bitmanipulation) <br>
```java
public class Solution {
	public long reverse(long A) {
	    long rev = 0;
	    
	    for (int i = 0; i < 32; i++) {
	        rev <<= 1;
	        if ((A & (1 << i)) != 0)
	            rev |= 1;
	    }
	    
	    return rev;
	    
	}
}
```
<a name="ques-89"></a>
**Single Number II** [Back](#bitmanipulation) <br>
```java
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int res = 0;
        for(int i=0; i < 32; i++) {
            int sum = 0;
            for (Integer val : A) {
                sum = sum + ((val >>> i) & 1);
            }
            // System.out.println("Index : " + i + " Sum : " + sum);
            sum = sum % 3;
            res = res | (sum << i);
        }
        return res;
    }
}
```
<a name="ques-90"></a>
**Divide Integers** [Back](#bitmanipulation) <br>
```java
public class Solution {
    public int divide(int A, int B) { 
        int res = 0;
        int bits = 31;
        int temp = 0;
        int mult = 1;
        if (A < 0 && B < 0) {
            mult = 1;
        } else if (A < 0 || B < 0) {
            mult = -1;
        }
        // System.out.println("MULT : " + mult);
        A = Math.abs(A);
        B = Math.abs(B);
        while (bits >= 0) {
            temp = (temp << 1) | ((A >>> bits) & 1);
            if (temp >= B) {
                res = (res << 1) | 1;
                // System.out.println("RES : " + res + " TEMP : " + temp);
                temp = temp - B;
            } else {
                res = res << 1;
            }
            bits--;
        }
        if (res < 0 && mult > 0) {
            res = Integer.MAX_VALUE;
        }
        return mult * res;
    }
}
```
<a name="ques-91"></a>
**Different Bits Sum Pairwise** [Back](#bitmanipulation) <br>
```java
public class Solution {
    public int cntBits(ArrayList<Integer> A) {
        long sum = 0;
        for (long i=0; i < 32; i++) {
            long ref = 1l << i;
            long ones = 0;
            long zeros = 0;
            for (Integer val : A) {
                long temp = ref & val;
                if (temp == 0)
                    zeros++;
                else
                    ones++;
            }
            sum = sum + (ones * zeros) % 1000000007;
        }
        return (int) ((2 * sum) % 1000000007);
    }
}
```

### Two Pointers
<a name="ques-92"></a>
**Merge Two Sorted Lists II** [Back](#twopointers) <br>
```java
public class Solution {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> res  = new ArrayList<>();
        int index1 = 0, index2 = 0;
        int A = a.size(), B = b.size();
        while (index1 < A && index2 < B) {
            if (a.get(index1) <= b.get(index2)) {
                a.add(a.get(index1));
                index1++;
            } else {
                a.add(b.get(index2));
                index2++;
            }
        }
        while (index1 < A){
            a.add(a.get(index1));
            index1++;
        }
        while (index2 < B) {
            a.add(b.get(index2));
            index2++;
        }
        for (int index=0; index < A; index++) {
            a.remove(0);
        }
    }
}
```
<a name="ques-93"></a>
**Intersection Of Sorted Arrays** [Back](#twopointers) <br>
```java
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        Map<Integer, Integer> count = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int index=0; index < A.size(); index++) {
            if (count.containsKey(A.get(index))) {
                count.put(A.get(index), count.get(A.get(index)) + 1);
            } else {
                count.put(A.get(index), 1);
            }
        }
        for (int index=0; index < B.size(); index++) {
            if (count.containsKey(B.get(index))) {
                res.add(B.get(index));
                count.put(B.get(index), count.get(B.get(index))-1);
                if (count.get(B.get(index)) == 0)
                    count.remove(B.get(index));
            }
        }
        return res;
    }
}
```
<a name="ques-94"></a>
**Minimize the absolute difference** [Back](#twopointers) <br>
```java
public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int idxA = 0, idxB = 0, idxC = 0;
        int An = A.size(), Bn = B.size(), Cn = C.size();
        int minDiff = Integer.MAX_VALUE;
        while (idxA < An || idxB < Bn || idxC < Cn) {
            int validA = (idxA < An) ? idxA : (An-1);
            int validB = (idxB < Bn) ? idxB : (Bn-1);
            int validC = (idxC < Cn) ? idxC : (Cn-1);
            int max  = Math.max(C.get(validC), 
                       Math.max(A.get(validA), 
                                B.get(validB)));
            int min  = Math.min(C.get(validC), 
                       Math.min(A.get(validA), 
                                B.get(validB)));
            minDiff = Math.min(minDiff, Math.abs(max-min));
            if ((idxA < An) &&
                (idxB == Bn || A.get(idxA) <= B.get(idxB)) && 
                (idxC == Cn || A.get(idxA) <= C.get(idxC))) {
                idxA++;
            } else if ((idxB < Bn) &&
                (idxA == An || B.get(idxB) <= A.get(idxA)) && 
                (idxC == Cn || B.get(idxB) <= C.get(idxC))) {
                idxB++;
            } else {
                idxC++;
            }
        }
        return minDiff;
    }
}
```
<a name="ques-95"></a>
**Remove Duplicates from Sorted Array** [Back](#twopointers) <br>
```java
public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        int start = 0;
        for (int index=1; index < a.size(); index++) {
            if (a.get(start) - a.get(index) == 0) {
                continue;
            } else {
                start++;
                a.set(start, a.get(index));
            }
        }
        start = start + 1;
        // System.out.println("START : " + start);
        a.subList(start, a.size()).clear();
        // for (int index=start; index < a.size(); index++) {
        //     // System.out.println("Removing @ " + index);
        //     a.remove(index);
        // }
        return start;
    }
}
```
<a name="ques-96"></a>
**Remove Duplicates from Sorted Array 2** [Back](#twopointers) <br>
```java
public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        int start = 0, count = 1;
        for (int index=1; index < a.size(); index++) {
            // System.out.println("Comparing " + a.get(start) + " and " + a.get(index));
            if (a.get(start) - a.get(index) == 0) {
                count++;
                if (count == 2) {
                    start++;
                    a.set(start, a.get(index));
                }
            } else {
                start++;
                a.set(start, a.get(index));
                count = 1;
            }
            // System.out.println("START : " + start + " COUNT : " + count + " INDEX : " + index);
        }
        start = start + 1;
        a.subList(start, a.size()).clear();
        return start;
    }
}
```
<a name="ques-97"></a>
**Remove Element from Array** [Back](#twopointers) <br>
```java
public class Solution {
    public int removeElement(ArrayList<Integer> a, int b) {
        int start = 0;
        for (int index = 0; index < a.size(); index++) {
            if (a.get(index) == b) {
                continue;
            } else {
                a.set(start, a.get(index));
                start++;
            }
        }
        a.subList(start, a.size()).clear();
        return a.size();
    }
}
```
<a name="ques-98"></a>
**Sort by Color** [Back](#twopointers) <br>
```java
public class Solution {
    public void sortColors(ArrayList<Integer> a) {
        int zeros = 0, ones = 0, twos = 0;
        for (int index=0; index < a.size(); index++) {
            if (a.get(index) == 0) {
                zeros++;
            } else if (a.get(index) == 1) {
                ones++;
            } else if (a.get(index) == 2) {
                twos++;
            }
        }
        int start = 0;
        for(int index = 0; index < zeros; index++) {
            a.set(start + index, 0);
        }
        start = zeros;
        for(int index = 0; index < ones; index++) {
            a.set(start + index, 1);
        }
        start = ones + zeros;
        for(int index = 0; index < twos; index++) {
            a.set(start + index, 2);
        }
    }
}
```
<a name="ques-99"></a>
**Diffk** [Back](#twopointers) <br>
```java
public class Solution {
    public int diffPossible(ArrayList<Integer> A, int B) {
        int left = 0, right = 1;
        if (A.size() == 1)
            return 0;
        while (right < A.size()) {
            int diff = A.get(right) - A.get(left);
            if (diff == B) {
                return 1;
            } else if (diff > B) {
                left++;
            } else {
                right++;
            }
            if (left == right)
                right++;
        }
        return 0;
    }
}
```
<a name="ques-100"></a>
**3 Sum** [Back](#twopointers) <br>
```java
public class Solution {
    public int threeSumClosest(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int minDist = Integer.MAX_VALUE, res = Integer.MAX_VALUE;
        System.out.println(A);
        // Assume A[outer] is part of the optimal solution
        for (int outer=0; outer < A.size(); outer++) {
            // Now problem becomes sum of two numbers in A - {outer} closest to B - A[outer]
            int start = 0, end = A.size()-1;
            if (outer > 25)
                System.out.println("RES : " + res + " MINDIST : " + minDist + " B : " + B);
            while (start < end) {
                if (start == outer)
                    start++;
                else if (end == outer)
                    end--;
                int sum = A.get(start) + A.get(end) + A.get(outer);
                int dist = Math.abs(B-sum);
                if (dist < minDist) {
                    minDist = dist;
                    res = sum;
                }
                if (sum > B) {
                    // end is too high, reduce
                    start++;
                } else if (sum < B) {
                    // start is too low, increase
                    end--;
                } else {
                    // found match
                    System.out.println("## SUM : " + sum + " DIST : " + dist);
                    return sum;
                }
            }
        }
        System.out.println("DONE!");
        return res;
    }
}
```
<a name="ques-101"></a>
**3 Sum Zero** [Back](#twopointers) <br>
```java
public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        Collections.sort(A);
        // Map<Integer, Integer> count = new HashMap<>();
        // for (int index=0; index < A.size(); index++) {
        //     if (count.containsKey(A.get(index)) {
        //         count.put(A.get(index), count.get(A.get(index)+1));
        //     } else {
        //         count.put(A.get(index), 1);
        //     }
        // }
        // Assuming outer is part of soln
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Set<String> sets = new HashSet<>();
        for (int outer=0; outer < A.size(); outer++) {
            int left = outer+1, right = A.size()-1;
            while (left < right) {
                int sum = A.get(outer) + A.get(left) + A.get(right);
                if (sum == 0) {
                    String str = A.get(outer) + "," + A.get(left) + "," + A.get(right);
                    // System.out.println(str);
                    if (!sets.contains(str)) {
                        sets.add(str);
                        res.add(new ArrayList<>());
                        res.get(res.size()-1).add(A.get(outer));
                        res.get(res.size()-1).add(A.get(left));
                        res.get(res.size()-1).add(A.get(right));
                    }
                    left++;
                } else if (sum > 0) {
                    // too many high numbers, reduce
                    right--;
                } else {
                    // too many low numbers, increase
                    left++;
                }
            }
        }
        return res;
    }
}
```
<a name="ques-102"></a>
**Max Continuous Series of 1s** [Back](#twopointers) <br>
```java
```
<a name="ques-103"></a>
**Array 3 Pointers** [Back](#twopointers) <br>
```java
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int minimize(final List<Integer> A, final List<Integer> B, final List<Integer> C) {
        int idxA = 0, idxB = 0, idxC = 0;
        int An = A.size(), Bn = B.size(), Cn = C.size();
        int minDiff = Integer.MAX_VALUE;
        while (idxA < An || idxB < Bn || idxC < Cn) {
            int validA = (idxA < An) ? idxA : (An-1);
            int validB = (idxB < Bn) ? idxB : (Bn-1);
            int validC = (idxC < Cn) ? idxC : (Cn-1);
            int max = Math.max(
                        Math.abs(A.get(validA) - B.get(validB)), 
                    Math.max(
                        Math.abs(B.get(validB) - C.get(validC)),
                        Math.abs(A.get(validA) - C.get(validC))));
            minDiff = Math.min(minDiff, max);
            if ((idxA < An) &&
                (idxB == Bn || A.get(idxA) <= B.get(idxB)) && 
                (idxC == Cn || A.get(idxA) <= C.get(idxC))) {
                idxA++;
            } else if ((idxB < Bn) &&
                (idxA == An || B.get(idxB) <= A.get(idxA)) && 
                (idxC == Cn || B.get(idxB) <= C.get(idxC))) {
                idxB++;
            } else {
                idxC++;
            }
        }
        return minDiff;
    }
}
```
<a name="ques-104"></a>
**Counting Triangles** [Back](#twopointers) <br>
```java
```
<a name="ques-105"></a>
**Container With Most Water** [Back](#twopointers) <br>
```java
public class Solution {
    public int maxArea(ArrayList<Integer> A) {
        int start = 0, end = A.size()-1;
        int max = 0;
        while (start < end) {
            int vol = Math.min(A.get(start), A.get(end)) * (end - start);
            max = Math.max(vol, max);
            if (A.get(start) <= A.get(end)) {
                start++;
            } else {
                end--;
            }
        }
        return max;
    }
}
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
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode A) {
        ListNode slow = A;
        ListNode fast = A;
        // find middle
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse the second half
        ListNode current = slow.next; 
        // System.out.println(print(current));
        current = reverse(current);
        // System.out.println(print(current));
        // compare the two
        ListNode right = current;
        ListNode left = A;
        int res = 1;
        while (left != null && right != null) {
            if (left.val != right.val) {
                res = 0;
                break;
            }
            left = left.next;
            right = right.next;
        }
        // restore the linked list
        // System.out.println(print(current));
        current = reverse(current);
        // System.out.println(print(current));
        slow.next = current;
        // System.out.println(print(A));
        return res;
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null; 
        ListNode current = head; 
        ListNode next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        }
        return prev; 
    }
    
    private String print(ListNode head) {
        String s = "HEAD => ";
        ListNode temp = head;
        while (temp != null) {
            s = s + temp.val + " => ";
            temp = temp.next;
        }
        s = s + "END";
        return s;
    }
}
```
<a name="ques-109"></a>
**Remove Duplicates from Sorted List** [Back](#linkedlist) <br>
```java
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode prev = A;
        ListNode curr = A.next;
        while (curr != null) {
            if (curr.val == prev.val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return A;
    }
}
```
<a name="ques-110"></a>
**Remove Duplicates from Sorted List 2** [Back](#linkedlist) <br>
```java
```
<a name="ques-111"></a>
**Merge Two Sorted Lists** [Back](#linkedlist) <br>
```java
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (A != null && B != null) {
            ListNode temp = null;
            if (A.val <= B.val) {
                temp = A;
                A = A.next;
            } else {
                temp = B;
                B = B.next;
            }
            tail.next = temp;
            tail = tail.next;
            tail.next = null;
        }
        if (A != null)
            tail.next = A;
        else
            tail.next = B;
        return dummy.next;
    }
}
```
<a name="ques-112"></a>
**Remove Nth Node from List End** [Back](#linkedlist) <br>
```java
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode a, int b) {
        if (a == null)
            return null;

        ListNode fast = a;
        ListNode slow = a;

        for (int i = 0; i < b; i++) {

            fast = fast.next;

            // if remove the first node
            if (fast == null) {
                a = a.next;
                return a;
            }

        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return a;
    }
}
```
<a name="ques-113"></a>
**Rotate List** [Back](#linkedlist) <br>
```java
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode A, int B) {
        int size = 0;
        ListNode prev = null;
        ListNode tail = A;
        while (tail != null) {
            prev = tail;
            tail = tail.next;
            size++;
        }
        tail = prev;
        int rot = B % size;
        ListNode top = A;
        ListNode curr = null;
        // System.out.println("ROT : " + rot);
        for (int index=0; index < (size-rot); index++) {
            if (curr == null)
                curr = A;
            else
                curr = curr.next;
        }
        tail.next = top;
        top = curr.next;
        curr.next = null;
        return top;
    }
}
```
<a name="ques-114"></a>
**Reverse Lists 2** [Back](#linkedlist) <br>
```java
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        ListNode curr = A;
        int count = 1;
        // make curr stop at B-1
        while (curr != null) {
            if (B == 1 || count == B-1)
                break;
            curr = curr.next;
            count++;
        }
        if (B == 1)
            count--;
        ListNode left = curr; // B-1 th node
        if (B > 1)
            curr = curr.next;
        // reverse from curr to count == C
        ListNode prev = null;
        ListNode current = curr;
        ListNode next = null; 
        while (current != null && count < C) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
            count++;
        }
        count--;
        if (B > 1)
            left.next = prev;
        else
            A = prev;
        curr.next = next;
        return A;
    }
    
    private String print(ListNode head) {
        String s = "HEAD => ";
        ListNode temp = head;
        while (temp != null) {
            s = s + temp.val + " => ";
            temp = temp.next;
        }
        s = s + "END";
        return s;
    }
}
```
<a name="ques-115"></a>
**Reorder List** [Back](#linkedlist) <br>
```java
```
<a name="ques-116"></a>
**Swap List Nodes in pairs** [Back](#linkedlist) <br>
```java
```
<a name="ques-117"></a>
**K reverse linked list** [Back](#linkedlist) <br>
```java
```
<a name="ques-118"></a>
**Add Two Numbers as Lists** [Back](#linkedlist) <br>
```java
```
<a name="ques-119"></a>
**List Cycle** [Back](#linkedlist) <br>
```java
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode a) {
        ListNode slow = a;
        ListNode fast = a;
        do {
            slow = slow.next;
            fast = fast.next;
            if (fast == null) 
                break;
            fast = fast.next;
        } while (fast != null && slow != fast);
        // no loop
        if (fast == null)
            return null;
        // Reset slow
        slow = a;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
```
<a name="ques-120"></a>
**Partition List** [Back](#linkedlist) <br>
```java
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode a, int x) {
        if(a == null) return null;
        
        ListNode fakeHead1 = new ListNode(0);
        ListNode fakeHead2 = new ListNode(0);
        fakeHead1.next = a;
        
        ListNode curr = a;
        ListNode prev = fakeHead1;
        ListNode p2 = fakeHead2;
        
        while(curr != null){
            if(curr.val < x){
                curr = curr.next;
                prev = prev.next;
            }
            else{
                p2.next = curr;
                prev.next = curr.next;
                
                curr = prev.next;
                p2 = p2.next;
            }
        }
        p2.next = null;
        
        prev.next = fakeHead2.next;
        return fakeHead1.next;
    }
    
    private void print(ListNode node) {
        String s = "HEAD -> ";
        while (node != null) {
            s = s + node.val + " -> ";
            node = node.next;
        }
        s = s + "TAIL";
        System.out.println(s);
    }
}
```
<a name="ques-121"></a>
**Sort List** [Back](#linkedlist) <br>
```java
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode A) {
        print(A);
        if (A.next == null) {
            System.out.println("RESULT");
            print(A);
            return A;
        }
        ListNode fast = A, slow = A;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next;
            fast = fast.next;
        }
        
        ListNode right = slow.next;
        slow.next = null;
        ListNode left = A;

        left = sortList(left);
        right = sortList(right);
        
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        System.out.println("LEFT");
        print(left);
        System.out.println("RIGHT");
        print(right);
        while (left != null && right != null) {
            ListNode temp = null;
            if (left.val <= right.val) {
                temp = left;
                left = left.next;
            } else {
                temp = right;
                right = right.next;
            }
            tail.next = temp;
            temp.next = null;
        }
        if (left != null)
            tail.next = left;
        else
            tail.next = right;
        System.out.println("RESULT");
        print(dummy.next);
        return dummy.next;
    }
    
    private void print(ListNode node) {
        String s = "HEAD -> ";
        while (node != null) {
            s = s + node.val + " -> ";
            node = node.next;
        }
        s = s + "TAIL";
        System.out.println(s);
    }
}
```
<a name="ques-122"></a>
**Insertion Sort List** [Back](#linkedlist) <br>
```java
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode A) {
        ListNode curr = A;
        while (curr != null) {
            ListNode temp = curr;
            ListNode swap = null;
            int minVal = Integer.MAX_VALUE;
            
            while (temp != null) {
                if (temp.val < minVal) {
                    minVal = temp.val;
                    swap = temp;
                }
                
                temp = temp.next;
            }
            
            swap.val = curr.val;
            curr.val = minVal;
            
            curr = curr.next;
        }
        
        return A;
    }
    
    private void print(ListNode node) {
        String s = "HEAD -> ";
        while (node != null) {
            s = s + node.val + " -> ";
            node = node.next;
        }
        s = s + "TAIL";
        System.out.println(s);
    }
}
```

### Stack
<a name="ques-123"></a>
**Simplify Directory Path** [Back](#stack) <br>
```java
public class Solution {
    public String simplifyPath(String A) {
        String[] op = A.trim().split("/");
        Deque<String> stack = new ArrayDeque<>();
        for (String s : op) {
            if (!s.isEmpty()) {
                if (".".equals(s)) {
                    continue;
                } else if ("..".equals(s)) {
                    if (stack.size() > 0)
                        stack.removeLast();
                } else {
                    stack.addLast(s);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if (stack.size() == 0) {
            sb.append("/");
        } else {
            while (stack.size() > 0) {
                sb.append("/");
                String s = stack.removeFirst();
                sb.append(s);
            }
        }
        return sb.toString();
    }
}
```
<a name="ques-124"></a>
**Redundant Braces** [Back](#stack) <br>
```java
public class Solution {
    public int braces(String A) {
        Stack<Character> stack = new Stack<>();
        for (char c : A.toCharArray()) {
            if (c == ')') {
                char top = stack.peek();
                stack.pop();
                
                if (top == '(') return 1;
                else {
                    int count = 0;
                    while (top != '(') {
                        top = stack.peek();
                        stack.pop();
                        count++;
                    }
                    
                    if (count == 1) return 1;
                }
            }
            else {
                stack.add(c);
            }
        }
        return 0;
    }
}
```
<a name="ques-125"></a>
**Nearest Smaller Element** [Back](#stack) <br>
```java
public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(-1);
        int start = 1;
        while (start < A.size()) {
            if (A.get(start) > A.get(start-1)) {
                res.add(start-1);
            } else {
                int curr = start-1;
                while (curr >= 0) {
                    int nextLowerIdx = res.get(curr);
                    if (nextLowerIdx == -1 || A.get(nextLowerIdx) < A.get(start)) {
                        res.add(nextLowerIdx);
                        break;
                    }
                    curr = nextLowerIdx;
                }
                if (curr == -1)
                    res.add(-1);
            }
            start++;
        }
        for(int index=0; index < res.size(); index++) {
            if (res.get(index) != -1)
                res.set(index, A.get(res.get(index)));
        }
        return res;
    }
}
```
<a name="ques-126"></a>
**Evaluate Expression** [Back](#stack) <br>
```java
public class Solution {
    public int evalRPN(ArrayList<String> A) {
        Deque<String> stack = new ArrayDeque<>();
        Set<String> ops = new HashSet<>();
        ops.add("+");
        ops.add("-");
        ops.add("*");
        ops.add("/");
        for (String op : A) {
            if (!ops.contains(op)) {
                // System.out.println("Pushing " + op);
                stack.push(op);
            } else {
                int b = Integer.valueOf(stack.pop());
                int a = Integer.valueOf(stack.pop());
                if ("+".equals(op)) {
                    a = a + b;
                } else if ("-".equals(op)) {
                    a = a - b;
                } else if ("*".equals(op)) {
                    a = a * b;
                } else if ("/".equals(op)) {
                    a = a / b;
                }
                // System.out.println("Pushing " + a);
                stack.push(a + "");
            }
        }
        return Integer.valueOf(stack.pop());
    }
}
```
<a name="ques-127"></a>
**Min Stack** [Back](#stack) <br>
```java
// O(n) space
class Solution {
    class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
    
    private Node head = null;
    private Node minhead = null;
    
    public void push(int x) {
        Node node = new Node(x);
        Node minnode = new Node(x);
        if (head == null) {
            head = node;
            minhead = minnode;
        } else {
            node.next = head;
            head = node;
            if (minhead.val < minnode.val) {
                minnode.val = minhead.val;
            }
            minnode.next = minhead;
            minhead = minnode;
        }
    }

    public void pop() {
        if (head != null) {
            head = head.next;
            minhead = minhead.next;
        }
    }

    public int top() {
        if (head == null)
            return -1;
        return head.val;
    }

    public int getMin() {
        if (minhead == null)
            return -1;
        return minhead.val;
    }
}
// O(1) space
public class MinStack {

    private Stack<Integer> values = new Stack<>();
    private int minValue = -1;

    public void push(int x) {
        if(values.empty()){
            values.push(x);
            minValue = x;
        }
        else{
            if( x < minValue){
                values.push(2*x - minValue);
                minValue = x;
            }
            else{
                values.push(x);
            }
        }
    }

    public void pop() {

        if(values.empty()){
            return;
        }
        int temp = values.peek();
        values.pop();
        if(temp < minValue){
            minValue = 2*minValue - temp;
        }
    }

    public int top() {
        if(values.empty()){
            return -1;
        }
        if(values.peek()<minValue){
            return minValue;
        }
        return values.peek();
    }

    public int getMin() {
        if(values.empty()){
            return -1;
        }

        return minValue;
    }
}
```
<a name="ques-128"></a>
**Largest Rectangle in Histogram** [Back](#stack) <br>
```java
public class Solution {
    public int largestRectangleArea(ArrayList<Integer> A) {
        Deque<Integer> stack = new ArrayDeque<>();
        if (A.size() == 1)
            return A.get(0);
        int maxArea = 0;
        for (int next=0; next < A.size(); next++) {
            int height = A.get(next);
            if (stack.size() == 0 || A.get(stack.peek()) <= height) {
                System.out.println("Pushing " + next);
                stack.push(next);
            } else {
                while (stack.size() > 0 && A.get(stack.peek()) > height) {
                    int curr = stack.pop();
                    int prev = ((stack.size() == 0) ? 0 : (stack.peek()+1));
                    int area = (next - prev) * A.get(curr);
                    System.out.println("Calculating height from " + prev + " to " + next + " at " + curr + " | AREA : " + area);
                    maxArea = Math.max(area, maxArea);
                }
                System.out.println("Pushing " + next);
                stack.push(next);
            }
        }
        while (stack.size() > 0) {
            int curr = stack.pop();
            int prev = ((stack.size() == 0) ? 0 : (stack.peek()+1));
            int area = (A.size() - prev) * A.get(curr);
            System.out.println("Calculating height from " + prev + " to " + A.size() + " at " + curr + " | AREA : " + area);
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}
```
<a name="ques-129"></a>
**Rain Water Trapped** [Back](#stack) <br>
```java
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> A) {
        int lbd = 0, rbd = A.size()-1;
        int l=lbd+1, r= rbd-1;
        int water = 0;
        while (l <= r) {
            // System.out.println("Comparing @ " + lbd + " " + A.get(lbd) + " and " + A.get(lbd+1));
            if (A.get(lbd) < A.get(lbd+1)) {
                while (lbd < A.size()-1 && A.get(lbd) < A.get(lbd+1)) {
                    lbd++;
                }
                l = lbd + 1;
            }
            // System.out.println("Comparing @ " + rbd + " " + A.get(rbd) + " and " + A.get(rbd-1));
            if (A.get(rbd) < A.get(rbd-1)) {
                while (rbd > 0 && A.get(rbd) < A.get(rbd-1)) {
                    rbd--;
                }
                r = rbd - 1;
            }
            // System.out.println("LB : " + lbd + " LP : " + l + " RB : " + rbd + " RP : " + r);
            if (lbd < rbd && l <= r) {
                if (A.get(lbd) <= A.get(rbd) && l < A.size()) {
                    water = water + (A.get(lbd) - A.get(l));
                    l++;
                    if (A.get(l) > A.get(lbd)) {
                        lbd = l;
                        l++;
                    }
                } else if (r >= 0) {
                    water = water + (A.get(rbd) - A.get(r));
                    r--;
                    if (A.get(r) > A.get(rbd)) {
                        rbd = r;
                        r--;
                    }
                }
            }
            // System.out.println("LB : " + lbd + " LP : " + l + " RB : " + rbd + " RP : " + r);
            // System.out.println("WATER : " + water);
        }
        return water;
    }
}
```

### Queue
<a name="ques-130"></a>
**Sliding Window Maximum** [Back](#queue) <br>
```java
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        ArrayList<Integer> res = new ArrayList<>();
        if (B >= A.size()) {
            int max = 0;
            for (Integer val : A)
                max = Math.max(max, val);
            res.add(max);
            return res;
        }
        Deque<Integer> queue = new ArrayDeque<>();
        for (int index=0; index < A.size(); index++) {
            // Clear invalid max
            while (queue.size() > 0 && (index - queue.peekFirst()) >= B) {
                queue.removeFirst();
            }
            if (queue.size() == 0) {
                queue.addFirst(index);
            } else {
                // decide to add to first or last
                if (A.get(index) >= A.get(queue.peekFirst())) {
                    queue.addFirst(index);
                } else {
                    while (queue.size() > 0 && A.get(index) >= A.get(queue.peekLast())) {
                        queue.removeLast();
                    }
                    queue.addLast(index);
                }
            }
            if (index >= B-1)
                res.add(A.get(queue.peekFirst()));
        }
        return res;
    }
}
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
public class Solution {
    
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
        output.add(new ArrayList<Integer>());
        if (a.size() == 0) {
            return output;
        }
        
        Collections.sort(a);
        generate(a, output, new ArrayList<Integer>(), 0);
        return output;
    }
    
    public void generate(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> output, ArrayList<Integer> temp, int index) {
        for (int i = index; i < a.size(); i++) {
            temp.add(a.get(i));
            output.add(new ArrayList<Integer>(temp));
            generate(a, output, temp, i+1);
            temp.remove(temp.size() - 1);
        }
    }
}
```
<a name="ques-134"></a>
**Combinations** [Back](#backtracking) <br>
```java
public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int A, int B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        select(A, B, 1, new ArrayList<>(), ans);
        return ans;
    }
    
    private void select(int A, int B, int currA, ArrayList<Integer> res, ArrayList<ArrayList<Integer>> ans) {
        if (B == 1 && (A - currA) >= 0) {
            for(int index=currA; index <= A; index++) {
                ArrayList<Integer> temp = new ArrayList<>(res);
                temp.add(index);
                if (!ans.contains(temp))
                    ans.add(temp);
            }
            return;
        }
        if (B > (A-currA+1) || currA > A)
            return;
        for (int index=currA; index <= A; index++) {
            // we can choose to select it
            ArrayList<Integer> temp = new ArrayList<>(res);
            temp.add(index);
            select(A, B-1, index+1, temp, ans);
            
            // we can choose not to select it
            select(A, B, index+1, res, ans);
        }
    }
}
```
<a name="ques-135"></a>
**Combination Sum** [Back](#backtracking) <br>
```java
public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Collections.sort(A);
        combinations(0, A, B, new ArrayList<Integer>(), res);
        return res;
    }

    private void combinations(int sum, ArrayList<Integer> A, int B, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res) {
        if (sum > B)
            return;
        for (int num : A) {
            if (sum + num <= B) {
                ArrayList<Integer> selected = new ArrayList<>(temp);
                selected.add(num);
                if (sum + num == B) {
                    Collections.sort(selected);
                    if (!res.contains(selected))
                        res.add(selected);
                }
                combinations(sum + num, A, B, selected, res);
            }
        }
    }
}
```
<a name="ques-136"></a>
**Combination Sum 2** [Back](#backtracking) <br>
```java
public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Collections.sort(A);
        combinations(0, A, B, 0, new ArrayList<Integer>(), res);
        return res;
    }

    private void combinations(int sum, ArrayList<Integer> A, int B, int index, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res) {
        if (sum > B)
            return;
        for (int i = index; i < A.size(); i++) {
            int num = A.get(i);
            if (sum + num <= B) {
                ArrayList<Integer> selected = new ArrayList<>(temp);
                selected.add(num);
                if (sum + num == B) {
                    Collections.sort(selected);
                    if (!res.contains(selected))
                        res.add(selected);
                }
                combinations(sum + num, A, B, index+1, selected, res);
            }
        }
    }
}
```
<a name="ques-137"></a>
**SubSets 2** [Back](#backtracking) <br>
```java
public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        subsets(A, 0, new ArrayList<Integer>(), res);
        return res;
    }

    private void subsets(ArrayList<Integer> A, int index, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res) {
        // System.out.println("=====================");
        // System.out.println("TEMP : " + temp);
        // System.out.println("Index : " + index);
        if (index == A.size()) {
            return;
        }
        // System.out.println("SIZE : " + A.size());
        for (int i=index; i < A.size(); i++) {
            temp.add(A.get(i));
            ArrayList<Integer> ans = new ArrayList<>(temp);
            if (!res.contains(ans))
                res.add(ans);
            subsets(A, i+1, temp, res);
            temp.remove(temp.size()-1);
        }
    }
}
```
<a name="ques-138"></a>
**Letter Phone** [Back](#backtracking) <br>
```java
public class Solution {
    public ArrayList<String> letterCombinations(String A) {
        Map<String, String> mapping = new HashMap<>();
        mapping.put("0", "0");
        mapping.put("1", "1");
        mapping.put("2", "abc");
        mapping.put("3", "def");
        mapping.put("4", "ghi");
        mapping.put("5", "jkl");
        mapping.put("6", "mno");
        mapping.put("7", "pqrs");
        mapping.put("8", "tuv");
        mapping.put("9", "xyz");
        ArrayList<String> res = new ArrayList<>();
        permute(A, 0, res, mapping, "");
        return res;
    }

    public void permute(String A, int index, ArrayList<String> res, Map<String, String> mapping, String temp) {
        if (index == A.length() || temp.length() == A.length()) {
            res.add(temp);
            return;
        }
        String num = A.charAt(index) + "";
        for (char c : mapping.get(num).toCharArray()) {
            permute(A, index+1, res, mapping, temp+c);
        }
    }
}
```
<a name="ques-139"></a>
**Palindrome Partitioning** [Back](#backtracking) <br>
```java
public class Solution {
    public ArrayList<ArrayList<String>> partition(String a) {
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        helper(ans, new ArrayList<String>(), a, 0);
        return ans;
    }
 
    private void helper(ArrayList<ArrayList<String>> ans, ArrayList<String> temp, String a, int idx) {
        if (idx == a.length()) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i=idx; i<a.length(); i++) {
            String sb = a.substring(idx, i+1);
 
            if (isPalindrome(sb)) {
                temp.add(sb);
                helper(ans, temp, a, i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
 
    private boolean isPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
```
<a name="ques-140"></a>
**Generate all Parentheses II** [Back](#backtracking) <br>
```java
public class Solution {
    public ArrayList<String> generateParenthesis(int A) {
        ArrayList<String> res = new ArrayList<>();
        brackets(A, A, 0, "", res);
        Collections.sort(res);
        return res;
    }

    private void brackets(int left, int right, int open, String temp, ArrayList<String> res) {
        if (left > right || left < 0 || right < 0 || open < 0) {
            return;
        }
        if (left == 0 && right == 0 && open == 0) {
            if (!res.contains(temp))
                res.add(temp);
        }
        if (open == 0) {
            brackets(left-1, right, open+1, temp + "(", res);
        } else { // open > 0
            if (left > 0)
                brackets(left-1, right, open+1, temp + "(", res); // add one more left
            brackets(left, right-1, open-1, temp + ")", res); // add one more right
        }
    }
}
```
<a name="ques-141"></a>
**Permutations** [Back](#backtracking) <br>
```java
public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Collections.sort(A);
        permute(new ArrayList<Integer>(A), new ArrayList<>(), res);
        return res;
    }
    
    private void permute(ArrayList<Integer> A, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res) {
        if (A.size() == 0) {
            res.add(temp);
            return;
        }
        for (int num : A) {
            ArrayList<Integer> ans = new ArrayList<>(temp);
            ans.add(num);
            ArrayList<Integer> tovisit = new ArrayList<>(A);
            tovisit.remove(new Integer(num));
            permute(tovisit, ans, res);
        }
    }
}
```
<a name="ques-142"></a>
**Gray Code** [Back](#backtracking) <br>
```java
public class Solution {
    public ArrayList<Integer> grayCode(int B) {
        
        //DP type approach
        /*
            000
            001
            011
            010
            ---  (mirror to see symmetry)
            110
            111
            101
            100
            
        */
        
        
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0);
        arr.add(1);
        for(int i=1;i<B;i++){
            //traversing array in reverse because of reflection pattern
            for(int j=arr.size()-1;j>=0;j--){
                
                int curr=arr.get(j);
                
                //Copying arr(j) to te, will simply copy bits of arr(j) to te.
                int te=curr;
                
                //Finally, setting final bit to 1.
                te+=1<<i;
                arr.add(te);
            }
            
        }
        
        return arr;
    }
}
```
<a name="ques-143"></a>
**Kth Permutation Sequence** [Back](#backtracking) <br>
```java
```
<a name="ques-144"></a>
**NQueens** [Back](#backtracking) <br>
```java
public class Solution {
    public ArrayList<ArrayList<String>> solveNQueens(int a) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        int[][] invalid = new int[a][a];
        int[][] pos = new int[a][a];
        nqueens(res, pos, invalid, 0, a);
        return res;
    }
    
    private void nqueens(ArrayList<ArrayList<String>> res, int[][] pos, int[][] invalid, int row, int a) {
        for (int col=0; col < a && row < a; col++) {
            // System.out.println("Checking at (" + row + ", " + col + ")");
            if (invalid[row][col] == 0) {
                // check if not invalid & update board
                int[][] newPos = clone(pos);
                int[][] newInvalid = clone(invalid);
                placeQueen(newPos, newInvalid, row, col, a);
                nqueens(res, newPos, newInvalid, row+1, a);
                if (row == a-1) {
                    addResult(res, newPos, a);   
                }
            }
        }
    }
    
    private void placeQueen(int[][] newPos, int[][] invalid, int row, int col, int a) {
        // System.out.println("Placing queen at (" + row + ", " + col + ")");
        newPos[row][col] = 1;
        // mark the row and col elements
        for (int index=0; index < a; index++) {
            invalid[row][index] = 1;
            invalid[index][col] = 1;
        }
        // mark the diagonal elements
        for (int index=1; index < a && row + index < a && col + index < a; index++) {
            invalid[row+index][col+index] = 1;
        }
        for (int index=1; index < a && row + index < a && col-index >= 0; index++) {
            invalid[row+index][col-index] = 1;
        }
        for (int index=1; index < a && row - index >= 0 && col - index >= 0; index++) {
            invalid[row-index][col-index] = 1;
        }
        for (int index=1; index < a && row - index >= 0 && col + index < a; index++) {
            invalid[row-index][col+index] = 1;
        }
    }
    
    private int[][] clone(int[][] input) {
        int[][] output = new int[input.length][input[0].length];
        for (int i=0; i < input.length; i++) {
            for (int j=0; j < input[0].length; j++) {
                output[i][j] = input[i][j];
            }
        }
        return output;
    }
    
    private void addResult(ArrayList<ArrayList<String>> res, int[][] pos, int a) {
        ArrayList<String> temp = new ArrayList<>();
        for (int row=0; row < a; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col=0; col < a; col++) {
                if (pos[row][col] == 0){
                    sb.append(".");
                } else if (pos[row][col] == 1) {
                    sb.append("Q");
                }
            }
            temp.add(sb.toString());
        }
        res.add(temp);
    }
}
```

### Hashing
<a name="ques-145"></a>
**Colorful Number** [Back](#hashing) <br>
```java
public class Solution {
    public int colorful(int A) {
        String B=A+"";
        
        HashMap<Integer,String> map= new HashMap<Integer,String>();
        for(int i=1;i<=B.length();i++)
        {
            for(int j=0;j<B.length()-i+1;j++)
            {
                boolean value=check(map,B.substring(j,j+i));
                if(value==false)
                    return 0;
            }
        }
        
        return 1;
    }
    
    public boolean check(HashMap<Integer,String> map, String A)
    {
        int prod=1;
        for(int i=0;i<A.length();i++)
            prod*=A.charAt(i)-'0';
        
        if(map.containsKey(prod))
            return false;
        
        map.put(prod,A);
        return true;
    }
}
```
<a name="ques-146"></a>
**Largest Continuous Sequence Zero Sum** [Back](#hashing) <br>
```java
public class Solution {
    public ArrayList<Integer> lszero(ArrayList<Integer> A) {
        ArrayList<Integer> sumList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        map.put(0,-1);
        
        int start = -1;
        int end = -1;
        int sum = 0;
        int maxLen = -1;
        
        for (int i=0;i<A.size();i++) {
            sum += A.get(i);
            if (map.containsKey(sum)) {
                if (maxLen < (i - map.get(sum))) {
                    start = map.get(sum) + 1;
                    end = i;
                    maxLen = i - map.get(sum);
                }
            }
            else {
                map.put(sum, i);
            }
        }
        
        if(start >= 0 && end >= 0) {
            for(int i = start; i <= end; i++) {
                result.add(A.get(i));
            }
        }
        
        return result;
    }
}
```
<a name="ques-147"></a>
**2 Sum** [Back](#hashing) <br>
```java
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int index=0; index < A.size(); index++) {
            int val = A.get(index);
            if (count.containsKey(val)) {
                continue;
            } else {
                count.put(val, index);
            }
        }
        for (int index=0; index < A.size(); index++) {
            int req = B - A.get(index);
            if (count.containsKey(req)) {
                int pos = count.get(req);
                if (pos < index) {
                    res.add(pos+1);
                    res.add(index+1);
                    return res;
                }
            }
        }
        return res;
    }
}
```
<a name="ques-148"></a>
**4 Sum** [Back](#hashing) <br>
```java
public class Solution {
    class Pair {
        int x;
        int y;
        public Pair (int x, int y) {
            this.x =x;
            this.y =y;
        }
    }
    public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> A, int B) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashMap<Integer, ArrayList<Pair>> map = new HashMap<>();
        for (int i=0; i < A.size(); i++) {
            for (int j=i+1; j < A.size(); j++) {
                int sum = A.get(i) + A.get(j);
                Pair pair = new Pair(i, j);
                if (map.containsKey(sum)){
                    map.get(sum).add(pair);
                } else {
                    ArrayList<Pair> temp = new ArrayList<>();
                    temp.add(pair);
                    map.put(sum, temp);
                }
            }
        }
        for (int i=0; i < A.size(); i++) {
            for (int j=i+1; j < A.size(); j++) {
                int req = B - A.get(i) - A.get(j);
                if (map.containsKey(req)) {
                    for (Pair pair : map.get(req)) {
                        if (pair.x != i && pair.x != j && pair.y != i && pair.y != j) {
                            ArrayList<Integer> temp = new ArrayList<>();
                            temp.add(A.get(i));
                            temp.add(A.get(j));
                            temp.add(A.get(pair.x));
                            temp.add(A.get(pair.y));
                            Collections.sort(temp);
                            if (!res.contains(temp))
                                res.add(temp);
                        }
                    }
                }
            }
        }
        Collections.sort(res, new LexicographicalSort());
        return res;
    }
    class LexicographicalSort implements Comparator<ArrayList<Integer>> {
        public int compare(ArrayList<Integer> l1, ArrayList<Integer> l2) {
            for (int index=0; index < l1.size(); index++) {
                if (l1.get(index) < l2.get(index)) {
                    return -1;
                } else if (l1.get(index) > l2.get(index)) {
                    return 1;
                } else {
                    continue;
                }
            }
            return 1;
        }
    }
}
```
<a name="ques-149"></a>
**Valid Sudoku** [Back](#hashing) <br>
```java
```
<a name="ques-150"></a>
**Diffk II** [Back](#hashing) <br>
```java
public class Solution {
	public int diffPossible(final List<Integer> a, int b) {
	    HashSet<Integer> visited = new HashSet<Integer>();
	    for (Integer number : a) {
	        if (visited.contains(number + b) || visited.contains(number - b)) return 1;
	        visited.add(number);
	    }
	    return 0;
	}
}
```
<a name="ques-151"></a>
**Anagrams** [Back](#hashing) <br>
```java
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        Map<String, Integer> wordMap = new HashMap<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int num=1;
        for (String anagram : A) {
            char[] arr = anagram.toCharArray();
            Arrays.sort(arr);
            String sorted = String.valueOf(arr);
            if (wordMap.containsKey(sorted)) {
                int index = wordMap.get(sorted);
                ArrayList<Integer> ans = res.get(index);
                ans.add(num);
            } else {
                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(num);
                res.add(ans);
                wordMap.put(sorted, res.size()-1);
            }
            num++;
        }
        return res;
    }
}
```
<a name="ques-152"></a>
**Equal** [Back](#hashing) <br>
```java
public class Solution {
    public ArrayList<Integer> equal(ArrayList<Integer> A) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for (int i=0;i<A.size();i++) {
            for (int j=i+1;j<A.size();j++) {
                int sum = A.get(i) + A.get(j);
                if (map.containsKey(sum) && map.get(sum).size() == 2) {
                    int C1 = i;
                    int D1 = j;                    
                    int A1 = map.get(sum).get(0);
                    int B1 = map.get(sum).get(1);
                    
                    if (A1 < B1 && C1 < D1 && A1 < C1 && B1 != D1 && B1 != C1) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(A1);
                        temp.add(B1);
                        temp.add(C1);
                        temp.add(D1);
                        
                        ans.add(temp);
                        ArrayList<Integer> t = new ArrayList<>();
                        map.put(sum, t);
                    }
                }
                else if (!map.containsKey(sum)) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    
                    map.put(sum, temp);
                }
            }
            
            Collections.sort(ans, new Sort());
        }
   
        return ans.get(0);
    }
    
    class Sort implements Comparator<ArrayList<Integer>> {

	    @Override
	    public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
	        int c = o1.get(0).compareTo(o2.get(0));
	        if (c == 0) {
	            c = o1.get(1).compareTo(o2.get(1));
	        }
	        if (c == 0) {
	            c = o1.get(2).compareTo(o2.get(2));
	        }
	        if (c == 0) {
	            c = o1.get(3).compareTo(o2.get(3));
	        }
	        
	        return c;
	    }    
	}
}

```
<a name="ques-153"></a>
**Copy List** [Back](#hashing) <br>
```java
/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode curr = head, clonehead = null, clone = null;
        Map<Integer, RandomListNode> map = new HashMap<>();
        while (curr != null) {
            RandomListNode temp = new RandomListNode(curr.label);
            map.put(curr.label, temp);
            if (clone == null) {
                clone = temp;
                clonehead = temp;
            } else {
                clone.next = temp;
                clone = clone.next;
            }
            curr = curr.next;
        }
        curr = head;
        clone = clonehead;
        while (curr != null) {
            if (curr.random != null) {
                int random = curr.random.label;
                // System.out.println("Searching for " + random);
                if (map.containsKey(random)) {
                    clone.random = map.get(random);
                }
            }
            clone = clone.next;
            curr = curr.next;
        }
        // print(clonehead);
        return clonehead;
    }
    
    private void print(RandomListNode node) {
        String s = "HEAD => ";
        while (node != null) {
            s = s + node.label + " => " ;
            node = node.next;
        }
        s = s + "END";
        System.out.println(s);
    }
}
```
<a name="ques-154"></a>
**Longest Substring Without Repeat** [Back](#hashing) <br>
```java
public class Solution {
    public int lengthOfLongestSubstring(String A) {
        Set<Character> set = new LinkedHashSet<>();
        Set<Character> res = new LinkedHashSet<>();
        char[] arr = A.toCharArray();
        int start=0, startOpt=0, end=0, max = 0;
        while (end < arr.length) {
            if (!set.contains(arr[end])) {
                set.add(arr[end]);
                if (max < set.size()) {
                    res = new LinkedHashSet<>(set);
                }
                max = Math.max(max, set.size());
            } else {
                Iterator<Character> iter = set.iterator();
                while (iter.hasNext()) {
                    if (iter.next() == arr[end]) {
                        break;
                    }
                    iter.remove();
                    start++;
                }
                iter.remove();
                set.add(arr[end]);
            }
            end++;
        }
        // System.out.println("RESULT : " + res);
        // System.out.println("START : " + startOpt + "RESULT : " + A.substring(startOpt, max));
        return max;
    }
}
```

<a name="ques-155"></a>
**Window String** [Back](#hashing) <br>
```java
public class Solution {
    public String minWindow(String s, String t) {
        String result = "";
        HashMap<Character, Integer> target = new HashMap<>();
        for(int i = 0;  i < t.length(); i++) {
            if(target.containsKey(t.charAt(i))){
                target.put(t.charAt(i), target.get(t.charAt(i)) + 1);
            }
            else {
                target.put(t.charAt(i), 1);
            }
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int minLen = s.length() + 1;
        
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(target.containsKey(c)) {
                if(map.containsKey(c)) {
                    if(map.get(c) < target.get(c)) {
                        count++;
                    }
                    map.put(c, map.get(c) + 1);                    
                }
                else {
                    map.put(c, 1);
                    count++;
                }
            }
            
            if(count == t.length()) {
                char sc = s.charAt(left);
                while(!map.containsKey(sc) || map.get(sc) > target.get(sc)) {
                    if(map.containsKey(sc) && map.get(sc) > target.get(sc)) {
                        map.put(sc, map.get(sc) - 1);                        
                    }
                    left++;
                    sc = s.charAt(left);
                }
                if(i - left + 1 < minLen) {
                    result = s.substring(left, i+1);
                    minLen = i - left + 1;
                }
            }
        }
        return result;
    }
}
```
<a name="ques-156"></a>
**Fraction** [Back](#hashing) <br>
```java
```
<a name="ques-157"></a>
**Points on the Straight Line** [Back](#hashing) <br>
```java
public class Solution {
    public int maxPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
        int maxPoints = 0;
        HashMap<Double, Integer> map = new HashMap<Double, Integer>();
        if(a.size() != b.size() || a.size() == 0 || a == null || b.size() == 0 || b == null)
            return maxPoints;
        if(a.size() == 1 && b.size() == 1)
            return 1;
        for(int i = 0; i < a.size(); i++){
            int duplicate = 1;
            int vertical = 0;
            int xi = a.get(i);
            int yi = b.get(i);
            for(int j = i+1; j < a.size(); j++){
                int xj = a.get(j);
                int yj = b.get(j);
                if(xi == xj){
                    if(yi == yj){
                        duplicate++;
                    }else{
                        vertical++;
                    }
                }
                else{
                    double slope = 0.0;
                    if(yj - yi == 0)
                        slope = 0.0;
                    else if(xj - xi == 0)
                        slope = Double.MAX_VALUE;
                    else
                        slope = (double)(yj - yi) / (double)(xj - xi);
                    
                    // System.out.println("Slope : " + slope);
                    if(map.containsKey(slope))
                        map.put(slope, map.get(slope) + 1);
                    else 
                        map.put(slope, 1);
                }
            }
            
            for(int sl : map.values())
                if(maxPoints < sl + duplicate)
                maxPoints = sl + duplicate;
            
            maxPoints = Math.max(vertical + duplicate, maxPoints);
            map.clear();
        }
        return maxPoints;
    }
}
```
<a name="ques-158"></a>
**Substring Concatenation** [Back](#hashing) <br>
```java
import java.math.BigInteger;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findSubstring(String A, final List<String> B) {
        int maxW = 0, total = 0;
        ArrayList<Integer> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String s : B) {
            maxW = Math.max(maxW, s.length());
            total = total + s.length();
            if (map.containsKey(s)) {
                map.put(s, map.get(s)+1);
            } else {
                map.put(s, 1);
            }
        }
        Map<String, Integer> tempMap = new HashMap<>(map);
        boolean found = false;
        for (int start=0; start < A.length(); start++) {
            int top = start;
            for (int index=start; index < A.length(); index++) {
                String s = A.substring(top, index+1);
                if (start == 2)
                    System.out.println("START : " + start + " TOP : " + top + " INDEX : " + index + " STR : "+ s);
                if (tempMap.containsKey(s)) {
                    found = true;
                    top = index+1;
                    tempMap.put(s, tempMap.get(s)-1);
                    if (tempMap.get(s) == 0) {
                        tempMap.remove(s);
                    }
                    if (tempMap.size() == 0) {
                        System.out.println("====================");
                        System.out.println("INDEX : " + index + " STR : "+ s);
                        res.add(index-total+1);
                    }
                } else if (s.length() == maxW) {
                    found = false;
                    tempMap.clear();
                    tempMap = new HashMap<>(map);
                    break;
                }
            }
        }
        System.out.println("END!");
        return res;
    }
}
```

### Heaps
<a name="ques-159"></a>
**N max pair combinations** [Back](#heaps) <br>
```java
```
<a name="ques-160"></a>
**Magician and Chocolates** [Back](#heaps) <br>
```java
public class Solution {
    public int nchoc(int A, ArrayList<Integer> B) {
        
        final int MOD = 1000000007;
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (Integer choc : B) {
            pq.add(choc);
        }

        long total = 0;

        while (A-- > 0) {
            int choc = pq.poll();
            total += choc;
            total %= MOD;
            pq.add(choc/2);
        }

        return (int) total;
    }
}
```
<a name="ques-161"></a>
**Merge K Sorted Lists** [Back](#heaps) <br>
```java
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ArrayList<ListNode> a) {
        ListNode top = new ListNode(0);
        ListNode current = top;
        
        PriorityQueue<ListNode> queue = new PriorityQueue<>(a.size(), 
            Comparator.comparing(node -> node.val));
        
        for (ListNode node: a) {
            queue.add(node);
        }
        
        
        while (!queue.isEmpty()) {
            current.next = queue.poll();
            current = current.next;
            if (current.next != null) {
                queue.add(current.next);
            }
        }
        
        return top.next;
    }
}
```

### HashMaps
<a name="ques-162"></a>
**Distinct Numbers in Window** [Back](#hashmaps) <br>
```java
public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        Map<Integer, Integer> count = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int index=0; index < B; index++) {
            if (count.containsKey(A.get(index))) {
                count.put(A.get(index), count.get(A.get(index)) + 1);
            } else {
                count.put(A.get(index), 1);
            }
        }
        res.add(count.size());
        for (int index=B; index < A.size(); index++) {
            int lastin = index-B;
            int nextin = index;
            // System.out.println("MAP : " + count + " RES : " + res + " NEXT : " + A.get(nextin) + " LAST : " + A.get(lastin));
            if (count.get(A.get(lastin)) > 1) {
                count.put(A.get(lastin), count.get(A.get(lastin)) - 1);
            } else {
                count.remove(A.get(lastin));
            }
            if (count.containsKey(A.get(nextin))) {
                count.put(A.get(nextin), count.get(A.get(nextin)) + 1);
            } else {
                count.put(A.get(nextin), 1);
            }
            res.add(count.size());
        }
        return res;
    }
}
```
<a name="ques-163"></a>
**LRU** [Back](#hashmaps) <br>
```java
public class Solution {

    Map<Integer, Node> map;
    Node start;
    Node end;
    int capacity;
    public Solution(int capacity) {
        map = new HashMap<>();
        start = new Node(0,0);
        end = new Node(0,0);
        this.capacity = capacity;
        start.next = end;
        end.prev = start;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            removeNode(node);
            addNode(node);

            return node.val;
        }
        return -1;
    }

    private void addNode(Node node) {
        node.next = start.next;
        start.next = node;
        node.prev = start;
        node.next.prev = node;
    }

    private void removeNode(Node node) {
        Node temp = node.next;
        node.prev.next = temp;
        temp.prev = node.prev;
    }

    public void set(int key, int value) {
        Node node = new Node(key, value);

        if (map.containsKey(key)) {
            Node temp = map.get(key);
            removeNode(temp);
            addNode(node);
        }
        else {
            if (capacity == map.size()) {
                Node temp = end.prev;
                removeNode(temp);
                map.remove(temp.key);
            }

            addNode(node);
        }
        map.put(key, node);
    }

    class Node {
        public int key;
        public int val;
        public Node prev;
        public Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
            prev = null;
            next = null;
        }
    }
}
```
<a name="ques-164"></a>
**Ways to form Max Heap** [Back](#hashmaps) <br>
```java
public class  Solution {
    
    long[] dp;  	/* dp[i] = number of max heaps for i distinct integers */
    long[][] nck;	/* nck[i][j] = i choose j if i>=j else 0 */
    int[] log2;		/* log2[i] = int(log base 2 of i) */
    
    final long MOD = 1000000007;
    
    public long choose(int n,int k)
    {
        if(k>n)
            return 0;
	if(n<=1)
	    return 1;
	if(k==0)
	    return 1;

        if(nck[n][k]!=-1)
            return nck[n][k];
        long answer = choose(n-1,k-1) + choose(n-1,k);
        answer%=MOD;
        nck[n][k] = answer;
        return answer;
    }
    
    public int getL(int n)
    {
        if(n==1)
            return 0;
            
        int h = log2[n];
        int p = n - ((1<<(h)) - 1);
        int m = (1<<h);
        if(p>=(m/2))
            return (1<<(h)) - 1;
        else
            return (1<<(h)) - 1 - ((m/2) - p);
    }
    
    public int solve(int n)
    {
        dp = new long[n+1];
        for(int i=0;i<=n;i++)
            dp[i]=-1;
            
        nck = new long[n+1][n+1];
        for(int i=0;i<=n;i++)
            for(int j=0;j<=n;j++)
                nck[i][j] = -1;
                
        log2 = new int[n+1];
        int currLogAnswer = -1;
        int currPower2 = 1;
        for(int i=1;i<=n;i++)
        {
	    if(currPower2==i)
            {
                currLogAnswer++;
                currPower2*=2;
            }
            log2[i] = currLogAnswer;
        }
        
        return (int)getNumberOfMaxHeaps(n);
    }
    
    public long getNumberOfMaxHeaps(int n)
    {
        if(n<=1)
            return 1;
            
        if(dp[n]!=-1)
            return dp[n];

        int L = getL(n);
        long ans = (choose(n-1,L)*getNumberOfMaxHeaps(L))%MOD*(getNumberOfMaxHeaps(n-1-L));
        ans%=MOD;
        dp[n] = ans;
        return ans;
    }
}
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
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        ArrayList<Integer> res = new ArrayList<>();
        TreeNode curr = A;
        stack.push(A);
        while (stack.size() > 0) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            
            System.out.println("Stack : " + stack);
            System.out.println("Res : " + res);
            System.out.println("Curr : " + curr.val);
            curr = curr.right;
        }
        return res;
    }
}
```
<a name="ques-170"></a>
**PreOrder Traversal** [Back](#trees) <br>
```java
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        stack.push(A);
        ArrayList<Integer> res = new ArrayList<>();
        while (stack.size() > 0) {
            TreeNode node = stack.pop();
            res.add(node.val);
            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }
        return res;
    }
}
```
<a name="ques-172"></a>
**PostOrder Traversal** [Back](#trees) <br>
```java
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<Integer> postorderTraversal(TreeNode a) {
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack <TreeNode>();
        TreeNode lastNode = null;
        while(!stack.isEmpty() || a != null){
            if(a != null){
                stack.push(a);
                a = a.left;
            }else{
                TreeNode peekNode = stack.peek();
                if(peekNode.right != null && lastNode != peekNode.right){
                    a = peekNode.right;
                }else{
                    result.add(peekNode.val);
                    lastNode = stack.pop();
                }
                
            }
        }
        
        return result;
        
    }
}
```
<a name="ques-173"></a>
**Hotel Reviews** [Back](#trees) <br>
```java
public class Solution {
    
    class TrieNode {
        TrieNode[] next;
        boolean isEnd;
        public TrieNode() {
            this.next = new TrieNode[26];
            this.isEnd = false;
        }
    }
    
    class Trie {
        TrieNode head = null;
        public Trie() {
            this.head = new TrieNode();
        }
        
        public void add(char[] arr) {
            TrieNode curr = head;
            for (int index=0; index < arr.length; index++) {
                int pos = (int)arr[index] - (int)'a';
                if (curr.next[pos] == null) {
                    TrieNode temp = new TrieNode();
                    curr.next[pos] = temp;
                }
                curr = curr.next[pos];
            }
            curr.isEnd = true;
        }
        
        public boolean findExact(char[] arr) {
            TrieNode curr = head;
            for (int index=0; index < arr.length; index++) {
                int pos = (int) arr[index] - (int)'a';
                if (curr.next != null && curr.next[pos] != null) {
                    curr = curr.next[pos];
                } else {
                    return false;
                }
            }
            return curr.isEnd;
        }
    }
    
    public ArrayList<Integer> solve(String A, ArrayList<String> B) {
        // Build the trie for the input A
        Trie trie = new Trie();
        for (String s : A.split("_")) {
            trie.add(s.toCharArray());
        }
        // Build count map for the hits
        TreeMap<Integer, ArrayList<Integer>> count = new TreeMap<>(Collections.reverseOrder());
        int index =0 ;
        for (String s : B) {
            int score = 0;
            for (String word : s.split("_")) {
                if (trie.findExact(word.toCharArray())) {
                    score++;
                }
            }
            if (count.containsKey(score)) {
                count.get(score).add(index);
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(index);
                count.put(score, temp);
            }
            index++;
        }
        // Build the result
        ArrayList<Integer> res = new ArrayList<>();
        for (Integer score : count.keySet()) {
            for (Integer pos : count.get(score)) {
                res.add(pos);
            }
        }
        return res;
    }
}
```
<a name="ques-174"></a>
**Balanced Binary Tree** [Back](#trees) <br>
```java
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int isBalanced(TreeNode A) {
        TreeNode curr = A;
        isBalanced = 1;
        check(curr);
        return isBalanced;
    }
    int isBalanced = 1;
    private int check(TreeNode A) {
        if (A == null)
            return 0;
        int left = check(A.left);
        int right = check(A.right);
        if (Math.abs(left-right) > 1)
            isBalanced = 0;
        return 1 + Math.max(left, right);
    }
}
```
<a name="ques-175"></a>
**Identical Binary Trees** [Back](#trees) <br>
```java
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int isSameTree(TreeNode A, TreeNode B) {
        if (A == null && B == null) {
            return 1;
        } else if (A == null) {
            return 0;
        } else if (B == null) {
            return 0;
        } else if (A.val != B.val) {
            return 0;
        }
        int left = isSameTree(A.left, B.left);
        int right = isSameTree(A.right, B.right);
        return left * right;
    }
}
```
<a name="ques-176"></a>
**Symmetric Binary Tree** [Back](#trees) <br>
```java
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int isSymmetric(TreeNode A) {
        return check(A.left, A.right);
    }
    
    public int check(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return 1;
        } else if (left == null || right == null || left.val != right.val) {
            return 0;
        }
        int valL = check(left.left, right.right);
        int valR = check(left.right, right.left);
        return valL * valR;
    }
}
```
<a name="ques-177"></a>
**Inorder Traversal of Cartesian Tree** [Back](#trees) <br>
```java
```
<a name="ques-178"></a>
**Sorted Array To Balanced BST** [Back](#trees) <br>
```java
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(final List<Integer> a) {
        return build(a, 0, a.size()-1);
    }
    
    public TreeNode build(final List<Integer> a, int start, int end) {
        int mid = (start + end)/2;
        TreeNode newNode = new TreeNode(a.get(mid));
        TreeNode left=null, right=null;
        if (start < mid)
            left = build(a, start, mid-1);
        if (mid < end)
            right = build(a, mid+1, end);
        newNode.left = left;
        newNode.right = right;
        return newNode;
    }
}
```
<a name="ques-179"></a>
**Binary Tree From Inorder And Postorder** [Back](#trees) <br>
```java
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int index=0; index < A.size(); index++) {
            map.put(A.get(index), index);
        }
        return buildTree(A, B, map, 0, A.size()-1, 0, B.size()-1);
    }
    
    private TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B, HashMap<Integer, Integer> map, int Astart, int Aend, int Bstart, int Bend) {
        if (Astart == Aend) {
            return new TreeNode(A.get(Astart));
        } else if (Bstart == Bend) {
            return new TreeNode(A.get(Bstart));
        } else if (Astart < 0 || Astart >= A.size() || Aend < 0 || Aend >= A.size()) {
            return null;
        } else if (Bstart < 0 || Bstart >= A.size() || Bend < 0 || Bend >= A.size()) {
            return null;
        }
        int midElem = B.get(Bend);
        TreeNode root = new TreeNode(midElem);
        int inorderPos = map.get(midElem);
        TreeNode left = null, right = null;
        if (inorderPos == Astart) {
            // no left subtree
            right = buildTree(A, B, map, inorderPos+1, Aend, Bstart, Bend-1);
        } else if (inorderPos == Aend) {
            // no right subtree
            left = buildTree(A, B, map, Astart, inorderPos-1, Bstart, Bend-1);
        } else {
            int leftSize = inorderPos - Astart;
            int rightSize = Aend - inorderPos;
            left = buildTree(A, B, map, Astart, inorderPos-1, Bstart, Bstart+leftSize-1);
            right = buildTree(A, B, map, inorderPos+1, Aend, Bend-rightSize, Bend-1);
        }
        // int val = B.get(Bend);
        // TreeNode root = new TreeNode(val);
        // int ArightStart = Aend;
        // while (A.get(ArightStart) != B.get(Bend)) {
        //     ArightStart--;
        // }
        // ArightStart++;
        // int rightTreeSize = Aend - ArightStart + 1;
        // int AleftTreeEnd = ArightStart - 2;
        // int leftTreeSize = AleftTreeEnd - Astart + 1;
        // TreeNode left = buildTree(A, B, Astart, AleftTreeEnd, Bstart, Bstart + leftTreeSize -1);
        // TreeNode right = buildTree(A, B, ArightStart, Aend, Bend - rightTreeSize - 1, Bend - 1);
        root.left = left;
        root.right = right;
        return root;
    }
}
```
<a name="ques-180"></a>
**Construct Binary Tree From Inorder And Preorder** [Back](#trees) <br>
```java
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public TreeNode buildTree(ArrayList<Integer> preorder, ArrayList<Integer> inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int index=0; index < inorder.size(); index++) {
            map.put(inorder.get(index), index);
        }
        return buildTree(inorder, preorder, map, 0, preorder.size()-1, 0, inorder.size()-1);
    }
    
    private TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B, HashMap<Integer, Integer> map, int Astart, int Aend, int Bstart, int Bend) {
        if (Astart == Aend) {
            return new TreeNode(A.get(Astart));
        } else if (Bstart == Bend) {
            return new TreeNode(A.get(Bstart));
        } else if (Astart < 0 || Astart >= A.size() || Aend < 0 || Aend >= A.size()) {
            return null;
        } else if (Bstart < 0 || Bstart >= A.size() || Bend < 0 || Bend >= A.size()) {
            return null;
        }
        int midElem = B.get(Bstart);
        TreeNode root = new TreeNode(midElem);
        int inorderPos = map.get(midElem);
        TreeNode left = null, right = null;
        if (inorderPos == Astart) {
            // no left subtree
            right = buildTree(A, B, map, inorderPos+1, Aend, Bstart+1, Bend);
        } else if (inorderPos == Aend) {
            // no right subtree
            left = buildTree(A, B, map, Astart, inorderPos-1, Bstart+1, Bend);
        } else {
            int leftSize = inorderPos - Astart;
            int rightSize = Aend - inorderPos;
            left = buildTree(A, B, map, Astart, inorderPos-1, Bstart+1, Bstart+leftSize);
            right = buildTree(A, B, map, inorderPos+1, Aend, Bend-rightSize+1, Bend);
        }
        // int val = B.get(Bend);
        // TreeNode root = new TreeNode(val);
        // int ArightStart = Aend;
        // while (A.get(ArightStart) != B.get(Bend)) {
        //     ArightStart--;
        // }
        // ArightStart++;
        // int rightTreeSize = Aend - ArightStart + 1;
        // int AleftTreeEnd = ArightStart - 2;
        // int leftTreeSize = AleftTreeEnd - Astart + 1;
        // TreeNode left = buildTree(A, B, Astart, AleftTreeEnd, Bstart, Bstart + leftTreeSize -1);
        // TreeNode right = buildTree(A, B, ArightStart, Aend, Bend - rightTreeSize - 1, Bend - 1);
        root.left = left;
        root.right = right;
        return root;
    }
}
```
<a name="ques-181"></a>
**Kth Smallest Element In Tree** [Back](#trees) <br>
```java
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    int min = 0;
    public int kthsmallest(TreeNode A, int B) {
        if (A.left == null && A.right == null) {
            if (B == 1)
                return 1;
            return 0;
        }
        int k = kthsmallest(A.left, B);
        k = k + 1;
        int right = kthsmallest(A.right, B);
    }
}
```
<a name="ques-182"></a>
**2-Sum Binary Tree** [Back](#trees) <br>
```java
```
<a name="ques-183"></a>
**BST Iterator** [Back](#trees) <br>
```java
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {

    TreeNode node = null;
    ArrayDeque<TreeNode> parents = null;
    
    public Solution(TreeNode root) {
        node = root;
        parents = new ArrayDeque<>();
        while (node != null && node.left != null) {
            parents.push(node);
            node = node.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        // if (node.right == null) {
        //     if (parents.size() > 0) {
        //         if (parents.peek().val > node.val) {
        //             return true;
        //         }
        //     }
        //     return false;
        // }
        if (node != null)
            return true;
        return false;
    }

    /** @return the next smallest number */
    public int next() {
        // System.out.println("NEXT : " + node.val);
        int res = -1;
        if (node != null) {
            res = node.val;
            if (node.right != null) {
                node = node.right;
                while (node.left != null) {
                    parents.push(node);
                    node = node.left;
                }
            } else if (parents.size() > 0 && parents.peek().val > node.val) {
                node = parents.pop();
            } else {
                node = null;
            }
        }
        return res;
    }
}

/**
 * Your Solution will be called like this:
 * Solution i = new Solution(root);
 * while (i.hasNext()) System.out.print(i.next());
 */
```
<a name="ques-184"></a>
**Recover Binary Search Tree** [Back](#trees) <br>
```java
```
<a name="ques-185"></a>
**Invert the Binary Tree** [Back](#trees) <br>
```java
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode A) {
        invert(A.left, A.right);
        return A;
    }
    
    public void invert(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return;
        }
        int temp = left.val;
        left.val = right.val;
        right.val = temp;
        invert(left.left, right.right);
        invert(left.right, right.left);
    }
}
```
<a name="ques-186"></a>
**ZigZag Level Order Traversal BT** [Back](#trees) <br>
```java
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        queue.addFirst(A);
        boolean lookFirst = true;
        while (queue.size() > 0) {
            int level = queue.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for (int index=0; index < level; index++) {
                TreeNode node = null;
                if (lookFirst == true) {
                    node = queue.pop();
                    if (node.left != null)
                        queue.offer(node.left);
                    if (node.right != null)
                        queue.offer(node.right);
                } else {
                    node = queue.removeLast();
                    if (node.right != null)
                        queue.push(node.right);
                    if (node.left != null)
                        queue.push(node.left);
                }
                temp.add(node.val);
            }
            res.add(temp);
            lookFirst = !lookFirst;
        }
        return res;
    }
}
```
<a name="ques-187"></a>
**Min Depth of Binary Tree** [Back](#trees) <br>
```java
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int minDepth(TreeNode A) {
        if (A == null)
            return 0;
        if (A.left == null && A.right == null)
            return 1;
        if (A.left == null)
            return 1 + minDepth(A.right);
        if (A.right == null)
            return 1 + minDepth(A.left);
        return 1 + Math.min(minDepth(A.left), minDepth(A.right));
    }
}
```
<a name="ques-188"></a>
**Path Sum** [Back](#trees) <br>
```java
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int hasPathSum(TreeNode a, int b) {
        if (a == null)
            return 0;
        if (a.val == b && (a.left == null && a.right == null))
            return 1;
        else if (hasPathSum(a.left, b - a.val) == 1
                || hasPathSum(a.right, b - a.val) == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
```
<a name="ques-189"></a>
**Sum Root to Leaf Numbers** [Back](#trees) <br>
```java
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int sumNumbers(TreeNode A) {
        ArrayList<Integer> res = new ArrayList<>();
        sumAllPaths(A, 0, res);
        int sum = 0;
        for (Integer val : res) {
            // System.out.println("SUM : "+ val);
            sum = sum + val;
        }
        return sum % 1003;
    }
    
    public void sumAllPaths(TreeNode node, int num, ArrayList<Integer> res) {
        if (node == null)
            return;
        if (node.left == null && node.right == null) {
            res.add((10*num + node.val)%1003);
            return;
        }
        if (node.left != null)
            sumAllPaths(node.left, (10 * num + node.val)%1003, res);
        if (node.right != null)
            sumAllPaths(node.right, (10 * num + node.val)%1003, res);
    }
}
```
<a name="ques-190"></a>
**Root to Leaf Paths With Sum** [Back](#trees) <br>
```java
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        if(root == null)
            return null;
        // temp.add(root.val);
        pathSum(root, sum, result, temp);
        return result;
    }
    
    public void pathSum(TreeNode node, int sum, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> temp) {
        if (node == null)
            return;
        int currentVal = node.val;
        temp.add(currentVal);
        if (node.left == null && node.right == null) {
            if (sum - currentVal == 0) {
                result.add(new ArrayList<Integer>(temp));
            }
        }
        pathSum(node.left, sum - node.val, result, temp);
        pathSum(node.right, sum - node.val, result, temp);
        temp.remove(temp.size() - 1);
    }
}
```
<a name="ques-191"></a>
**Populate Next Right Pointers Tree** [Back](#trees) <br>
```java
/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode curr = root;
        ArrayDeque<TreeLinkNode> queue = new ArrayDeque<>();
        queue.offer(curr);
        while (queue.size() > 0) {
            int level = queue.size();
            System.out.println("LEVEL : " + level);
            for (int index=0; index < level; index++) {
                TreeLinkNode top = queue.remove();
                System.out.println("Dequeued element : " + top.val);
                if (queue.size() > 0) {
                    System.out.println("Poining " + top.val + " to " + queue.peek().val);
                    top.next = queue.peek();
                }
                if (top.left != null)
                    queue.offer(top.left);
                if (top.right != null)
                    queue.offer(top.right);
            }
        }
    }
}
```
<a name="ques-192"></a>
**Least Common Ancestor** [Back](#trees) <br>
```java
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int lca(TreeNode A, int B, int C) {
        int res = recurse(A, B, C);
        if (res == Integer.MAX_VALUE && B == C) {
            return B;
        } else if (res == Integer.MAX_VALUE || res == Integer.MIN_VALUE) {
            return -1;
        }
        return res;
    }
    
    private int recurse(TreeNode A, int B, int C) {
        // if non-important leaf node, skip it
        if (A == null || (A.left == null && A.right == null && A.val != B && A.val != C)) {
            return Integer.MIN_VALUE;
        }
        int left = recurse(A.left, B, C);
        int right = recurse(A.right, B, C);
        if (left == Integer.MAX_VALUE && right == Integer.MAX_VALUE) {
            return A.val;
        } else if (A.val == B || A.val == C) {
            if (left == Integer.MAX_VALUE || right == Integer.MAX_VALUE) {
                return A.val;
            } else {
                return Integer.MAX_VALUE;
            }
        } else if (left == Integer.MAX_VALUE || right == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            return Math.max(left, right);
        }
    }
}
```
<a name="ques-193"></a>
**Shortest Unique Prefix** [Back](#trees) <br>
```java
public class Solution {
    
    class TrieNode {
        int num;
        boolean isEnd;
        TrieNode[] next;
        public TrieNode() {
            this.next = new TrieNode[26];
            this.num = 0;
            this.isEnd = false;
        }
    }
    
    class Trie {
        TrieNode head;
        
        public Trie() {
            this.head = new TrieNode();
        }
        
        public void addWord(String s) {
            char[] arr = s.toCharArray();
            TrieNode curr = head;
            for (int index=0; index < arr.length; index++) {
                int pos = (int)arr[index] - (int)'a';
                if (curr.next[pos] == null) {
                    // System.out.println("Adding node for " + arr[index]);
                    curr.next[pos] = new TrieNode();
                }
                curr.next[pos].num++;
                curr = curr.next[pos];
            }
            curr.isEnd = true;
        }
        
        public String findPrefix(String a) {
            char[] arr = a.toCharArray();
            TrieNode curr = head;
            StringBuilder prefix = new StringBuilder();
            for (int index=0; index < arr.length; index++) {
                int pos = (int)arr[index] - (int)'a';
                prefix.append(arr[index]);
                if (curr.next[pos] == null) {
                    // System.out.println("PREFIX : " + prefix);
                    return prefix.toString();
                }
                if (curr.next[pos].num == 1) {
                    return prefix.toString();
                }
                curr = curr.next[pos];
            }
            return prefix.toString();
        }
    }
    
    public ArrayList<String> prefix(ArrayList<String> A) {
        Trie trie = new Trie();
        for (String s : A) {
            trie.addWord(s);
        }
        ArrayList<String> res = new ArrayList<>();
        for (String s : A) {
            String prefix = trie.findPrefix(s);
            res.add(prefix);
        }
        return res;
    }
}
```
<a name="ques-194"></a>
**Flatten Binary Tree to Linked List** [Back](#trees) <br>
```java
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode flatten(TreeNode a) {
        if (a.left == null && a.right == null) {
            return a;
        }
        if (a.left != null) {
            if (a.right != null) {
                TreeNode temp = a.left;
                a.left = a.right;
                a.right = temp;
            } else {
                a.right = a.left;
                a.left = null;
            }
        }
        TreeNode leftNode = null, rightNode = null;
        if (a.left != null)
            leftNode = flatten(a.left);
        if (a.right != null)
            rightNode = flatten(a.right);
        
        if (rightNode == null) {
            a.right = leftNode;
        } else if (leftNode == null) {
            a.right = rightNode;
        } else {
            a.right = rightNode;
            while (rightNode.right != null) {
                rightNode = rightNode.right;
            }
            rightNode.right = leftNode;
        }
        a.left = null;
        return a;
    }
}
```
<a name="ques-195"></a>
**Order of People Heights** [Back](#trees) <br>
```java
public class Solution {
    public ArrayList<Integer> order(ArrayList<Integer> A, ArrayList<Integer> B) {
        TreeMap<Integer, Integer> sort = new TreeMap<>();
        for (int index=0; index < A.size(); index++) {
            sort.put(A.get(index), B.get(index));
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int index=0; index < A.size(); index++) {
            res.add(null);
        }
        for (Integer height : sort.keySet()) {
            int numTaller = sort.get(height);
            // System.out.println("Finding pos for " + height + " with " + numTaller + " taller in front");
            for (int index=0; index < res.size(); index++) {
                if (numTaller == 0 && res.get(index) == null) {
                    // System.out.println("Fixing " + height + " at " + index);
                    res.set(index, height);
                    break;
                } else if (res.get(index) != null && res.get(index) <= height) {
                    continue;
                } else if (res.get(index) == null || res.get(index) > height) {
                    numTaller--;
                }
            }
        }
        return res;
    }
}
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


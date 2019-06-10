# Math Problems

## Questions <a name="questions"></a>
| # | Title | Description | Solution |
|---| ----- | -------- | ------- |
| 1 | Prime Sum | Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number. | [Java](#ques-1) |
| 2 | Power of Two Integers | Given a positive integer which fits in a 32 bit signed integer, find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers. | [Java](#ques-2) |
| 3 | Excel Column Number | Given a column title as appears in an Excel sheet, return its corresponding column number. | [Java](#ques-3) |
| 4 | Excel Column Tile | Given a positive integer, return its corresponding column title as appear in an Excel sheet. | [Java](#ques-4) |
| 5 | Palindrome Integer | Determine whether an integer is a palindrome. Do this without extra space. | [Java](#ques-5) |
| 6 | Reverse Digits of Integer | Reverse digits of an integer. | [Java](#ques-6) |
| 7 | GCD | Given 2 non negative integers m and n, find gcd(m, n) | [Java](#ques-7) |
| 8 | Sorted Permutation Rank | Given a string, find the rank of the string amongst its permutations sorted lexicographically. Assume that no characters are repeated. | [Java](#ques-8) |
| 9 | Numbers of length N less than K | Given a set of digits (A) in sorted order, find how many numbers of length B are possible whose value is less than number C. | [Java](#ques-9) |
| 10 | Rearrange Array | Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space. | [Java](#ques-10) |
| 11 | Grid Unique Paths | A robot is located at the top-left corner of an A x B grid. The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked ‘Finish’ in the diagram below). How many possible unique paths are there? | [Java](#ques-11) |

## Solutions
<a name="ques-1"></a>
**Prime Sum** [Back](#questions) <br>
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
<a name="ques-2"></a>
**Power of two integers** [Back](#questions) <br>
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
<a name="ques-3"></a>
**Excel Column Number** [Back](#questions) <br>
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
<a name="ques-4"></a>
**Excel Column Tile** [Back](#questions) <br>
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
<a name="ques-5"></a>
**Palindrome Integer** [Back](#questions) <br>
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
<a name="ques-6"></a>
**Reverse Digits of Integer** [Back](#questions) <br>
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
<a name="ques-7"></a>
**GCD** [Back](#questions) <br>
```java
public class Solution {
	public int gcd(int a, int b) {
	    if(a == 0) return b;
	    return gcd(b%a, a);
	}
}
```
<a name="ques-8"></a>
**Sorted Permutation Rank** [Back](#questions) <br>
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
<a name="ques-9"></a>
**Numbers of length N less than K** [Back](#questions) <br>
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
<a name="ques-10"></a>
**Rearrange Array** [Back](#questions) <br>
```java
public class Solution {
	public void arrange(ArrayList<Integer> A) {
	   	    int n = A.size();
	    for (int i = 0; i < n; i++) A.set(i, A.get(i) + (A.get(A.get(i)) % n) * n );
	    for (int i = 0; i < n; i++) A.set(i, A.get(i) / n);
	}
}
```
<a name="ques-11"></a>
**Grid Unique Paths** [Back](#questions) <br>
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
# Math Problems

## Questions <a name="questions"></a>
| # | Title | Description | Solution |
|---| ----- | -------- | ------- |
| 1 | Palindrome String | Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases. | [Java](#ques-1) |
| 2 | Longest Common Prefix | Write a function to find the longest common prefix string amongst an array of strings. Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2. | [Java](#ques-2) |
| 3 | Count and Say | The count-and-say sequence is the sequence of integers beginning as follows: 1, 11, 21, 1211, 111221, ... | [Java](#ques-3) |
| 4 | Amazing Substring | You are given a string S, and you have to find all the amazing substrings of S. Amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U). | [Java](#ques-4) |
| 5 |  |  | [Java](#ques-5) |
| 6 |  |  | [Java](#ques-6) |
| 7 |  |  | [Java](#ques-7) |
| 8 |  |  | [Java](#ques-8) |
| 9 |  |  | [Java](#ques-9) |

## Solutions
<a name="ques-1"></a>
**Palindrome String** [Back](#questions) <br>
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
<a name="ques-2"></a>
**Longest Common Prefix** [Back](#questions) <br>
```java

```
<a name="ques-3"></a>
**Count and Say** [Back](#questions) <br>
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
<a name="ques-4"></a>
**Amazing Substring** [Back](#questions) <br>
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
<a name="ques-5"></a>
** ** [Back](#questions) <br>
```java
```
<a name="ques-6"></a>
** ** [Back](#questions) <br>
```java
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
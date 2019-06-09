
# Arrays Problems

## Questions <a name="questions"></a>
| # | Title | Description | Solution |
|---| ----- | -------- | ------- |
| 1 | Spiral Matrix | Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order. | [Java](#spiral-matrix) |
| 2 | Max Sum Contiguous Subarray | Find the contiguous subarray within an array (containing at least one number) which has the largest sum. | [Java]() |
| 3 | Min Steps in Infinite Grid | You are in an infinite 2D grid where you can move in any of the 8 directions. You are given a sequence of points and  **the order in which you need to cover the points**. Give the minimum number of steps in which you can achieve it. You start from the first point. | [Java]() |

## Solutions
<a name="spiral-matrix"></a>
**Spiral Matrix**
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
[Back](#questions)
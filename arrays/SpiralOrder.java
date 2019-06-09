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

#java code to perform boundary traversal on the matrix in a clockwise manner

class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here 
           ArrayList<Integer> list = new ArrayList<>();


        if (n == 1) {
            for (int i = 0; i < m; i++) {
                list.add(matrix[0][i]);

            }
            return list;
        }

        if (m == 1) {
            for (int i = 0; i < n; i++) {
                list.add(matrix[i][0]);
            }
            return list;
        }

        if (n == 1 && m == 1) {
            list.add(matrix[0][0]);
            return list;
        }
        

        int i = 0;
        int j = 0;
        while (j < m) {
            list.add(matrix[i][j]);
            j++;
        }

        i++;
        int k = m - 1;
        while (i < n) {
            list.add(matrix[i][k]);
            i++;
        }


        i--;
        int col = m - 2;
        while (col >= 0) {
            list.add(matrix[i][col]);

            col--;
        }


        col++;
        int rc = n - 2;
        while (rc >= 1) {
            list.add(matrix[rc][col]);

            rc--;
        }
        return list;

    }
}

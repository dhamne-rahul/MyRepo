package Recursion.BackTracking;

public class Knights {
    public static void main(String[] args) {
        int n=2;
        boolean[][] board=new boolean[n][n];
        // int count=0;
        knight(board,0,0,n);
        System.out.println(count);
    }
    public static int count=0;
    static void knight(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            count=count+1;
            return;
        }

        if (row == board.length - 1 && col == board.length) {
            return;
        }

        if (col == board.length) {
            knight(board, row + 1, 0, knights);
            return;
        }
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        knight(board, row, col + 1, knights);
        // return count;
    }
    public static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }
    public static boolean isValid(boolean[][] board,int row,int col)
    {
        if(row>=0 && row<board.length && col>=0 && col<board.length)
        {
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for(int row=0;row<board.length;row++)
        {
            for(int col=0;col<board[0].length;col++)
            {
                if(board[row][col])
                {
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

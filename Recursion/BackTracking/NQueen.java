package Recursion.BackTracking;

public class NQueen {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        System.out.println(queens(board,0));;    
    }
    // public static int queens(boolean[][] board,int row)
    // {
    //     if(row==board.length)
    //     {
    //         display(board);
    //         return 1;
    //     }
    //     int count=0;
    //     for(int col=1;col<board[0].length;col++)
    //     {
    //         if(isSafe(board,row,col))
    //         {
    //             board[row][col]=true;
    //             count=count+queens(board, row+1);
    //             board[row][col]=false;
    //         }
    //     }
    //     return count;
    // }
    public static int queens(boolean[][]board,int row)
    {
        if(row==board.length)
        {
            display(board);
            return 1;
        }
        int count=0;
        for(int col=0;col<board[0].length;col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col]=true;
                count=count+queens(board, row+1);
                board[row][col]=false;
            }
        }
        return count;
    }
    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check for row;
        for(int i=0;i<row;i++)
        {
            if(board[i][col])
            {
                return false;
            }
        }
        //check for leftside;
        int leftcount=Math.min(row, col);
        for(int i=1;i<=leftcount;i++)
        {
            if(board[row-i][col-i])
            {
                return false;
            }
        }
        int rightcount=Math.min(row, board.length-col-1);
        for(int i=1;i<=rightcount;i++)
        {
            if(board[row-i][col+i])
            {
                return false;
            }
        }
        return true;
    }
    
    // public static boolean issafe(boolean[][]board,int row,int col){
    //     //check for rows:
    //     for(int i=0;i<row;i++)
    //     {
    //         if(board[i][col])
    //         {
    //             return false;
    //         }
    //     }
    //     //check left diagonal:
    //     int leftCount=Math.min(row,col);
    //     for(int i=1;i<=leftCount;i++){
    //         if(board[row-i][col-i])
    //         {
    //             return false;
    //         }
    //     }
    //     // check for right count: 
    //     int rightCount=Math.min(row,board.length-col-1);
    //     for(int i=1;i<=rightCount;i++){
    //         if(board[row-i][col+i])
    //         {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    private static void display(boolean[][] board) {
        for(int row=0;row<board.length;row++)
        {
            for(int col=0;col<board[0].length;col++)
            {
                if(board[row][col])
                {
                    System.out.print("Q ");
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

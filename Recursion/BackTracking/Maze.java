package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;


public class Maze {
    public static void main(String[] args) {
        // int n=3;
        // int m=3;
        // int ans=count(m,n);
        // System.out.println(ans);
        // ArrayList<String>ans=printPathDiago(1, 1, m, n, "");
        // System.out.println(ans);
        boolean[][] maze={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int m=maze.length;
        int n=maze[0].length;
        // printPathObstacles(0, 0, maze, "");
        int[][]path=new int[m][n];
        for(int[] i:path)
        {
            Arrays.fill(i, 0);
        }
        // allPathPrint(0, 0, maze, "",path, 1);
        printAllPath(0, 0, maze, "", path, 1);
    }
    public static void printAllPath(int i,int j,boolean[][]maze,String temp,int[][]path,int step)
    {
        if(i==maze.length-1 && j==maze[0].length-1)
        {
            path[i][j]=step;
            for(int[] p:path)
            {
                System.out.println(Arrays.toString(p));
            }
            System.out.println(temp);;
            System.out.println();
            return;
        }
        if(maze[i][j]==false)
        {
            return ;
        }
        maze[i][j]=false;
        path[i][j]=step;
        if(i<maze.length-1)
        {
            printAllPath(i+1, j, maze, temp+"D", path, step+1);
        }
        if(j<maze[0].length-1)
        {
            printAllPath(i, j+1, maze, temp+"R", path, step+1);
        }
        if(i>0)
        {
            printAllPath(i-1, j, maze, temp+"U", path, step+1);
        }
        if(j>0)
        {
            printAllPath(i, j-1, maze, temp+"L", path, step+1);
        }
        maze[i][j]=true;
        path[i][j]=0;
    }
    public static void allPathPrint(int i,int j,boolean[][]maze,String temp,int[][]path,int step)
    {
        if(i==maze.length-1 && j==maze[0].length-1)
        {
            path[i][j]=step;
            for(int[] k:path)
            {
                System.out.println(Arrays.toString(k));
            }
            System.out.println(temp);
            System.out.println();
            return ;
        }
        if(maze[i][j]==false)
        {
            return ;
        }
        maze[i][j]=false;
        path[i][j]=step;
        if(i<maze.length-1)
        {
            allPathPrint(i+1, j,maze,temp+"D",path,step+1);
        }
        if(j<maze[0].length-1)
        {
            allPathPrint(i, j+1,maze, temp+"R",path,step+1);
        }
        if(i>0)
        {
            allPathPrint(i-1, j, maze, temp+"U",path,step+1);
        }
        if(j>0)
        {
            allPathPrint(i, j-1, maze, temp+"L",path,step+1);
        }
        maze[i][j]=true;
        path[i][j]=0;

    }
    public static void printPathObstacles(int i,int j,boolean[][]maze,String temp)
    {
        if(i==maze.length-1 && j==maze[0].length-1)
        {
            System.out.println(temp);
            return ;
        }
        if(maze[i][j]==false)
        {
            return ;
        }
        maze[i][j]=false;
        if(i<maze.length-1)
        {
            printPathObstacles(i+1, j,maze, temp+"D");
        }
        if(j<maze[0].length-1)
        {
            printPathObstacles(i, j+1,maze, temp+"R");
        }
        if(i>0)
        {
            printPathObstacles(i-1, j, maze, temp+"U");
        }
        if(j>0)
        {
            printPathObstacles(i, j-1, maze, temp+"L");
        }
        // this line is where the function is over
        //so before the function get removed from the stack we remove all the changes the is made by thaat function.
        maze[i][j]=true;
    }
    // public static ArrayList<String> printPathObstacles(int i,int j,boolean[][]maze,String temp)
    // {
    //     if(i==maze.length-1 && j==maze[0].length-1)
    //     {
    //         ArrayList<String>a=new ArrayList<>();
    //         a.add(temp);
    //         return a;
    //     }
    //     if(maze[i][j]==false)
    //     {
    //         return ;
    //     }
    //     ArrayList<String>list=new ArrayList<>();
    //     if(i<maze.length-1)
    //     {
    //         list.addAll(printPathObstacles(i+1, j,maze, temp+"D"));
    //     }
    //     if(j<maze[0].length-1)
    //     {
    //         list.addAll(printPathObstacles(i, j+1,maze, temp+"R"));
    //     }
    // }
    // public static ArrayList<String> printPathDiago(int i,int j,int m,int n,String temp)
    // {
    //     if(i==m && j==n)
    //     {
    //         ArrayList<String>t=new ArrayList<>();
    //         t.add(temp);
    //         return t;
    //     }
    //     ArrayList<String>list=new ArrayList<>();
    //     if(i<m && j<n)
    //     {
    //         list.addAll(printPath(i+1, j+1, m, n, temp+"P"));
    //     }
    //     if(i<m)
    //     {
    //         list.addAll(printPath(i+1, j, m, n, temp+"D"));
    //     }
    //     if(j<n)
    //     {
    //         list.addAll(printPath(i, j+1, m, n, temp+"R"));
    //     }
    //     return list;
    // }
    public static ArrayList<String> printPath(int i,int j,int m,int n,String temp)
    {
        if(i==m && j==n)
        {
            ArrayList<String>t=new ArrayList<>();
            t.add(temp);
            return t;
        }
        ArrayList<String>list=new ArrayList<>();
        if(i<m)
        {
            list.addAll(printPath(i+1, j, m, n, temp+"D"));
        }
        if(j<n)
        {
            list.addAll(printPath(i, j+1, m, n, temp+"R"));
        }
        return list;
    }
    private static int count(int m, int n) {
        if(m==1 || n==1)
        {
            return 1;
        }
        int a=count(m-1, n);
        int b=count(m, n-1);
        return a+b;
    }
    
}

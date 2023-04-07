package Heaps;

import java.awt.Point;
import java.util.PriorityQueue;

public class ColsestPoint {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int dist;

        Point(int x,int y,int dist){
            this.dist=dist;
            this.x=x;
            this.y=y;
        }
        public int compareTo(Point p2){
            return this.dist-p2.dist;
        }
    }
    public static void main(String[] args) {
        int[][] points={
            {3,3},
            {5,-1},
            {-2,4}
        };
        PriorityQueue<Point>pq=new PriorityQueue<>();
        for(int i[]:points){
            int dist=(i[0]*i[0])+(i[1]*i[1]);
            pq.add(new Point(i[0],i[1],dist));
        }
        while(!pq.isEmpty()){
            System.out.println("("+pq.peek().x+","+pq.peek().y+") ->"+pq.peek().dist);
            pq.poll();
        }
    }
}

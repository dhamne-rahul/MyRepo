package Graphs;

import java.security.interfaces.EdECKey;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    static class Edge {
    int src;
    int dest;
    int wt;
    Edge(int src, int dest,int wt) {
    this.dest = dest;
    this.src = src;
    this.wt=wt;
    }
    }
    // static class Edge {
    //     int src;
    //     int dest;

    //     // int wt;
    //     Edge(int src, int dest) {
    //         this.dest = dest;
    //         this.src = src;
    //         // this.wt=wt;
    //     }
    // }

    // public static void createGraph(ArrayList<Edge>[] graph) {
    // for (int i = 0; i < graph.length; i++) {
    // graph[i] = new ArrayList<Edge>();
    // }
    // graph[0].add(new Edge(0, 1, 1));
    // graph[0].add(new Edge(0, 2, 1));
    // graph[1].add(new Edge(1, 0, 1));
    // graph[1].add(new Edge(1, 3, 1));
    // graph[2].add(new Edge(2, 0, 1));
    // graph[2].add(new Edge(2, 4, 1));
    // graph[3].add(new Edge(3, 1, 1));
    // graph[3].add(new Edge(3, 4, 1));
    // graph[3].add(new Edge(3, 5, 1));
    // graph[4].add(new Edge(4, 2, 1));
    // graph[4].add(new Edge(4, 3, 1));
    // graph[4].add(new Edge(4, 5, 1));
    // graph[5].add(new Edge(5, 3, 1));
    // graph[5].add(new Edge(5, 4, 1));
    // graph[5].add(new Edge(5, 6, 1));
    // graph[5].add(new Edge(6, 5, 1));
    // }
    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        
        // graph[2].add(new Edge(2, 3));
        // graph[3].add(new Edge(3, 1));
        // graph[4].add(new Edge(4, 0));
        // graph[4].add(new Edge(4, 1));
        // graph[5].add(new Edge(5, 0));
        // graph[5].add(new Edge(5, 2));
    }

    public static void bfs(ArrayList<Edge>[] graph, int V, boolean[] isVis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (isVis[curr] == false) {
                System.out.print(curr + " ");
                isVis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] isVis) {
        if (isVis[curr]) {
            return;
        }

        System.out.print(curr + " ");
        isVis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (isVis[e.dest] != true) {
                dfs(graph, e.dest, isVis);
            }
        }
    }

    public static void printAllPath(ArrayList<Edge> graph[], String ans, int curr, int target, boolean[] isVis) {
        if (curr == target) {
            System.out.println(ans + curr);
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!isVis[e.dest]) {
                isVis[curr] = true;
                printAllPath(graph, ans + curr, e.dest, target, isVis);
                isVis[curr] = false;
            }
        }
    }

    public static boolean undirectedCycle(ArrayList<Edge> graph[], int curr, boolean[] isVis, boolean[] recarr) {
        recarr[curr] = true;
        isVis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (recarr[e.dest] == true) {
                return true; // cycle condition:we are trying to add vertex that is already in stack.
            } else if (!isVis[e.dest]) {
                undirectedCycle(graph, e.dest, isVis, recarr);
            }
        }
        recarr[curr] = false;
        return false;

    }

    public static boolean isCyclicUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (stack[e.dest]) { // cycle exists
                return true;
            } else if (!vis[e.dest] && isCyclicUtil(graph, e.dest, vis, stack)) {
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    public static boolean isCyclic(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (vis[i] == false) {
                boolean cycle = isCyclicUtil(graph, i, vis, new boolean[vis.length]);
                if (cycle) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void topoSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> st) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topoSortUtil(graph, e.dest, vis, st);
            }
        }
        st.add(curr);
    }

    public static void topoSort(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topoSortUtil(graph, i, vis, s);
            }
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
    public static boolean isCycleUndirected(ArrayList<Edge>[] graph,int curr,int parent,boolean[]vis){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.dest]==true && e.dest!=parent){
                return true;
            }
            else if(vis[e.dest]==false &&isCycleUndirected(graph, e.dest, curr, vis)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        // for(int i=0;i<graph[1].size();i++){
        // Edge e=graph[1].get(i);
        // System.out.println(e.src+"-> "+e.dest+": "+e.wt);
        // }
        // System.out.println("bfs traversal:");
        boolean[] isVis = new boolean[V];
        // for(int i=0;i<V;i++){
        // if(isVis[i]==false){
        // bfs(graph, V,isVis);
        // }
        // }
        // System.out.println("dfs traversal :");
        // for(int i=0;i<V;i++){
        // if(isVis[i]==false){
        // dfs(graph, 0, isVis);
        // }
        // }
        // printAllPath(graph, "", 0, 5, isVis);
        // boolean[] arr = new boolean[V];
        // boolean ans = isCyclic(graph);
        // System.out.println(ans);
        Stack<Integer> st = new Stack<>();
        topoSort(graph);
        // System.out.println(st);
        // while(!st.empty()){
        // System.out.println(st.pop());
        // }

    }
}

package Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BuildTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Binarytree{
        int idx=-1;
        public Node buildTree(int[] node){
            idx++;
            if(node[idx]==-1){
                return null;
            }
            Node root=new Node(node[idx]);
            root.left=buildTree(node);
            root.right=buildTree(node);

            return root;
        }
        public void preOrder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+"->");
            preOrder(root.left);
            preOrder(root.right);
        }
        public void postOrder(Node root){
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+"->");
        }
        public void inOrder(Node root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+"->");
            inOrder(root.right);
        }
        public void levelOrderTrversal(Node root){
            Queue<Node>q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node front=q.poll();
                if(front!=null){
                    System.out.print(front.data+" ");
                    if(front.left!=null){
                        q.add(front.left);
                    }
                    if(front.right!=null){
                        q.add(front.right);
                    }

                }
                else{
                    if(q.isEmpty()){
                        return;
                    }
                    System.out.println();
                    q.add(null);
                }
            }
        }
        public int height(Node root){
            if(root==null){
                return 0;
            }
            return Math.max(height(root.left),height(root.right))+1;
        }
        public int count(Node root){
            if(root==null){
                return 0;
            }
            return count(root.left)+count(root.right)+1;
        }
        public static int sumNode(Node root){
            if(root==null){
                return 0;
            }
            return root.data+sumNode(root.left)+sumNode(root.right);
        }
        public int diameter(Node root){
            if(root==null){
                return 0;
            }
            int ld=diameter(root.left);
            int lh=height(root.left);
            int rd=diameter(root.right);
            int rh=height(root.right);
            int selfdia=rh+lh+1;

            return Math.max(selfdia, Math.max(ld, rd));
        }
        static class Info{
            int h;
            int di;
            Info(int h,int di){
                this.h=h;
                this.di=di;
            }
        }
        public Info getDia(Node root){
            if(root==null){
                return new Info(0, 0);
            }
            Info leftDia=getDia(root.left);
            Info rightDia=getDia(root.right);
            int lh=leftDia.h;
            int rh=rightDia.h;
            int ht=Math.max(lh,rh)+1;
            int di=Math.max(leftDia.di,Math.max(rightDia.di, (lh+rh+1)));
            return new Info(ht, di);
        }
        public boolean isSubTree(Node root,Node subRoot){
            if(root==null){
                return true;
            }
            if(root.data==subRoot.data){
                if(isIdentical(root,subRoot)){
                    return true;
                }
            }
            boolean leftAns=isSubTree(root.left, subRoot);
            boolean rightAns=isSubTree(root.right, subRoot);
            return leftAns||rightAns;
        }
        private boolean isIdentical(Node root, Node subRoot) {
            if(root==null &&subRoot==null){
                return true;
            }
            else if(root==null ||subRoot==null ||root.data!=subRoot.data){
                return false;
            }
            if(!isIdentical(root.left, subRoot.left)){
                return false;
            }
            if(!isIdentical(root.right,subRoot.right)){
                return false;
            }
            return true;
        }
        static class Info1{
            int hd;
            Node node;
            Info1(Node node,int hd){
                this.node=node;
                this.hd=hd;
            }
        }
        public void topView(Node root,int dist){
            Queue<Info1>q=new LinkedList<>();
            HashMap<Integer,Node>map=new HashMap<>();
            int min=0;
            int max=0;

            q.add(new Info1(root, 0));
            q.add(null); 

            while(!q.isEmpty()){
                Info1 curr=q.remove();  
                if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    if(!map.containsKey(curr.hd)){
                        map.put(curr.hd, curr.node);
                    }
                    if(curr.node.left!=null){
                        q.add(new Info1(curr.node.left, curr.hd-1));
                        min=Math.min(min, curr.hd-1);
                    }
                    if(curr.node.right!=null){
                        q.add(new Info1(curr.node.right, curr.hd+1));
                        max=Math.max(max, curr.hd+1);
                    }

                }
            }
            for(int i=min;i<=max;i++){
                 System.out.print(map.get(i).data+" ");
            }

        }
        public void printKthLevel(Node root,int k,int i){
            if(root==null){
                return;
            }
            if(i==k){
                System.out.print(root.data+"-> ");
                return;
            }
            printKthLevel(root.left, k,i+1);
            printKthLevel(root.right, k,i+1);

        }
        
    }
    public static void main(String[] args) {
        int[] node={1,2,3,4,5,6,7,-1,-1,-1,-1,-1,-1,-1,-1};
        Binarytree bt=new Binarytree();
        Node root=bt.buildTree(node);
        // System.out.println(root.left.data);
        // bt.preOrder(root);
        // System.out.println();
        bt.preOrder(root);
        System.out.println();
        // System.out.println();
        // bt.postOrder(root);
        // System.out.println();
        // bt.levelOrderTrversal(root);
        // System.out.println();
        // System.out.println(bt.height(root));
        // System.out.println("node count :"+bt.count(root));
        // System.out.println("node count :"+bt.sumNode(root));
        // System.out.println(bt.diameter(root));
        // // System.out.println(bt.getDia(root).h);
        // bt.topView(root, 0);
        // System.out.println(bt.map);
        // Set<Integer>set=bt.map.keySet();
        // for(Integer k:set){
        //     System.out.print(bt.map.get(k).data+" ->");
        // }
        // System.out.print("END");
        bt.printKthLevel(root, 3,1);
        
    }
}

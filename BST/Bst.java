package BST;

import java.util.ArrayList;
import java.util.List;

public class Bst {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;           
        }
    }
    public static Node insert(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(root.data>data){
            root.left=insert(root.left, data);
        }
        else{
            root.right=insert(root.right, data);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+"->");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"->");
        postOrder(root.left);
        postOrder(root.right);
    }
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(key>root.data){
            return search(root.right, key);
        }
        return search(root.left, key);
    }
    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right=delete(root.right, val);
        }
        else if(root.data>val){
            root.left=delete(root.left, val);
        }
        else{
            // case I:leaf node:
            if(root.left==null &&root.right==null){
                return null;
            }
            // case 2:single leaf node: 
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            // case 3:node with 2 nodes.
            Node IS=findSucc(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);
        }
        return root;

    }
    private static Node findSucc(Node root) {
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+"->");
            printInRange(root.right , k1, k2);
        }
        else if(root.data>k1){
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }
    public static boolean isBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        if(max!=null && root.data>=max.data){
            return false;
        }
        return isBST(root.left, min, root)&& isBST(root.right, root, max);
    }
    public static Node mirror(Node root){
        if(root ==null){
            return null;
        }
        Node leftMirror=mirror(root.left);
        Node rightMirror=mirror(root.right);

        root.right=leftMirror;
        root.left=rightMirror;
        return root;
    }
    static List<List<Integer>>ans=new ArrayList<>();
    public static void printPath(Node root,ArrayList<Integer>temp){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            temp.add(root.data);
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(root.data);
        printPath(root.left, temp);
        printPath(root.right, temp);
        temp.remove(temp.size()-1);
    }
    public static Node formBST(int[] arr,int st,int en){
        if(st>en){
            return null;
        }
        int mid=st+(en-st)/2;
        Node root=new Node(arr[mid]);
        root.left=formBST(arr, st, mid-1);
        root.right=formBST(arr,mid+1, en);
        return root;
    }
    static class Info{
        boolean isBst;
        int size;
        int min;
        int max;
        Info(boolean isBst,int size,int min,int max){
            this.isBst=isBst;
            this.size=size;
            this.max=max;
            this.min=min;
        }
    }
    static int ans1=Integer.MIN_VALUE;
    public static Info largestBSTInBT(Node root){
        if(root==null){
            return new Info(true, 0, Integer.MAX_VALUE , Integer.MIN_VALUE);
        }

        Info leftInfo=largestBSTInBT(root.left);
        Info rightInfo=largestBSTInBT(root.right);
        int size=leftInfo.size+rightInfo.size+1;
        int min=Math.min(root.data,Math.min(leftInfo.min, rightInfo.min));
        int max=Math.max(root.data,Math.max(leftInfo.max, rightInfo.max));

        if(root.data<=min && root.data>=max){
            new Info(false, size, min, max);
        }
        if(leftInfo.isBst||rightInfo.isBst){
            ans1=Math.max(ans1, leftInfo.size+rightInfo.size+1);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }
    public static void main(String[] args) {
        // int[] arr={5,1,3,4,2,7};
        // Node root=null;
        // for(int i=0;i<arr.length;i++){
        //     root=insert(root, arr[i]);
        // }
        // System.out.println(root.data);
        // inOrder(root);
        System.out.println();
        // System.out.println(search(root, 72));
        // delete(root, 4);
        // inOrder(root);
        // printInRange(root,5,7);
        // printPath(root,new ArrayList<>());
        // System.out.println(ans);
        int[]arr={3,5,6,8,10,11,12};
        Node root=formBST(arr, 0, arr.length-1);
        // postOrder(root);
        largestBSTInBT(root);
        System.out.println(ans1);


    }
}

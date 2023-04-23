package Hashing;

import java.util.LinkedList;

import javax.print.attribute.standard.Sides;

public class CustomHashMap {
    static class HashMap<K, V> {
        public class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int N;
        private int n;
        private LinkedList<Node>[] buckets;
        HashMap(){
            this.N=4;
            this.n=0;
            buckets=new LinkedList[N];
            for(int i=0;i<N;i++){
                buckets[i]=new LinkedList<>();
            }
        }
        public void put(K key,V value){
            int bi=hashFunction(key);
            int li=searchInLL(key,bi);//index or -1;
            if(li!=-1){//update
                buckets[bi].get(li).value=value;
            }
            else{
                buckets[bi].add(new Node(key, value) );
                n++;
                

                double lambda=n/N;
                if(lambda>2.0){
                    reHash();
                }  
            }
        }
        public void remove(K key){
            int bi=hashFunction(key);
            int li=searchInLL(key,bi);//index or -1;
            if(li==-1){
                return;
            }
            else{
                buckets[bi].remove(li);
                return;
            }
        }
        public boolean isEmpty(){
            return n==0;
        }
        private void reHash() {
            LinkedList<Node>[] oldBucket=buckets;
            buckets=new LinkedList[2*N];
            N*=2;
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
            // add old ll element to new buckets:
            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node>ll=oldBucket[i];
                while(!ll.isEmpty()){
                    Node node=ll.peek();
                    ll.poll();
                    put(node.key, node.value);
                }
            }
        }
        private int hashFunction(K key) {
            int hc=key.hashCode();
            return Math.abs(hc)%10;
        }
        private int searchInLL(K key,int bi) {
            LinkedList<Node>ll=buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                Node node =ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        public boolean isContainsKey(K key){
            int bi=hashFunction(key);
            int li=searchInLL(key,bi);//index or -1;
            if(li==-1){
                return false;
            }
            return true;
        }
        public V get(K key){
            int bi=hashFunction(key);
            int li=searchInLL(key,bi);//index or -1;
            if(li==-1){
                return buckets[bi].get(li).value;
            }
            return null;
        }

    }
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("india", 100);
        map.put("US", 50);
        map.put("china", 150);
        map.put("nepal", 5);
        
    }

}

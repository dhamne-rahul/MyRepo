package Trie;

public class Trie {
    static class trieNode {
        trieNode[] childrens;
        boolean isEndOfWord;

        public trieNode() {
            childrens = new trieNode[26];
            isEndOfWord = false;
        }
    }

    public static void insert(trieNode root, String key) {
        trieNode curr = root;
        for (int i = 0; i < key.length(); i++) {
            char cur = key.charAt(i);
            if (curr.childrens[cur - 'a'] == null) {
                trieNode newNode = new trieNode();
                curr.childrens[cur - 'a'] = newNode;
            }
            curr = curr.childrens[cur - 'a'];
        }
        curr.isEndOfWord = true;
    }

    public static boolean search(trieNode root, String key) {
        trieNode curr = root;

        for (int i = 0; i < key.length(); i++) {
            char cur = key.charAt(i);
            if (curr.childrens[cur - 'a'] == null) {
                return false;
            }
            curr = curr.childrens[cur - 'a'];
        }
        return curr.isEndOfWord;
    }

    public static boolean wordBreak(trieNode root,String key) {
        int len = key.length();
        if (len == 0) {
            return true;
        }
        for (int i = 1; i <= len; i++) {
            if (search(root, key.substring(0, i)) &&
                    wordBreak(root,key.substring(i))) {
                return true;
            }
        }
        return false;
    }
    public static boolean startsWith(trieNode root, String prefix) {
        trieNode curr = root;
        for(int i=0; i<prefix.length(); i++) {
            int idx = prefix.charAt(i)-'a';
            if(curr.childrens[idx] == null) { 
                return false;
            }
            curr = curr.childrens[idx];
        }
        return true;
    }
    public static int countNodes(trieNode root) {
        if(root == null) {
            return 0;
        }
        int count = 0;
        for(int i=0; i<26; i++) {
            if(root.childrens[i] != null) {
                count+= countNodes(root.childrens[i]);
            }
        }
        return 1+count; //extra one for the self node
    }
 
 

    public static void main(String[] args) {
        // String[] words = { "the", "there", "a", "their", "any" };
        trieNode root = new trieNode();
        // for (String i : words) {
        //     insert(root, i);
        // }
        // System.out.println(search(root, "the"));
        // System.out.println(wordBreak(root,"thereany"));
        String str="ababa";
        for(int i=0;i<str.length();i++){
            insert(root, str.substring(i));
        }
        System.out.println(countNodes(root));

    }
}

package LeetCode;

/**
 * @author abc
 * @version 1.0
 * @date 2022/4/10 16:36
 */
public class LeetCode208 {
    class TrieNode {
        boolean isword;
        TrieNode[] children;

        public TrieNode() {
            isword = true;
            children = new TrieNode[26];
        }
    }

    class Trie {
        TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode cur = root;
            int len = word.length();
            for (int i = 0; i < len; ++i) {
                int index = word.charAt(i) - 'a';
                if (cur.children[index] == null) {
                    cur.children[index] = new TrieNode();
                    cur.children[index].isword = false;
                }
                cur = cur.children[index];
            }
            cur.isword = true;
        }

        public boolean search(String word) {
            TrieNode cur = find(word);
            return cur != null&&cur.isword;
        }

        public boolean startsWith(String prefix) {
            return find(prefix) != null;
        }

        private TrieNode find(String str) {
            TrieNode current = root;
            int length = str.length();
            for (int i = 0; i < length; i++) {
                int index = str.charAt(i) - 'a';
                if ((current = current.children[index]) == null) {
                    return null;
                }
            }
            return current;
        }
    }
}
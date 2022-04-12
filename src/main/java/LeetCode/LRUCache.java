package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/4/5 8:32
 */
class LRUCache {
    class DLinkList{
        int key;
        int val;
        DLinkList prev;
        DLinkList next;

        public DLinkList() {
        }

        public DLinkList(int key, int val) {
            this.key = key;
            this.val = val;

        }

    }

    private HashMap<Integer, DLinkList> map = new HashMap<>();
    private int size;
    private int capacity;
    private DLinkList head, tail;



    public void addToHead(DLinkList node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    public void removeNode(DLinkList node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void moveToHead(DLinkList node) {
        removeNode(node);
        addToHead(node);
    }

    public DLinkList removeTail() {
        DLinkList node = tail.prev;
        removeNode(node);
        return node;
    }

    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new DLinkList();
        tail = new DLinkList();
        head.next = tail;
        tail.prev = head;
    }
    public int get(int key) {
        DLinkList node = map.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.val;
    }

    public void put(int key, int value) {
        DLinkList node = map.get(key);
        if (node == null) {
            DLinkList newNode = new DLinkList(key, value);
            map.put(key, newNode);
            ++size;
            addToHead(newNode);
            if (size > capacity) {
                DLinkList tailNode = removeTail();
                map.remove(tailNode.key);
                --size;
            }
        } else {
            node.val = value;
            moveToHead(node);

        }
    }
}


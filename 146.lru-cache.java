import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=146 lang=java
 *
 * [146] LRU Cache
 */

// @lc code=start
class LRUCache {
    class Node {
        int key;
        int value;
        Node pre;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    Node head;
    Node tail;
    Map<Integer, Node> map = null;
    int capacity = 0;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
    }

    public int get(int key) {
        if (map.get(key) == null) {
            return -1;
        }
        Node n = map.get(key);
        removeNode(n);
        offerNode(n);
        return n.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node n = map.get(key);
            n.value = value;
            removeNode(n);
            offerNode(n);
        } else {
            if (map.size() >= capacity) {
                map.remove(head.key);
                removeNode(head);
            }
            Node node = new Node(key, value);
            offerNode(node);
            map.put(key, node);
        }

    }

    private void removeNode(Node n) {
        if (n.pre != null) {
            n.pre.next = n.next;
        } else {
            head = n.next;
        }
        if (n.next != null) {
            n.next.pre = n.pre;
        } else {
            tail = n.pre;
        }
    }

    private void offerNode(Node n) {
        if (tail != null) {
            tail.next = n;
        }
        n.pre = tail;
        n.next = null;
        tail = n;
        if (head == null) {
            head = tail;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such: LRUCache obj =
 * new LRUCache(capacity); int param_1 = obj.get(key); obj.put(key,value);
 */
// @lc code=end

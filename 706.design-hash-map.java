import java.util.Arrays;

/*
 * @lc app=leetcode id=706 lang=java
 *
 * [706] Design HashMap
 */

// @lc code=start
class MyHashMap {

    /** Initialize your data structure here. */
    int[] data;

    public MyHashMap() {
        this.data = new int[10000001];
        Arrays.fill(data, -1);
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        data[key] = value;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map
     * contains no mapping for the key
     */
    public int get(int key) {
        return data[key];
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping
     * for the key
     */
    public void remove(int key) {
        data[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such: MyHashMap obj
 * = new MyHashMap(); obj.put(key,value); int param_2 = obj.get(key);
 * obj.remove(key);
 */
// @lc code=end

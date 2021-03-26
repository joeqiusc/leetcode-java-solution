import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode id=225 lang=java
 *
 * [225] Implement Stack using Queues
 */

// @lc code=start
class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;

    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int result = q1.poll();
        swap();
        return result;
    }

    /** Get the top element. */
    public int top() {
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int result = q1.poll();
        q2.add(result);
        swap();
        return result;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }

    void swap() {
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
}

/**
 * Your MyStack object will be instantiated and called as such: MyStack obj =
 * new MyStack(); obj.push(x); int param_2 = obj.pop(); int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

import java.awt.List;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

import jdk.internal.org.jline.reader.Candidate;

/*
 * @lc app=leetcode id=127 lang=java
 *
 * [127] Word Ladder
 */

// @lc code=start
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (wordList == null || wordList.size() == 0)
            return 0;
        Set<String> wordSet = new HashSet<>(wordList);
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int result = 1;
        while (!queue.isEmpty()) {
            result++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                List<String> candidate = candidate(word, wordSet);
                for (String s : candidate) {
                    if (endWord.equals(s)) {
                        return result;
                    }
                    queue.offer(s);
                }
            }
        }
        return 0;
    }

    private List<String> candidate(String word, Set<String> wordSet) {
        List<String> candidates = new ArrayList<>();
        StringBuilder sb = new StringBuilder(word);
        for (int i = 0; i < sb.length(); i++) {
            char temp = sb.charAt(i);
            for (char c = 'a'; c <= 'z'; c++) {
                if (temp == c) {
                    continue;
                }
                sb.setCharAt(i, c);
                String newWord = sb.toString();
                if (wordSet.remove(newWord)) {
                    candidates.add(newWord);
                }
            }
            sb.setCharAt(i, temp);
        }
        return candidates;
    }
}
// @lc code=end

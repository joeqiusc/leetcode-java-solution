import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/*
 * @lc app=leetcode id=126 lang=java
 *
 * [126] Word Ladder II
 */

// @lc code=start
class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        List<List<String>> result = new LinkedList<>();
        Map<String, List<String>> nextWords = new HashMap<>();
        Map<String, Integer> distance = new HashMap<>();
        if (!wordSet.contains(endWord)) {
            return result;
        }
        wordSet.add(beginWord);
        bfs(beginWord, endWord, wordSet, nextWords, distance);
        dfs(beginWord, endWord, nextWords, distance, new LinkedList<>(), result);
        return result;
    }

    // there could be 0 or many next word, that only change one letter at specific
    // position
    // this method put all these next words into list.
    private List<String> getNextWord(String current, Set<String> wordSet) {
        List<String> nextWords = new LinkedList<>();
        char[] charArray = current.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (ch == currentChar) {
                    // no word change
                    continue;
                }
                charArray[i] = ch;
                // all possible changes, for example, lot -> lat, to any letter that second
                // letter is not 'o'
                // that should be 25 candidates, but not all of them are in the wordSet.
                String newWord = String.valueOf(charArray);
                if (wordSet.contains(newWord)) {
                    nextWords.add(newWord);
                }
                charArray[i] = currentChar;
            }
        }
        return nextWords;
    }

    // find the shortest distance
    private void bfs(String beginWord, String endWord, Set<String> wordSet, Map<String, List<String>> nextWords,
            Map<String, Integer> distance) {
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        distance.put(beginWord, 0);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                if (current.equals(endWord)) {
                    break;
                    // that means already find the shortest distance, we don't need to travelsel the
                    // rest.
                }
                // if not, we need to record the current next word
                List<String> currentNextWords = getNextWord(current, wordSet);
                Iterator<String> it = currentNextWords.iterator();
                while (it.hasNext()) {
                    String word = it.next();
                    if (!distance.containsKey(word)) {
                        queue.offer(word);
                        distance.put(word, distance.get(current) + 1);
                    }
                }
                nextWords.put(current, currentNextWords);
            }

        }
    }

    // traversel all the possible ladder, to find the result
    private void dfs(String currentWord, String endWord, Map<String, List<String>> nextWords,
            Map<String, Integer> distance, LinkedList<String> list, List<List<String>> result) {
        list.add(currentWord);
        if (currentWord.equals(endWord)) {
            result.add(new LinkedList<>(list));
        } else {
            for (String nextWord : nextWords.get(currentWord)) {
                if (nextWord == null) {
                    continue;
                }
                // the distance difference between the current word and the next word always 1
                if (distance.get(nextWord) == distance.get(currentWord) + 1) {
                    dfs(nextWord, endWord, nextWords, distance, list, result);
                }
            }
        }
        list.remove(list.size() - 1);
    }
}
// @lc code=end

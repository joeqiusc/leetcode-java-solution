/*
 * @lc app=leetcode id=506 lang=java
 *
 * [506] Relative Ranks
 */

// @lc code=start
class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> orderedRanking = new PriorityQueue<>((o1, o2) -> score[o2] - score[o1]);
        orderedRanking.addAll(IntStream.range(0, score.length).boxed().collect(Collectors.toList()));
        String[] relativeRanks = new String[score.length];
        int currentRank = 1;
        while (!orderedRanking.isEmpty()) {
            int removed = orderedRanking.poll();
            if (currentRank > 3) {
                relativeRanks[removed] = String.valueOf(currentRank++);
            } else {
                relativeRanks[removed] = (currentRank == 1 ? "Gold Medal"
                        : (currentRank == 2 ? "Silver Medal" : "Bronze Medal"));
                currentRank++;
            }
        }
        return relativeRanks;
    }
}
// @lc code=end

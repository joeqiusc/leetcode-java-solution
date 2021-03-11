/*
 * @lc app=leetcode id=355 lang=java
 *
 * [355] Design Twitter
 */

// @lc code=start
class Twitter {

    private HashMap<Integer, HashSet<Integer>> follows;
    private HashMap<Integer, LinkedList<Tweet>> tweets;
    private int timestamp;

    private class Tweet implements Comparable<Tweet> {
        private int tweetId;
        private int timestamp;
        private int userId;

        public Tweet(int tweetId, int userId, int timestamp) {
            this.tweetId = tweetId;
            this.timestamp = timestamp;
            this.userId = userId;
        }

        @Override
        public int compareTo(Tweet tweet) {
            return tweet.timestamp - this.timestamp;
        }
    }

    /** Initialize your data structure here. */
    public Twitter() {
        follows = new HashMap<>();
        tweets = new HashMap<>();
        timestamp = 0;
    }

    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        if (!tweets.containsKey(userId)) {
            tweets.put(userId, new LinkedList<>());
        }
        tweets.get(userId).add(0, new Tweet(tweetId, userId, timestamp++));
        if (!follows.containsKey(userId)) {
            follows.put(userId, new HashSet());
            follows.get(userId).add(userId);
        }
    }

    /**
     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in
     * the news feed must be posted by users who the user followed or by the user
     * herself. Tweets must be ordered from most recent to least recent.
     */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> feed = new LinkedList<>();
        PriorityQueue<Tweet> q = new PriorityQueue<>();
        if (!follows.containsKey(userId)) {
            return feed;
        }
        HashSet<Integer> followed = follows.get(userId);
        HashMap<Integer, Integer> count = new HashMap<>();
        for (Integer i : followed) {
            if (tweets.containsKey(i)) {
                Tweet t = tweets.get(i).get(0);
                q.add(t);
                count.put(t.userId, 1);
            }
        }
        while (q.size() > 0 && feed.size() < 10) {
            Tweet t = q.poll();
            feed.add(t.tweetId);
            int next = count.get(t.userId);
            count.put(t.userId, next + 1);
            if (next < tweets.get(t.userId).size()) {
                q.add(tweets.get(t.userId).get(next));
            }
        }
        return feed;
    }

    /**
     * Follower follows a followee. If the operation is invalid, it should be a
     * no-op.
     */
    public void follow(int followerId, int followeeId) {
        if (!follows.containsKey(followerId)) {
            follows.put(followerId, new HashSet());
            follows.get(followerId).add(followerId);
        }
        follows.get(followerId).add(followeeId);
    }

    /**
     * Follower unfollows a followee. If the operation is invalid, it should be a
     * no-op.
     */
    public void unfollow(int followerId, int followeeId) {
        if (followerId == followeeId) {
            return;
        }
        if (follows.containsKey(followerId)) {
            follows.get(followerId).remove(followeeId);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such: Twitter obj =
 * new Twitter(); obj.postTweet(userId,tweetId); List<Integer> param_2 =
 * obj.getNewsFeed(userId); obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
// @lc code=end

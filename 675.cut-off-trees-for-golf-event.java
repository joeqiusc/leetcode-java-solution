/*
 * @lc app=leetcode id=675 lang=java
 *
 * [675] Cut Off Trees for Golf Event
 */

// @lc code=start
class Solution {
    public int cutOffTree(List<List<Integer>> forest) {
        Queue<int[]> heap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[2], b[2]);
            }
        });
        int n = forest.size();
        int m = forest.get(0).size();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int k = forest.get(i).get(j);
                if (k > 1)
                    heap.add(new int[] { i, j, k });
            }
        }
        int[] prev = new int[] { 0, 0, 0 };
        int count = 0;
        while (!heap.isEmpty()) {
            int[] pos = heap.poll();
            int bfs = bfs(forest, prev, pos, n, m);
            if (bfs == -1)
                return -1;
            count += bfs;
            prev[0] = pos[0];
            prev[1] = pos[1];
        }
        return count;
    }

    int[][] coord = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    int bfs(List<List<Integer>> forest, int[] start, int[] end, int n, int m) {
        Queue<int[]> queue = new LinkedList<>();
        start[2] = 0;
        queue.add(start);
        boolean visited[][] = new boolean[n][m];
        visited[start[0]][start[1]] = true;
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int i = cell[0];
            int j = cell[1];
            int cost = cell[2];
            if (i == end[0] && j == end[1])
                return cost;

            for (int[] c : coord) {
                int x = i + c[0];
                int y = j + c[1];
                if (x < 0 || y < 0)
                    continue;
                if (x >= n || y >= m)
                    continue;
                if (forest.get(x).get(y) == 0)
                    continue;
                if (visited[x][y])
                    continue;
                visited[x][y] = true;
                queue.add(new int[] { x, y, cost + 1 });
            }
        }
        return -1;
    }
}
// @lc code=end

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*
 * @lc app=leetcode id=811 lang=java
 *
 * [811] Subdomain Visit Count
 */

// @lc code=start
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {

        // Solution 1 by string split
        // List<String> list = new LinkedList<>();
        // Map<String, Integer> map = new HashMap<>();
        // if (cpdomains == null || cpdomains.length == 0)
        // return list;
        // for (String s : cpdomains) {
        // String[] strs = s.split("\\s+");
        // int num = Integer.parseInt(strs[0]);
        // String[] domains = strs[1].split("\\.");
        // StringBuilder sb = new StringBuilder();
        // for (int i = domains.length - 1; i >= 0; i--) {
        // sb.insert(0, domains[i]);
        // map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + num);
        // sb.insert(0, ".");
        // }
        // }
        // for (String key : map.keySet()) {
        // list.add(map.get(key) + " " + key);
        // }
        // return list;

        // Solution 2 by sbstring
        List<String> list = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();
        if (cpdomains == null || cpdomains.length == 0)
            return list;
        for (String s : cpdomains) {
            final int num = Integer.valueOf(s.substring(0, s.indexOf(' ')));
            final String domains = s.substring(s.indexOf(' ') + 1);
            map.put(domains, map.getOrDefault(domains, 0) + num);
            for (int i = 0; i < domains.length(); i++) {
                if (domains.charAt(i) == '.') {
                    String subdomain = domains.substring(i + 1);
                    map.put(subdomain, map.getOrDefault(subdomain, 0) + num);
                }
            }
        }
        for (String key : map.keySet()) {
            list.add(map.get(key) + " " + key);
        }
        return list;
    }
}
// @lc code=end

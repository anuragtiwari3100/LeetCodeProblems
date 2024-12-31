class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        Set<Integer> travelDays = new HashSet<>();
        for (int day : days) {
            travelDays.add(day);
        }

        int maxDay = days[days.length - 1];
        int[] dp = new int[maxDay + 1];

        for (int day = 1; day <= maxDay; day++) {
            if (travelDays.contains(day)) {
                dp[day] = Math.min(dp[day - 1] + costs[0],
                        Math.min(dp[Math.max(0, day - 7)] + costs[1],
                                dp[Math.max(0, day - 30)] + costs[2]));
            } else {
                dp[day] = dp[day - 1];
            }
        }

        return dp[maxDay];
    }
}

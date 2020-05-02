public class TwoFiveSix {

    // inspired by the solution. But I did it from start to end instead of backwards;
    public int minCost(int[][] costs) {
        if(costs.length == 0) return 0;
        for(int i = 1; i < costs.length; i++) {
            costs[i][0] += Math.min(costs[i-1][1], costs[i-1][2]);
            costs[i][1] += Math.min(costs[i-1][0], costs[i-1][2]);
            costs[i][2] += Math.min(costs[i-1][0], costs[i-1][1]);
        }
        int l = costs.length - 1;
        return Math.min(costs[l][0], Math.min(costs[l][1], costs[l][2]));
    }
}

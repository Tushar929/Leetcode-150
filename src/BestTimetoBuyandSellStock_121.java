public class BestTimetoBuyandSellStock_121 {
    public static void main(String[] args) {
        BestTimetoBuyandSellStock_121 solution = new BestTimetoBuyandSellStock_121();

        // Test case example: Stock prices over days
        int[] prices = {7, 1, 5, 3, 6, 4};

        // Calling the method and printing the result
        int result = solution.maxProfit(prices);
        System.out.println("Max profit: " + result);
    }

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxprofit = 0;
        int cost = 0;
        for (int i = 0; i < prices.length; i++) {
            cost = prices[i] - min;
            maxprofit = Math.max(maxprofit, cost);
            min = Math.min(min, prices[i]);
        }
        return maxprofit;
    }
}

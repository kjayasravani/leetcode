class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;
        int exchange = count;
        while(exchange>=numExchange){
            int newBottles = exchange/numExchange;
            count += newBottles;
            exchange = newBottles + (exchange % numExchange);
        }
        return count;
    }
}
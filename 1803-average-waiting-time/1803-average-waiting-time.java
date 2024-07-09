class Solution {
    public double averageWaitingTime(int[][] customers) {
        double fin_time = 0;
        double total_wait_time = 0;
        double wait_time=0;
        for(int i=0;i<customers.length;i++){
            if(fin_time<customers[i][0]){
                fin_time = customers[i][0];
            }
            fin_time += customers[i][1];
            wait_time = fin_time - customers[i][0];
            total_wait_time += wait_time;
        }
        return total_wait_time/customers.length;
    }
}
public class bestimetobuyandsellstocks {
    public int maxProfit(int[] prices) {
        int p = prices[0];
        int maxp=0;
        int k =0;

        if(prices.length <2){
            return 0;
        }
        for(int i =0 ; i<prices.length ;i++){
            if(prices[i]< p){
                p=prices[i];
            }
            maxp = prices[i]-p;
            k =Math.max(k,maxp);


        }
        return k;
    }
}

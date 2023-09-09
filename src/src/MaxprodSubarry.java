public class MaxprodSubarry {
    public int maxProduct(int[] nums) {
        int temp = nums[0];
        for (int i =0 ; i<nums.length ;i++){
            int sum =1;
            for (int j = i ; j< nums.length ;j++){
                sum = sum*nums[j];
                if(sum >temp){
                    temp = sum ;
                }
            }
        }
        return temp;
    }
}

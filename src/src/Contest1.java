public class Contest1 {
    public long maximumTripletValue(int[] nums) {
        long temp =0;
        for(int i =0; i< nums.length;i++){
            for(int j =i+1;j<nums.length ;j++){
                for (int k=j+1; k< nums.length;k++){
                    long sum = (long)(nums[i]-nums[j])*nums[k];
                    if(sum>temp){
                        temp = sum;
                    }

                }
            }
        }
        return temp;
    }
}

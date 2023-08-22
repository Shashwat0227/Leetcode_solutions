public class moveZeros {
    public void moveZeroes(int[] nums) {
        int []arr = new int [nums.length];
        int count =0;
        for (int i =0 ; i < nums.length ;i++){
            if(nums[i]!=0){
                arr[count]=nums[i];
                count++;
            }
        }
        for(int i=0 ;i < count ;i++){
            nums[i]=arr[i];
        }
        for(int i =count;i<nums.length ;i++){
            nums[i]=0;
        }
    }
}

import java.util.Arrays;

public class PrefixScore {
    static int maxScore(int[] nums) {
Arrays.sort(nums);
int count = 0;
int sum = 0;
int []pre = new int [nums.length];
for (int i = nums.length-1 ; i>=0 ; i--){
    sum+=nums[i];
    pre[i]=sum;
    if(pre[i]>0) count++;
}
    return count;
    }

    public static void main(String[] args) {
        int []nums = {402297,-972364,550108,139600,462523,-622496,-195119,382696,450472,-255760,566176,-715438,-232452,20399,-752064,188167,171099,-34126,-574516};
        int ans = maxScore(nums);
        System.out.println(ans);
    }
}

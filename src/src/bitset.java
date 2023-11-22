public class bitset {
    static boolean isKthBitSet(int n, int k) {
        // Write your code here.
        int ans = 1<<k-1;
        if((n & ans)!=0){
            return true;
        }
        return false;
    }
}

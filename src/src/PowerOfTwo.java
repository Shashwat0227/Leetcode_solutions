public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n>0){
            if((n &(n-1))==0){
                return true;
            }
        }
        return false;
    }
}

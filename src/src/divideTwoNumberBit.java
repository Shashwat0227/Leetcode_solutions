public class divideTwoNumberBit {
    public int divide(int dividend, int divisor) {

        int ans =0;
        // edge case ( when bit is greater than the range !)
        if (dividend == 1 << 31 && divisor == -1) return (1 << 31) - 1;
        ans = dividend/divisor;
        return ans;

    }
}

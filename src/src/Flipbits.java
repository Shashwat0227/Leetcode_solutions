import java.util.*;
public class Flipbits {
    public int minBitFlips(int start, int goal) {
    int ans =0;
    ans = start^goal;
  int res= Integer.bitCount(ans);
  return res;
    }
}

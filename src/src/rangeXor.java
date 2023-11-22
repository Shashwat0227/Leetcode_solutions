public class rangeXor {
    static int range(int L, int R){
int ans=0;
        for (int i =0; i< R ;i++){
            R= R^i;

        }
    for(int i =0; i< L;i++){
        L= i^(L-1);
    }
    ans = L^R;
    return ans;
    }

    public static void main(String[] args) {
        System.out.println(range(2,4));
    }
}

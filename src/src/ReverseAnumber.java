public class ReverseAnumber {
    public int reverse(int x) {
        long revnumber =0;
        int lastDigit =0;

        while(x!=0){
            lastDigit = x%10;
            x =x/10;
            revnumber = lastDigit + revnumber*10;

        }
        if(revnumber>=Integer.MIN_VALUE && revnumber<=Integer.MAX_VALUE){
            return (int )revnumber;
        }
        return 0;
    }
}

public class oneBitTwoBit {
    public boolean isOneBitCharacter(int[] bits) {
        int i =0;
        for( i =0 ; i< bits.length -1;){
            if(bits[i]==0){
                i++;
            }else {
                i = i+2;
            }
        }
        if((i==bits.length-1)){
            return true;
        }
        return false;
    }
}

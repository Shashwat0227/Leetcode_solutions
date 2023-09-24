import java.util.*;
public class kidwithMaxcandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> lst=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(max<candies[i])
                max=candies[i];
        }
        for(int i=0;i<candies.length;i++){
            int curr=candies[i]+extraCandies;
            if(curr>=max){
                lst.add(true);
            }
            else{
                lst.add(false);
            }
        }
        return lst;
    }
}

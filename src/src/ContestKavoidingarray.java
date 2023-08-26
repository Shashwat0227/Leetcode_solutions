import java.util.*;
public class ContestKavoidingarray {
  public int sum(int n, int k) {
    HashSet<Integer> set=new HashSet<>();
    int i=1;
    int count=0;
    while(n>0){
      if(set.contains(k-i))i++;
      else{
        set.add(i);
        count+=i;
        i++;
        n--;

      }

    }
    return count;
  }
}

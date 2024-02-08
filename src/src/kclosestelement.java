import com.sun.source.tree.LiteralTree;

import java.security.KeyPair;
import java.util.*;
class Pair{
    int val;
    int dist;
    public Pair (int val, int dist){
        this.val = val;
        this.dist = dist;
    }
}
public class kclosestelement {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Pair> ls = new ArrayList<Pair>();
        for(int i = 0 ;i< arr.length ; i++){
            Pair obj = new Pair(arr[i],Math.abs(x-arr[i]));
            ls.add(obj);
        }
        Collections.sort(ls, new Comparator<Pair>() {
            public int compare(Pair o1, Pair o2) {
                if(o1.dist!=o2.dist) {
                    return Integer.valueOf(o1.dist).compareTo(Integer.valueOf(o2.dist));
                } else {
                    return Integer.valueOf(o1.val).compareTo(Integer.valueOf(o2.val));
                }
            }
        });
        List<Integer> res = new ArrayList<>();
        for(int i =0 ; i< k ; i++){
            res.add(ls.get(i).val);
        }
        Collections.sort(res);
        return res;
    }
}


import java.util.*;
public class noofkeychanges {
    static int countKeyChanges(String s) {
      int count =0;
     s = s.toLowerCase();
      for (int i =1; i< s.length();i++){
          if(s.charAt(i-1)!=s.charAt(i)){
              count ++;
          }
      }
    return count;
    }

    public static void main(String[] args) {
        String s ="aAbBcC";
        int res = countKeyChanges(s);
        System.out.println(s);
    }
}

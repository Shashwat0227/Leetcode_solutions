import java.util.*;
public class ValidParanthesis {
    static int checkValidString(String s) {

        int max = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') count++;
            if (s.charAt(i) == ')') count--;
            if (s.charAt(i) == '*') max++;

        }
//        if (count == 0) return true;
//        else if (count > 0) {
//            if ((count - max) == 0) {
//                return true;
//
//            }
//        }else{
//            if ((count + max) == 0) return true;
//        }
//
//        return false;
//    }
return count;
    }
    public static void main(String[] args) {
        String s = "(((((*)))**";
        System.out.println(checkValidString(s));
    }
}

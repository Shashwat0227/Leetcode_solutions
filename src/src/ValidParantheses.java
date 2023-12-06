import java.util.*;
public class ValidParantheses {
    public boolean isValid(String s) {
        Stack<Character> str = new Stack<>();
       for(int i =0 ; i<s.length();i++){
           if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[' ){
               str.push(s.charAt(i));
           }
           else {
               if(str.isEmpty()){
                   return false;
               }
           char c = str.peek();
               if(s.charAt(i)=='}'||s.charAt(i)==')'||s.charAt(i)==']' ){
                   str.pop();
               }
else{
    return false;
               }
           }


       }
        if(str.isEmpty()){
            return true;
        }
    return false;
    }
}
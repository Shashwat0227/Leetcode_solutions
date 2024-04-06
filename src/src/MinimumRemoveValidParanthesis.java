import java.util.Stack;
import java.util.*;

public class MinimumRemoveValidParanthesis {

       public String minRemoveToMakeValid(String s) {
       char []ans = s.toCharArray();
       int count =0;
       for (int i =0 ; i < ans.length ; i++){
           if (ans[i]=='('){
               count++;
           }else if ( ans[i]==')') {
               if (count > 0) count--;
           }else ans[i]='0';

       }
for(int i = ans.length -1 ; i>=0; i++){
    if ( ans[i]==')'){
        count++;
    }else if (ans[i]=='('){
        if(count>0)count--;
    }else ans[i]=0;
}
    String str= "";
for(int i =0 ; i<ans.length ; i++ ){
    if(ans[i]=='0'){
        str+="";
    }
str+=ans[i];
}
       return str;
       }
}

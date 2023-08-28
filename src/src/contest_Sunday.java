import java.util.*;
public class contest_Sunday {
    public int furthestDistanceFromOrigin(String moves) {
        StringBuilder st = new StringBuilder();
        int count =0;
        int i =0;
        while (i <moves.length()){

           if(moves.charAt(i)=='_'){
               moves.replace('_','L');
           }

        }
        for(int j =0 ; i < moves.length();i++){
           if(moves.charAt(i)=='L'){
               count ++;
           }
        }
        return count;
    }
}

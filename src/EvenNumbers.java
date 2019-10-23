import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {

         public static List<Integer> filterOddNumber(List<Integer> listOfNumbers){

             List<Integer> toRemove = new ArrayList<Integer>();

        for(Integer a: listOfNumbers){
            if(a % 2 != 0){
                toRemove.add(a);
            }
        }
        return toRemove;
    }
    }


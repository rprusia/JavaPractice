import java.util.HashSet;
import java.util.Set;

public class RandString {

    public static void main(String args[]) {

        char currentChar;
        Set<String> myChars = new HashSet<String>();
        String alphaSource = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Set<String> fruits = new HashSet<String>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < alphaSource.length(); i++) {
            currentChar = alphaSource.charAt(i);
            myChars.add(String.valueOf(currentChar));
       }
//
//        for (String fruit: fruits) {
//            if(fruits.add(fruit)){
//                sb.append(fruit);
//                sb.append(", ");
//            }
//        }
//
//        System.out.println(sb.toString());

        }
    }

import java.util.*;
import java.io.*;

public class HRLoopII {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for ( int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            List<Integer> abc = new ArrayList<Integer>();
            abc.add(a);
            for (int ab = 0; ab < n; ab++) {
                abc.add(abc.get(ab) + (int) (Math.pow(2,ab)) *  b);
            }
            abc.remove(0);

            for (int z = 0; z < abc.size(); z++) {
                System.out.printf("%d ", abc.get(z));
            }
            in.close();
        }

    }
}

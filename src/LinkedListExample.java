import java.util.*;

public class LinkedListExample {

    public static void main(String args[]){

        LinkedList<String> list = new LinkedList<String>();
        int count = 0;

        list.add("Ray");
        list.add("Sam");
        list.add("Heather");
        list.add("Sue");

        list.addFirst("Negan"); // add element to first position
        list.addLast("Glenn");
        list.add(2, "third position");

        // iterating LinkedList
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println((iterator.next()));
            count++;
        }
        System.out.println(count);
    }
}

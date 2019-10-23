public class TwoWordNameToInitials {

    public static String abbrevName(String name) {

        String [] arr = name.toUpperCase().split(" ");
        Character[] myResult = new Character[3];
        int counter = 0;

        for (String ss : arr){
            myResult[counter++] = ss.charAt(0);
        }

        String initials = new String( myResult[0] + "." + myResult[1]);

        return initials;
    }
}

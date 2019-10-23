public class FindCharAt {

    public static String position (char alphabet){

        Integer position = 0;
        Character[] alphaChars = {'a','b','c','d','e','f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y','z'};

        for ( int i = 0 ; i < alphaChars.length; i++){

            if (alphaChars[i] == alphabet){
                position = i + 1;
            }
        }
        String result = new String ("Position of alphabet: " + position.toString());
        return result;
    }
}

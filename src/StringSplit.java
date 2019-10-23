public class StringSplit {


    public static void main(String[] args){
        String str = "geekss for geekss";
        String[] arrOfStr = str.split(" ");
        String[] result = new String[arrOfStr.length];
        int i = 0;

        for (String a : arrOfStr){

            result[i] = a.substring(0,1).toUpperCase() + a.substring(1);
            i++;

        }


    }


}

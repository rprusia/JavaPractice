public class RockPaperScissors {

    public static String rps(String p1, String p2){

       // StringBuffer result = new StringBuffer();
        String x = new String("no result");
        if (p1.contains("scissors") && p2.contains("paper") || p1.contains("paper") && p2.contains("scissors")){

            if (p1.contains("scissors")){
               // result.append("Player 1 won!") ;
                String result = new String("Player 1 won!");
                return result;
            }
            else {
                String result = new String("Player 2 won!");
                return result;
            }
        }
        else if (p1.contains("paper")  && p2.contains("scissors") || p1.contains("scissors") && p2.contains("paper")){

            if (p1.contains("scissors")){
                //result.append("Player 1 won!") ;
                String result = new String("Player 1 won!");
                return result;
            }
            else {
                //result.append("Player 2 won!") ;
                String result= new String("Player 2 won!");
                return result;
            }
        }
        else if (p1.contains("rock")  && p2.contains("scissors") || p1.contains("scissors") && p2.contains("rock")){

            if (p1.contains("rock")){
                String result = new String("Player 1 won!");
                return result;
            }
            else {
                String result= new String("Player 2 won!");
                return result;
            }
        }

     //   return result;
        return x;
    }
}

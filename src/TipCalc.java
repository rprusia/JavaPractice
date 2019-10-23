public class TipCalc {

    public static Integer calculateTip(double amount, String rating){

        Integer roundedTip = 0;
        Double tip = 0d;

        switch(rating.toUpperCase()){
            case "EXCELLENT":
                tip = amount * 0.20;
                break;
            case "GREAT":
                tip = amount * 0.15;
                break;
            case "GOOD":
                tip = amount * 0.10;
                break;
            case "POOR":
                tip = amount * 0.05;
                break;
            case "TERRIBLE":
                tip = amount * 0.0;
                break;
            default:
                return null;
        }


        roundedTip = (int) Math.ceil(tip);
        return roundedTip;
    }

}

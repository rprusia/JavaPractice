public class BasicMath {

    public int basicOp(String operation, int num1, int num2) {
        int result = 0;

        switch (operation) {

            case "+":
                result = num1 + num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "-":
                result = num1 - num2;
                break;

        }

        return result;
    }
}



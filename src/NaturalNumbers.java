public class NaturalNumbers {

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

Note: If the number is a multiple of both 3 and 5, only count it once.
 */

    public int solution(int number) {

        int total = 0;
        boolean flag = false;

        for (int i =0; i < 10; i++) {

            if (number < 10) {

                if ((number % 3 == 0) && (number % 5 == 0)) {

                    total = +number;
                }
            }
        }

        return total;

    }

}

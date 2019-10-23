/**
 Two tortoises named A and B must run a race. A starts with an average speed of 720 feet per hour.
 Young B knows she runs faster than A, and furthermore has not finished her cabbage. When she starts,
 at last, she can see that A has a 70 feet lead but B's speed is 850 feet per hour.
 How long will it take B to catch A?

 More generally: given two speeds v1 (A's speed, integer > 0) and v2 (B's speed, integer > 0)
 and a lead g (integer > 0) how long will it take B to catch A?

 The result will be an array [hour, min, sec]
 which is the time needed in hours, minutes and seconds (round down to the nearest second)
 or a string in some languages.

 If v1 >= v2 then return nil, nothing, null,
 None or {-1, -1, -1} for C++, C, Go, Nim, [] for Kotlin or "-1 -1 -1".

 Examples:
 (form of the result depends on the language)

 race(720, 850, 70) => [0, 32, 18] or "0 32 18"
 race(80, 91, 37)   => [3, 21, 49] or "3 21 49"
 ** Note:

 See other examples in "Your test cases".

 In Fortran - as in any other language - the returned string is not permitted to contain
 any redundant trailing whitespace: you can use dynamically allocated character strings.

 ** Hints for people who don't know how to convert to hours, minutes, seconds:
 Tortoises don't care about fractions of seconds
 Think of calculation by hand using only integers (in your code use or simulate integer division)
 or Google: "convert decimal time to hours minutes seconds"
 *
 */
public class TurtleRace {


    public static int race(int a, int b, int g )
    {
        int aAvgSpeed = a;
        int bAvgSpeed = b;
        int lead = g;
        int aPosition = 70;
        int bPosition = 0;
        int fullHour = 0;
        int counter = 0;
        int time = 0;

        while (bPosition < aPosition){

            if ((aPosition + bAvgSpeed) > (bPosition + bAvgSpeed)) {  // full hour, next position of each turtle

                aPosition += aAvgSpeed;
                bPosition += bAvgSpeed;
                fullHour += 60;
                counter = counter + 1;

            }

            if ((aPosition + bAvgSpeed) > (bPosition + bAvgSpeed)){

            }
            else {  // partial hour

                int x = (bPosition + bAvgSpeed) - (aPosition + bAvgSpeed);

            }

        }

        return time;

    }

}



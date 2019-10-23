public class RainFall {

    /**
     * data and data1 are two strings with rainfall records of a few cities for months from January to December.
     *      The records of towns are separated by \n.
     *      The name of each town is followed by :.
     *              data and towns can be seen in "Your Test Cases:".
     * Task:
     *  function: mean(town, strng)
     *      should return the average of rainfall for the city town and the strng
     * data or data1 (In R and Julia this function is called avg).
     *
     * function: variance(town, strng) should return the variance of
     * rainfall for the city town and the strng data or data1.
     *
     * if functions mean or variance have as parameter town a city which has no records
     *  return -1 or -1.0 (depending on the language)
     * Don't truncate or round:
     *  the tests will pass if abs(your_result - test_result) <= 1e-2 or abs((your_result - test_result) / test_result) <= 1e-6 depending on the language.
     *
     * Shell tests only variance
     * A ref: http://www.mathsisfun.com/data/standard-deviation.html
     * data and data1 (can be named d0 and d1 depending on the language; see "Sample Tests:") are adapted from: http://www.worldclimate.com
     *
     */

    public static String data1 =
            "Rome:Jan 90.2,Feb 73.2,Mar 80.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 147.7,Nov 121.0,Dec 97.9" +
                    "\n" +
                    "London:Jan 58.0,Feb 38.9,Mar 49.9,Apr 42.2,May 67.3,Jun 52.1,Jul 59.5,Aug 77.2,Sep 55.4,Oct 62.0,Nov 69.0,Dec 52.9" +
                    "\n" +
                    "Paris:Jan 182.3,Feb 120.6,Mar 188.1,Apr 204.9,May 323.1,Jun 350.5,Jul 336.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7" +
                    "\n" +
                    "NY:Jan 128.7,Feb 121.8,Mar 151.9,Apr 93.5,May 98.8,Jun 93.6,Jul 142.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2" +
                    "\n" +
                    "Vancouver:Jan 155.7,Feb 121.4,Mar 132.3,Apr 69.2,May 85.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 69.6,Oct 116.3,Nov 154.6,Dec 171.5" +
                    "\n" +
                    "Sydney:Jan 123.4,Feb 111.0,Mar 151.3,Apr 129.7,May 123.0,Jun 159.2,Jul 102.8,Aug 90.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2" +
                    "\n" +
                    "Bangkok:Jan 20.6,Feb 28.2,Mar 40.7,Apr 81.8,May 189.4,Jun 151.7,Jul 198.2,Aug 197.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4" +
                    "\n" +
                    "Tokyo:Jan 59.9,Feb 81.5,Mar 106.4,Apr 139.2,May 144.0,Jun 186.0,Jul 155.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4" +
                    "\n" +
                    "Beijing:Jan 13.9,Feb 14.7,Mar 18.2,Apr 18.4,May 43.0,Jun 88.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 38.0,Nov 19.3,Dec 2.7" +
                    "\n" +
                    "Lima:Jan 11.2,Feb 10.9,Mar 10.7,Apr 10.4,May 10.6,Jun 11.8,Jul 14.4,Aug 13.1,Sep 23.3,Oct 1.7,Nov 0.5,Dec 10.7";

    public static double mean(String town, String strng) {

        double mean = 0.0;
        String[] monthlyTotal; ;
        String delimiter = "\\n";
        String townDelimiter = ":";
        String monthValuesDelimiter = ",";
        String[] currentTownProcessing = new String[2];

        // your code
        String lines[];
        String monthValues;
        lines = strng.split(delimiter);

        // find town row
        for (int i = 0; i < lines.length; i++){

            if (lines[i].toUpperCase().contains(town.toUpperCase())){
                // found town.
                // process average
                currentTownProcessing = lines[i].split(townDelimiter);

                for ( int j = 1; j < 12; j++){

                }
                System.out.println("average");

            }


        }
        return mean;

    }

    public static double variance(String town, String strng) {
        // your code
        double variance = 0.0;
        return variance;
    }
}



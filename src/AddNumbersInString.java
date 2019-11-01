public class AddNumbersInString {

    public static void main(String[] args) {
        int sum = add("111ab7");
        System.out.println("The sum is:" + sum);
    }

    static int add(String str) {

        String numberStr = str.replaceAll("[\\D]+", " ");  // regular expression replace all numbers \\D and playce in str
        String[] numbers = numberStr.split(" ");
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            try {
                sum += Integer.parseInt(numbers[i]);
            } catch (Exception e) {
                //Just in case, the element in the array is not parse-able into Integer, Ignore it
            }
        }

        return sum;

    }
}

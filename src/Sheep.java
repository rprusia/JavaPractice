public class Sheep {


    public int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int counter = 0;

        for (int i = 0; i < arrayOfSheeps.length; i++) {

            if (arrayOfSheeps[i] == true) {
                counter += 1;
            }
        }

        return counter;
    }


}
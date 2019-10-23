public class MaxProduct {

    public static int adjacentElementsProduct (int[] array ){

       int max = 0;
       int temp = 0;

      for (int i = 0; i < array.length; i++)
       {
               if (i+1 >= array.length)
               {
                   break;
               }

               if (i == 0 ){

                   temp = array[i] * array[i+1];
                   max = temp;  // set max and temp to each other.  first iteration
               }
               else{
                   temp = array[i] * array[i+1];
               }

               if (temp > max)
               {
                   max = temp;
               }
       }

       return max;
    }
}

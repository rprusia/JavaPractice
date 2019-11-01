public class SwapArrayDigit {

    public static void main(String[] args){

        int[][]  arr = new int[][] {

                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4}
        };

        interchange(arr, 4,4);
    }

    static void interchange (int a[][], int r, int c){
        int first = 0;
        int last = 0;

        for (int row = 0; row < r; row++){
            for (int col = 0; col < c; col++){

                if (col == 0) {
                    first = a[row][col];
                }
                if (col == c - 1){
                    last = a[row][col];
                }

            }
            a[row][0] = last;
            a[row][c-1] = first;

        }

        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

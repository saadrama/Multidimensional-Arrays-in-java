public class Main {
    public static void main(String[] args) {
        System.out.println("Multi-Dimensional Arrays");
        /*A multidimensional array is an array of arrays
        * Multidimensional arrays are useful when you wangt to store data as a tabular form
        * like a table with rows and columns
        * To create a two-dimensional array, add each array within its own set of curly braces */
        int[][] myNumbers={{1,2,3,4}, {5,6,7,8}}; //myNumbers is now an array with two arrays as its elements
        //Accessing elements
        //Specify two indexes: one for the array , and one for the element inside that array
        System.out.println(myNumbers[0][2]); //outputs 3
        System.out.println(myNumbers[1][2]); //outputs 7

        //changing element values
        myNumbers[1][3]=9;
        System.out.println(myNumbers[1][3]); //outputs 9 instead of 8

        //LOOP THROUGH A MULTI-DIMENSIONAL ARRAY
        /* we can also use for loop inside another for loop to get the elements
         of a two-dimensional array we still have to point to the two indexes*/
        var num= new int[][] {{10,11,12,13}, {14,15,16,17}};
        for (int i=0; i< num.length; ++i) {
            for (int j=0; j< num[i].length; ++j) {
                System.out.println(num[i][j]);
            }
        }
    }
}
package interview_tasks;

public class Array_Reverse {

    /*
    write a function that can reverse an array

     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int j =0;
    }


    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];


        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }

        return result;


    }
}
/*
1 you create an empty array (here result) with the same length of your array. You wanna reverse
2. you use fori loop from the last index to 0
3. you create additional variable j for index numbers for the emty array result, i is for the old array indexes
4. you assign old array element to new result array
5. you print it outside of the loop
 */
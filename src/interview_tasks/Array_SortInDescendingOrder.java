package interview_tasks;

import java.util.Arrays;

public class Array_SortInDescendingOrder {

    /*
        Write a return method that can sort an int array in descending order without using the sort method
     */

    public int[] sortingArrayAsc(int[] arr) {

        int[] result = Arrays.copyOfRange(arr, 0, arr.length);

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result.length; j++) {
                if (result[i] > result[j]) {
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }

        }

        return result;

    }


}

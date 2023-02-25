import java.util.*;
//

public class IndexOf {
    /**
     * Find the position of a number in an array.
     * For example, the position of 7 in {0,1,7,3,4} is 2.
     *
     * @param arr an int array.
     * @param n a possible value of arr.
     * @return the first index (position) of n in arr. if n does not exist in arr, return -1.
     */
    public int getIndex(int[] arr, int n){
        //Looping through the loop
       for(int i =0; i < arr.length; i++){
        // if any element in the array is equal to n which is the target value we want 
        // Return the index of the array element that n is in
        if(arr[i] == n){
            return i;
        }
       }
       //Otherwise return -1
        return -1;
    }
}

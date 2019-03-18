//Insertion-sort of an array of characters into non-decreasing order

public class insertionSort {
    public static void insertionSort(char[] data) {
        int n = data.length;

        for (int k = 1; k < n;k++) {                //begin with second element
            char cur = data[k];                     //cur = current element on data array, relative to for-loop index
            int j = k;                              //int j = current index of for loop, j will be element that is manipulated
            //find correct index j for cur
            while (j > 0 && data[j-1] > cur) {      //thus, data[j-1] must go after cur
                data[j] = data[j-1];                //slide data[j-1] rightward
                j--;
            }
            data[j] = cur;                          //this is the proper place for cur
        }
    }
}

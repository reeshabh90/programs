
public class CountInversions {

    private static int countInverse(int[] arr, int[] left, int[] right) {
        int leftInd = 0;
        int righInd = 0;
        int count = 0;

        while(leftInd < left.length && righInd < right.length) {
            if(left[leftInd] < right[righInd]) {
                count++;   
            }
        }
        return count;
    }

    private void mergeSort(int[] arr, int count) {
        if (arr.length == 1) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = getSliceOfArray(arr, 0, mid);
        int[] right = getSliceOfArray(arr, mid, arr.length);

        mergeSort(left, count);
        mergeSort(right, count);   
        
        count += countInverse(arr, left, right);
    }

    int[] getSliceOfArray(int[] arr, int start, int end) {

        // Get the slice of the Array
        int[] slice = new int[end - start];

        // Copy elements of arr to slice
        for (int i = 0; i < slice.length; i++) {
            slice[i] = arr[start + i];
        }

        // return the slice
        return slice;
    }

}
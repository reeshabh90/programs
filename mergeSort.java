/**
 * mergeSort
 */
public class mergeSort {

    void divide(int arr[]) {
        if (arr.length == 1) {
            return;
        }
        int midpoint = arr.length / 2;

        int[] left = getSliceOfArray(arr, 0, midpoint);
        int[] right = getSliceOfArray(arr, midpoint, arr.length);
        divide(left);
        divide(right);
        merge(arr, left, right);
    }

    void merge(int arr[], int leftArr[], int rightArr[]) {
        int leftInd = 0;
        int righInd = 0;
        int mainIndx = 0;

        while (leftInd < leftArr.length && righInd < rightArr.length) {
            if (leftArr[leftInd] < rightArr[righInd]) {
                arr[mainIndx] = leftArr[leftInd];
                mainIndx++;
                leftInd++;
            } else {
                arr[mainIndx] = rightArr[righInd];
                mainIndx++;
                righInd++;
            }
        }

        while (leftInd < leftArr.length) {
            arr[mainIndx] = leftArr[leftInd];
            mainIndx++;
            leftInd++;
        }

        while (righInd < rightArr.length) {
            arr[mainIndx] = rightArr[righInd];
            mainIndx++;
            righInd++;
        }
    }

    int[] getSliceOfArray(int[] arr, int start, int end) {
        int[] slice = new int[end - start];
        for (int i = 0; i < slice.length; i++) {
            slice[i] = arr[start + i];
        }
        return slice;
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        mergeSort m = new mergeSort();
        m.printArray(arr);
        m.divide(arr);
        m.printArray(arr);
    }
}
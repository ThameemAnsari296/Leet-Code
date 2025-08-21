class Solution {
    public int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // You're in the descending part of the array
                end = mid;
            } else {
                // You're in the ascending part of the array
                start = mid + 1;
            }
        }

        // start and end converge to the peak element
        return start;
    }
}
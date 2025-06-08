class Solution {
    public long inversionCount(int[] arr) {
        return mergeSort(arr, new int[arr.length], 0, arr.length - 1);
    }

    private long mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left >= right) return 0;
        int mid = (left + right) / 2;
        long inv = 0;
        inv += mergeSort(arr, temp, left, mid);
        inv += mergeSort(arr, temp, mid + 1, right);
        inv += merge(arr, temp, left, mid, right);
        return inv;
    }

    private long merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left, j = mid + 1, k = left;
        long inv = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else {
                temp[k++] = arr[j++];
                inv += (mid - i + 1);
            }
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];
        System.arraycopy(temp, left, arr, left, right - left + 1);
        return inv;
    }
}


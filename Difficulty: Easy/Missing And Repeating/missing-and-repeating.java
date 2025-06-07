// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        long sum = 0, sumSq = 0;
        long expectedSum = (long)n * (n + 1) / 2;
        long expectedSqSum = (long)n * (n + 1) * (2 * n + 1) / 6;
        for (int num : arr) {
            sum += num;
            sumSq += (long)num * num;
        }
        long diff = sum - expectedSum; 
        long squareDiff = sumSq - expectedSqSum; 
        long sumXY = squareDiff / diff;
        long x = (diff + sumXY) / 2;
        long y = x - diff;
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add((int)x);
        result.add((int)y);
        return result;
    }
}

public class GFG {
    // Function to perform left rotation using block swap algorithm
    static void leftRotate(int arr[], int d, int n) {
        d = d % n; // Reduce the number of rotations to be within array size
        
        reverse(arr, 0, d - 1); // Reverse the first d elements
        reverse(arr, d, n - 1); // Reverse the remaining n-d elements
        reverse(arr, 0, n - 1); // Reverse the whole array
    }

    // Utility function to reverse an array or its portion
    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            // XOR swap technique to swap array elements without a temporary variable
            arr[start] ^= arr[end];
            arr[end] ^= arr[start];
            arr[start] ^= arr[end];
            start++;
            end--;
        }
    }

    // Main method
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 2;
        int n = arr.length;
        
        leftRotate(arr, d, n); // Perform left rotation
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Print the rotated array
        }
        System.out.println();
    }
}

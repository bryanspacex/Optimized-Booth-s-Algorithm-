public class BruteForceAlgorithm {

    // Brute force algorithm to find the minimum element in an array
    public static int findMinimumElement(int[] array) {
        // Check if the input array is empty
        if (array.length == 0) {
            throw new IllegalArgumentException("Input array is empty.");
        }

        // Initialize the minimum to the first element of the array
        int minimumElement = array[0];

        // Iterate through the rest of the elements in the array
        for (int i = 1; i < array.length; i++) {
            // Compare each element with the current minimum
            if (array[i] < minimumElement) {
                // If the element is smaller than the current minimum, update the minimumElement
                minimumElement = array[i];
            }
        }

        // Return the final minimum element found
        return minimumElement;
    }

    // Function to scan an array from right to left
    public static void scanArrayFromRight(int[] arr) {
        // Get the length of the array
        int n = arr.length;

        // Iterate over the array in reverse order
        for (int i = n - 1; i >= 0; i--) {
            int element = arr[i];
            // Do whatever you need to do with the element (e.g., print, process, etc.)
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 7, 3, 8};
        
        // Test the findMinimumElement function
        int minimum = findMinimumElement(array);
        System.out.println("Minimum element: " + minimum);

        // Test the scanArrayFromRight function
        scanArrayFromRight(array);
    }
}

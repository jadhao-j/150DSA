

// public class sort {
//     public static void main(String[] args) {
//         int arr[]={21,13,1,11,13,3,4,6};
//         Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }
public class sort {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 1, 5, 9 };
        int temp; // A single temporary variable to hold values during swap
        for (int i = 0; i < arr.length ; i++) {
            for(int j=i+1;j<arr.length;j++){
            if (arr[i] > arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            }
        }
        
        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

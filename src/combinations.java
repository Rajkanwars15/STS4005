import java.util.Arrays;

public class combinations {
    public static int[][] combo(int[] arr) {
        int n = arr.length;
        int[][] combinations = new int[n * (n - 1) / 2][2];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if (arr[i] != arr[j]) { // Skip if both elements are the same
                    combinations[index][0] = arr[i];
                    combinations[index][1] = arr[j];
                    index++;
                }
            }
        }

        return Arrays.copyOf(combinations, index); // Trim the array to remove unused slots
    }

    public static void main(String[] args){
        int[] arr = {1,2,1};
        System.out.println(Arrays.deepToString(combo(arr)));
    }
}

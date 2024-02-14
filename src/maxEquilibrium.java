import static java.lang.Math.abs;

public class maxEquilibrium {
    public static int calc(int[] arr) {
        int point = 0;
        int minDiff = Integer.MAX_VALUE; // Initialize minDiff to a large value

        for (int i = 0; i < arr.length; i++) {
            int left = sum(arr, 0, i);
            int right = sum(arr, i + 1, arr.length);

            int diff = abs(right - left);
            if (diff < minDiff) {
                minDiff = diff;
                point = i;
            }
        }

        return point;
    }

    public static int sum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 3, 2, 1};
        System.out.println(calc(arr));
        System.out.println(arr[calc(arr)]);
    }
}

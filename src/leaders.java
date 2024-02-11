public class leaders {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {16, 17, 4, 3, 5, 2};

        for (int i = 0; i < n; i++) {

            boolean isLeader = true;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}

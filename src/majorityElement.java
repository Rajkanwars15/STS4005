public class majorityElement {
    public static int majEle(int[] arr) {
        int len = arr.length;

        int count = 0;
        int ele = arr[0];

        for (int i = 0; i < len; i++) {
            if (count == 0) {
                ele = arr[i];
                count = 1;
            } else if (ele == arr[i]) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == ele) {
                count++;
            }
        }

        if (count > (len / 2)) {
            return ele;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println(majEle(arr)); // Output: 4
    }
}

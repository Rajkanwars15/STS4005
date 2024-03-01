public class activity {
    public static void main(String[] args) {
        String[] arr = {"A1", "A2", "A3"};
        int[] st = {1, 4, 9};
        int[] en = {9, 5, 10};
        int n = arr.length;

        int tempEn, tempSt;
        String temp;

        // Bubble sort based on ending times
        for (int x = 0; x < n - 1; x++) {
            for (int y = 0; y < n - x - 1; y++) {
                if (en[y] > en[y + 1]) {
                    //swap for ending arr
                    tempEn = en[y];
                    en[y] = en[y + 1];
                    en[y + 1] = tempEn;

                    //swap for starting arr
                    tempSt = st[y];
                    st[y] = st[y + 1];
                    st[y + 1] = tempSt;

                    //swap for string arr
                    temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                }
            }
        }

        int count = 1;
        System.out.println("Feasible activities:");
        System.out.println(arr[0]);
        int lastSelected = 0;

        for (int i = 1; i < n; i++) {
            if (st[i] >= en[lastSelected]) {
                count++;
                System.out.println(arr[i]);
                lastSelected = i;
            }
        }

        System.out.println("Total possible activities: " + count);
    }
}

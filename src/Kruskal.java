public class Kruskal {
    public static void main(String[] args){

        int [][] arr = {{0, 1, 2, 7},
                {1, 0, 6, 4},
                {2, 6, 0, 3},
                {7, 4, 3, 0}};
        int [] minValues = new int[arr.length]; // Array to store row-wise minimum values
        int [] cost = new int[arr.length];

        int [][] minIndices = new int[arr.length][2];

        for(int i = 0; i < arr.length; i++){
            int min = Integer.MAX_VALUE; // Initialize min to maximum possible value
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] != 0 && arr[i][j] < min){ // Exclude 0 and find the minimum value
                    min = arr[i][j];
                    minIndices[i][0] = i; // Store the row index
                    minIndices[i][1] = j; // Store the column index
                }
            }
            minValues[i] = min; // Store the minimum value for the current row
        }

        // Printing row-wise minimum values
        for(int i = 0; i < minValues.length; i++){
            System.out.println("Minimum value in row " + i + ": " + minValues[i]);
        }

        // Printing cost array
        for(int i = 0; i < cost.length; i++){
            System.out.print(cost[i] + " ");
        }

        // Printing minIndices array
        for (int i = 0; i < minIndices.length; i++){
            for (int j = 0; j < minIndices[i].length; j++){
                System.out.print(minIndices[i][j] + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Arrays;

public class Man2D {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 4, 6},
                {76, 75, 98, 32},
                {43, 67, 32},
                {5, 87, 100}
        };

        int[] result = findMax(arr);
        System.out.println("Maximum element is at position: (" + result[0] + ", " + result[1] + ")");
    }

    static int[] findMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int[] position = {-1, -1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    position[0] = i;
                    position[1] = j;
                }
            }
        }

        return position;
    }
}


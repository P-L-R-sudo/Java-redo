public class Array {
    public static void main(Strings[] args) {

        // int nums [] = new int [4]; // declare an array of assistant
        int num[] = { 1, 2, 3, 4 }; // declare an array of assistant with values
        // num[0] = 10;
        // num[1] = 20;
        // num[2] = 30;
        // num[3] = 40;

        for (int n : num) { // Enhanced loop in JAVA
            System.out.println(n);
        }

        // int nums [] = {1,2,3,4};
        // nums[2] = 6;
        // for ( int i = 0; i <= 3; i++ ){
        // System.out.println(nums[i]);
        // }

        // int nums[][][] = new int[3][4][5];
        // System.out.println(nums[0][1][2]);
        // System.out.println(nums[0].length);

        // for (int i = 0; i < nums.length; i++) {
        // for (int j = 0; j < nums[i].length; j++) {
        // for (int k = 0; k < nums[i][j].length; k++) {
        // nums[i][j][k] = (int)(Math.random() * 100); // Random 0–99
        // }
        // }
        // }
        // // Optional: Print to verify
        // for (int i = 0; i < nums.length; i++) {
        // System.out.println("Layer " + i + ":");
        // for (int j = 0; j < nums[i].length; j++) {
        // for (int k = 0; k < nums[i][j].length; k++) {
        // System.out.print(nums[i][j] + "\t");
        // }
        // System.out.println();
        // }
        // }

        // int nums[][] = {
        // {10, 20},
        // {30, 40},
        // {50, 60},
        // {70, 80}
        // };

        // for (int[] n : nums) {
        // for (int m : n) {
        // System.out.print(m + " ");
        // }
        // System.out.println();
        // }

        // int[][][] nums = {
        // {
        // {1, 2, 3},
        // {4, 5, 6}
        // },
        // {
        // {7, 8, 9},
        // {10, 11, 12}
        // }
        // };

        // for (int[][] twoD : nums) {
        // for (int[] oneD : twoD) {
        // for (int val : oneD) {
        // System.out.print(val + " ");
        // }
        // System.out.println(); // new row
        // }
        // System.out.println("--- End of Block ---");
        // }
    }
}

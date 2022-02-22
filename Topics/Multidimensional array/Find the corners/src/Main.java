class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        // write your code here
        int[][] newArr = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                newArr[0][0] = twoDimArray[0][0];
                newArr[0][1] = twoDimArray[0][twoDimArray[0].length - 1];
                newArr[1][0] = twoDimArray[twoDimArray.length - 1][0];
                newArr[1][1] = twoDimArray[twoDimArray.length - 1][twoDimArray[twoDimArray.length - 1].length - 1];
                System.out.print(newArr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
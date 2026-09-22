class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        // write your code here

        int[] firstArray = new int[twoDimArray[0].length];
        int[] lastArray = new int[twoDimArray[twoDimArray.length - 1].length]; // isso é importante se lembre!!!!
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (i == 0) {
                    firstArray[j] = twoDimArray[i][j];
                }
                if (i == twoDimArray.length - 1) {
                    lastArray[j] = twoDimArray[i][j];
                }
            }
        }
        System.out.println(firstArray[0] + " " + firstArray[firstArray.length - 1]);
        System.out.println(lastArray[0] + " " + lastArray[lastArray.length - 1]);
    }
}


/*
    1 0 2   1 = 00 2 02
    0 0 0
    3 0 4  3 = 20  4 = 22
* */
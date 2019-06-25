public class MatrixReloaded {
    public static void main(String[] args) {
        int[][] m1 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[][] m2 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[][] result = new int[3][3];

        if(m1.length != m2.length) {
            System.out.println("These arrays are not the same size, try again");
        } else {
            for (int i = 0; i < m1.length; i++) {
                for(int j = 0; j < m1[i].length; j++) {
                    result[i][j] = m1[i][j] + m2[i][j];
                    System.out.print(result[i][j] + " ");
                }
                System.out.println("\n");
            }

        }
    }
}

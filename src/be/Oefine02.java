package be;

public class Oefine02 {
    public static void main(String[] args) {
        int[][] num2D = new int[10][10];

        for(int row = 0; row < num2D.length;row++){

            for(int col = 0;col < num2D[row].length;col++){
                System.out.println(num2D[row][col] + " ");
            }
        }
        System.out.println();

    }
}

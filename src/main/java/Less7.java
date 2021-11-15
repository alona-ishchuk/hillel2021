public class Less7 {

    public static void main(String[] args){
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "■";
                else chessBoard[i][j] = "\u0081";
            }
        }
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                System.out.print(" " + chessBoard[i][j] + " ");
            }
            System.out.println();
        }



        int [][] bobik = new int[5][5];

        for(int i = 0; i < bobik.length; i++) {
            for (int j = 0; j < bobik[i].length; j++) {
                bobik[i][j] = (int) (Math.random() * 21);
                System.out.print(bobik[i][j] + "\t");
            }
            System.out.println(" ");
        }
        int sum_a = 0;
        int sum_b = 0;

        for(int i = 0; i < bobik.length; i++){
            for(int j = 0; j <bobik[i].length; j++){
                if(i == j){
                    sum_b+= bobik[i][j];
                }
                if(j == bobik[i].length - 1 - i)
                    sum_a+=bobik[i][j];
            }
        }

        System.out.println("The sum_a is "+ sum_a + " The sum_b is "+ sum_b);
    }
}


import java.util.Scanner;

public class App {
    static String[][] goBoard = new String[9][9];
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        boolean continuer = true;
        boolean flipper = true;
        while(continuer !=false){
            System.out.println("  0 1 2 3 4 5 6 7 8");
            for (int i = 0; i < goBoard.length; i++){
                System.out.print(i + " ");
                for (int j = 0; j < goBoard[i].length; j++){
                    if(goBoard[i][j] == null){
                        if(j == 0){
                            System.out.print("|");
                        }
                        else{
                            System.out.print("-|");
                        }
                    }
                    else{
                        System.out.print(goBoard[i][j]);
                    }
                }
                System.out.println();
            }
            System.out.println("Enter a X coordinate for your piece to go.");
            int moveY = myObj.nextInt();
            System.out.println("Enter an Y coordinate for your piece to go.");
            int moveX = myObj.nextInt();
            if(moveY > 8 || moveX > 8 || goBoard[moveX][moveY] == "-x" || goBoard[moveX][moveY] == "-o"){
                System.out.println("That move is invalid! Please enter a different set of coordinates.");
            }
            else{
                if(flipper){
                    goBoard[moveX][moveY] = "-x";
                }
                else{
                    goBoard[moveX][moveY] = "-o";
                }
                flipper = !flipper;
            }
        }
    }
} 
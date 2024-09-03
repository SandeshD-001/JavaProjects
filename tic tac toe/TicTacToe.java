
import java.util.Scanner;

public class TicTacToe {
    private static char[][] board;
        private static char currentplayer;
    public static void main(String[] args) {
        board= new char[3][3];
        currentplayer='x';
        initialize();

        while (true) { 
            showboard();
            playermove();
            if(isWinner()){
                showboard();
                System.out.println(currentplayer+"is winner");
                break;
            }
            if(isFull()){
                showboard();
                System.out.println("Tai");
                break;
            }
            switchPlayers();
        }
    }
    public static void initialize(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
    public static void showboard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void playermove(){
        Scanner sc = new Scanner(System.in);
        int row,col;
        while (true) { 
            System.err.println(currentplayer +" your row and column:");
        row= sc.nextInt()-1;
        col= sc.nextInt()-1;
        if(row>=0 && row<3 && col >=0 && col <3 && board[row][col]=='-'){
            board[row][col]=currentplayer;
            break;
        }
        else{
            System.out.println("not valid input");
        }
        }
        
        
    }
    public static boolean isWinner() {
        // Row and column checks
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentplayer && board[i][1] == currentplayer && board[i][2] == currentplayer) || 
                (board[0][i] == currentplayer && board[1][i] == currentplayer && board[2][i] == currentplayer)) {
                return true;
            }
        }
        // Diagonal checks
        if ((board[0][0] == currentplayer && board[1][1] == currentplayer && board[2][2] == currentplayer) || 
            (board[0][2] == currentplayer && board[1][1] == currentplayer && board[2][0] == currentplayer)) {
            return true;
        }
        return false;
    }
    public static boolean  isFull(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                if(board[i][j]=='-')
                return false;
            }  
        }
        return true;
    }
    public static void switchPlayers(){
        if(currentplayer=='x')
        currentplayer='o';
        else
        currentplayer='x';
    }
}

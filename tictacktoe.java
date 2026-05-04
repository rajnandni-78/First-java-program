import java.util.Scanner;

public class tictacktoe {

    static char[][] board={

        {' ',' ',' '},
        {' ',' ',' '},
        {' ',' ',' '},

    };

    public static void printboard(){
        System.out.println("-------------");
        for(int i = 0;i<3;i++){
            System.out.print("| ");
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]+" | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static boolean checkwin(char player){
        for(int i = 0;i<3;i++){
            if (board[i][0]==player && board[i][1]==player && board[i][2]==player || board[0][i]==player && board[1][i]==player && board[2][i]==player ) {
                return true;
                
            }
        }
        if (board[0][0]==player && board[1][1] == player && board[2][2]== player || board[0][2]== player && board[1][1]== player && board[2][0]==player ) {
                return true;
                
            }
            return false;

    }

    public static boolean isFull(){
        for(int i = 0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]==' '){
                    return false;
                }
            }
        }
        return true;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char currentplayer='X';
        while (true) {
            printboard();

            System.out.println("player "+currentplayer+" turn");
            System.out.print("enter roe(0-2) and coloumn (0-2):");

            int row=sc.nextInt();
            int col= sc.nextInt();

            if(row<0 || row>2 || col<0 || col>2 || board[row][col] !=' '){
                System.out.println("invalid move , try again");
                continue;

            }
             board [row][col]=currentplayer;

             if(checkwin(currentplayer)){
                printboard();
                System.out.println("player "+currentplayer+" wins!");
                break;
            }

            if (isFull()) {
                printboard();
                System.out.println("it,s a drow");
                break;
            }
                
                currentplayer=(currentplayer=='X')?'0':'X';
             

            
        }
        sc.close();
        
    }
}
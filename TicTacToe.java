import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        char[] pos = new char[9];
        for (int i =0; i<9; i++){
            pos[i]= ' ';
        }

        Scanner userInput = new Scanner(System.in);
        int input;
        int count = 0;
        char turn = 'X';

        while (count < 9) {
            do {
                System.out.print("Please enter a position: ");
            input = userInput.nextInt();
            } while( pos[input-1] == 'X' || pos[input-1] == 'O');

            pos[input - 1] = turn;

            System.out.println("\n " + pos[6] + " | " + pos[7] + " | " + pos[8]);
            line();
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5]);
            line();
            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] +"\n");

            if ((pos[0] == turn && pos[1] == turn && pos[2] == turn)
                    || pos[3] == turn && pos[4] == turn && pos[5] == turn
                    || pos[6] == turn && pos[7] == turn && pos[8] == turn
                    || pos[0] == turn && pos[3] == turn && pos[6] == turn
                    || pos[1] == turn && pos[4] == turn && pos[7] == turn
                    || pos[2] == turn && pos[5] == turn && pos[8] == turn
                    || pos[0] == turn && pos[4] == turn && pos[8] == turn
                    || pos[2] == turn && pos[4] == turn && pos[6] == turn )
            {
                System.out.println( turn + " is the WINNER!");
                break;
            }
            count++;

            if (turn == 'X') {
                  turn = 'O';
            } else if (turn == 'O'){
                 turn = 'X';
            }


        }
        if (count == 9){
        System.out.println("It's a tie!");}

    }

    static void line(){
        System.out.println("---+---+---");
    }
}

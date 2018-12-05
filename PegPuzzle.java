/*
Name: Josh Robbins
Class: CSCE 4430
Description: This program solves the Cracker Barrel Peg Puzzle for starting positions #0-4
*/

public class PegPuzzle{
    //a list of all valid moves
    private int[][] moveList = { 
	{0,1,3}, {3,1,0},//0,1
	{0,2,5}, {5,2,0},
	{1,3,6}, {6,3,1},
	{1,4,8}, {8,4,1},//6,7
    	{2,4,7}, {7,4,2},
	{2,5,9}, {9,5,2},
	{3,6,10}, {10,6,3},//12,13
	{3,7,12}, {12,7,3},
	{4,7,11}, {11,7,4},
	{4,8,13}, {13,8,4},
    	{5,8,12}, {12,8,5},//20,21
	{5,9,14}, {14,9,5},
	{3,4,5}, {5,4,3},
	{6,7,8}, {8,7,6},
	{7,8,9}, {9,8,7},//28,29
	{10,11,12}, {12,11,10},
    	{11,12,13}, {13,12,11},
	{12,13,14}, {14,13,12}};
    private int[] board = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

   private int[] soln1 = {1,25,2,5,15,4,29,26,35,32,20,33,30};

    /* solve */
    public void solve(){
        int[] m;
	int s;
                System.out.print("\n");
        for(int i = 0; i < 13; i++){
	    s = soln1[i];
            m = moveList[s];
            if(canMove(m)){
                move(m);
	    }
                System.out.println("    " + board[0]);
                System.out.println("   " + board[1] + " " + board[2]);
                System.out.println("  " + board[3] + " " + board[4] + " " + board[5]);
                System.out.println(" " + board[6] + " " + board[7] + " " + board[8] + " " + board[9]);
                System.out.println(board[10] + " " + board[11] + " " + board[12] + " " + board[13] + " " + board[14]);
                System.out.print("\n");
        }
    }

    //checks for ability to make move
    public boolean canMove(int[] m){
        return (board[m[0]] == 1 && board[m[1]] == 1 && board[m[2]] == 0);
    }

    //makes move
    public void move(int[] m){
        board[m[0]] = 0;
        board[m[1]] = 0;
        board[m[2]] = 1;
    }

    //main
    public static void main(String[] args){
        PegPuzzle p = new PegPuzzle();
	System.out.println("\n");
	System.out.println("+---Solution Move Set For Starting Position #0---+");
        p.solve();
//        int[] b = c.getBarrel();
//        for(int i = 0; i < 15; i++){
//            System.out.print(b[i] + " ");
//        }
    }
}

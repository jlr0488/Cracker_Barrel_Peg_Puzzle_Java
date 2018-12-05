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

   private int[] soln1 = {1,25,2,5,15,4,29,26,35,32,20,33,30};
   private int[] soln2 = {5,0,7,17,4,13,8,11,33,17,24,10,23};
   private int[] soln3 = {11,2,9,19,10,23,6,5,32,19,25,4,13};
   private int[] soln4 = {0,3,5,9,19,2,11,8,32,35,15,4,13};
   private int[] soln5 = {17,29,6,5,0,10,33,14,32,23,20,33,30};

   private int[][] solns = {soln1,soln2,soln3,soln4,soln5};


    //solve peg puzzle
    public void solve(){
        int[] m;
	int[] soln;
	int s;
	int[] board;
    	int[][] boards = { {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
	{1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1} };
    	int[] board_restart = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        System.out.print("\n");
    	for(int j = 0; j < 5; j++)
	{
		board = boards[j];
        	System.out.println("\n");
        	System.out.println("+---Solution Move Set For Starting Position #" + Integer.toString(j)  + "---+");

        	for(int i = 0; i < 13; i++){
                    s = solns[j][i];
        	    m = moveList[s];
        	    if(canMove(m,board)){
        	        board = move(m,board);
		    }
        	        System.out.println("    " + board[0]);
        	        System.out.println("   " + board[1] + " " + board[2]);
        	        System.out.println("  " + board[3] + " " + board[4] + " " + board[5]);
        	        System.out.println(" " + board[6] + " " + board[7] + " " + board[8] + " " + board[9]);
        	        System.out.println(board[10] + " " + board[11] + " " + board[12] + " " + board[13] + " " + board[14]);
        	        System.out.print("\n");
        	}
	}
    }

    //checks for ability to make move
    public boolean canMove(int[] m, int[] b){
        return (b[m[0]] == 1 && b[m[1]] == 1 && b[m[2]] == 0);
    }

    //makes move
    public int[] move(int[] m, int[] b){
        b[m[0]] = 0;
        b[m[1]] = 0;
        b[m[2]] = 1;
	return b;
    }

    //main
    public static void main(String[] args){
        PegPuzzle p = new PegPuzzle();
        p.solve();
    }
}

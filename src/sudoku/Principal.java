package sudoku;

public class Principal {

	public static void main(String[] args)
	{
		int [][] tablero ={
			
				{0,6,0,0,4,0,0,0,0},
				{0,0,5,6,0,2,0,0,7},
				{0,0,0,0,8,0,0,2,0},
				{0,0,7,0,0,0,1,0,0},
				{0,5,0,3,0,9,0,4,0},
				{0,0,0,0,6,0,0,0,0},
				{9,0,0,0,0,0,0,0,4},
				{0,3,0,2,0,5,0,9,0},
				{0,0,0,0,0,8,0,0,0},
				
	 };
	 Sudoku miSudoku = new Sudoku(tablero);
	 miSudoku.resolverSudoku();
	 miSudoku.imprimirSudoku();
	}

}
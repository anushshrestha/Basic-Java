package datastructure;

public class Eightqueen {
	
	public static void main(String[] args) {
		int N=8;
		int [][]board = new int[N][N];
		solve(0,board,N);
		
		//displaying the board
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(board[i][j]==1) System.out.print("Q ");
				else System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static boolean solve(int row, int[][]board,int N){
		if(row>=N) return true;
		
		for(int position=0;position<N;position++){ //for every 0 to 8 columns
			if(isValid(board,row,position,N)){ //check if row,col is valid...
				board[row][position]=1;
				
				//after valid found goes to another row...
				
				//if done in row, go for next row 
				if(!solve(row+1,board,N)){
						//no place in next row means return false .go  back stack and make this make this position 0 
					board[row][position]=0;
				}else return true;
			}
		}
		return false;
	}
	
	//gets board row position board size
	static boolean isValid(int [][] board, int x, int y, int N){
		int i,j;
		
		//0 to send row
		for(i=0;i<x;i++)
			//diff row same column true then return 
			
			
			if(board[i][y]==1) return false;
		
		i=x-1;
		j=y-1;
		
		while((i>=0)&&(j>=0))
			if(board[i--][j--]==1)return false;
		
		i=x-1;
		j=y+1;
		
		while((i>=0)&&(j<N))
			if(board[i--][j++]==1) return false;
		
		return true;
	}

}

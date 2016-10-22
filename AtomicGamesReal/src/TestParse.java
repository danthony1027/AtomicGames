import com.google.gson.Gson;
import java.util.ArrayList;

public class TestParse {	
    	
	public static void main(String[] args) {
		
		int index;
		int spot = 0;
		int i=0, j=0, randMove;
		ArrayList <Integer> valid = new ArrayList<Integer>();
		for(index=0; index < args.length; ++index)
		{
			System.out.println("args[" +index +"]: " +args[index]);
		}
	int [][] fourArray = new int[7][6];	
	String board;
	String player;
	String time;
		
	board = args[1];
	player = args[3];
	time = args[5];
	
	System.out.println(board);
	System.out.println(player);
	System.out.println(time);
	
	
	
	Gson gson = new Gson();
	
	fourArray = gson.fromJson(board, int[][].class);
	
	/****************************************************************
	 * check for valid move
	 ***************************************************************/

	for(j=0; j<7; j++)
	{
			if(fourArray[0][j] == 0)
			{
				valid.add(j);
			}
	}
	
	/****************************************************************
	 * 
	 ***************************************************************/
	
	for(i=0; i<7; i++){
		for(j=5; j >= 0; j--)
		{
			if((fourArray[i][j] !=0) && (fourArray[i+1][j] !=0) && (fourArray[i+2][j] !=0))
			{
				if(valid.get(i) != 0)
				{
				System.exit(i+3);
				}
			}
		}
	}
	randMove = (int) (Math.random() *valid.size());
	
	System.exit(valid.get(randMove));
	
	}
}



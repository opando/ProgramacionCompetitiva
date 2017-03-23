package tc.srm000;

public class MagicSubset {

	public int findBest(int[] values){
		int n =0, p = 0 ;
		
		for(int i = 1 ; i < values.length ; i++){
			if(values[i]>0)p+=values[i];
			else n+=values[i];
		}
		
		
		return Math.max( (-1)*(n+values[0]), p);
	}
}

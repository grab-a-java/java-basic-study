public class Exercise9_12 {
  	private static int getRand(int from, int to) {
		return (int)(Math.random()*(Math.abs(to-from)))+Math.min(from, to) +1 ;
	}
	
	public static void main(String[] args) {
		for(int i=0; i<20; i++) 
			System.out.print(getRand(1, -3) + ",");
	}
}

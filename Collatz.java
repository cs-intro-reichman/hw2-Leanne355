// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt (args[0]);
		String mode = args[1];
		int seed;
		int counter=0;
		for(int i=1; i<=N ; i++){
			counter=0;
			seed=i;
			if(mode.equals("v")) System.out.print(seed + " ");
			counter++;
			if (seed==1){
				seed=(seed*3)+1;
				if(mode.equals("v")) System.out.print(seed + " ");
				counter++;
			}
			while (seed!=1){
				counter++;
				if(seed%2==0){
					seed=seed/2;
				}else{
					seed=(seed*3)+1;
				}
				if(mode.equals("v")) System.out.print(seed+ " ");
			}
			if(mode.equals("v"))System.out.println("("+counter+")");
			System.out.println();
		}
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
}}

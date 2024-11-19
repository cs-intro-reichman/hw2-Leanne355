// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int Times=Integer.parseInt(args[0]);
		double approximatedPi=0.0;
		for (int i = 0; i < Times; i++) {
			//on even times we minus the term and on odd time we add the term
            if (i % 2 == 0) {
				//we add or minus to the Pi each time  1/number and the number double each time.
                approximatedPi += 1.0 / (2 * i + 1);
            } else {
                approximatedPi -= 1.0 / (2 * i + 1);
            }
        }
		approximatedPi=approximatedPi*4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + approximatedPi);
	}
}

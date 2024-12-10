package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			int n = sc.nextInt();
			double[] vect = new double[n];
			
			for (int i = 0;i < n ; i++) {
				vect[i] = sc.nextInt();
				
			}
			for (int j = 0;j < n ; j++) {
					if (vect[j] < 0)
						System.out.println(vect[j]);
			} 
		
		
		
		sc.close();
	}

}

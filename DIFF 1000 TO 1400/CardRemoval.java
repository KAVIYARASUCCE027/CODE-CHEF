import java.util.*;


public class CardRemoval {
    	{
		// your code goes here
		// System.out.println();
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t -- > 0) {
			int n = sc.nextInt();
			int[] ar = new int[n];
			
			int count = 1;
			int max = 0;
			
			for (int i = 0; i < ar.length; i++) {
				ar[i] = sc.nextInt();
			}
			Arrays.sort(ar);
			for (int i = 0; i < ar.length-1; i++) {
				
				if (ar[i] == ar[i+1]) {
					count++ ;
				}
				else {
					if (count > max) {
						max = count ;
					}
					count = 1 ;
				}
			}
			
			if (count > max) {
				max = count ;
			}

			System.out.println(n - max);
		}

	}
    
}

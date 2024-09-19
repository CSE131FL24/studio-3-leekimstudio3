package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Max number to sieve up to: ");
		int n = in.nextInt();
		boolean[] arr = new boolean[n];
		int p = 2;
		boolean cont = true;
		boolean go = true;
		
		if(n<2) {
			go = false;
		}
		
		while (go) {
			arr[0] = true;
			arr[1] = true;
			while (cont) {
				for (int i = 2*p; i < n; i=i+p) {
					arr[i] = true;
				}
				for (int i = p+1; i < n; i++) {
					if (i == n-1) {
						cont = false;
					}
					if (arr[i] == false) {
						p = i;
						break;
					}
				}
			}
			
			for (int i = 1; i < n; i++) {
				if(arr[i]==false) {
					System.out.println(i);
				}
			}
			go = false;
		}
	}

}

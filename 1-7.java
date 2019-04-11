import java.util.Scanner;
import java.lang.Math;

class Rotate_Matrix{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int ar[][] = new int[n][m];
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				ar[i][j] = i*5+j;
			}
		}
		int mid_n = (int)Math.ceil(n/2);
		int mid_m = (int)Math.ceil(m/2);
		mid_n+=1;
		mid_m+=1;
		System.out.print(mid_n+" "+mid_m);
		print(ar,n,m);

		for(int i=0;i<mid_n+1;i++){
			for(int j=i;j<mid_m+1-i;j++){
				System.out.println(i+" "+j);
				int temp = ar[i][j];
				ar[i][j] = ar[n-1-j][i];
				ar[n-j-1][i] = ar[n-i-1][m-j-1];
				ar[n-i-1][m-j-1] = ar[j][n-i-1];
				ar[j][n-i-1] = temp;
			}
			// print(ar,n,m);
			
		}
		print(ar,n,m);
	}
	public static void print(int ar[][], int n, int m){
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}
import java.util.Scanner;

class Zero_Matrix{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int ar[][] = new int[n][m];
		int row[] = new int[n];
		int col[] = new int[m];
		
		System.out.println("Enter your matrix: ");

		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				ar[i][j] = scanner.nextInt();
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(ar[i][j]==0){
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		for(int i=0;i<n;i++){
			if(row[i]==1){
				for(int a=0;a<m;a++){
					ar[i][a] = 0;
				}			
			}
		}
		for(int i=0;i<m;i++){
			if(col[i]==1){
				for(int a=0;a<n;a++){
					ar[a][i] = 0;
				}
			}
		}
		System.out.println("Your Matrix is: ");
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}

	}
}
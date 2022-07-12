public class Parallelogram_Pattern{
	public static void main(String args[]){
		int i,j,k;
		int n=4;
		for(i=0; i<n; i++){
			for(j=n; j>i; j--){
				System.out.print(' ');
			}
			for(k=0; k<n*2; k++){
				System.out.print('#' );
			}
			System.out.println();
		}
	}
}
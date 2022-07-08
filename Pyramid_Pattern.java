class Pyramid_Pattern{
	public static void main(String args[]){
		int i,j,k,n=11;
		for(i=n; i>0; i--){
			for(j=0; j<i-1;j++){
				System.out.print(" ");
			}
			for(k=0; k<(n-i)+(n-i-1) ;k++){
				System.out.print('#');
			}System.out.println();
		}
	}
} 

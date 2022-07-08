class Diamond_Pattern{
	public static void main(String args[]){
		int i,j,k,r;
		
		// for(r=0; r<2; r++){
			for(i=1; i<5; i++){
				for(j=4; j>i; j-- ){
					System.out.print(' ');
				}
				for(k=0; k<i+i-1; k++){
					// System.out.print(k);
					System.out.print('#');
				}
				System.out.println();
			}
			for(i=1; i<5; i++){
				for(j=0; j<i; j++){
					System.out.print(' ');
				}
				for(k=0; k<6-i-(i-1); k++){
					System.out.print('#');
				}
				System.out.println();
			}
		// }
	}
}

/*
		#
	   ###
	  #####
	 #######
	  #####
	   ###
	    #
	    */
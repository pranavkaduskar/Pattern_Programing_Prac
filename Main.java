package pp_Sdac_prac;

public class Main {
	
	
	private void printpp() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				System.out.print(j+" ");
				
			}
			
			System.out.println();
		}

	}
	private void printp2() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 4; i++) {
			char ch = 'A';
			for(int j = 1; j  <= 5 ; j++ ) {
				if(i< j) {
					
					System.out.print(ch);
					
				}else {
					System.out.print(" ");
				}
				ch++;
			}
			System.out.println();
			
		}
	}
	private void printpp1() {
		// TODO Auto-generated method stub
		for (int i = 5; i >= 0; i--) {
			char ch = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch+" ");
				ch++;
			}
			
			System.out.println();
		}

	}
	
	private void printpp2() {
		// TODO Auto-generated method stub
		for (int i = 5; i > 0; i--) {
			char ch = 'A';
			for(int j = 1; j <= 5; j++ ) {
				if(i <= j) {
					System.out.print(ch+"");
				}else {
					System.out.print(" ");
				}
				ch++;
			}
			System.out.println();
		}

	}
	 private void printpp3() {
		// TODO Auto-generated method stub
		 int i = 0;
		 for(char row = 'A'; row <= 'E';  row++) {
			
			 for(int j = 1; j <= 5; j++  ) {
				 if(i < j) {
					 System.out.print(row);
				 }else {
					 System.out.print(" ");
				 }
			
				 
			 }
			 i++;
			 System.out.println();
		 }

	}
	 private void printpp4() {
			// TODO Auto-generated method stub
			 int i = 5;
			 for(char row = 'A'; row <= 'E';  row++) {
				
				 for(int j = 1; j <= 5; j++  ) {
					 if(i <= j) {
						 System.out.print(row+"");
					 }else {
						 System.out.print(" ");
					 }
				
					 
				 }
				 i--;
				 System.out.println();
			 }

		}
	
	

	
	private void printpp5() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			int ch = 1;
			for(int j = 5; j >0; j--) {
				if(i>=j) {
					System.out.print(" ");
				}else {
					System.out.print(ch+" ");
				}
				ch++;
			}
			System.out.println();
		}

	}
	
	private void printpp6() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 4; i++) {
			for(int j = 1; j  <= 5 ; j++ ) {
				if(i< j) {
					if (j==3) {
						System.out.print(" ");
						
					}
					if(i==3 && j==4) {
						System.out.print(" ");
					}
					System.out.print(j);
					
				}else {
					System.out.print(" ");
				}
//				if(j == 2) {
//					System.out.print(" "+j+" ");
//				}else {
//					System.out.print(j+" ");
//				}
			}
			System.out.println();
			
		}
	}
	
	private void printpp7() {
		// TODO Auto-generated method stub
		
		for(int i = 5; i >0 ; i--) {
			int n = 1;
			for(int j=1; j<=5; j++ ) {
				if(i <=j) {
					System.out.print(n);
					n++;
				}else {
					System.out.print(" ");
				}
				
				
			}
			
			System.out.println();
		}

	}
	
	
	
	
	private void printpp8() {
		// TODO Auto-generated method stub
		
		for(int i = 5; i >0 ; i--) {
			char n = 'A';
			for(int j=1; j<=5; j++ ) {
				if(i <=j) {
					System.out.print(n+" ");
					n++;
				}else {
					System.out.print(" ");
				}
				
				
			}
			
			System.out.println();
		}

	}
	
	
	private void printpp9() {
		// TODO Auto-generated method stub
		
		for(int i = 5; i >0 ; i--) {
			int n = 1;
			for(int j=1; j<=5; j++ ) {
				if(i <=j) {
					System.out.print(n+" ");
					n++;
				}else {
					System.out.print(" ");
				}
				
				
			}
			
			System.out.println();
		}

	}
	
//	private void printpp10() {
//		// TODO Auto-generated method stub
//		
//		for(int i = 5; i >0 ; i--) {
//			char n = 'A';
//			for(int j=1; j<=5; j++ ) {
//				if(i >=j) {
//					System.out.print(n);
//					n++;
//				}else {
//					System.out.print(" ");
//				}
//				
//				
//			}
//			
//			System.out.println();
//		}
//
//	}
	
	public static void main(String[] args) {
		Main p = new Main();
//		p.printpp();
//		p.printp2();		
//		p.printpp1();
//		p.printpp2();
//		p.printpp3();
//		p.printpp4();
//		p.printpp5();
//		p.printpp6();
//		p.printpp7();
		p.printpp8();
//		p.printpp9();
		p.printpp10();
		
		
	}

}

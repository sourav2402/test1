package test;

public class Oddsum {
	public static void main(String[] args) {
		int oddsum=0;
		//using for loop
		for (int a=7;a<=21;a++){
			
			//checking condition
			if (a%2!=0) {
				oddsum=oddsum+a;
				System.out.println("Odd numbers between 7 to 21 are : " + a);
				
				
			}
			
			}
		System.out.println("sum of odd numbers between : "+oddsum);
		
			
		
	}

}

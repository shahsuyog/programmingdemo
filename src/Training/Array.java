package Training;

public class Array {

public static void main(String[] args) {
////		int [] a= {1,2,3,4};
//		
//		int [] a= new int[4];
//		System.out.println(a.length);
//		
//		a[2]=2;
////		//System.out.println(a);// print address of array
////		
////		//System.out.println(a[2]);
////		
//		for (int i = 0; i < a.length; i++) {
//			
//			System.out.println(a[i]);
			
			
         //  }
//		System.out.println(a.length + "lenth is 4");
		
//		int [] a= {22,34,23,31,1,2};
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] +" ");
//		}
//		// reverse array
//		System.out.println("===============");
//		for (int i = a.length-1; i>=0 ; i--) {
//			System.out.print(a[i] + " ");
//		}
		
		//  2d array matrix
	
//	int [][]a= {{22,11,33},{11,11,11,1},{1,2,3}};
//	
//	for (int i = 0; i < a.length; i++) {
//		
//		for (int j = 0; j < a.length; j++) {
//			System.out.print(a[i][j]+" ");
//			
//		}
//		System.out.println();
//		
//		
//	}
//	System.out.println("length is="+a.length);
		
	// 2d array jaget
	
//int [][]b= {{22,11,33},{11,11,11,1},{1,2,3}};
//	
//	for (int i = 0; i <= b.length-1; i++) {
//		
//		for (int j = 0; j <= b[i].length-1; j++) {
//			System.out.print(b[i][j]+" ");
//			
//		}
//		System.out.println();
//		
//		
//	}
//	System.out.println("length is="+b.length);
	
	
	//  save different data types element in array 
	
	
	Object[] obj = new Object[3];
	obj[0]= 10;
	obj[1]="sss";
	obj[2]='a';
	
	for (int i = 0; i < obj.length; i++) {
		System.out.print(obj[i]+" ");
		
	}
	System.out.println();
	for (int i = obj.length-1; i>=0; i--) {
		System.out.print(obj[i]+" ");
		
	}
	
	}

}


public class Arrays {
	public static void main(String[] args) {
		
		//one-dimensional array
		int arr[]={1,2,3,4,5};  
		for(int i:arr)  
		System.out.println(i); 
	    
		//multi-dimensional array
	    int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};  
	    for(int i=0;i<3;i++){  
	    for(int j=0;j<3;j++){  
	    System.out.print(arr1[i][j]+" ");  
	 }  
	 System.out.println();  
	}  
}
}

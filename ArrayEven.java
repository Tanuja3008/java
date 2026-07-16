public class ArrayEven{
	public static void main(String [] arg){
		
		int arr[] = {2,2,3,1,1};
					
		for(int i = 0; i < arr.length; i++){
		int count = 0;
			for(int j = 0; j < arr.length; j++){
				if(arr[i]==arr[j]){
					count++;
	}
}
				if(count%2!=0){
					System.out.println("Odd Occuring Element "+ arr[i]);
						break;		
				}
			
		}
	}
}
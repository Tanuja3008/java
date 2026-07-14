//findind largest and second largest element
import java.util.Scanner;
public class maxAndSecondlarge{
	public static void main(String []arg){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size");
		int n = sc.nextInt();

		int arr[] = new int[n];
		int secondlarg[] = new int[n];
		System.out.println("Enter" + n +"array element");
		for(int i =0; i < n; i++){
			arr[i] = sc.nextInt();
			}
		int max = arr[0];
		int secondlarge = arr[0];
		for(int i = 0; i < n; i++){
			if(arr[i] > max){
				max = arr[i];
		}
	}
		for(int i = 0; i < n; i++){
			if(arr[i] > secondlarge && arr[i] != max){
				secondlarge = arr[i];
		}
	}

			System.out.println("maximum element " + max);	
			System.out.println("Second large element " + secondlarge);		

	}
}
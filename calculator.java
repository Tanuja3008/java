public class calculator{
	public static void main(String []args){

	calculator c1 = new calculator();
	int addresult = c1.addition(10,20);
	System.out.println(addresult);

	
	calculator c2 = new calculator();
	int subresult = c2.subtraction(50,20);
	System.out.println(subresult);

	int mulresult = multiplication(10,10);
	System.out.println(mulresult);

}

	public int addition(int a, int b){
		System.out.println("addition of calculator class");
		return a + b;
		


	}

	public int subtraction(int x,int y){
		System.out.println("subtraction of calculator class");
		return x - y;

	}

	public static int multiplication(int c,int d){
		System.out.println("multiplication of calculator class");
		return c*d;

}
	

}
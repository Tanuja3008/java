import java.util.Scanner;

public class Addition_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c[] = new int[5];
        System.out.println("Enter the 1st Array");
        int a[] = new int[5];
         int b[] = new int[5];
        for(int i = 0; i<= 4; i++){
            a[i] = sc.nextInt();   
        }
        System.out.println("Enter the 2nd Array");
        for (int i = 0; i<=4; i++){
             b[i] = sc.nextInt();
        }
        for (int i = 0; i<=4;i++) {
            c[i] =  a[i] + b[i];
            System.out.print(c[i] + " ");
            }
            
        }
   }
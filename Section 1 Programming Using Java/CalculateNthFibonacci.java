import java.util.Scanner;


public class CalculateNthFibonacci
{
    public static int calculateNthFibonacci(int n) {
        int a = 0;
        int b = 1;
        int count = 0;
        while(count <= n - 2) {
            int c = a + b;
            a = b;
            b = c;
            count++;
        }
        return a;
    }
    
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value of N: ");
		int n = sc.nextInt();
		int num = calculateNthFibonacci(n);
		System.out.println("The " + n + "th Fibonacci Number: " + num);
	}
}

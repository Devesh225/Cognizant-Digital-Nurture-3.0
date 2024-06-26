import java.util.Scanner;
public class NonRepeatedDigitsCount
{
    
    public static int countNonRepeatedDigits(int n) {
        int arr[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        while(n > 0) {
            int rem = n % 10;
            arr[rem]++;
            n = n / 10;
        }
        int c = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) c++;
        }
        return c;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		int count = countNonRepeatedDigits(n);
		System.out.println("Non-Repeated Digits: " + count);
	}
}

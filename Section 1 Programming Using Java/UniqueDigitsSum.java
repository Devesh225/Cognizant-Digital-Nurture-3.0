import java.util.Scanner;
public class UniqueDigitsSum
{
    
    public static int uniqueDigitsSum(int n) {
        int arr[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        while(n > 0) {
            int rem = n % 10;
            arr[rem]++;
            n = n / 10;
        }
        int s = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                s = s + i;
            }
        }
        return s;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		int sum = uniqueDigitsSum(n);
		System.out.println("Non-Repeated Digits: " + sum);
	}
}

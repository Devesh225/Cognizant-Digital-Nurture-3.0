import java.util.Scanner;
public class CalculateHillWeight
{
    
    public static int calculateHillPatternSum(int rows, int head, int inc) {
        int sum = 0;
        for(int i = 1; i <= rows; i++) {
            sum = sum + (head * i);
            head = head + inc;
        }
        return sum;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Total Levels in Hill Pattern: ");
		int rows = sc.nextInt();
		System.out.print("Enter Weight of Head Level: ");
		int head = sc.nextInt();
		System.out.print("Enter Weight Increments: ");
		int inc = sc.nextInt();
		int totalSum = calculateHillPatternSum(rows, head, inc);
		System.out.println("Total Weight of Hill Pattern: " + totalSum);
	}
}
import java.util.*;

public class ConsecutiveNumbersSum
{
    public static void printConsecutiveNumbersSum(int n) {
        int left = 1;
        int right = 1;
        int sum = 1;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        while(left <= n/2) {
            if(sum < n) {
                right++;
                sum = sum + right;
            } else if(sum > n) {
                sum = sum - left;
                left++;
            } else {
                List<Integer> al = new ArrayList<>();
                for(int i = left; i <= right; i++) {
                    al.add(i);
                }
                ans.add(al);
                sum = sum - left;
                left++;
            }
        }
        System.out.println(ans);
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		System.out.println("Consecutive Numbers Adding to " + n + ":-");
		printConsecutiveNumbersSum(n);
	}
}
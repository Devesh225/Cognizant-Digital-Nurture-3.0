import java.util.Scanner;


public class CreatePIN
{
    public static int calculatePIN(int i1, int i2, int i3) {
        int pin = 0;
        int p = 100;
        int m = 0;
        int max = 0;
        while(i1 > 0 || i2 > 0 || i3 > 0) {
            int r1 = i1 / p;
            int r2 = i2 / p;
            int r3 = i3 / p;
            m = r1 > r2 ? r1 : (r2 > r3 ? r2 : r3);
            int digit = r1 < r2 ? r1 : (r2 < r3 ? r2 : r3);
            pin = pin * 10 + digit;
            i1 = i1 % p;
            i2 = i2 % p;
            i3 = i3 % p;
            p = p / 10;
            if(p == 0) p = 1;
            if(m > max) max = m;
        }
        pin = max * 1000 + pin;
        return pin;
    }
    
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Input 1: ");
		int i1 = sc.nextInt();
		System.out.print("Enter Input 2: ");
		int i2 = sc.nextInt();
		System.out.print("Enter Input 3: ");
		int i3 = sc.nextInt();
		int pin = calculatePIN(i1, i2, i3);
		System.out.println("PIN: " + pin);
	}
}

import java.util.Scanner;
public class sinegraph {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(forLoop());
		whileLoop();
		average();
		to360();
	}
	public static int forLoop(){
		int sum=0;
		for(int i=1;i<=10 ;i++ ) {
			sum+= i;
		}
		return sum;
	}
	public static void whileLoop(){
		int sum2=0;
		int num=0;
		while(num<=10) {
			sum2+= num;
			num++;
		}
		System.out.println("The sum of 10 numbers is (using while loop)" +sum2);
	}
	public static void average() {
		System.out.println(forLoop());
		double num=(double)55/10;
		System.out.println(num);
	}
	public static void to360() {
		System.out.println("What do you want the increment");
		Scanner input =new Scanner(System.in);
		int increment = input.nextInt();
		System.out.println("What do you want the times");
		int i= input.nextInt();
		System.out.println();
		for(int p=0; p<i;p++ ) {
			int sum=0;
			while(sum<360) {
				sum += increment;
				System.out.println(sum);
			}
		}
	}
}

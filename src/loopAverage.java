public class loopAverage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum using the for loop " +forLoop());
		whileLoop();
		average();
		
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
}

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;
public class sinegraph {
	private static Scanner input;
	public static void main(String args[]) throws FileNotFoundException{
		to360();
		toAbberation();
	}
	public static void to360() throws FileNotFoundException {
		ArrayList<Integer> radian = new ArrayList<Integer>();
		System.out.println("What do you want the increment");
		input = new Scanner(System.in);
		int increment = input.nextInt();
		System.out.println("What do you want the times");
		int i= input.nextInt();
		System.out.println();
		for(int p=0; p<i;p++ ) {
			int sum=0;
			while(sum<=360) {
				radian.add(sum);
				sum += increment;
				
			}
			
		}
		printArray(radian);
		System.out.println();
		toRadian(radian);
	}
	private static void printArray(ArrayList<Integer> radian) {
		for(int x:radian) {
			System.out.print(x+" ");
		}
		
	}
	public static void toRadian(ArrayList radian) throws FileNotFoundException {
		ArrayList<Double> toFile = new ArrayList<Double>();
		double radianValue;
		Writer writer = null;
		for(int i=0; i<radian.size(); i++) {
			double a= (Integer) radian.get(i);
			radianValue  = Math.sin( Math.toRadians(a));
			toFile.add(radianValue);
		}
		writeToFile(toFile);
	}
	public static void writeToFile(ArrayList<Double> toFile) {
		String strFilePath = "apple.txt";
		try {
			PrintWriter writer = new PrintWriter("value.txt");
			for (double element: toFile) {
				double radian  = Math.toRadians( element )  ;
				writer.println(Math.sin(radian));
//				System.out.println(Math.sin(radian));
			}
			writer.close();
		} catch (IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void toAbberation() {
		ArrayList<Double> lines = new ArrayList<Double>();
		double average=0;
		try {
			File file = new File("abberation.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;

			while ((line = bufferedReader.readLine()) != null) {
				Double doubleObject = new Double(line);
				lines.add(doubleObject);
			}
			double sum=0;   

			int n=0;
			for(Double app:lines) {
				sum += app;
				n++;
			}
			average= (sum/(n-1));
//			System.out.println(average);
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		outlinerOrNot(lines,average);
	}
	public static void outlinerOrNot(ArrayList<Double> lines, double average) {
		for(int i=0;i<lines.size();i++) {
			if(Math.abs(lines.get(i)-average)>3) {
				System.out.println(lines.get(i));
			}

		}
	}
}



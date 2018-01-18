import java.util.Scanner;
public class FeetToMeters {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a measurement in feet to be converted to meters:");
		double feet = sc.nextDouble();
		System.out.println(feet+" feet is "+(feet*0.305)+" meters");
	}
}
import java.util.Scanner;
class BMI 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Weight(kg) -- "); double weight = sc.nextDouble(); 
        System.out.print("Height(m) -- "); double height = sc.nextDouble();
		double bmi = weight/(height*height);
		System.out.println("BMI is "+bmi);
	}
}

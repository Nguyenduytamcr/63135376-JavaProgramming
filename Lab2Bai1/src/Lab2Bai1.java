import java.util.Scanner;

public class Lab2Bai1 {

	public static void main(String[] args) {
		Scanner banphim = new Scanner(System.in);
		System.out.println("phương trình ax + b = 0");
		System.out.println("nhập a: ");
		float a = banphim.nextFloat();
		System.out.println("nhập b: ");
		float b = banphim.nextFloat();
		if(a == 0){
			if(b == 0){
				System.out.println("phương trình vô số nghiệm!");
			}
			else{
				System.out.println("phương trình vô nghiệm!");
			}
		}
		else{
			System.out.printf("\nphương trình có nghiệm: x = %f",-b/a);
			//tính và xuất nghiệm x = -b/a;
		}
	}
}





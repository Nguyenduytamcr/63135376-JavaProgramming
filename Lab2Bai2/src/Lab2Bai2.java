import java.util.Scanner;

public class Lab2Bai2 {

	public static void main(String[] args) {
		Scanner banphim = new Scanner(System.in);
		System.out.println("Phương trình bậc 2: ax^2 + bx + c = 0");
		System.out.println("Nhập a: ");
		float a = banphim.nextFloat();
		System.out.println("Nhập b: ");
		float b = banphim.nextFloat();
		System.out.println("Nhập c: ");
		float c = banphim.nextFloat();
		if(a==0) {
			if(b == 0){
				if(c == 0){
					System.out.println("phương trình vô số nghiệm!");
				}
				else{
					System.out.println("phương trình vô nghiệm!");
				}
			}
			else{
				System.out.printf("\nphương trình có nghiệm: x = %f",-c/b);
			}
		}
		else {
			double Delta = Math.pow(b,2) - (4*a*c);
			if(Delta < 0) {
				System.out.println("phương trình vô nghiệm!");
			}
			else if(Delta == 0) {
				System.out.printf("\nphương trình có nghiệm kép: x = %f",-b/(2*a));
			}
			else {
				System.out.printf("\nphương trình có nghiệm phân biệt: \nx = %f \nx = %f", (-b + Math.sqrt(Delta))/(2*a),(-b - Math.sqrt(Delta))/(2*a) );
			}
		}
	
	
	
	
	}

}

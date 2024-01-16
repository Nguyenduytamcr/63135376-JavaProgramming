import java.util.Scanner;

public class Lab1Bai4 {

	public static void main(String[] args) {
		Scanner banPhim = new Scanner(System.in);
		System.out.println("phương trình bậc 2:  ax^2 + bx + c");
		System.out.print("Nhập a: ");
		float a = banPhim.nextFloat();
		System.out.print("Nhập b: ");
		float b = banPhim.nextFloat();
		System.out.print("Nhập c: ");
		float c = banPhim.nextFloat();
		double delta = Math.pow(b,2) - (4*a*c);
		System.out.printf("Căn Delta là: %f ",Math.sqrt(delta));
	}

}

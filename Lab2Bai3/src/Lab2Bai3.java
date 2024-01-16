import java.util.Scanner;

public class Lab2Bai3 {

	public static void main(String[] args) {
		Scanner banphim = new Scanner(System.in);
		System.out.println("Nhập số điện sử dụng của tháng: ");
		float soDien = banphim.nextFloat();
		if (soDien < 50) {
			double tien = soDien * 1000;
			System.out.printf("Tiền điện của tháng: %f", tien);
		}
		else {
			double tien = 50 * 1000 + (soDien - 50) * 1200;
			System.out.printf("Tiền điện của tháng: %f", tien);
		}
	}

}

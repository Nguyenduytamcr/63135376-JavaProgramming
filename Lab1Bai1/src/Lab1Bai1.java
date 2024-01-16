import java.util.Scanner;

public class Lab1Bai1 {

	public static void main(String[] args) {
		Scanner banphim = new Scanner(System.in);
		System.out.print("Họ và tên: ");
		String hoTen = banphim.nextLine();
		System.out.print("Điểm TB: ");
		double diemTB = banphim.nextDouble();
		System.out.printf(" %s %.3f điểm",hoTen, diemTB);
	}

}

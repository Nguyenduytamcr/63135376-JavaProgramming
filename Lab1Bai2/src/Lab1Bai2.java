import java.util.Scanner;

public class Lab1Bai2 {

	public static void main(String[] args) {
		Scanner banphim = new Scanner(System.in);
		System.out.println("Nhập chiều dài: ");
		double dai = banphim.nextDouble();
		System.out.println("Nhập chiều rộng: ");
		double rong = banphim.nextDouble();
		System.out.printf("chu vi của hình chữ nhật là: %.3f", (dai + rong)*2);
		System.out.printf("\ncạnh nhỏ của hình chữ nhật là: %.3f", dai*rong);
		System.out.printf("\ncạnh nhỏ của hình chữ nhật là: %.3f", Math.min(dai, rong));
		
	}

}

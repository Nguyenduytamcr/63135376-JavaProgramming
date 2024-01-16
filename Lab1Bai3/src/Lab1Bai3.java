import java.util.Scanner;

public class Lab1Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner banphim = new Scanner(System.in);
		System.out.print("Nhập cạnh khối lập phương: ");
		float canh = banphim.nextFloat();
		System.out.printf("Thể tích khối lập phương: %.2f",Math.pow(canh,3));
	}

}

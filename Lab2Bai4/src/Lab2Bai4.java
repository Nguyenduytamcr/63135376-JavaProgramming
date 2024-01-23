import java.util.Scanner;

public class Lab2Bai4 {

	public static void main(String[] args) {
		Scanner banphim = new Scanner(System.in);
		System.out.println("+---------------------------------------------------+");
		System.out.println("1. Giải phương trình bậc nhất");
		System.out.println("2. Giải phương trình bậc 2");
		System.out.println("3. Tính tiền điện");
		System.out.println("4. Kết thúc");
		System.out.println("+---------------------------------------------------+");
		System.out.println("Chọn chức năng: ");
		int count = banphim.nextInt();
		switch(count) {
		case 1:
			PtBac1();
			break;
		case 2:
			PtBac2();
			break;
		case 3:
			Tiendien();
			break;
		case 4:
			System.exit(0);
			break;
		}

	}
	
	public static void PtBac1() {
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
	
	public static void PtBac2() {
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
	
	public static void Tiendien() {
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

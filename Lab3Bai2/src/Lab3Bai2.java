import java.util.Scanner;

public class Lab3Bai2 {

	public static void main(String[] args) {
		Scanner banphim = new Scanner(System.in);
		System.out.println("+---------------------------------------------------+");
		System.out.println("1. Chọn 1 bảng cửu chương");
		System.out.println("2. Xuất tât cả bảng cửu chương");
		System.out.println("3. Kết thúc");
		System.out.println("+---------------------------------------------------+");
		System.out.println("Chọn chức năng: ");
		int count = banphim.nextInt();
		switch(count) {
		case 1:
			in1ban();
			break;
		case 2:
			inALL();
			break;
		case 3:
			System.exit(0);
			break;
		}
	}
	public static void in1ban() {
		Scanner banphim = new Scanner(System.in);
		System.out.println("Nhập bảng cửu chương bạn chọn: ");
		int a = banphim.nextInt();
		System.out.printf("Bảng nhân %d: ",a);
		for(int i=1; i<=10;i++){
			System.out.printf("\n%d x %d = %d",a,i,a*i);
		}
	}
	public static void inALL() {
		for (int i = 1; i <= 9; i++) {
            System.out.println("Bảng nhân " + i + ":");
            // Vòng lặp cho từng bảng nhân
            for (int j = 1; j <= 10; j++) {
                System.out.printf("\n%d x %d = %d", i, j, i * j);
            }
		}
	}
	

}

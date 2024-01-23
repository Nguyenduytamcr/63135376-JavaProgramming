import java.util.Scanner;

public class Lab3Bai1 {

	public static void main(String[] args) {
		Scanner banphim = new Scanner(System.in);
		System.out.println("Nhập số nguyên: ");
		int N = banphim.nextInt();
		boolean ok = true;
		for(int i=2; i < N-1; i++){ // N là số nhập từ bàn phím
		if(N % i == 0){
		ok = false;
		break;
		}
		i++;
		}
		if (ok) {
            System.out.println(N + " là số nguyên tố.");
        } else {
            System.out.println(N + " không là số nguyên tố.");
        }
	}

}

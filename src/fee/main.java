package fee;

import java.util.Scanner;
public class main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// TODO Auto-generated method stub
		System.out.println("type");
		int taxi = sc.nextInt();
		System.out.println("length");
		double length = sc.nextDouble();
		taxFee taxi1 = new taxFee();
		taxi1.getNumber(taxi);
		taxi1.getLength(length);
		double money = taxi1.outMoney();
		System.out.println(money);
	}


}

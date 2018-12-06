package fee;
public class taxFee {
	private  int type;
	private double money;
	private double length;
	public  void getNumber(int n) {
		type = n;
	}	
	public  void getLength(double n) {
		length = n;
	}
	public double outMoney () {
		switch (type) {
		case 1 :
			if(length >= 3) {
				money = 3 + (length - 3) * 2.1;
			} else {
				money = 3;
			}
			break;
		case 2:
			if(length >= 3) {
				money = 4 + (length - 3) * 2.4;
			} else {
				money = 4;
			}
			break;
		case 3 :
			if(length >= 3) {
				money = 5 + (length - 3) * 2.7;
			} else {
				money = 5;
			}
			break;
		}
		sishewuru();
		return money;
	}
	private void sishewuru () {
		money = (double)((int)(money * 100+0.5))/100;
	}

}

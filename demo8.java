//输出从100到999中满足
//1、完全平方数
//2、含有两位数字相同
public class demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=101;i<999;i++) {
			if(check_1(i)==1&&check_2(i)==1) {
				int k=0;
				System.out.print(i+"\t");
			}
		}
	}
	public static int check_1(int n) {
		for(int i=10;i<32;i++) {
			if(n==i*i) {
				return 1;
			}
		}
		return 0;
	}
	public static int check_2(int n) {
		int i=n/100;
		int j=n/10%10;
		int k=n%10;
		if(i==j||i==k||j==k) {
			return 1;
		}
		return 0;
		
	}

}

/*输出100-1000的所有平方回文数。
 *1.从左读与从有读都是一样
 *2.为某一个数的平方
 */
public class demo_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		for(int i=100;i<1001;i++) {
			if(check_1(i)==1&&check_2(i)==1) {
				n++;
				if(n%5==0) {
					System.out.println();
				}else {
					System.out.print(i+"\t");
				}	
			}
		}	
	}
	public static int check_1(int n) {
		int i=n/100;
		int j=n/10%10;
		int k=n%10;
		if(i==k) {
			return 1;
		}
		return 0;
	}
	public static int check_2(int n){
		for(int i=10;i<32;i++) {
			if(i*i==n) {
				return 1;
			}
		}
		return 0;
	}

}

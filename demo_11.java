import javax.rmi.ssl.SslRMIClientSocketFactory;

//第二遍八皇后问题
public class demo_11 {
	private static int[][] a=new int[8][8];
	private static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun();
		find(0);
	}
	public static void fun() {
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				a[i][j]=0;
			}
		}
	}
	public static int check(int x,int y) {
		for(int i=x-1;i>=0;i--) {
			if(a[i][y]==1) {
				return 0;
			}
		}
		
		for(int i=x-1,j=y-1;i>=0&&j>=0;i--,j--) {
			if(a[i][y]==1) {
				return 0;
			}
		}
		for(int i=x-1,j=y+1;i>=0&&j<8;i--,j++) {
			if(a[i][j]==1) {
				return 0;
			}
		}
		return 1;
		
	}
	public static void show() {
		//count++;
		System.out.println("第"+count+"种解法");
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				System.out.print(a[i][j]+" ");
			}System.out.println();
			
		}
		
	}
	public static void find(int step) {
		//int x=step-1;
		for(int i=0;i<8;i++) {	
			if(check(step,i)==1) {
				a[step][i]=1;
				if(step==7) {
					count++;
					show();
				}else {			
					find(step+1);
					a[step][i]=0;
				}
			}else{
				a[step][i]=0;
			}
		}		
	}
}

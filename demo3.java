//国际象棋中的马跳日问题
public class demo3 {
	public static int m=5;//棋盘行数
	public static int n=5;//棋盘列数
	public int x;//马的横坐标
	public int y;//马的竖坐标
	public static int a[][]= new int[m][n];//棋盘坐标
	public static int count=0;//解得总数
	public static int fx[]= {1,1,-1,-1,2,2,-2,-2};
	public static int fy[]= {2,-2,2,-2,1,-1,1,-1};
	public static void array() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				a[i][j]=0;
			}
		}
	}
	public static int check(int next_x,int next_y) {
		if(next_x>=m||next_y>=n||next_x<0||next_y<0||a[next_x][next_y]!=0) {
			return 0;
		}
		return 1;
	}
	public static void show() {
		count++;
		System.out.println("第"+count+"种解法");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+"\t");
			}System.out.println();
		}
		
	}
	public static void find(int x,int y,int dep) {
		
		for(int i=0;i<8;i++) {
			int xx=x+fx[i];
			int yy=y+fy[i];
			if(check(xx,yy)==1) {
				a[xx][yy]=dep;
				//dep++;
				if(dep==m*n) {
					//dep++;
					//System.out.println("123");
					show();
				}else {
					find(xx,yy,dep+1);
				}
					a[xx][yy]=0;
		}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array();
		a[0][0]=1;
		find(0,0,2);
	}
}

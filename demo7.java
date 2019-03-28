import javax.swing.plaf.synth.SynthStyle;
//第二遍马走日问题
public class demo7 {
	private static int m=5;//棋盘的行宽
	private static int n=5;//棋盘的列宽
	private static int a[][]=new int[5][5];//棋盘坐标
	//private int x;//棋子的位置x
	//private int y;//棋子的位置y
	private static int fx[]= {1,1,-1,-1,2,2,-2,-2};//变换横坐标
	private static int fy[]= {2,-2,2,-2,1,-1,1,-1};//变换纵坐标
	private static int  count=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun();
		a[0][0]=1;	
		find(0,0,2);
	}
	public static void fun() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				a[i][j]=0;
		}
	}
}
	public static void show() {
		count++;
		System.out.println("第"+count+"种解法");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(a[i][j]+"\t");
			}System.out.println();
		}
	}
	public static void find(int x,int y,int step) {
		for(int k=0;k<8;k++) {
			int xx=x+fx[k];
			int yy=y+fy[k];
			if(check(xx,yy)==1) {
				a[xx][yy]=step;
				//System.out.println(step);
				if(step==m*n) {
					show();
				}else {
					find(xx,yy,step+1);
				}
				a[xx][yy]=0;
			}
		}
	}
	public static int check(int x,int y) {
		if(x>=m||y>=n||x<0||y<0||a[x][y]!=0) {
			return 0;
		}
		return 1;
	}
}

//八皇后问题 回溯法
class demo1 {
	public static int[][] map=new int[8][8];
	public static int count=0;
	public static void show() {
		System.out.println("第"+count+"种解法");
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				System.out.print(map[i][j]+" ");
			}System.out.println();
		}
	}
	public static boolean check(int row,int col) {
		for(int i=row-1;i>=0;i--) {
			if(map[i][col]==1) {
				return false;
			}
		}
		for(int i=row-1, j=col+1;i>=0&&j<8;i--,j++) {
			if(map[i][j]==1) {
				return false;
			}
		}
		for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--) {
			if(map[i][j]==1) {
				return false;
			}
		}
		return true;	
	}
        
    public static void play(int row) {
    		for(int i=0;i<8;i++) {
    			if(check(row,i)) {
    				map[row][i]=1;
    				//row++;
    				if(row==7) {
    					//System.out.println("123");
    					count++;
    					show();
    				}else {
    					//row=row+1;
    					play(row+1);
    					map[row][i]=0;
    				}
    			}else {
    				map[row][i]=0;
    			}
    		}
    }

public static void main(String[] args) {
	play(0);
}
}

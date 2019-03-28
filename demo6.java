import java.util.Scanner;
//求字符串中最长数字字符串长度
public class demo6 {
	private static int count;
	private static int max;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s=findMaxString(str);
		System.out.println("最长字符子串："+s+"\n"+"最长位数:"+max);
	}
	public static String findMaxString(String str) {
		String s="";
		int index;
		char[] array=str.toCharArray();
		for(int i=0;i<array.length;i++) {
			if(array[i]>='0'&&array[i]<= '9') {
				count=0;
				index=i;
				for(int j=i;j<array.length;j++) {
					if(array[j]>='0'&&array[j]<= '9') {
						count++;
						index=j;
					}else {
						break;
					}
				}
				if(count>s.length()) {
					s=str.substring(i,index+1);
					max=count;
				}
			}else {
				continue;
			}	
		}
		return s;	
	}

}

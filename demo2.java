import java.util.Scanner;
//求两个字符串的最长公共子串
public class demo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String print=CommonString(str1,str2);
		System.out.println("最长公共子串"+print);
	}
	public static String CommonString(String str1,String str2) {
		String taget=null;
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		int len1=str1.length();
		int len2=str2.length();
		String min=null;
		String max=null;
		min=len1>=len2 ? str2:str1;
		max=len1< len2 ? str2:str1;
		for(int i=min.length();i>0;i--) {
			for(int j=0;j<min.length()-i;j++) {
				taget=min.substring(j,j+i);
				for(int k=0;k<max.length()-i;k++) {
					if(max.substring(k,k+i).equals(taget)) {
						return taget;
					}
				}
			}
		}
		return null;
		
	}
}

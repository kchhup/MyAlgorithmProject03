import java.util.Scanner;

//输入一串字符串，把下标为奇数的小写字母（从0开始编号）转换成为大写字母。然后输出字符串
public class demo9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String st=func(s);
		System.out.print(st);
	}
	public static String func(String s) {
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i%2==1) {
				char c=ch[i];
				char c1=(char) (c-32);
				ch[i]=c1;
				
			}
		}
		
		return new String(ch);//将字符数组转换成字符串
	}

}

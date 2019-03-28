import java.util.Stack;
//青蛙杯棒球赛
public class demo5 {
	private static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st[]= {"5","2","C","D","+"};
		countGrade(st);
		System.out.println("输出得分"+count);
		
	}
	public static void countGrade(String st[]) {
		Stack<Integer> stack=new Stack<Integer>(); 
		for(String s:st) {
			//System.out.println(s);
			if(s.equals("C")) {
				stack.pop();
			}else if(s.equals("D")) {
				int one=stack.pop();
				int two=one*2;
				stack.push(one);
				stack.push(two);		
			}else if(s.equals("+")){
				int t1=stack.pop();
				int t2=stack.pop();
				int sum=t1+t2;
				stack.push(t1);	
				stack.push(t2);	
				stack.push(sum);	
			}else {
				stack.push(Integer.parseInt(s));
			}
		}
		while(!stack.isEmpty()) {
			count+=stack.pop();
		}
	}
}

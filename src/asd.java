import java.util.Scanner;

public class asd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请按照模板y=ax²+bx+c，来设置二元一次方程！\n正则表达式懒得打，请输入一万以内数字，感谢配合\n只支持结果为整数的方程\n");
		System.out.println("输入数字后回车输入下一个数字");
		System.out.print(" 请输入y的值：");
		String Y= s.next();
		System.out.print(" 请输入a的值：");
		String A = s.next();
		System.out.print(" 请输入b的值：");
		String B = s.next();
		System.out.print(" 请输入c的值：");
		String C = s.next();
		System.out.println("x的值分别为：");
		double y = Double.parseDouble(Y);
		double a = Double.parseDouble(A);
		double b = Double.parseDouble(B);
		double c = Double.parseDouble(C);
		for(int x = -1000000;x<=1000000;x++){
			if(y==a*x*x+b*x+c){
				System.out.println(x);		
			}
			
		}
		
	}

}

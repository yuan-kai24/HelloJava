import java.util.Scanner;


//java基础复习
public class Hellojava {
	public static void main(String[] args){
		yk01();
		yk02();
		yk03();
		yk04();
		yk05();
		yk06();
		Test();//调用Text方法
		int as = add(1,3);
		System.out.println(as);
		Text01();
		yk07();
	}
	//********************************************************************************************************************//
	public static void yk01(){
		//随机数，判断
		double d = Math.random();
		int b = 1+(int)(d*6);
		System.out.println(b);
		if(b>4){
			System.out.println("大数");
		}else if(b>2){
			System.out.println("中数");
		}else{
			System.out.println("小数");
		}
		System.out.println("_____________________分隔符__________________________");
	}
	public static void yk02(){
		//switch判断
		double d = Math.random();
		int b = 1+(int)(d*6);
		switch(b){
		case 6:
			System.out.println("运气报表");
			break;
		case 5:
			System.out.println("运气很好");
			break;
		case 4:
			System.out.println("运气可以");
			break;
		default:
			System.out.println("运气不咋样");
			break;
		}
		System.out.println("_____________________分隔符__________________________");

	}
	public static void yk03(){
		//while循环出1到100
		int a = 1;
		while(a<=100){
			System.out.print(a+"—");
			a++;

		}
		System.out.println("结束");
		System.out.println("_____________________分隔符__________________________");

	}
	public static void yk04(){
		//九九乘法表
		for(int i = 1; i<=9; i++){
			for(int j = 1; j<=i; j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		System.out.println("_____________________分隔符__________________________");

	}
	public static void yk05(){
		//100内能被五整除的数，分四列
		for(int q = 1; q<=100; q++){
			if(q%5==0){
				System.out.print(q+"\t");
			}
			if(q%(5*4)==0){
				System.out.println();
			}
		}
		System.out.println("_____________________分隔符__________________________");

	}
	public static void yk06(){
		//终止循环和跳过本次循环,类似goto的标签跳跃
		int total = 0;
		System.out.println("begin");
		while(true){
			total++;
			int i = (int)Math.round(100 * Math.random());//随机取100内一个整数
			if(i == 88){
				break;	
			}
		}
		System.out.println("Game over,used" + " " + total + "times.");//第几次随机取到88

		for(int w = 100; w<150; w++){
			if(w%3==0){
				continue;
			}//跳过能被3整除的数
			System.out.print(w+"_");
		}
		System.out.println();
		outer: for (int e = 101; e < 150; e++){
			for(int r = 2; r < 10; r++){
				if(e % r == 0){
					continue outer;
				}
			}
			System.out.print(e+" ");		
		}
		System.out.println();

	}
	public static void Test(){
		//dowhile概念
		int dw = 5;
		do{
			System.out.println("dowhile使用qwq~");
			dw++;
		}while(dw<3);		
	}
	public static int add(int ocp,int pdo){
		int summ = ocp+pdo;
		return summ;//返回值和结束方法
	}
	static int am = 0;
	public static void Text01(){

		am++;
		System.out.print("调用第"+am+"次"+" "+"-");
		if(am<=2){
			Text01();

		}else{
			System.out.print("over!");
			System.out.println();
		}
	}
	public static void yk07(){
		/**
		 * 用户输入，Scannery的使用。
		 */
		Scanner s = new Scanner(System.in);
		System.out.print("请输入：");
		String str = s.next();
		System.out.println("输入了："+str);
		System.out.println("请输入数字1：");
		int a = s.nextInt();
		System.out.println("请输入数字2：");
		int b = s.nextInt();
		int sum = a+b;
		System.out.println("相加得："+sum);
	}
}

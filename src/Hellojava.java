import java.util.Scanner;


//java������ϰ
public class Hellojava {
	public static void main(String[] args){
		yk01();
		yk02();
		yk03();
		yk04();
		yk05();
		yk06();
		Test();//����Text����
		int as = add(1,3);
		System.out.println(as);
		Text01();
		yk07();
	}
	//********************************************************************************************************************//
	public static void yk01(){
		//��������ж�
		double d = Math.random();
		int b = 1+(int)(d*6);
		System.out.println(b);
		if(b>4){
			System.out.println("����");
		}else if(b>2){
			System.out.println("����");
		}else{
			System.out.println("С��");
		}
		System.out.println("_____________________�ָ���__________________________");
	}
	public static void yk02(){
		//switch�ж�
		double d = Math.random();
		int b = 1+(int)(d*6);
		switch(b){
		case 6:
			System.out.println("��������");
			break;
		case 5:
			System.out.println("�����ܺ�");
			break;
		case 4:
			System.out.println("��������");
			break;
		default:
			System.out.println("������զ��");
			break;
		}
		System.out.println("_____________________�ָ���__________________________");

	}
	public static void yk03(){
		//whileѭ����1��100
		int a = 1;
		while(a<=100){
			System.out.print(a+"��");
			a++;

		}
		System.out.println("����");
		System.out.println("_____________________�ָ���__________________________");

	}
	public static void yk04(){
		//�žų˷���
		for(int i = 1; i<=9; i++){
			for(int j = 1; j<=i; j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		System.out.println("_____________________�ָ���__________________________");

	}
	public static void yk05(){
		//100���ܱ�������������������
		for(int q = 1; q<=100; q++){
			if(q%5==0){
				System.out.print(q+"\t");
			}
			if(q%(5*4)==0){
				System.out.println();
			}
		}
		System.out.println("_____________________�ָ���__________________________");

	}
	public static void yk06(){
		//��ֹѭ������������ѭ��,����goto�ı�ǩ��Ծ
		int total = 0;
		System.out.println("begin");
		while(true){
			total++;
			int i = (int)Math.round(100 * Math.random());//���ȡ100��һ������
			if(i == 88){
				break;	
			}
		}
		System.out.println("Game over,used" + " " + total + "times.");//�ڼ������ȡ��88

		for(int w = 100; w<150; w++){
			if(w%3==0){
				continue;
			}//�����ܱ�3��������
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
		//dowhile����
		int dw = 5;
		do{
			System.out.println("dowhileʹ��qwq~");
			dw++;
		}while(dw<3);		
	}
	public static int add(int ocp,int pdo){
		int summ = ocp+pdo;
		return summ;//����ֵ�ͽ�������
	}
	static int am = 0;
	public static void Text01(){

		am++;
		System.out.print("���õ�"+am+"��"+" "+"-");
		if(am<=2){
			Text01();

		}else{
			System.out.print("over!");
			System.out.println();
		}
	}
	public static void yk07(){
		/**
		 * �û����룬Scannery��ʹ�á�
		 */
		Scanner s = new Scanner(System.in);
		System.out.print("�����룺");
		String str = s.next();
		System.out.println("�����ˣ�"+str);
		System.out.println("����������1��");
		int a = s.nextInt();
		System.out.println("����������2��");
		int b = s.nextInt();
		int sum = a+b;
		System.out.println("��ӵã�"+sum);
	}
}

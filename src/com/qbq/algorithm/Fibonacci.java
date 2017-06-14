package com.qbq.algorithm;

/**
 * @author QianBingqiao
 * @date 2017-05-28 11:00:08
 */
public class Fibonacci {
	/**
	 * 쳲��������У����壺쳲���������ָ��������һ������ 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233��377��610��987��1597��2584��4181��6765
     *  ........    ������дӵ�3�ʼ��ÿһ�����ǰ����֮�͡�
     *  ����ѧ�ϣ�쳲��������������±��Եݹ�ķ������壺F(0)=0��F(1)=1, F(n)=F(n-1)+F(n-2)��n>=2��n��N*��
	 * @param n
	 * @return
	 */
	public int fibonacciDemo(int n){
		if(n<= 0){
			return 0;
		}else if(n==1){
			return 1;
		}
		return fibonacciDemo(n-1) + fibonacciDemo(n-2);
	}
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		f.fibonacciDemo(15);
		System.out.println("��ӡ쳲����������е�15������   " + f.fibonacciDemo(15));
	}
//	
//
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
}

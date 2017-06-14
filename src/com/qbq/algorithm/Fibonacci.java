package com.qbq.algorithm;

/**
 * @author QianBingqiao
 * @date 2017-05-28 11:00:08
 */
public class Fibonacci {
	/**
	 * 斐波那契数列：定义：斐波那契数列指的是这样一个数列 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，4181，6765
     *  ........    这个数列从第3项开始，每一项都等于前两项之和。
     *  在数学上，斐波纳契数列以如下被以递归的方法定义：F(0)=0，F(1)=1, F(n)=F(n-1)+F(n-2)（n>=2，n∈N*）
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
		System.out.println("打印斐波那契数列中第15个数：   " + f.fibonacciDemo(15));
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

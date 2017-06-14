package com.qbq.algorithm;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author QianBingqiao
 *
 */
public class JosephusProblem {
	/**
	 * 约瑟夫问题 ，最后打印剩下人数的编号，打印出局的人员的编号和是第几轮出局
	 * 
	 * @param num
	 *            玩死亡游戏的总人数
	 * @param start
	 *            开始报数人的编号
	 * @param death
	 *            出局的数字，比如说1.2.3，3号出局， 则death=3；
	 * @return list 剩下人数的号码数组列表，个数跟death的值有关， 当num<death 的时候剩下当前所有num人数，
	 *         当num远远大于death值时候， 剩下的个数等于death-1；
	 */
	public List<Integer> josephusProblem(int num, int start, int death) {
		List<Integer> list = new LinkedList<Integer>();
		List<Integer> newList = new LinkedList<Integer>();// 用来接收每一轮出局的
		for (int i = 1; i <= num; i++) {
			list.add(i);
		}
		int number = 1;
		int point = start - 1;
		int index = 1;
		int tag = 0;
		while (list.size() > death - 1) {
			++tag;
			if (number % death == 0) {
				newList.add(list.get(point));
				list.remove(point);
				point--;
			}
			point++;
			number++;
			if (point > list.size() - 1) {
				point = 0;
				System.out.println("第" + index + "轮被顺序淘汰人员的编号：" + newList + "\n");
				newList.removeAll(newList);
				index++;
			}
		}
		System.out.println(tag);
		System.out.println("最终剩下的人员的编号：" + list);
		return list;
	}



	public static void main(String[] args) {
		JosephusProblem joseph = new JosephusProblem();
		joseph.josephusProblem(41,1, 3);	
	}
	// 备注：打印的地方我用了一个newList来接收是为了方便自己理解，
    //	       这样做多了一个list的开销，也可以不用，直接打印输出被淘汰的人；
	//     我存放进newList的数据是根据被淘汰的顺序添加的,目前暂时测试顺序是对的
	//
	//
	//
	//
}

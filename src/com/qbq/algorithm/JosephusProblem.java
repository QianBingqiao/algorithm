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
	 * Լɪ������ ������ӡʣ�������ı�ţ���ӡ���ֵ���Ա�ı�ź��ǵڼ��ֳ���
	 * 
	 * @param num
	 *            ��������Ϸ��������
	 * @param start
	 *            ��ʼ�����˵ı��
	 * @param death
	 *            ���ֵ����֣�����˵1.2.3��3�ų��֣� ��death=3��
	 * @return list ʣ�������ĺ��������б�������death��ֵ�йأ� ��num<death ��ʱ��ʣ�µ�ǰ����num������
	 *         ��numԶԶ����deathֵʱ�� ʣ�µĸ�������death-1��
	 */
	public List<Integer> josephusProblem(int num, int start, int death) {
		List<Integer> list = new LinkedList<Integer>();
		List<Integer> newList = new LinkedList<Integer>();// ��������ÿһ�ֳ��ֵ�
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
				System.out.println("��" + index + "�ֱ�˳����̭��Ա�ı�ţ�" + newList + "\n");
				newList.removeAll(newList);
				index++;
			}
		}
		System.out.println(tag);
		System.out.println("����ʣ�µ���Ա�ı�ţ�" + list);
		return list;
	}



	public static void main(String[] args) {
		JosephusProblem joseph = new JosephusProblem();
		joseph.josephusProblem(41,1, 3);	
	}
	// ��ע����ӡ�ĵط�������һ��newList��������Ϊ�˷����Լ���⣬
    //	       ����������һ��list�Ŀ�����Ҳ���Բ��ã�ֱ�Ӵ�ӡ�������̭���ˣ�
	//     �Ҵ�Ž�newList�������Ǹ��ݱ���̭��˳����ӵ�,Ŀǰ��ʱ����˳���ǶԵ�
	//
	//
	//
	//
}

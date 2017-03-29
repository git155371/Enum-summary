package com.example.Enum;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

import javax.swing.RowFilter.Entry;

public class Main {
	public static void main(String[] arg0) {
		//EnumWeek.values ����  EnumWeek[]���͡�eΪһ��EnumWeek���һ��EnumWeek���͵ĳ�Ա��
		for (EnumWeek e : EnumWeek.values()) {
			System.out.println(e);//-->EnumWeek.MON.name��EnumWeek.TUE.name...
		}

		System.out.println("------------------");
		System.out.println(EnumWeek.TUE);//-->���EnumWeek��TUE��name

		System.out.println("------------------------");

		EnumWeek week = EnumWeek.TUE;
		System.out.println(week.compareTo(EnumWeek.MON));//-->compareTo: ������ε�λ�� �� ���١�
		System.out.println(week.compareTo(EnumWeek.TUE));
		System.out.println(week.compareTo(EnumWeek.WED));
		System.out.println(week.compareTo(EnumWeek.THU));

		System.out.println(week.getDeclaringClass().getName());//����ö�ٳ�����ö�����Ͷ�Ӧ�������
		System.out.println(week.name());
		System.out.println(week.toString());//week.name
		System.out.println(week.ordinal());

		 System.out.println(EnumWeek.valueOf(EnumWeek.class,"TUE"));//ͨ�� name���ַ�������ö�����͵����Գ���

	
		System.out.println("******************************");
		for (EnumWeek02 e02 : EnumWeek02.values()) {
			System.out.println(e02 + "   " + e02.getN()+"  "+e02.ordinal());//getN ������EnumWeek02.MON ��ǰ������  new EnumWeek02(int) �Ĺ��췽��
		}

	
		System.out.println("******************************");
		System.out.println(EnumWeek03.FRI.getN() + "   " + EnumWeek03.FRI.isRest());//isRest:�з����� ���� �����Լ��ķ�����û�о͵�����ġ�
		System.out.println(EnumWeek03.SUN.getN() + "   " + EnumWeek03.SUN.isRest());
		System.out.println();

	
		System.out.println("******************************");//��hashmap��hashset�÷�����һ�£���ҪЧ�ʸߡ�
		EnumSet<EnumWeek03> week03 = EnumSet.allOf(EnumWeek03.class);
		for(EnumWeek03 e03 : week03){
			System.out.println(e03 +"   "+e03.ordinal());
		}
		EnumMap<EnumWeek03 ,String >  weekMap = new EnumMap<EnumWeek03, String>(EnumWeek03.class);
		weekMap.put(EnumWeek03.MON, "����һ");
		weekMap.put(EnumWeek03.TUE, "���ڶ�");
		for(Map.Entry<EnumWeek03, String> entry: weekMap.entrySet()){
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		

	}

}

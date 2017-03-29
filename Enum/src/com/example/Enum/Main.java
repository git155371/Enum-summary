package com.example.Enum;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

import javax.swing.RowFilter.Entry;

public class Main {
	public static void main(String[] arg0) {
		//EnumWeek.values 返回  EnumWeek[]类型。e为一个EnumWeek类的一个EnumWeek类型的成员。
		for (EnumWeek e : EnumWeek.values()) {
			System.out.println(e);//-->EnumWeek.MON.name、EnumWeek.TUE.name...
		}

		System.out.println("------------------");
		System.out.println(EnumWeek.TUE);//-->输出EnumWeek。TUE。name

		System.out.println("------------------------");

		EnumWeek week = EnumWeek.TUE;
		System.out.println(week.compareTo(EnumWeek.MON));//-->compareTo: 我与入参的位置 多 多少。
		System.out.println(week.compareTo(EnumWeek.TUE));
		System.out.println(week.compareTo(EnumWeek.WED));
		System.out.println(week.compareTo(EnumWeek.THU));

		System.out.println(week.getDeclaringClass().getName());//返回枚举常量的枚举类型对应的类对象
		System.out.println(week.name());
		System.out.println(week.toString());//week.name
		System.out.println(week.ordinal());

		 System.out.println(EnumWeek.valueOf(EnumWeek.class,"TUE"));//通过 name的字符串返回枚举类型的属性常数

	
		System.out.println("******************************");
		for (EnumWeek02 e02 : EnumWeek02.values()) {
			System.out.println(e02 + "   " + e02.getN()+"  "+e02.ordinal());//getN ：代表EnumWeek02.MON 提前调用了  new EnumWeek02(int) 的构造方法
		}

	
		System.out.println("******************************");
		System.out.println(EnumWeek03.FRI.getN() + "   " + EnumWeek03.FRI.isRest());//isRest:有方法就 覆盖 调用自己的方法，没有就调用类的。
		System.out.println(EnumWeek03.SUN.getN() + "   " + EnumWeek03.SUN.isRest());
		System.out.println();

	
		System.out.println("******************************");//与hashmap和hashset用法大略一致，但要效率高。
		EnumSet<EnumWeek03> week03 = EnumSet.allOf(EnumWeek03.class);
		for(EnumWeek03 e03 : week03){
			System.out.println(e03 +"   "+e03.ordinal());
		}
		EnumMap<EnumWeek03 ,String >  weekMap = new EnumMap<EnumWeek03, String>(EnumWeek03.class);
		weekMap.put(EnumWeek03.MON, "星期一");
		weekMap.put(EnumWeek03.TUE, "星期二");
		for(Map.Entry<EnumWeek03, String> entry: weekMap.entrySet()){
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		

	}

}

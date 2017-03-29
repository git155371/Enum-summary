package com.example.singleton;

public enum Singleton {
	INSTANCE("abc",1),
	TWO("def",5);
	Singleton(String info,int i){
		this.info=info;
		this.i = i;
	}
	private int i;
	private String info;
	
	public  void printParameter(){
		System.out.println(i+"  "+info);
		System.out.println(this.name()+" " +this.ordinal());
		System.out.println(this.hashCode());
	}
	
}


//1�� �������л���
//2�� ��ֻ֤��һ��ʵ������ʹʹ�÷������Ҳ�޷����ʵ����һ��ö��������
//3�� �̰߳�ȫ��
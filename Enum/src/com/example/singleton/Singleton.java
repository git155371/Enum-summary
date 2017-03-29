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


//1、 自由序列化；
//2、 保证只有一个实例（即使使用反射机制也无法多次实例化一个枚举量）；
//3、 线程安全；
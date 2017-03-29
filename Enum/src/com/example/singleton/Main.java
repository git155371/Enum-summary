package com.example.singleton;

public class Main {

	public static void main(String[] args) {

		Singleton s00 = Singleton.INSTANCE;
		s00.printParameter();
		
		Singleton s01 = Singleton.INSTANCE;
		s01.printParameter();
		
		Singleton s02 = Singleton.TWO;
		s02.printParameter();
	}

}

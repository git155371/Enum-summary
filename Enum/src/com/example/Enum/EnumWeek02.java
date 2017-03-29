package com.example.Enum;

public enum EnumWeek02 {
	MON(1),TUE(2),WED(3),THU(4),FRI(5),SAT(6),SUN(7);
	private int n;
	EnumWeek02(int n){
		this.n= n;
	}
	public int getN(){
		return  n;
	}
}

//MON(1)   ===>  new EnumWeek02(1) ===>  Enum("MON",0)
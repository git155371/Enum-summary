package com.example.Enum;

public enum EnumWeek03 {
	MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6) {
		@Override
		public boolean isRest() {
			return true;
		}
	},
	SUN(0) {
		@Override
		public boolean isRest() {
			return true;
		}
	};
	private int n;

	private EnumWeek03(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public boolean isRest() {
		return false;
	}

}
// isRest() -->覆盖了默认的方法，

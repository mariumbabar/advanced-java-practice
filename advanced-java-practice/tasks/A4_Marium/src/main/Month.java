package main;

public enum Month {
	JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6), JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10),
	NOVEMBER(11), DECEMBER(12);

	private int month;

	private Month() {
		this.month = 4;
	}

	private Month(int month) {
		this.month = month;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
}

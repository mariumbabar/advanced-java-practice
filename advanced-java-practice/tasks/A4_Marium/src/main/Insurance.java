package main;

public class Insurance implements Comparable {
	private final long insuranceNo;

	public Insurance(long insuranceNo) {
		this.insuranceNo = insuranceNo;
	}

	public long getInsuranceNo() {
		return insuranceNo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Insurance other = (Insurance) obj;
		if (this.insuranceNo != other.insuranceNo)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {

		return 0;
	}

	@Override
	public String toString() {
		return "Insurance of insuranceNo: " + insuranceNo;
	}

}

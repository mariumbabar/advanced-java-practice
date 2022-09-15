package main;

public class Customer {
	private String customername;
	private String plan;
	private String address;
	private String id_proof;
	private Month expiresEndMonth;

	public Customer(String customername, String plan, String address, String id_proof) {
		this.customername = customername;
		this.plan = plan;
		this.address = address;
		this.id_proof = id_proof;
	}

	public Customer(String customername, String plan, String address, String id_proof, Month expiresEndMonth) {
		this.customername = customername;
		this.plan = plan;
		this.address = address;
		this.id_proof = id_proof;
		this.expiresEndMonth = expiresEndMonth;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId_proof() {
		return id_proof;
	}

	public void setId_proof(String id_proof) {
		this.id_proof = id_proof;
	}

	public Month getExpiresEndMonth() {
		return expiresEndMonth;
	}

	public void setExpiresEndMonth(Month expiresEndMonth) {
		this.expiresEndMonth = expiresEndMonth;
	}

	@Override
	public String toString() {
		return "Customer customername: " + customername + ", plan: " + plan + ", address: " + address + ", id_proof: "
				+ id_proof;
	}

}

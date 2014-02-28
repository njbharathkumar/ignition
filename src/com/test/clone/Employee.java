package com.test.clone;

public class Employee implements Cloneable {
	private int id;
	private String name;
	private PackageDetail packDetail;

	public PackageDetail getPackDetail() {
		return packDetail;
	}

	public void setPackDetail(PackageDetail packDetail) {
		this.packDetail = packDetail;
	}

	public Employee(int id, String name, PackageDetail packDetail) {
		this.id = id;
		this.name = name;
		this.packDetail = packDetail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// copy constructor
	protected Employee(Employee emp) throws CloneNotSupportedException {
		this.id = emp.id;
		this.name = emp.name;
		this.packDetail = emp.packDetail.clone();// PackageDetail is hierarchy
	}

	public Employee clone() throws CloneNotSupportedException {
		return new Employee(this);
	}

	public String toString() {
		return "Employee: id=" + this.id + ", name=" + this.name + ", package: "
				+ this.packDetail;
	}
}
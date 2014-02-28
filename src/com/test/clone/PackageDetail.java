package com.test.clone;

import java.util.List;
import java.util.ArrayList;

public class PackageDetail implements Cloneable {
	private double basicSalary = 5000d;
	private List<String> dependents = new ArrayList<String>();

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public PackageDetail() {
	}

	public PackageDetail(double basicSalary, List<String> dependents) {
		this.basicSalary = basicSalary;
		this.dependents = dependents;
	}

	public PackageDetail clone() throws CloneNotSupportedException {
		PackageDetail cloned = (PackageDetail)super.clone();
		cloned.dependents = copyDependents(cloned.dependents);		
		return cloned;
	}

	public double getSalary() {
		return this.basicSalary;
	}

	public String toString() {
		return " basic salary="+getSalary()+", dependents="+dependents;
	}

	public List<String> getDependents() {
		return dependents;
	}

	public void setDependents(List<String> dependents) {
		this.dependents = dependents;
	}
	
	private List<String> copyDependents(List<String> s) {
		List<String> r = new ArrayList<String>();
		for (String i : s) {
			r.add(i);
		}
		return r;
	}
}
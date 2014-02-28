package com.test.clone;

public class AdvancedPackage extends PackageDetail {
	private double bonusPercentage = 10d;

	public double getBonusPercentage() {
		return bonusPercentage;
	}

	public void setBonusPercentage(double bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}

	public AdvancedPackage() {
	}

	public AdvancedPackage(double bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}

	public double getSalary() {
		return super.getSalary() + super.getSalary() * this.bonusPercentage	/ 100;
	}

	public String toString() {
		return " basic salary+bonus="+getSalary()+",  dependents="+super.getDependents();
	}
}
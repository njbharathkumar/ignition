package com.test.clone;

import java.util.ArrayList;
import java.util.List;

public class TestClone {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1 = new Employee(1, "A", new PackageDetail());
		Employee emp2 = emp1.clone();
		emp2.setId(2);
		emp2.setName("B: clone A");
		emp2.getPackDetail().setBasicSalary(7000d);
		List<String> s1 = new ArrayList<String>();
		s1.add("X");
		s1.add("Y");
		s1.add("Z");
		emp2.getPackDetail().setDependents(s1);
		System.out.println(emp1);
		System.out.println(emp2);
		
		Employee emp3 = new Employee(3, "C", new AdvancedPackage());
		Employee emp4 = emp3.clone();
		emp4.setId(4);
		emp4.setName("D: clone C");
		emp4.getPackDetail().setBasicSalary(110000);
		System.out.println(emp3);
		System.out.println(emp4);
		
		Employee emp5 = emp2.clone();
		emp5.setId(5);
		emp5.setName("E: clone B");
		System.out.println(emp5);
		
		s1.add("P");
		s1.add("Q");
		System.out.println("\nupdate emp2: add P,Q to dependents ...");
		System.out.println(emp2);
		System.out.println(emp5);
		
		
		Employee emp6 = emp1.clone();
		emp6.setId(6);
		emp6.setName("F: clone A");
		AdvancedPackage w= new AdvancedPackage();
		w.setBonusPercentage(15d);
		emp6.setPackDetail(w);
		
		System.out.println("\nupdate emp6: change bonus percentage ...");
		System.out.println(emp6);
	}
}
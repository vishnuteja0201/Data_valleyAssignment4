package com.javaLinkedList;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		
		Employee employee1 = new Employee(32,"Harish",32000.54);
		Employee employee2 = new Employee(12,"Abhi",12000.58);
		Employee employee3 = new Employee(62,"Naruto",62000.54);
		Employee employee4 = new Employee(42,"Tsunade",42000.53);
		Employee employee5 = new Employee(22,"Boruto",22000.52);
		
		List<Employee> list =new LinkedList();
		
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		
		 // Sort by name
        Collections.sort(list, Comparator.comparing(Employee::getEmployee_Name));
        System.out.println("Sorted by Name:");
        for (Employee employee : list) {
            System.out.println(employee.getDetails());
        }

        // Sort by salary
        Collections.sort(list, Comparator.comparing(Employee::getEmployee_Salary));
        System.out.println("\nSorted by Salary:");
        for (Employee employee : list) {
            System.out.println(employee.getDetails());
        }
		
	}
}

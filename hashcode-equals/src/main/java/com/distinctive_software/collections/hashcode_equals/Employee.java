/**
 * 
 */
package com.distinctive_software.collections.hashcode_equals;

import java.util.Objects;

/**
 * Demo class for hashCode and Equals
 * 
 * @author ladobbins
 *
 */
public class Employee {
	
	private EmployeeId id;
	private EmployeeName name;
	
	private Address address;
	
	/**
	 * Default no-arg constructor
	 */
	public Employee() {
		super();
	}

	public EmployeeId getId() {
		return id;
	}
	
	public void setId(EmployeeId id) {
		this.id = id;
	}
	
	/**
	 * @return the name
	 */
	public EmployeeName getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(EmployeeName name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Employee other = (Employee) obj;
		return Objects.equals(id, other.id);
	}	

}
